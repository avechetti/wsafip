/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wscdc;

public interface IServiceSoap extends java.rmi.Remote {

	/**
	 * Determina los modos de facturación habilitados a consultar por este
	 * medio.
	 */
	public coop.guenoa.afip.wscdc.FacModTipoResponse comprobantesModalidadConsultar(coop.guenoa.afip.wscdc.CmpAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Recupera los Tipos de Comprobantes habilitados a consultar por este
	 * medio.
	 */
	public coop.guenoa.afip.wscdc.CbteTipoResponse comprobantesTipoConsultar(coop.guenoa.afip.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera los Tipos de Documentos habilitados a consultar por este medio.
	 */
	public coop.guenoa.afip.wscdc.DocTipoResponse documentosTipoConsultar(coop.guenoa.afip.wscdc.CmpAuthRequest auth) throws java.rmi.RemoteException;

	/**
	 * Recupera el listado de identificadores para los campos Opcionales
	 */
	public coop.guenoa.afip.wscdc.OpcionalTipoResponse opcionalesTipoConsultar(coop.guenoa.afip.wscdc.CmpAuthRequest auth)
			throws java.rmi.RemoteException;

	/**
	 * Constatación de comprobantes de forma electronica
	 */
	public coop.guenoa.afip.wscdc.CmpResponse comprobanteConstatar(coop.guenoa.afip.wscdc.CmpAuthRequest auth, coop.guenoa.afip.wscdc.CmpDatos cmpReq)
			throws java.rmi.RemoteException;

	/**
	 * Metodo dummy para verificacion de funcionamiento
	 */
	public coop.guenoa.afip.wscdc.DummyResponse comprobanteDummy() throws java.rmi.RemoteException;
}
