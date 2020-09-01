/**
 * ConsultarCtasCtesRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class ConsultarCtasCtesRequestType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.AuthRequestType authRequest;

	private coop.guenoa.afip.FECredService.RolSimpleType rolCUITRepresentada;

	private java.lang.Long CUITContraparte;

	private coop.guenoa.afip.FECredService.FiltroFechaType fecha;

	private coop.guenoa.afip.FECredService.EstadoCtaCteSimpleType estadoCtaCte;

	public ConsultarCtasCtesRequestType() {
	}

	public ConsultarCtasCtesRequestType(coop.guenoa.afip.FECredService.AuthRequestType authRequest,
			coop.guenoa.afip.FECredService.RolSimpleType rolCUITRepresentada, java.lang.Long CUITContraparte,
			coop.guenoa.afip.FECredService.FiltroFechaType fecha,
			coop.guenoa.afip.FECredService.EstadoCtaCteSimpleType estadoCtaCte) {
		this.authRequest = authRequest;
		this.rolCUITRepresentada = rolCUITRepresentada;
		this.CUITContraparte = CUITContraparte;
		this.fecha = fecha;
		this.estadoCtaCte = estadoCtaCte;
	}

	/**
	 * Gets the authRequest value for this ConsultarCtasCtesRequestType.
	 * 
	 * @return authRequest
	 */
	public coop.guenoa.afip.FECredService.AuthRequestType getAuthRequest() {
		return authRequest;
	}

	/**
	 * Sets the authRequest value for this ConsultarCtasCtesRequestType.
	 * 
	 * @param authRequest
	 */
	public void setAuthRequest(coop.guenoa.afip.FECredService.AuthRequestType authRequest) {
		this.authRequest = authRequest;
	}

	/**
	 * Gets the rolCUITRepresentada value for this ConsultarCtasCtesRequestType.
	 * 
	 * @return rolCUITRepresentada
	 */
	public coop.guenoa.afip.FECredService.RolSimpleType getRolCUITRepresentada() {
		return rolCUITRepresentada;
	}

	/**
	 * Sets the rolCUITRepresentada value for this ConsultarCtasCtesRequestType.
	 * 
	 * @param rolCUITRepresentada
	 */
	public void setRolCUITRepresentada(coop.guenoa.afip.FECredService.RolSimpleType rolCUITRepresentada) {
		this.rolCUITRepresentada = rolCUITRepresentada;
	}

	/**
	 * Gets the CUITContraparte value for this ConsultarCtasCtesRequestType.
	 * 
	 * @return CUITContraparte
	 */
	public java.lang.Long getCUITContraparte() {
		return CUITContraparte;
	}

	/**
	 * Sets the CUITContraparte value for this ConsultarCtasCtesRequestType.
	 * 
	 * @param CUITContraparte
	 */
	public void setCUITContraparte(java.lang.Long CUITContraparte) {
		this.CUITContraparte = CUITContraparte;
	}

	/**
	 * Gets the fecha value for this ConsultarCtasCtesRequestType.
	 * 
	 * @return fecha
	 */
	public coop.guenoa.afip.FECredService.FiltroFechaType getFecha() {
		return fecha;
	}

	/**
	 * Sets the fecha value for this ConsultarCtasCtesRequestType.
	 * 
	 * @param fecha
	 */
	public void setFecha(coop.guenoa.afip.FECredService.FiltroFechaType fecha) {
		this.fecha = fecha;
	}

	/**
	 * Gets the estadoCtaCte value for this ConsultarCtasCtesRequestType.
	 * 
	 * @return estadoCtaCte
	 */
	public coop.guenoa.afip.FECredService.EstadoCtaCteSimpleType getEstadoCtaCte() {
		return estadoCtaCte;
	}

	/**
	 * Sets the estadoCtaCte value for this ConsultarCtasCtesRequestType.
	 * 
	 * @param estadoCtaCte
	 */
	public void setEstadoCtaCte(coop.guenoa.afip.FECredService.EstadoCtaCteSimpleType estadoCtaCte) {
		this.estadoCtaCte = estadoCtaCte;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConsultarCtasCtesRequestType))
			return false;
		ConsultarCtasCtesRequestType other = (ConsultarCtasCtesRequestType) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.authRequest == null && other.getAuthRequest() == null)
						|| (this.authRequest != null && this.authRequest.equals(other.getAuthRequest())))
				&& ((this.rolCUITRepresentada == null && other.getRolCUITRepresentada() == null)
						|| (this.rolCUITRepresentada != null
								&& this.rolCUITRepresentada.equals(other.getRolCUITRepresentada())))
				&& ((this.CUITContraparte == null && other.getCUITContraparte() == null)
						|| (this.CUITContraparte != null && this.CUITContraparte.equals(other.getCUITContraparte())))
				&& ((this.fecha == null && other.getFecha() == null)
						|| (this.fecha != null && this.fecha.equals(other.getFecha())))
				&& ((this.estadoCtaCte == null && other.getEstadoCtaCte() == null)
						|| (this.estadoCtaCte != null && this.estadoCtaCte.equals(other.getEstadoCtaCte())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getAuthRequest() != null) {
			_hashCode += getAuthRequest().hashCode();
		}
		if (getRolCUITRepresentada() != null) {
			_hashCode += getRolCUITRepresentada().hashCode();
		}
		if (getCUITContraparte() != null) {
			_hashCode += getCUITContraparte().hashCode();
		}
		if (getFecha() != null) {
			_hashCode += getFecha().hashCode();
		}
		if (getEstadoCtaCte() != null) {
			_hashCode += getEstadoCtaCte().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ConsultarCtasCtesRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarCtasCtesRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("authRequest");
		elemField.setXmlName(new javax.xml.namespace.QName("", "authRequest"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "AuthRequestType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rolCUITRepresentada");
		elemField.setXmlName(new javax.xml.namespace.QName("", "rolCUITRepresentada"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "RolSimpleType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("CUITContraparte");
		elemField.setXmlName(new javax.xml.namespace.QName("", "CUITContraparte"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fecha");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "FiltroFechaType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("estadoCtaCte");
		elemField.setXmlName(new javax.xml.namespace.QName("", "estadoCtaCte"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "EstadoCtaCteSimpleType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
