/**
 * ConsultarComprobanteRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class ConsultarComprobanteRequestType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.AuthRequestType authRequest;

	private coop.guenoa.afip.FECredService.RolSimpleType rolCUITRepresentada;

	private java.lang.Long CUITContraparte;

	private java.lang.Short codTipoCmp;

	private coop.guenoa.afip.FECredService.EstadoCmpSimpleType estadoCmp;

	private coop.guenoa.afip.FECredService.FiltroFechaType fecha;

	private java.lang.Long codCtaCte;

	private coop.guenoa.afip.FECredService.EstadoCtaCteSimpleType estadoCtaCte;

	public ConsultarComprobanteRequestType() {
	}

	public ConsultarComprobanteRequestType(coop.guenoa.afip.FECredService.AuthRequestType authRequest,
			coop.guenoa.afip.FECredService.RolSimpleType rolCUITRepresentada, java.lang.Long CUITContraparte,
			java.lang.Short codTipoCmp, coop.guenoa.afip.FECredService.EstadoCmpSimpleType estadoCmp,
			coop.guenoa.afip.FECredService.FiltroFechaType fecha, java.lang.Long codCtaCte,
			coop.guenoa.afip.FECredService.EstadoCtaCteSimpleType estadoCtaCte) {
		this.authRequest = authRequest;
		this.rolCUITRepresentada = rolCUITRepresentada;
		this.CUITContraparte = CUITContraparte;
		this.codTipoCmp = codTipoCmp;
		this.estadoCmp = estadoCmp;
		this.fecha = fecha;
		this.codCtaCte = codCtaCte;
		this.estadoCtaCte = estadoCtaCte;
	}

	/**
	 * Gets the authRequest value for this ConsultarComprobanteRequestType.
	 * 
	 * @return authRequest
	 */
	public coop.guenoa.afip.FECredService.AuthRequestType getAuthRequest() {
		return authRequest;
	}

	/**
	 * Sets the authRequest value for this ConsultarComprobanteRequestType.
	 * 
	 * @param authRequest
	 */
	public void setAuthRequest(coop.guenoa.afip.FECredService.AuthRequestType authRequest) {
		this.authRequest = authRequest;
	}

	/**
	 * Gets the rolCUITRepresentada value for this ConsultarComprobanteRequestType.
	 * 
	 * @return rolCUITRepresentada
	 */
	public coop.guenoa.afip.FECredService.RolSimpleType getRolCUITRepresentada() {
		return rolCUITRepresentada;
	}

	/**
	 * Sets the rolCUITRepresentada value for this ConsultarComprobanteRequestType.
	 * 
	 * @param rolCUITRepresentada
	 */
	public void setRolCUITRepresentada(coop.guenoa.afip.FECredService.RolSimpleType rolCUITRepresentada) {
		this.rolCUITRepresentada = rolCUITRepresentada;
	}

	/**
	 * Gets the CUITContraparte value for this ConsultarComprobanteRequestType.
	 * 
	 * @return CUITContraparte
	 */
	public java.lang.Long getCUITContraparte() {
		return CUITContraparte;
	}

	/**
	 * Sets the CUITContraparte value for this ConsultarComprobanteRequestType.
	 * 
	 * @param CUITContraparte
	 */
	public void setCUITContraparte(java.lang.Long CUITContraparte) {
		this.CUITContraparte = CUITContraparte;
	}

	/**
	 * Gets the codTipoCmp value for this ConsultarComprobanteRequestType.
	 * 
	 * @return codTipoCmp
	 */
	public java.lang.Short getCodTipoCmp() {
		return codTipoCmp;
	}

	/**
	 * Sets the codTipoCmp value for this ConsultarComprobanteRequestType.
	 * 
	 * @param codTipoCmp
	 */
	public void setCodTipoCmp(java.lang.Short codTipoCmp) {
		this.codTipoCmp = codTipoCmp;
	}

	/**
	 * Gets the estadoCmp value for this ConsultarComprobanteRequestType.
	 * 
	 * @return estadoCmp
	 */
	public coop.guenoa.afip.FECredService.EstadoCmpSimpleType getEstadoCmp() {
		return estadoCmp;
	}

	/**
	 * Sets the estadoCmp value for this ConsultarComprobanteRequestType.
	 * 
	 * @param estadoCmp
	 */
	public void setEstadoCmp(coop.guenoa.afip.FECredService.EstadoCmpSimpleType estadoCmp) {
		this.estadoCmp = estadoCmp;
	}

	/**
	 * Gets the fecha value for this ConsultarComprobanteRequestType.
	 * 
	 * @return fecha
	 */
	public coop.guenoa.afip.FECredService.FiltroFechaType getFecha() {
		return fecha;
	}

	/**
	 * Sets the fecha value for this ConsultarComprobanteRequestType.
	 * 
	 * @param fecha
	 */
	public void setFecha(coop.guenoa.afip.FECredService.FiltroFechaType fecha) {
		this.fecha = fecha;
	}

	/**
	 * Gets the codCtaCte value for this ConsultarComprobanteRequestType.
	 * 
	 * @return codCtaCte
	 */
	public java.lang.Long getCodCtaCte() {
		return codCtaCte;
	}

	/**
	 * Sets the codCtaCte value for this ConsultarComprobanteRequestType.
	 * 
	 * @param codCtaCte
	 */
	public void setCodCtaCte(java.lang.Long codCtaCte) {
		this.codCtaCte = codCtaCte;
	}

	/**
	 * Gets the estadoCtaCte value for this ConsultarComprobanteRequestType.
	 * 
	 * @return estadoCtaCte
	 */
	public coop.guenoa.afip.FECredService.EstadoCtaCteSimpleType getEstadoCtaCte() {
		return estadoCtaCte;
	}

	/**
	 * Sets the estadoCtaCte value for this ConsultarComprobanteRequestType.
	 * 
	 * @param estadoCtaCte
	 */
	public void setEstadoCtaCte(coop.guenoa.afip.FECredService.EstadoCtaCteSimpleType estadoCtaCte) {
		this.estadoCtaCte = estadoCtaCte;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConsultarComprobanteRequestType))
			return false;
		ConsultarComprobanteRequestType other = (ConsultarComprobanteRequestType) obj;
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
				&& ((this.codTipoCmp == null && other.getCodTipoCmp() == null)
						|| (this.codTipoCmp != null && this.codTipoCmp.equals(other.getCodTipoCmp())))
				&& ((this.estadoCmp == null && other.getEstadoCmp() == null)
						|| (this.estadoCmp != null && this.estadoCmp.equals(other.getEstadoCmp())))
				&& ((this.fecha == null && other.getFecha() == null)
						|| (this.fecha != null && this.fecha.equals(other.getFecha())))
				&& ((this.codCtaCte == null && other.getCodCtaCte() == null)
						|| (this.codCtaCte != null && this.codCtaCte.equals(other.getCodCtaCte())))
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
		if (getCodTipoCmp() != null) {
			_hashCode += getCodTipoCmp().hashCode();
		}
		if (getEstadoCmp() != null) {
			_hashCode += getEstadoCmp().hashCode();
		}
		if (getFecha() != null) {
			_hashCode += getFecha().hashCode();
		}
		if (getCodCtaCte() != null) {
			_hashCode += getCodCtaCte().hashCode();
		}
		if (getEstadoCtaCte() != null) {
			_hashCode += getEstadoCtaCte().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ConsultarComprobanteRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarComprobanteRequestType"));
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
		elemField.setFieldName("codTipoCmp");
		elemField.setXmlName(new javax.xml.namespace.QName("", "codTipoCmp"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("estadoCmp");
		elemField.setXmlName(new javax.xml.namespace.QName("", "estadoCmp"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "EstadoCmpSimpleType"));
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
		elemField.setFieldName("codCtaCte");
		elemField.setXmlName(new javax.xml.namespace.QName("", "codCtaCte"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
