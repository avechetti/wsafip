/**
 * ConsultarHistorialEstadosComprobanteResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class ConsultarHistorialEstadosComprobanteResponseType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.ConsultarHistorialEstadosComprobanteReturnType consultarHistorialEstadosComprobanteReturn;

	public ConsultarHistorialEstadosComprobanteResponseType() {
	}

	public ConsultarHistorialEstadosComprobanteResponseType(
			coop.guenoa.afip.FECredService.ConsultarHistorialEstadosComprobanteReturnType consultarHistorialEstadosComprobanteReturn) {
		this.consultarHistorialEstadosComprobanteReturn = consultarHistorialEstadosComprobanteReturn;
	}

	/**
	 * Gets the consultarHistorialEstadosComprobanteReturn value for this
	 * ConsultarHistorialEstadosComprobanteResponseType.
	 * 
	 * @return consultarHistorialEstadosComprobanteReturn
	 */
	public coop.guenoa.afip.FECredService.ConsultarHistorialEstadosComprobanteReturnType getConsultarHistorialEstadosComprobanteReturn() {
		return consultarHistorialEstadosComprobanteReturn;
	}

	/**
	 * Sets the consultarHistorialEstadosComprobanteReturn value for this
	 * ConsultarHistorialEstadosComprobanteResponseType.
	 * 
	 * @param consultarHistorialEstadosComprobanteReturn
	 */
	public void setConsultarHistorialEstadosComprobanteReturn(
			coop.guenoa.afip.FECredService.ConsultarHistorialEstadosComprobanteReturnType consultarHistorialEstadosComprobanteReturn) {
		this.consultarHistorialEstadosComprobanteReturn = consultarHistorialEstadosComprobanteReturn;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConsultarHistorialEstadosComprobanteResponseType))
			return false;
		ConsultarHistorialEstadosComprobanteResponseType other = (ConsultarHistorialEstadosComprobanteResponseType) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.consultarHistorialEstadosComprobanteReturn == null
				&& other.getConsultarHistorialEstadosComprobanteReturn() == null)
				|| (this.consultarHistorialEstadosComprobanteReturn != null
						&& this.consultarHistorialEstadosComprobanteReturn
								.equals(other.getConsultarHistorialEstadosComprobanteReturn())));
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
		if (getConsultarHistorialEstadosComprobanteReturn() != null) {
			_hashCode += getConsultarHistorialEstadosComprobanteReturn().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ConsultarHistorialEstadosComprobanteResponseType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarHistorialEstadosComprobanteResponseType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("consultarHistorialEstadosComprobanteReturn");
		elemField.setXmlName(new javax.xml.namespace.QName("", "consultarHistorialEstadosComprobanteReturn"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarHistorialEstadosComprobanteReturnType"));
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
