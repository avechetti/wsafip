/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public interface IService extends javax.xml.rpc.Service {

	/**
	 * Web Service orientado al servicio de Bonos Fiscales electronicos v1.1
	 */
	public java.lang.String getServiceSoapAddress();

	public coop.guenoa.afip.wsbfev1.IServiceSoap getServiceSoap() throws javax.xml.rpc.ServiceException;

	public coop.guenoa.afip.wsbfev1.IServiceSoap getServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
