package coop.guenoa.afip.wsaa;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.Base64;
import org.apache.axis.encoding.XMLType;
import org.apache.log4j.Logger;
import org.bouncycastle.cert.jcajce.JcaCertStore;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.CMSTypedData;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Store;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import coop.guenoa.afip.util.Configuracion;
// El Departamento de Seguridad Informatica de la AFIP (DeSeIn/AFIP), pone a disposicion
// el siguiente codigo para su utilizacion con el WebService de Autenticacion y Autorizacion
// de la AFIP.
//
// El mismo no puede ser re-distribuido, publicado o descargado en forma total o parcial, ya sea
// en forma electronica, mecanica u optica, sin la autorizacion de DeSeIn/AFIP. El uso no
// autorizado del mismo esta prohibido.
//
// DeSeIn/AFIP no asume ninguna responsabilidad de los errores que pueda contener el codigo ni la
// obligacion de subsanar dichos errores o informar de la existencia de los mismos.
//
// DeSeIn/AFIP no asume ninguna responsabilidad que surja de la utilizacion del codigo, ya sea por
// utilizacion ilegal de patentes, perdida de beneficios, perdida de informacion o cualquier otro
// inconveniente.
//
// Bajo ninguna circunstancia DeSeIn/AFIP podra ser indicada como responsable por consecuencias y/o
// incidentes ya sean directos o indirectos que puedan surgir de la utilizacion del codigo.
//
// DeSeIn/AFIP no da ninguna garantia, expresa o implicita, de la utilidad del codigo, si el mismo es
// correcto, o si cumple con los requerimientos de algun proposito en particular.
//
// DeSeIn/AFIP puede realizar cambios en cualquier momento en el codigo sin previo aviso.
//
// El codigo debera ser evaluado, verificado, corregido y/o adaptado por personal tecnico calificado
// de las entidades que lo utilicen.
//
// EL SIGUIENTE CODIGO ES DISTRIBUIDO PARA EVALUACION, CON TODOS SUS ERRORES Y OMISIONES. LA
// RESPONSABILIDAD DEL CORRECTO FUNCIONAMIENTO DEL MISMO YA SEA POR SI SOLO O COMO PARTE DE
// OTRA APLICACION, QUEDA A CARGO DE LAS ENTIDADES QUE LO UTILICEN. LA UTILIZACION DEL CODIGO
// SIGNIFICA LA ACEPTACION DE TODOS LOS TERMINOS Y CONDICIONES MENCIONADAS ANTERIORMENTE.
//
// Version 1.0
// gp/rg/OF.G. DeSeIn-AFIP
//
import coop.guenoa.afip.util.Token;

public class Wsaa {
	
	public static String wsfe = "wsfe";
	public static String ws_sr_padron_a4 = "ws_sr_padron_a4";
	public static String ws_sr_padron_a5 = "ws_sr_padron_a5";

	
	private Logger log = Logger.getLogger(Wsaa.class);

	private TicketLogin ticketLogin = null;

	private String service = null;

	private PrivateKey pKey = null;

	private X509Certificate pCertificate = null;

	private String filename;

	public Wsaa(String service) {

		this.service = service;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public PrivateKey getpKey() {
		return pKey;
	}

	public void setpKey(PrivateKey pKey) {
		this.pKey = pKey;
	}

	public X509Certificate getpCertificate() {
		return pCertificate;
	}

	public void setpCertificate(X509Certificate pCertificate) {
		this.pCertificate = pCertificate;
	}

	public TicketLogin getTicketLogin() throws WsaaException {

		try {

			filename = Configuracion.CUIT+"-"+this.service ;
			
			buscarTicketAlmacenado();
			if (ticketLogin == null || !ticketLogin.esVigente()) {
				log.debug("No existe Certificado vignete");
				System.out.println("Obtener nuevo Certificado");
				ObtenerCentificadoAfip();
			}

		} catch (DocumentException | ServiceException | IOException | UnrecoverableKeyException | KeyStoreException
				| NoSuchAlgorithmException | CertificateException | OperatorCreationException | ParseException
				| CMSException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException
				| BadPaddingException e) {
			log.error("ObtenerCentificadoAfip", e);

			throw new WsaaException(e);
		}

		return ticketLogin;
	}

	private void loadp12file(String p12file, String p12pass, String signer) throws KeyStoreException,
			NoSuchAlgorithmException, CertificateException, IOException, UnrecoverableKeyException {
		//
		// Manage Keys & Certificates
		//
		// Create a keystore using keys from the pkcs#12 p12file
		KeyStore ks = KeyStore.getInstance("pkcs12");
		FileInputStream p12stream = new FileInputStream(p12file);
		ks.load(p12stream, p12pass.toCharArray());
		p12stream.close();

		// Get Certificate & Private key from KeyStore
		pKey = (PrivateKey) ks.getKey(signer, p12pass.toCharArray());

		pCertificate = (X509Certificate) ks.getCertificate(signer);
		String signerDN = pCertificate.getSubjectDN().toString();
		log.info("DN: " + signerDN);
	}

	//
	// Create the CMS Message
	//
	private byte[] create_cms(String dstDN, String service, int ticketTime)
			throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException,
			UnrecoverableKeyException, DocumentException, OperatorCreationException, CMSException {
		byte[] asn1_cms = null;
		String loginTicketRequest_xml;
		String signerDN = null;

		// Create a list of Certificates to include in the final CMS
		ArrayList<X509Certificate> certList = new ArrayList<X509Certificate>();
		certList.add(pCertificate);

		Store<?> certs = new JcaCertStore(certList);

		if (Security.getProvider("BC") == null) {
			Security.addProvider(new BouncyCastleProvider());
		}

		signerDN = pCertificate.getSubjectDN().toString();
		log.info("DN: " + signerDN);

		//
		// Create XML Message
		//
		loginTicketRequest_xml = createLoginTicketRequest(signerDN, dstDN, service, ticketTime);

		//
		// Create CMS Message
		//
		// Create a new empty CMS Message
		CMSSignedDataGenerator gen = new CMSSignedDataGenerator();

		ContentSigner sha1Signer = new JcaContentSignerBuilder("SHA1withRSA").setProvider("BC").build(pKey);
		gen.addSignerInfoGenerator(
				new JcaSignerInfoGeneratorBuilder(new JcaDigestCalculatorProviderBuilder().setProvider("BC").build())
						.build(sha1Signer, pCertificate));
		gen.addCertificates(certs);

		// the data (XML) to the Message
		CMSTypedData data = new CMSProcessableByteArray(loginTicketRequest_xml.getBytes());

		CMSSignedData sigData = gen.generate(data, true);

		asn1_cms = sigData.getEncoded();

		log.info("Enveloped data: " + asn1_cms.toString());

		return asn1_cms;
	}

	//
	// Create XML Message for AFIP wsaa
	//
	private String createLoginTicketRequest(String SignerDN, String dstDN, String service, int TicketTime)
			throws DocumentException, IOException {
		String loginTicketRequest_xml;
		Date GenTime = new Date();
		String UniqueId = new Long(GenTime.getTime() / 1000).toString();

		GregorianCalendar gentime = new GregorianCalendar();
		XMLGregorianCalendarImpl XMLGenTime = new XMLGregorianCalendarImpl(gentime);

		GregorianCalendar exptime = new GregorianCalendar();
		exptime.add(GregorianCalendar.SECOND, TicketTime);
		XMLGregorianCalendarImpl XMLExpTime = new XMLGregorianCalendarImpl(exptime);

		loginTicketRequest_xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
				+ "<loginTicketRequest version=\"1.0\">" + "<header>" + "<source>" + SignerDN + "</source>"
				+ "<destination>" + dstDN + "</destination>" + "<uniqueId>" + UniqueId + "</uniqueId>"
				+ "<generationTime>" + XMLGenTime + "</generationTime>" + "<expirationTime>" + XMLExpTime
				+ "</expirationTime>" + "</header>" + "<service>" + service + "</service>" + "</loginTicketRequest>";
		Document document = DocumentHelper.parseText(loginTicketRequest_xml);

		FileWriter out = new FileWriter("loginTicketRequest.xml");
		document.write(out);
		out.close();

		return loginTicketRequest_xml;
	}

	private void ObtenerCentificadoAfip()
			throws ServiceException, DocumentException, IOException, ParseException, UnrecoverableKeyException,
			KeyStoreException, NoSuchAlgorithmException, CertificateException, OperatorCreationException, CMSException,
			InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {

		String endpoint = Configuracion.HOMOLOCION ? "https://wsaahomo.afip.gov.ar/ws/services/LoginCms" : "";

		String dstDN = Configuracion.DSTDN;

		String p12file = Configuracion.KEYSTORE;
		String signer = Configuracion.KEYSTORE_USER;
		String p12pass = Configuracion.KEYSTORE_PASS;
		int ticketTime = Configuracion.TICKETTIME;

		loadp12file(p12file, p12pass, signer);

		// Set proxy system vars
		System.setProperty("http.proxyHost", Configuracion.HTTP_PROXY);
		System.setProperty("http.proxyPort", Configuracion.HTTP_PROXY_PORT);
		System.setProperty("http.proxyUser", Configuracion.HTTP_PROXY_USER);
		System.setProperty("http.proxyPassword", Configuracion.HTTP_PROXY_PASS);

		// Set the keystore used by SSL
		/*
		 * System.setProperty("javax.net.ssl.trustStore",
		 * config.getProperty("trustStore", ""));
		 * System.setProperty("javax.net.ssl.trustStorePassword",
		 * config.getProperty("trustStore_password", ""));
		 */

		// Create LoginTicketRequest_xml_cms
		byte[] LoginTicketRequest_xml_cms = create_cms(dstDN, service, ticketTime);
		// Invoke AFIP wsaa and get LoginTicketResponse

		String ticketResponse = invoke_wsaa(LoginTicketRequest_xml_cms, endpoint);

		Token.guardar(filename, ticketResponse);

		ticketLogin = llenarEntidadTicketResponse(ticketResponse);

	}

	private TicketLogin llenarEntidadTicketResponse(String ticketResponse) throws ParseException, DocumentException {

		Document document = DocumentHelper.parseText(ticketResponse);

		TicketLogin ticketLogin = new TicketLogin();

		ticketLogin.setToken(document.valueOf("/loginTicketResponse/credentials/token"));

		ticketLogin.setSign(document.valueOf("/loginTicketResponse/credentials/sign"));

		String expirationTime = document.valueOf("/loginTicketResponse/header/expirationTime");

		String format = "yyyy-MM-dd'T'HH:mm:ss.SSSX";

		GregorianCalendar cal = new GregorianCalendar();

		cal.setTime(new SimpleDateFormat(format).parse(expirationTime));

		ticketLogin.setExpirationTime(cal.getTime());

		return ticketLogin;
	}

	private String invoke_wsaa(byte[] LoginTicketRequest_xml_cms, String endpoint)
			throws ServiceException, DocumentException, IOException {

		Service service = new Service();
		Call call = (Call) service.createCall();

		//
		// Prepare the call for the Web service
		//
		call.setTargetEndpointAddress(new java.net.URL(endpoint));
		call.setOperationName("loginCms");
		call.addParameter("request", XMLType.XSD_STRING, ParameterMode.IN);
		call.setReturnType(XMLType.XSD_STRING);

		//
		// Make the actual call and assign the answer to a String
		//
		String loginTicketResponse = (String) call.invoke(new Object[] { Base64.encode(LoginTicketRequest_xml_cms) });
		// LoginTicketResponse = (String) call.invoke(new Object[] {
		// LoginTicketRequest_xml_cms });
		/*
		 * Document document = DocumentHelper.parseText(loginTicketResponse);
		 * 
		 * return document;
		 */

		return loginTicketResponse;
	}

	private void buscarTicketAlmacenado()
			throws DocumentException, ParseException, IOException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		ticketLogin = null;
		String texto;
		texto = Token.leer(filename);

		if (texto != null) {
			ticketLogin = llenarEntidadTicketResponse(texto);
		} else {
			ticketLogin = null;
		}
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * http://chuwiki.chuidiang.org/index.php?title=Encriptacion_con_Java
	 * 
	 * 
	 * 
	 * private static void guardarTicketResponse() throws IOException { File archivo
	 * = new File("loginticket.xml");
	 * 
	 * // Crear objeto FileWriter que sera el que nos ayude a escribir sobre //
	 * archivo FileWriter escribir = new FileWriter(archivo, true);
	 * 
	 * // Escribimos en el archivo con el metodo write
	 * escribir.write(loginTicket.toString());
	 * 
	 * // Cerramos la conexion escribir.close();
	 * 
	 * XMLWriter writer = new XMLWriter();
	 * writer.write(loginTicket.toString().getBytes()); writer.close();
	 * 
	 * }
	 * 
	 * private static void buscarTicketAlmacenado() throws IOException,
	 * DocumentException { FileReader xmlFile = new FileReader("loginticket.xml");
	 * 
	 * SAXBuilder builder = new SAXBuilder();
	 * 
	 * //Se crea el documento a traves del archivo Document document = (Document)
	 * builder.build( xmlFile );
	 * 
	 * //Se obtiene la raiz 'tables' Element rootNode = document.getRootElement();
	 * 
	 * //Se obtiene la lista de hijos de la raiz 'tables' rootNode.get
	 * 
	 * 
	 * 
	 * // El contenido de lector se guarda en un BufferedReader BufferedReader
	 * contenido = new BufferedReader(xmlFile);
	 * 
	 * String texto; String tickelogin = null;
	 * 
	 * 
	 * 
	 * 
	 * while ((texto = contenido.readLine()) != null) {
	 * 
	 * if (tickelogin == null) { tickelogin = texto; } else { tickelogin =
	 * tickelogin.concat(texto).concat(System.getProperty("line.separator")); } }
	 * 
	 * contenido.close();
	 * 
	 * loginTicket = new TicketLogin();
	 * loginTicket.setLoginTicketResponse(tickelogin);
	 * 
	 * System.out.println(tickelogin);
	 * 
	 * }
	 */
}