/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsfev1;

import java.net.URL;

import javax.xml.rpc.ServiceException;

public interface IService extends javax.xml.rpc.Service {

	/**
	 * Web Service orientado al servicio de Facturacion electronica RG2485 V1
	 */
	public String getServiceSoapAddress();

	public IServiceWsfeV1 getServiceSoap() throws ServiceException;

	public IServiceWsfeV1 getServiceSoap(URL portAddress) throws ServiceException;
}
