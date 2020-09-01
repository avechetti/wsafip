/**
 * FECredServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;


public class FECredServiceLocator extends Service implements FECredService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9028281585135947443L;

	public FECredServiceLocator() {
	}

	public FECredServiceLocator(EngineConfiguration config) {
		super(config);
	}

	public FECredServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for FECredServiceSOAP
	private String FECredServiceSOAP_address = "https://fwshomo.afip.gov.ar:443/wsfecred/FECredService";

	public String getFECredServiceSOAPAddress() {
		return FECredServiceSOAP_address;
	}

	// The WSDD service name defaults to the port name.
	private String FECredServiceSOAPWSDDServiceName = "FECredServiceSOAP";

	public String getFECredServiceSOAPWSDDServiceName() {
		return FECredServiceSOAPWSDDServiceName;
	}

	public void setFECredServiceSOAPWSDDServiceName(String name) {
		FECredServiceSOAPWSDDServiceName = name;
	}

	public FECredServicePortType getFECredServiceSOAP() throws ServiceException {
		URL endpoint;
		try {
			endpoint = new URL(FECredServiceSOAP_address);
		} catch (MalformedURLException e) {
			throw new ServiceException(e);
		}
		return getFECredServiceSOAP(endpoint);
	}

	public FECredServicePortType getFECredServiceSOAP(URL portAddress) throws ServiceException {
		try {
			FECredServiceSOAPStub _stub = new FECredServiceSOAPStub(portAddress, this);
			_stub.setPortName(getFECredServiceSOAPWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setFECredServiceSOAPEndpointAddress(String address) {
		FECredServiceSOAP_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
		try {
			if (FECredServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
				FECredServiceSOAPStub _stub = new FECredServiceSOAPStub(new URL(FECredServiceSOAP_address), this);
				_stub.setPortName(getFECredServiceSOAPWSDDServiceName());
				return _stub;
			}
		} catch (Throwable t) {
			throw new ServiceException(t);
		}
		throw new ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort(QName portName, Class serviceEndpointInterface)
			throws ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		String inputPortName = portName.getLocalPart();
		if ("FECredServiceSOAP".equals(inputPortName)) {
			return getFECredServiceSOAP();
		} else {
			Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public QName getServiceName() {
		return new QName("http://ar.gob.afip.wsfecred/FECredService/", "FECredService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new QName("http://ar.gob.afip.wsfecred/FECredService/", "FECredServiceSOAP"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(String portName, String address) throws ServiceException {

		if ("FECredServiceSOAP".equals(portName)) {
			setFECredServiceSOAPEndpointAddress(address);
		} else { // Unknown Port Name
			throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(QName portName, String address) throws ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
