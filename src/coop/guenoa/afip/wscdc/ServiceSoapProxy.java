package coop.guenoa.afip.wscdc;

public class ServiceSoapProxy implements coop.guenoa.afip.wscdc.IServiceSoap {
	private String _endpoint = null;
	private coop.guenoa.afip.wscdc.IServiceSoap serviceSoap = null;

	public ServiceSoapProxy() {
		_initServiceSoapProxy();
	}

	public ServiceSoapProxy(String endpoint) {
		_endpoint = endpoint;
		_initServiceSoapProxy();
	}

	private void _initServiceSoapProxy() {
		try {
			serviceSoap = (new coop.guenoa.afip.wscdc.ServiceLocator()).getServiceSoap();
			if (serviceSoap != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address",
							_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) serviceSoap)
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
		if (serviceSoap != null)
			((javax.xml.rpc.Stub) serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public coop.guenoa.afip.wscdc.IServiceSoap getServiceSoap() {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap;
	}

	public coop.guenoa.afip.wscdc.FacModTipoResponse comprobantesModalidadConsultar(coop.guenoa.afip.wscdc.CmpAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.comprobantesModalidadConsultar(auth);
	}

	public coop.guenoa.afip.wscdc.CbteTipoResponse comprobantesTipoConsultar(coop.guenoa.afip.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.comprobantesTipoConsultar(auth);
	}

	public coop.guenoa.afip.wscdc.DocTipoResponse documentosTipoConsultar(coop.guenoa.afip.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.documentosTipoConsultar(auth);
	}

	public coop.guenoa.afip.wscdc.OpcionalTipoResponse opcionalesTipoConsultar(coop.guenoa.afip.wscdc.CmpAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.opcionalesTipoConsultar(auth);
	}

	public coop.guenoa.afip.wscdc.CmpResponse comprobanteConstatar(coop.guenoa.afip.wscdc.CmpAuthRequest auth, coop.guenoa.afip.wscdc.CmpDatos cmpReq)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.comprobanteConstatar(auth, cmpReq);
	}

	public coop.guenoa.afip.wscdc.DummyResponse comprobanteDummy() throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.comprobanteDummy();
	}

}