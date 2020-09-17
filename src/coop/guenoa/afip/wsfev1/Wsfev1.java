package coop.guenoa.afip.wsfev1;

public class Wsfev1 implements IServiceWsfeV1 {
	private String _endpoint = null;
	private IServiceWsfeV1 serviceSoap = null;
	private Boolean homologacion = true;

	public Wsfev1() {
		this.homologacion = false;
	}

	public Wsfev1(Boolean homologacion) {
		this.homologacion = homologacion;
		// _initServiceSoapProxy();
	}

	/*
	 * public ServiceSoap(String endpoint) { _endpoint = endpoint;
	 * _initServiceSoapProxy(); }
	 */

	private void _initServiceSoapProxy() {
		try {
			serviceSoap = (new ServiceLocator(homologacion)).getServiceSoap();
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

	public IServiceWsfeV1 getServiceSoap() {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap;
	}

	@Override
	public FECAEResponse FECAESolicitar(FEAuthRequest auth, FECAERequest feCAEReq)
			throws java.rmi.RemoteException, WsFev1Execepcion {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FECAESolicitar(auth, feCAEReq);
	}

	@Override
	public FERegXReqResponse FECompTotXRequest(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FECompTotXRequest(auth);
	}

	@Override
	public DummyResponse FEDummy() throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEDummy();
	}

	@Override
	public FERecuperaLastCbteResponse FECompUltimoAutorizado(FEAuthRequest auth, int ptoVta, int cbteTipo)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FECompUltimoAutorizado(auth, ptoVta, cbteTipo);
	}

	@Override
	public FECompConsultaResponse FECompConsultar(FEAuthRequest auth, FECompConsultaReq feCompConsReq)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FECompConsultar(auth, feCompConsReq);
	}

	@Override
	public FECAEAResponse FECAEARegInformativo(FEAuthRequest auth, FECAEARequest feCAEARegInfReq)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FECAEARegInformativo(auth, feCAEARegInfReq);
	}

	@Override
	public FECAEAGetResponse FECAEASolicitar(FEAuthRequest auth, int periodo, short orden)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FECAEASolicitar(auth, periodo, orden);
	}

	@Override
	public FECAEASinMovConsResponse FECAEASinMovimientoConsultar(FEAuthRequest auth, java.lang.String CAEA, int ptoVta)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FECAEASinMovimientoConsultar(auth, CAEA, ptoVta);
	}

	@Override
	public FECAEASinMovResponse FECAEASinMovimientoInformar(FEAuthRequest auth, int ptoVta, java.lang.String CAEA)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FECAEASinMovimientoInformar(auth, ptoVta, CAEA);
	}

	@Override
	public FECAEAGetResponse FECAEAConsultar(FEAuthRequest auth, int periodo, short orden)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FECAEAConsultar(auth, periodo, orden);
	}

	@Override
	public FECotizacionResponse FEParamGetCotizacion(FEAuthRequest auth, java.lang.String monId)
			throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetCotizacion(auth, monId);
	}

	@Override
	public FETributoResponse FEParamGetTiposTributos(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetTiposTributos(auth);
	}

	@Override
	public MonedaResponse FEParamGetTiposMonedas(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetTiposMonedas(auth);
	}

	@Override
	public IvaTipoResponse FEParamGetTiposIva(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetTiposIva(auth);
	}

	@Override
	public OpcionalTipoResponse FEParamGetTiposOpcional(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetTiposOpcional(auth);
	}

	@Override
	public ConceptoTipoResponse FEParamGetTiposConcepto(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetTiposConcepto(auth);
	}

	@Override
	public FEPtoVentaResponse FEParamGetPtosVenta(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetPtosVenta(auth);
	}

	@Override
	public CbteTipoResponse FEParamGetTiposCbte(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetTiposCbte(auth);
	}

	@Override
	public DocTipoResponse FEParamGetTiposDoc(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetTiposDoc(auth);
	}

	@Override
	public FEPaisResponse FEParamGetTiposPaises(FEAuthRequest auth) throws java.rmi.RemoteException {
		if (serviceSoap == null)
			_initServiceSoapProxy();
		return serviceSoap.FEParamGetTiposPaises(auth);
	}

	public String get_endpoint() {
		return _endpoint;
	}

	public void set_endpoint(String _endpoint) {
		this._endpoint = _endpoint;
	}

	public Boolean getHomologacion() {
		return homologacion;
	}

	public void setHomologacion(Boolean homologacion) {
		this.homologacion = homologacion;
	}

	public void setServiceSoap(IServiceWsfeV1 serviceSoap) {
		this.serviceSoap = serviceSoap;
	}

}