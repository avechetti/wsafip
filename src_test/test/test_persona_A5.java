package test;

import afip.padron.a5.PersonaReturn;
import afip.padron.a5.PersonaServiceA5;
import afip.padron.a5.PersonaServiceA5_Service;
import afip.padron.a5.SRValidationException_Exception;
import coop.guenoa.afip.util.Configuracion;
import coop.guenoa.afip.wsaa.TicketLogin;
import coop.guenoa.afip.wsaa.Wsaa;
import coop.guenoa.afip.wsaa.WsaaException;

public class test_persona_A5 {

	public static void main(String[] args) {

		PersonaServiceA5_Service personaService = new PersonaServiceA5_Service();

		PersonaServiceA5 personaPort = personaService.getPersonaServiceA5Port();

		Wsaa wsaa = new Wsaa(Wsaa.ws_sr_padron_a5);

		TicketLogin tl;
		try {
			tl = wsaa.getTicketLogin();

			PersonaReturn personaReturn = personaPort.getPersona(tl.getToken(), tl.getSign(),
					Long.valueOf(Configuracion.CUIT), Long.valueOf("20221062583"));
			

		} catch (WsaaException e) {

			e.printStackTrace();
		} catch (NumberFormatException e) {

			e.printStackTrace();
		} catch (SRValidationException_Exception e) {

			e.printStackTrace();
		}

		/*
		 * //dummy = personaService.
		 * 
		 * System.out.println(dummy.toString());
		 * 
		 * Configuracion.readProperty(); TicketLogin tl = null;
		 * 
		 * Wsaa wsaa = new Wsaa(Wsaa.ws_sr_padron_a5);
		 * 
		 * tl = wsaa.getTicketLogin();
		 * 
		 * PersonaReturn personaReturn = personaService.getPersona(tl.getToken(),
		 * tl.getSign(), Long.valueOf(Configuracion.CUIT), Long.valueOf("20221062583"));
		 * 
		 * DatosGenerales generales = personaReturn.getDatosGenerales();
		 * 
		 * System.out.println(generales.toString());
		 */

	}

}
