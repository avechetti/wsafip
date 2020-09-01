/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsfev1;

public interface IServiceWsfeV1 extends java.rmi.Remote {

	/**
	 * Solicitud de Código de Autorización Electrónico (CAE)
	 * 
	 * @throws WsFev1Execepcion
	 */
	public FECAEResponse FECAESolicitar(FEAuthRequest auth, FECAERequest feCAEReq)
			throws java.rmi.RemoteException, WsFev1Execepcion;

	/**
	 * Retorna la cantidad maxima de registros que puede tener una invocacion al
	 * metodo FECAESolicitar / FECAEARegInformativo
	 */
	public FERegXReqResponse FECompTotXRequest(FEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Metodo dummy para verificacion de funcionamiento
	 */
	public DummyResponse FEDummy() throws java.rmi.RemoteException;

	/**
	 * Retorna el ultimo comprobante autorizado para el tipo de comprobante / cuit /
	 * punto de venta ingresado / Tipo de Emisión
	 */
	public FERecuperaLastCbteResponse FECompUltimoAutorizado(FEAuthRequest auth, int ptoVta, int cbteTipo)
			throws java.rmi.RemoteException;

	/**
	 * Consulta Comprobante emitido y su código.
	 */
	public FECompConsultaResponse FECompConsultar(FEAuthRequest auth, FECompConsultaReq feCompConsReq)
			throws java.rmi.RemoteException;

	/**
	 * Rendición de comprobantes asociados a un CAEA.
	 */
	public FECAEAResponse FECAEARegInformativo(FEAuthRequest auth, FECAEARequest feCAEARegInfReq)
			throws java.rmi.RemoteException;

	/**
	 * Solicitud de Código de Autorización Electrónico Anticipado (CAEA)
	 */
	public FECAEAGetResponse FECAEASolicitar(FEAuthRequest auth, int periodo, short orden)
			throws java.rmi.RemoteException;

	/**
	 * Consulta CAEA informado como sin movimientos.
	 */
	public FECAEASinMovConsResponse FECAEASinMovimientoConsultar(FEAuthRequest auth, java.lang.String CAEA, int ptoVta)
			throws java.rmi.RemoteException;

	/**
	 * Informa CAEA sin movimientos.
	 */
	public FECAEASinMovResponse FECAEASinMovimientoInformar(FEAuthRequest auth, int ptoVta, java.lang.String CAEA)
			throws java.rmi.RemoteException;

	/**
	 * Consultar CAEA emitidos.
	 */
	public FECAEAGetResponse FECAEAConsultar(FEAuthRequest auth, int periodo, short orden)
			throws java.rmi.RemoteException;

	/**
	 * Recupera la cotizacion de la moneda consultada y su fecha
	 */
	public FECotizacionResponse FEParamGetCotizacion(FEAuthRequest auth, java.lang.String monId)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los diferente tributos que pueden ser utilizados en el
	 * servicio de autorizacion
	 */
	public FETributoResponse FEParamGetTiposTributos(FEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de monedas utilizables en servicio de autorización
	 */
	public MonedaResponse FEParamGetTiposMonedas(FEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de Tipos de Iva utilizables en servicio de autorización.
	 */
	public IvaTipoResponse FEParamGetTiposIva(FEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de identificadores para los campos Opcionales
	 */
	public OpcionalTipoResponse FEParamGetTiposOpcional(FEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de identificadores para el campo Concepto.
	 */
	public ConceptoTipoResponse FEParamGetTiposConcepto(FEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de puntos de venta registrados y su estado
	 */
	public FEPtoVentaResponse FEParamGetPtosVenta(FEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de Tipos de Comprobantes utilizables en servicio de
	 * autorización.
	 */
	public CbteTipoResponse FEParamGetTiposCbte(FEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de Tipos de Documentos utilizables en servicio de
	 * autorización.
	 */
	public DocTipoResponse FEParamGetTiposDoc(FEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los diferente paises que pueden ser utilizados en el
	 * servicio de autorizacion
	 */
	public FEPaisResponse FEParamGetTiposPaises(FEAuthRequest auth) throws java.rmi.RemoteException;
}
