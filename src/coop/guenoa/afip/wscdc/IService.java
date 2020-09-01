/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wscdc;

public interface IService extends javax.xml.rpc.Service {

	/**
	 * Web Service Orientado a la Constatacion de Comprobantes.
	 */
	public java.lang.String getServiceSoapAddress();

	public coop.guenoa.afip.wscdc.IServiceSoap getServiceSoap() throws javax.xml.rpc.ServiceException;

	public coop.guenoa.afip.wscdc.IServiceSoap getServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
