/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsseg;

public interface ServiceSoap extends java.rmi.Remote {

	/**
	 * Autoriza un comprobante, devolviendo su CAE correspondiente
	 */
	public coop.guenoa.afip.wsseg.SEGResponseAuthorize SEGAuthorize(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth, coop.guenoa.afip.wsseg.ClsSEGRequest cmp)
			throws java.rmi.RemoteException;

	/**
	 * Recupera los datos completos de un comprobante ya autorizado
	 */
	public coop.guenoa.afip.wsseg.SEGGetCMPResponse SEGGetCMP(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth, coop.guenoa.afip.wsseg.ClsSEGGetCMP cmp)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los tipos de comprobante y su codigo utilizables
	 * en servicio de autorizacion
	 */
	public coop.guenoa.afip.wsseg.SEGResponse_Tipo_doc SEGGetPARAM_Tipo_doc(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de las alicuotas de IVA y su codigo utilizables en
	 * servicio de autorizacion
	 */
	public coop.guenoa.afip.wsseg.SEGResponse_Tipo_IVA SEGGetPARAM_Tipo_IVA(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los tipos de comprobante y su codigo utilizables
	 * en servicio de autorizacion
	 */
	public coop.guenoa.afip.wsseg.SEGResponse_Tipo_Cbte SEGGetPARAM_Tipo_Cbte(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de monedas y su codigo utilizables en servicio de
	 * autorizacion
	 */
	public coop.guenoa.afip.wsseg.SEGResponse_Mon SEGGetPARAM_MON(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el ultimos comprobante autorizado
	 */
	public coop.guenoa.afip.wsseg.SEGResponseLast_CMP SEGGetLast_CMP(coop.guenoa.afip.wsseg.ClsSEG_LastCMP auth) throws java.rmi.RemoteException;

	/**
	 * Metodo dummy para verificacion de funcionamiento
	 */
	public coop.guenoa.afip.wsseg.DummyResponse SEGDummy() throws java.rmi.RemoteException;

	/**
	 * Recupera el ultimo ID y su fecha
	 */
	public coop.guenoa.afip.wsseg.SEGResponse_LastID SEGGetLast_ID(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth) throws java.rmi.RemoteException;
}
