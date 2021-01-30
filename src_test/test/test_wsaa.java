package test;

import coop.guenoa.afip.util.Configuracion;
import coop.guenoa.afip.wsaa.TicketLogin;
import coop.guenoa.afip.wsaa.Wsaa;
import coop.guenoa.afip.wsaa.WsaaException;

public class test_wsaa {

	public static void main(String[] args) {

		System.setProperty("http.proxyHost", "");
		System.setProperty("http.proxyPort", "80");

		Configuracion.readProperty();

		Wsaa wsaa = new Wsaa("wsfe");
		
		TicketLogin ticketResponse = null;
		try {
			ticketResponse = wsaa.getTicketLogin();
		} catch (WsaaException e) {
			e.printStackTrace();
		}

		String token = ticketResponse.getToken();
		String sign = ticketResponse.getSign();
		
		ticketResponse.esVigente();

		System.out.println("TOKEN: " + token);
		System.out.println("SIGN: " + sign);
	}
}