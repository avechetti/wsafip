/**
 * 
 */
package coop.guenoa.afip.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author avechetti
 *
 */
public class Configuracion {

	public static Boolean HOMOLOCION = true;
	public static Boolean DEBUG = true;

	public static String DSTDN = "cn=wsaahomo,o=afip,c=ar,serialNumber=CUIT 33693450239";
	public static String KEYSTORE = "";
	public static String KEYSTORE_USER = "";
	public static String KEYSTORE_PASS = "";

	public static String HTTP_PROXY = "";
	public static String HTTP_PROXY_PORT = "";
	public static String HTTP_PROXY_USER = "";
	public static String HTTP_PROXY_PASS = "";
	public static Integer TICKETTIME = 60*60;

	public static String CUIT = "";

	public static void readProperty() {
		Properties config = new Properties();

		try {
			config.load(new FileInputStream("./wsafip.properties"));
		} catch (IOException e) {
		}

		DSTDN = config.getProperty("dstdn", "cn=wsaahomo,o=afip,c=ar,serialNumber=CUIT 33693450239");

		KEYSTORE = config.getProperty("keystore", "certificado.p12");
		KEYSTORE_USER = config.getProperty("keystore-signer", "");
		KEYSTORE_PASS = config.getProperty("keystore-password", "");

		HTTP_PROXY = config.getProperty("http_proxy", "");
		HTTP_PROXY_PORT = config.getProperty("http_proxy_port", "");
		HTTP_PROXY_USER = config.getProperty("http_proxy_user", "");
		HTTP_PROXY_PASS = config.getProperty("http_proxy_password", "");

		CUIT = config.getProperty("cuit");


		/*
		 * // Set proxy system vars System.setProperty("http.proxyHost",
		 * config.getProperty("http_proxy", ""));
		 * System.setProperty("http.proxyPort",
		 * config.getProperty("http_proxy_port", ""));
		 * System.setProperty("http.proxyUser",
		 * config.getProperty("http_proxy_user", ""));
		 * System.setProperty("http.proxyPassword",
		 * config.getProperty("http_proxy_password", ""));
		 */
		// Set the keystore used by SSL
		/*
		 * System.setProperty("javax.net.ssl.trustStore",
		 * config.getProperty("trustStore", ""));
		 * System.setProperty("javax.net.ssl.trustStorePassword",
		 * config.getProperty("trustStore_password", ""));
		 */
	}
}
