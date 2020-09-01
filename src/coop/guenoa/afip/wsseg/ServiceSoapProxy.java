package coop.guenoa.afip.wsseg;

public class ServiceSoapProxy implements coop.guenoa.afip.wsseg.ServiceSoap {
	private String _endpoint = null;
	private coop.guenoa.afip.wsseg.ServiceSoap serviceSoap = null;

	public ServiceSoapProxy() {
		_initServiceSoapProxy();
	}

	public ServiceSoapProxy(String endpoint) {
		_endpoint = endpoint;
		_initServiceSoapProxy();
	}

	private void _initServiceSoapProxy() {
		try {
			serviceSoap = (new coop.guenoa.afip.wsseg.ServiceLocator()).getServiceSoap();
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

	public coop.guenoa.afip.wsseg.ServiceSoap getServiceSoap() {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap;
	}

	public coop.guenoa.afip.wsseg.SEGResponseAuthorize SEGAuthorize(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth, coop.guenoa.afip.wsseg.ClsSEGRequest cmp)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.SEGAuthorize(auth, cmp);
	}

	public coop.guenoa.afip.wsseg.SEGGetCMPResponse SEGGetCMP(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth, coop.guenoa.afip.wsseg.ClsSEGGetCMP cmp)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.SEGGetCMP(auth, cmp);
	}

	public coop.guenoa.afip.wsseg.SEGResponse_Tipo_doc SEGGetPARAM_Tipo_doc(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.SEGGetPARAM_Tipo_doc(auth);
	}

	public coop.guenoa.afip.wsseg.SEGResponse_Tipo_IVA SEGGetPARAM_Tipo_IVA(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.SEGGetPARAM_Tipo_IVA(auth);
	}

	public coop.guenoa.afip.wsseg.SEGResponse_Tipo_Cbte SEGGetPARAM_Tipo_Cbte(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.SEGGetPARAM_Tipo_Cbte(auth);
	}

	public coop.guenoa.afip.wsseg.SEGResponse_Mon SEGGetPARAM_MON(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.SEGGetPARAM_MON(auth);
	}

	public coop.guenoa.afip.wsseg.SEGResponseLast_CMP SEGGetLast_CMP(coop.guenoa.afip.wsseg.ClsSEG_LastCMP auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.SEGGetLast_CMP(auth);
	}

	public coop.guenoa.afip.wsseg.DummyResponse SEGDummy() throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.SEGDummy();
	}

	public coop.guenoa.afip.wsseg.SEGResponse_LastID SEGGetLast_ID(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.SEGGetLast_ID(auth);
	}

}