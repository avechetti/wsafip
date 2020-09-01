package coop.guenoa.afip.FECredService;

public class FECredServicePortTypeProxy implements FECredServicePortType {
	private String _endpoint = null;
	private FECredServicePortType fECredServicePortType = null;

	public FECredServicePortTypeProxy() {
		_initFECredServicePortTypeProxy();
	}

	public FECredServicePortTypeProxy(String endpoint) {
		_endpoint = endpoint;
		_initFECredServicePortTypeProxy();
	}

	private void _initFECredServicePortTypeProxy() {
		try {
			fECredServicePortType = (new FECredServiceLocator()).getFECredServiceSOAP();
			if (fECredServicePortType != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) fECredServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address",
							_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) fECredServicePortType)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (fECredServicePortType != null)
			((javax.xml.rpc.Stub) fECredServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address",
					_endpoint);

	}

	public FECredServicePortType getFECredServicePortType() {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType;
	}

	public DummyResponseType dummy() throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.dummy();
	}

	public ConsultarComprobantesResponseType consultarComprobantes(ConsultarComprobanteRequestType parameters)
			throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarComprobantes(parameters);
	}

	public RechazarNotaDCResponseType rechazarNotaDC(RechazarNotaDCRequestType parameters)
			throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.rechazarNotaDC(parameters);
	}

	public ConsultarCtasCtesResponseType consultarCtasCtes(ConsultarCtasCtesRequestType parameters)
			throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarCtasCtes(parameters);
	}

	public ConsultarCtaCteResponseType consultarCtaCte(ConsultarCtaCteRequestType parameters)
			throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarCtaCte(parameters);
	}

	public OperacionFECredResponseType informarCancelacionTotalFECred(
			InformarCancelacionTotalFECredRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.informarCancelacionTotalFECred(parameters);
	}

	public OperacionFECredResponseType aceptarFECred(AceptarFECredRequestType parameters)
			throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.aceptarFECred(parameters);
	}

	public OperacionFECredResponseType rechazarFECred(RechazarFECredRequestType parameters)
			throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.rechazarFECred(parameters);
	}

	public OperacionFECredResponseType informarFacturaAgtDptoCltv(InformarFacturaAgtDptoCltvRequestType parameters)
			throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.informarFacturaAgtDptoCltv(parameters);
	}

	public ConsultarFacturasAgtDptoCltvResponseType consultarFacturasAgtDptoCltv(
			ConsultarFacturasAgtDptoCltvRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarFacturasAgtDptoCltv(parameters);
	}

	public ConsultarCuentasComitenteResponseType consultarCuentasComitente(
			ConsultarCuentasComitenteRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarCuentasComitente(parameters);
	}

	public ConsultarObligadoRecepcionResponseType consultarObligadoRecepcion(
			ConsultarObligadoRecepcionRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarObligadoRecepcion(parameters);
	}

	public ConsultarTiposRetencionesResponseType consultarTiposRetenciones(
			ConsultarCodigoDescripcionRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarTiposRetenciones(parameters);
	}

	public ConsultarCodigoDescripcionResponseType consultarTiposMotivosRechazo(
			ConsultarCodigoDescripcionRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarTiposMotivosRechazo(parameters);
	}

	public ConsultarCodigoDescripcionResponseType consultarTiposFormasCancelacion(
			ConsultarCodigoDescripcionRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarTiposFormasCancelacion(parameters);
	}

	public ObtenerRemitosResponseType obtenerRemitos(ObtenerRemitosRequestType parameters)
			throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.obtenerRemitos(parameters);
	}

	public ConsultarHistorialEstadosComprobanteResponseType consultarHistorialEstadosComprobante(
			ConsultarHistorialEstadosComprobanteRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarHistorialEstadosComprobante(parameters);
	}

	public ConsultarHistorialEstadosCtaCteResponseType consultarHistorialEstadosCtaCte(
			ConsultarHistorialEstadosCtaCteRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarHistorialEstadosCtaCte(parameters);
	}

	public ConsultarCodigoDescripcionResponseType consultarTiposAjustesOperacion(
			ConsultarCodigoDescripcionRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarTiposAjustesOperacion(parameters);
	}

	public ConsultarMontoObligadoRecepcionResponseType consultarMontoObligadoRecepcion(
			ConsultarMontoObligadoRecepcionRequestType parameters) throws java.rmi.RemoteException {
		if (fECredServicePortType == null)
			_initFECredServicePortTypeProxy();
		return fECredServicePortType.consultarMontoObligadoRecepcion(parameters);
	}

}