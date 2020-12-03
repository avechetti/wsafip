package test;

import java.rmi.RemoteException;

import coop.guenoa.afip.util.Configuracion;
import coop.guenoa.afip.util.Debug;
import coop.guenoa.afip.wsaa.TicketLogin;
import coop.guenoa.afip.wsaa.Wsaa;
import coop.guenoa.afip.wsaa.WsaaException;
import coop.guenoa.afip.wsfev1.DummyResponse;
import coop.guenoa.afip.wsfev1.FEAuthRequest;
import coop.guenoa.afip.wsfev1.OpcionalTipoResponse;
import coop.guenoa.afip.wsfev1.Wsfev1;

public class test_wsfev1_FEParamGetTiposConceptos {

	public static void main(String[] args) {

		Debug.debug = true;

		Wsfev1 wsfev1 = new Wsfev1(true);

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

		try {
			OpcionalTipoResponse opcional = wsfev1.FEParamGetTiposOpcional(auth);

			for (int i = 0; i < opcional.getErrors().length; i++) {

				System.err.println(opcional.getErrors()[i]);

			}

			for (int i = 0; i < opcional.getResultGet().length; i++) {

				System.out.println(opcional.getResultGet()[i]);
			}

		} catch (RemoteException e) {

			e.printStackTrace();
		}

	}
}
