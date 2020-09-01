package test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import coop.guenoa.afip.FECredService.AuthRequestType;
import coop.guenoa.afip.FECredService.ConsultarComprobanteRequestType;
import coop.guenoa.afip.FECredService.ConsultarComprobantesResponseType;
import coop.guenoa.afip.FECredService.FECredServiceLocator;
import coop.guenoa.afip.FECredService.FECredServicePortType;
import coop.guenoa.afip.FECredService.FECredServiceSOAPStub;
import coop.guenoa.afip.util.Configuracion;
import coop.guenoa.afip.wsaa.TicketLogin;
import coop.guenoa.afip.wsaa.Wsaa;
import coop.guenoa.afip.wsaa.WsaaException;

public class test_FECredService_Consultar_Comprobantes {

	public static void main(String[] args) {

		Configuracion.readProperty();
		TicketLogin tl = null;
		try {
			Wsaa wsaa = new Wsaa("wsfe");
			tl = wsaa.getTicketLogin();

		} catch (WsaaException e2) {
			e2.printStackTrace();
		}

		try {
			FECredServiceLocator feCredServiceLocator = new FECredServiceLocator();

			FECredServicePortType feCredService = feCredServiceLocator.getFECredServiceSOAP();

			ConsultarComprobanteRequestType parameters = new ConsultarComprobanteRequestType();

			AuthRequestType authRequest = new AuthRequestType();

			//authRequest.setCuitRepresentada(Long.valueOf(Configuracion.CUIT));
			
			authRequest.setCuitRepresentada(Long.valueOf("30500120882"));

			authRequest.setSign(tl.getSign());
			authRequest.setToken(tl.getToken());

			parameters.setAuthRequest(authRequest);

			ConsultarComprobantesResponseType comprobantes = feCredService.consultarComprobantes(parameters);

		} catch (RemoteException | ServiceException e) {

			e.printStackTrace();
		}

	}

}
