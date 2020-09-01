/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsfexv1;

public interface IServiceSoap extends java.rmi.Remote {

	/**
	 * Autoriza un comprobante, devolviendo su CAE correspondiente
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponseAuthorize FEXAuthorize(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth, coop.guenoa.afip.wsfexv1.ClsFEXRequest cmp)
			throws java.rmi.RemoteException;

	/**
	 * Recupera los datos completos de un comprobante ya autorizado
	 */
	public coop.guenoa.afip.wsfexv1.FEXGetCMPResponse FEXGetCMP(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth, coop.guenoa.afip.wsfexv1.ClsFEXGetCMP cmp)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los tipos de comprobante y su codigo utilizables
	 * en servicio de autorizacion
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_Cbte_Tipo FEXGetPARAM_Cbte_Tipo(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los tipos de exportacion y sus codigo utilizables
	 * en servicio de autorizacion
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_Tex FEXGetPARAM_Tipo_Expo(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado Incoterms utilizables en servicio de autorizacion
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_Inc FEXGetPARAM_Incoterms(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los idiomas y sus codigos utilizables en servicio
	 * de autorizacion
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_Idi FEXGetPARAM_Idiomas(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de las unidades de medida y su codigo utilizables en
	 * servicio de autorizacion
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_Umed FEXGetPARAM_UMed(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de paises
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_DST_pais FEXGetPARAM_DST_pais(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de las cuits de los paises de destinacion
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_DST_cuit FEXGetPARAM_DST_CUIT(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de monedas y su codigo utilizables en servicio de
	 * autorizacion
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_Mon FEXGetPARAM_MON(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el ultimos comprobante autorizado
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponseLast_CMP FEXGetLast_CMP(coop.guenoa.afip.wsfexv1.ClsFEX_LastCMP auth) throws java.rmi.RemoteException;

	/**
	 * Metodo dummy para verificacion de funcionamiento
	 */
	public coop.guenoa.afip.wsfexv1.DummyResponse FEXDummy() throws java.rmi.RemoteException;

	/**
	 * Recupera la cotizacion de la moneda consultada y su fecha
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_Ctz FEXGetPARAM_Ctz(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth, java.lang.String mon_id)
			throws java.rmi.RemoteException;

	/**
	 * Recupera el ultimo ID y su fecha
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_LastID FEXGetLast_ID(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de los puntos de venta registrados para Factura
	 * electronica de exportacion - WS y su estado
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_PtoVenta FEXGetPARAM_PtoVenta(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Verifica la existencia de la permiso/pais de destinación de embarque
	 * ingresado
	 */
	public coop.guenoa.afip.wsfexv1.FEXResponse_CheckPermiso FEXCheck_Permiso(coop.guenoa.afip.wsfexv1.ClsFEXAuthRequest auth,
			java.lang.String ID_Permiso, int dst_merc) throws java.rmi.RemoteException;
}
