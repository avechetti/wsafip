/**
 * FECredService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface FECredService extends Service {
	public String getFECredServiceSOAPAddress();

	public FECredServicePortType getFECredServiceSOAP() throws ServiceException;

	public FECredServicePortType getFECredServiceSOAP(URL portAddress) throws ServiceException;
}
