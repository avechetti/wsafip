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
import coop.guenoa.afip.wsfev1.CbteTipo;
import coop.guenoa.afip.wsfev1.CbteTipoResponse;
import coop.guenoa.afip.wsfev1.DummyResponse;
import coop.guenoa.afip.wsfev1.FEAuthRequest;
import coop.guenoa.afip.wsfev1.FECAECabRequest;
import coop.guenoa.afip.wsfev1.FECAECabResponse;
import coop.guenoa.afip.wsfev1.FECAEDetRequest;
import coop.guenoa.afip.wsfev1.FECAEDetResponse;
import coop.guenoa.afip.wsfev1.FECAERequest;
import coop.guenoa.afip.wsfev1.FECAEResponse;
import coop.guenoa.afip.wsfev1.Wsfev1;
import coop.guenoa.afip.wsfev1.WsFev1Execepcion;

public class test_wsfev1_TipoDeComprobantes {

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
			CbteTipoResponse tipoComprobantes = wsfev1.FEParamGetTiposCbte(auth);
			
			for (int i = 0; i < tipoComprobantes.getResultGet().length; i++) {
				
				CbteTipo tipoComprobante = tipoComprobantes.getResultGet()[i];
				
				System.out.println(tipoComprobante.toString());
				
				
			}   
			
			
		} catch (RemoteException e) {
		
			
			
			
			e.printStackTrace();
		}
	  	
	  	
	  	
		
		

	}
}
