package coop.guenoa.afip.wsfexv1;

public class ServiceSoapProxy implements coop.guenoa.afip.wsfexv1.IServiceSoap {
	private String _endpoint = null;
	private coop.guenoa.afip.wsfexv1.IServiceSoap serviceSoap = null;

	public ServiceSoapProxy() {
		_initServiceSoapProxy();
	}

	public ServiceSoapProxy(String endpoint) {
		_endpoint = endpoint;
		_initServiceSoapProxy();
	}

	private void _initServiceSoapProxy() {
		try {
			serviceSoap = (new coop.guenoa.afip.wsfexv1.ServiceLocator()).getServiceSoap();
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

	public coop.guenoa.afip.wsfexv1.IServiceSoap getServiceSoap() {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap;
	}

	public coop.guenoa.afip.wsfexv1.FEXResponseAuthorize FEXAuthorize(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth, coop.guenoa.afip.wsfexv1.ClsFEXRequest cmp)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXAuthorize(auth, cmp);
	}

	public coop.guenoa.afip.wsfexv1.FEXGetCMPResponse FEXGetCMP(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth, coop.guenoa.afip.wsfexv1.ClsFEXGetCMP cmp)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetCMP(auth, cmp);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_Cbte_Tipo FEXGetPARAM_Cbte_Tipo(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_Cbte_Tipo(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_Tex FEXGetPARAM_Tipo_Expo(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_Tipo_Expo(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_Inc FEXGetPARAM_Incoterms(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_Incoterms(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_Idi FEXGetPARAM_Idiomas(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_Idiomas(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_Umed FEXGetPARAM_UMed(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_UMed(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_DST_pais FEXGetPARAM_DST_pais(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_DST_pais(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_DST_cuit FEXGetPARAM_DST_CUIT(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_DST_CUIT(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_Mon FEXGetPARAM_MON(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_MON(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponseLast_CMP FEXGetLast_CMP(coop.guenoa.afip.wsfexv1.ClsFEX_LastCMP auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetLast_CMP(auth);
	}

	public coop.guenoa.afip.wsfexv1.DummyResponse FEXDummy() throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXDummy();
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_Ctz FEXGetPARAM_Ctz(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth, java.lang.String mon_id)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_Ctz(auth, mon_id);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_LastID FEXGetLast_ID(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetLast_ID(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_PtoVenta FEXGetPARAM_PtoVenta(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXGetPARAM_PtoVenta(auth);
	}

	public coop.guenoa.afip.wsfexv1.FEXResponse_CheckPermiso FEXCheck_Permiso(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth,
			java.lang.String ID_Permiso, int dst_merc) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEXCheck_Permiso(auth, ID_Permiso, dst_merc);
	}

}