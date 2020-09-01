/**
 * InformarFacturaAgtDptoCltvRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class InformarFacturaAgtDptoCltvRequestType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.AuthRequestType authRequest;

	private coop.guenoa.afip.FECredService.IdCtaCteType idCtaCte;

	private coop.guenoa.afip.FECredService.CuentaComitenteType ctaComitente;

	public InformarFacturaAgtDptoCltvRequestType() {
	}

	public InformarFacturaAgtDptoCltvRequestType(coop.guenoa.afip.FECredService.AuthRequestType authRequest,
			coop.guenoa.afip.FECredService.IdCtaCteType idCtaCte,
			coop.guenoa.afip.FECredService.CuentaComitenteType ctaComitente) {
		this.authRequest = authRequest;
		this.idCtaCte = idCtaCte;
		this.ctaComitente = ctaComitente;
	}

	/**
	 * Gets the authRequest value for this InformarFacturaAgtDptoCltvRequestType.
	 * 
	 * @return authRequest
	 */
	public coop.guenoa.afip.FECredService.AuthRequestType getAuthRequest() {
		return authRequest;
	}

	/**
	 * Sets the authRequest value for this InformarFacturaAgtDptoCltvRequestType.
	 * 
	 * @param authRequest
	 */
	public void setAuthRequest(coop.guenoa.afip.FECredService.AuthRequestType authRequest) {
		this.authRequest = authRequest;
	}

	/**
	 * Gets the idCtaCte value for this InformarFacturaAgtDptoCltvRequestType.
	 * 
	 * @return idCtaCte
	 */
	public coop.guenoa.afip.FECredService.IdCtaCteType getIdCtaCte() {
		return idCtaCte;
	}

	/**
	 * Sets the idCtaCte value for this InformarFacturaAgtDptoCltvRequestType.
	 * 
	 * @param idCtaCte
	 */
	public void setIdCtaCte(coop.guenoa.afip.FECredService.IdCtaCteType idCtaCte) {
		this.idCtaCte = idCtaCte;
	}

	/**
	 * Gets the ctaComitente value for this InformarFacturaAgtDptoCltvRequestType.
	 * 
	 * @return ctaComitente
	 */
	public coop.guenoa.afip.FECredService.CuentaComitenteType getCtaComitente() {
		return ctaComitente;
	}

	/**
	 * Sets the ctaComitente value for this InformarFacturaAgtDptoCltvRequestType.
	 * 
	 * @param ctaComitente
	 */
	public void setCtaComitente(coop.guenoa.afip.FECredService.CuentaComitenteType ctaComitente) {
		this.ctaComitente = ctaComitente;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof InformarFacturaAgtDptoCltvRequestType))
			return false;
		InformarFacturaAgtDptoCltvRequestType other = (InformarFacturaAgtDptoCltvRequestType) obj;
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
				&& ((this.idCtaCte == null && other.getIdCtaCte() == null)
						|| (this.idCtaCte != null && this.idCtaCte.equals(other.getIdCtaCte())))
				&& ((this.ctaComitente == null && other.getCtaComitente() == null)
						|| (this.ctaComitente != null && this.ctaComitente.equals(other.getCtaComitente())));
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
		if (getIdCtaCte() != null) {
			_hashCode += getIdCtaCte().hashCode();
		}
		if (getCtaComitente() != null) {
			_hashCode += getCtaComitente().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			InformarFacturaAgtDptoCltvRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"InformarFacturaAgtDptoCltvRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("authRequest");
		elemField.setXmlName(new javax.xml.namespace.QName("", "authRequest"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "AuthRequestType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idCtaCte");
		elemField.setXmlName(new javax.xml.namespace.QName("", "idCtaCte"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "IdCtaCteType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ctaComitente");
		elemField.setXmlName(new javax.xml.namespace.QName("", "ctaComitente"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "CuentaComitenteType"));
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
