package test;

import java.rmi.RemoteException;

import coop.guenoa.afip.util.Configuracion;
import coop.guenoa.afip.util.Debug;
import coop.guenoa.afip.wsaa.TicketLogin;
import coop.guenoa.afip.wsaa.Wsaa;
import coop.guenoa.afip.wsaa.WsaaException;
import coop.guenoa.afip.wsfev1.DummyResponse;
import coop.guenoa.afip.wsfev1.Err;
import coop.guenoa.afip.wsfev1.Evt;
import coop.guenoa.afip.wsfev1.FEAuthRequest;
import coop.guenoa.afip.wsfev1.FECompConsultaReq;
import coop.guenoa.afip.wsfev1.FECompConsultaResponse;
import coop.guenoa.afip.wsfev1.Wsfev1;

public class test_wsfev1_ConsultarCae {

	public static void main(String[] args) throws RemoteException {

		Debug.debug = true;

		Wsfev1 wsfev1 = new Wsfev1(true);

		DummyResponse response = wsfev1.FEDummy();
		System.out.println("App Server: " + response.getAppServer());
		System.out.println("Auth Server: " + response.getAuthServer());
		System.out.println("Db Server: " + response.getDbServer());

		Configuracion.readProperty();
		TicketLogin tl = null;
		try {
			Wsaa wsaa = new Wsaa("wsfe");
			tl = wsaa.getTicketLogin();
		} catch (WsaaException e) {
			e.printStackTrace();
		}

		Long cuit = Long.valueOf("20286670149");

		FEAuthRequest auth = new FEAuthRequest(tl.getToken(), tl.getSign(), cuit.longValue());

		int ptoVta = 6;
		int cbteTipo = 6;
		long cbteNro = wsfev1.FECompUltimoAutorizado(auth, ptoVta, cbteTipo).getCbteNro();

		System.out.println("Puto de Venta: " + ptoVta);
		System.out.println("Comprobante: " + cbteTipo);
		System.out.println("Nro Combrobante: " + cbteNro);

		FECompConsultaReq feCompConsReq = new FECompConsultaReq(cbteTipo, cbteNro, ptoVta);

		FECompConsultaResponse result = wsfev1.FECompConsultar(auth, feCompConsReq);

		Err[] errs = result.getErrors();
		if (errs != null) {
			for (int i = 0; i < errs.length; i++) {
				Err err = errs[i];
				System.err.println("Err " + err.getCode() + err.getMsg());
			}
		}

		Evt[] evs = result.getEvents();
		if (evs != null) {
			for (int i = 0; i < evs.length; i++) {
				Evt evt = evs[i];
				System.out.println("Evs " + evt.getMsg());
			}
		}

	}

}
