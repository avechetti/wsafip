package test;

import java.rmi.RemoteException;

import coop.guenoa.afip.padron.a4.DummyReturn;
import coop.guenoa.afip.padron.a4.Persona;
import coop.guenoa.afip.padron.a4.PersonaReturn;
import coop.guenoa.afip.padron.a4.PersonaServiceA4;
import coop.guenoa.afip.util.Configuracion;
import coop.guenoa.afip.wsaa.TicketLogin;
import coop.guenoa.afip.wsaa.Wsaa;
import coop.guenoa.afip.wsaa.WsaaException;

public class test_persona_A4 {

	public static void main(String[] args) {

		try {
			PersonaServiceA4 personaService = new PersonaServiceA4();

			DummyReturn dummy = personaService.dummy();

			System.out.println(dummy.toString());

			Configuracion.readProperty();
			TicketLogin tl = null;

			Wsaa wsaa = new Wsaa(Wsaa.ws_sr_padron_a4);
			
			tl = wsaa.getTicketLogin();

			PersonaReturn personaReturn = personaService.getPersona(tl.getToken(), tl.getSign(), Long.valueOf(Configuracion.CUIT),
					Long.valueOf("20187986843"));

			Persona persona  = personaReturn.getPersona();
			
			System.out.println(persona.toString());
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (WsaaException e) {
			e.printStackTrace();
		}

	}

}
