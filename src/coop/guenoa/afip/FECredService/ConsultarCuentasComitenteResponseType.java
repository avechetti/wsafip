/**
 * ConsultarCuentasComitenteResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class ConsultarCuentasComitenteResponseType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.ConsultarCuentasComitenteReturnType consultarCuentasComitenteReturn;

	public ConsultarCuentasComitenteResponseType() {
	}

	public ConsultarCuentasComitenteResponseType(
			coop.guenoa.afip.FECredService.ConsultarCuentasComitenteReturnType consultarCuentasComitenteReturn) {
		this.consultarCuentasComitenteReturn = consultarCuentasComitenteReturn;
	}

	/**
	 * Gets the consultarCuentasComitenteReturn value for this
	 * ConsultarCuentasComitenteResponseType.
	 * 
	 * @return consultarCuentasComitenteReturn
	 */
	public coop.guenoa.afip.FECredService.ConsultarCuentasComitenteReturnType getConsultarCuentasComitenteReturn() {
		return consultarCuentasComitenteReturn;
	}

	/**
	 * Sets the consultarCuentasComitenteReturn value for this
	 * ConsultarCuentasComitenteResponseType.
	 * 
	 * @param consultarCuentasComitenteReturn
	 */
	public void setConsultarCuentasComitenteReturn(
			coop.guenoa.afip.FECredService.ConsultarCuentasComitenteReturnType consultarCuentasComitenteReturn) {
		this.consultarCuentasComitenteReturn = consultarCuentasComitenteReturn;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConsultarCuentasComitenteResponseType))
			return false;
		ConsultarCuentasComitenteResponseType other = (ConsultarCuentasComitenteResponseType) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.consultarCuentasComitenteReturn == null
				&& other.getConsultarCuentasComitenteReturn() == null)
				|| (this.consultarCuentasComitenteReturn != null
						&& this.consultarCuentasComitenteReturn.equals(other.getConsultarCuentasComitenteReturn())));
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
		if (getConsultarCuentasComitenteReturn() != null) {
			_hashCode += getConsultarCuentasComitenteReturn().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ConsultarCuentasComitenteResponseType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarCuentasComitenteResponseType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("consultarCuentasComitenteReturn");
		elemField.setXmlName(new javax.xml.namespace.QName("", "consultarCuentasComitenteReturn"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarCuentasComitenteReturnType"));
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
