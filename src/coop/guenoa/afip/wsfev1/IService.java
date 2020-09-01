/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsfev1;

public interface IService extends javax.xml.rpc.Service {

	/**
	 * Web Service orientado al servicio de Facturacion electronica RG2485 V1
	 */
	public java.lang.String getServiceSoapAddress();

	public coop.guenoa.afip.wsfev1.IServiceWsfeV1 getServiceSoap() throws javax.xml.rpc.ServiceException;

	public coop.guenoa.afip.wsfev1.IServiceWsfeV1 getServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
