package coop.guenoa.afip.wsbfev1;

public class ServiceSoap implements coop.guenoa.afip.wsbfev1.IServiceSoap {
	private String _endpoint = null;
	private coop.guenoa.afip.wsbfev1.IServiceSoap serviceSoap = null;

	public ServiceSoap() {
		_initServiceSoapProxy();
	}

	public ServiceSoap(String endpoint) {
		_endpoint = endpoint;
		_initServiceSoapProxy();
	}

	private void _initServiceSoapProxy() {
		try {
			serviceSoap = (new coop.guenoa.afip.wsbfev1.ServiceLocator()).getServiceSoap();
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

	public coop.guenoa.afip.wsbfev1.IServiceSoap getServiceSoap() {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap;
	}

	public coop.guenoa.afip.wsbfev1.BFEResponseAuthorize BFEAuthorize(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth, coop.guenoa.afip.wsbfev1.ClsBFERequest cmp)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEAuthorize(auth, cmp);
	}

	public coop.guenoa.afip.wsbfev1.BFEGetCMPResponse BFEGetCMP(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth, coop.guenoa.afip.wsbfev1.ClsBFEGetCMP cmp)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetCMP(auth, cmp);
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_doc BFEGetPARAM_Tipo_doc(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetPARAM_Tipo_doc(auth);
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_IVA BFEGetPARAM_Tipo_IVA(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetPARAM_Tipo_IVA(auth);
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Opc BFEGetPARAM_Tipo_Opc(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetPARAM_Tipo_Opc(auth);
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Zon BFEGetPARAM_Zonas(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetPARAM_Zonas(auth);
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_Cbte BFEGetPARAM_Tipo_Cbte(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetPARAM_Tipo_Cbte(auth);
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Umed BFEGetPARAM_UMed(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetPARAM_UMed(auth);
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_NCM BFEGetPARAM_NCM(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetPARAM_NCM(auth);
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Mon BFEGetPARAM_MON(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetPARAM_MON(auth);
	}

	public coop.guenoa.afip.wsbfev1.BFEResponseLast_CMP BFEGetLast_CMP(coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetLast_CMP(auth);
	}

	public coop.guenoa.afip.wsbfev1.DummyResponse BFEDummy() throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEDummy();
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_LastID BFEGetLast_ID(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.BFEGetLast_ID(auth);
	}

}