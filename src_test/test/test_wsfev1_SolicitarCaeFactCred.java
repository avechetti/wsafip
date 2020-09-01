package test;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;

import coop.guenoa.afip.util.Configuracion;
import coop.guenoa.afip.util.Debug;
import coop.guenoa.afip.wsaa.TicketLogin;
import coop.guenoa.afip.wsaa.Wsaa;
import coop.guenoa.afip.wsaa.WsaaException;
import coop.guenoa.afip.wsfev1.AlicIva;
import coop.guenoa.afip.wsfev1.DummyResponse;
import coop.guenoa.afip.wsfev1.FEAuthRequest;
import coop.guenoa.afip.wsfev1.FECAECabRequest;
import coop.guenoa.afip.wsfev1.FECAECabResponse;
import coop.guenoa.afip.wsfev1.FECAEDetRequest;
import coop.guenoa.afip.wsfev1.FECAEDetResponse;
import coop.guenoa.afip.wsfev1.FECAERequest;
import coop.guenoa.afip.wsfev1.FECAEResponse;
import coop.guenoa.afip.wsfev1.Opcional;
import coop.guenoa.afip.wsfev1.Wsfe_v1;
import coop.guenoa.afip.wsfev1.WsFev1Execepcion;

public class test_wsfev1_SolicitarCaeFactCred {

	public static void main(String[] args) {

		Debug.debug = true;

		Wsfe_v1 wsfev1 = new Wsfe_v1(true);

		DummyResponse response;
		try {
			response = wsfev1.FEDummy();
			System.out.println("App Server: " + response.getAppServer());
			System.out.println("Auth Server: " + response.getAuthServer());
			System.out.println("Db Server: " + response.getDbServer());
		} catch (RemoteException e2) {
			e2.printStackTrace();
		}

		Configuracion.readProperty();
		TicketLogin tl = null;
		try {
			Wsaa wsaa = new Wsaa("wsfe");
			tl = wsaa.getTicketLogin();
		} catch (WsaaException e2) {

			e2.printStackTrace();
		}

		Long cuit = Long.valueOf("20286670149");

		FEAuthRequest auth = new FEAuthRequest(tl.getToken(), tl.getSign(), cuit.longValue());

		int ptoVta = 4;
		int cbteTipo = 201;
		int nro_comprobante = 0;
		try {
			nro_comprobante = wsfev1.FECompUltimoAutorizado(auth, ptoVta, cbteTipo).getCbteNro() + 1;

		} catch (RemoteException e1) {

			e1.printStackTrace();
		}

		// nro_comprobante=270;

		System.out.println("Puto de Venta: " + ptoVta);
		System.out.println("Comprobante: " + cbteTipo);
		System.out.println("Nro Combrobante: " + nro_comprobante);

		/*
		 * Cabezera
		 */
		FECAECabRequest feCabReq = new FECAECabRequest(1, ptoVta, cbteTipo);

		
		/*
		 * Detalle
		 */
		FECAEDetRequest[] detalle = new FECAEDetRequest[1];
		detalle[0] = new FECAEDetRequest();
		detalle[0].setConcepto(2);
		
		Date d = new Date();
		SimpleDateFormat form = new SimpleDateFormat("yyyyMMdd");

		detalle[0].setCbteFch(form.format(d));
		detalle[0].setCbteDesde(nro_comprobante);
		detalle[0].setCbteHasta(nro_comprobante);
		detalle[0].setDocTipo(80);
		detalle[0].setDocNro(Long.valueOf("30533004160"));
		detalle[0].setFchServDesde(detalle[0].getCbteFch());
		detalle[0].setFchServHasta(detalle[0].getCbteFch());
		detalle[0].setFchVtoPago(detalle[0].getCbteFch());
		detalle[0].setImpNeto(10000000.00);
		detalle[0].setImpOpEx(0.00);
		detalle[0].setImpIVA(2100000.00);
		detalle[0].setImpTrib(0.00);
		detalle[0].setImpTotConc(0.00);
		detalle[0].setImpTotal(12100000.00);
		detalle[0].setMonId("PES");
		detalle[0].setMonCotiz(1);

		
		/*
		 * Opcionales
		 */
		
		Opcional[] opcionales = new Opcional[1];
		
		opcionales[0] = new  Opcional();
		opcionales[0].setId("2101");
		opcionales[0].setValor("0000000000000000000000");
		detalle[0].setOpcionales(opcionales);
		
		/*
		 * Iva
		 */
		AlicIva[] iva = new AlicIva[2];
		iva[0] = new AlicIva();
		iva[0].setBaseImp(10000000.00);
		iva[0].setId(5);
		iva[0].setImporte(2100000.00);
		detalle[0].setIva(iva);

		
		FECAERequest feCAEReq = new FECAERequest(feCabReq, detalle);

		FECAEResponse result;
		try {
			result = wsfev1.FECAESolicitar(auth, feCAEReq);

			FECAECabResponse cabs = result.getFeCabResp();
			System.out.println(" " + cabs.getResultado());
			System.out.println(" " + cabs.getFchProceso());

			FECAEDetResponse[] resps = result.getFeDetResp();
			for (int i = 0; i < resps.length; i++) {
				FECAEDetResponse fecaeDetResponse = resps[i];
				System.out.println("CAE: " + fecaeDetResponse.getCAE());
				System.out.println(" Fcha Venc: " + fecaeDetResponse.getCAEFchVto());
			}
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (WsFev1Execepcion e1) {

			e1.printStackTrace();

			System.err.println(e1.getMessage());
		}
	}

}
