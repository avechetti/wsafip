/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public interface IServiceSoap extends java.rmi.Remote {

	/**
	 * Autoriza un comprobante, devolviendo su CAE correspondiente
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponseAuthorize BFEAuthorize(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth, coop.guenoa.afip.wsbfev1.ClsBFERequest cmp)
			throws java.rmi.RemoteException;

	/**
	 * Recupera los datos completos de un comprobante ya autorizado
	 */
	public coop.guenoa.afip.wsbfev1.BFEGetCMPResponse BFEGetCMP(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth, coop.guenoa.afip.wsbfev1.ClsBFEGetCMP cmp)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los tipos de comprobante y su codigo utilizables
	 * en servicio de autorizacion
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_doc BFEGetPARAM_Tipo_doc(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de las alicuotas de IVA y su codigo utilizables en
	 * servicio de autorizacion
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_IVA BFEGetPARAM_Tipo_IVA(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los opcionales y su codigo utilizables en servicio
	 * de autorizacion
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponse_Opc BFEGetPARAM_Tipo_Opc(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de las alicuotas de IVA y su codigo utilizables en
	 * servicio de autorizacion
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponse_Zon BFEGetPARAM_Zonas(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los tipos de comprobante y su codigo utilizables
	 * en servicio de autorizacion
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_Cbte BFEGetPARAM_Tipo_Cbte(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de las unidades de medida y su codigo utilizables en
	 * servicio de autorizacion
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponse_Umed BFEGetPARAM_UMed(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de productos y su codigo utilizables en servicio de
	 * autorizacion
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponse_NCM BFEGetPARAM_NCM(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de monedas y su codigo utilizables en servicio de
	 * autorizacion
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponse_Mon BFEGetPARAM_MON(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el ultimos comprobante autorizado
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponseLast_CMP BFEGetLast_CMP(coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP auth) throws java.rmi.RemoteException;

	/**
	 * Metodo dummy para verificacion de funcionamiento
	 */
	public coop.guenoa.afip.wsbfev1.DummyResponse BFEDummy() throws java.rmi.RemoteException;

	/**
	 * Recupera el ultimo ID y su fecha
	 */
	public coop.guenoa.afip.wsbfev1.BFEResponse_LastID BFEGetLast_ID(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException;
}
