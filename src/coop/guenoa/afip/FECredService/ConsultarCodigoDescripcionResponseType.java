/**
 * ConsultarCodigoDescripcionResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class ConsultarCodigoDescripcionResponseType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.ConsultarCodigoDescripcionReturnType codigoDescripcionReturn;

	public ConsultarCodigoDescripcionResponseType() {
	}

	public ConsultarCodigoDescripcionResponseType(
			coop.guenoa.afip.FECredService.ConsultarCodigoDescripcionReturnType codigoDescripcionReturn) {
		this.codigoDescripcionReturn = codigoDescripcionReturn;
	}

	/**
	 * Gets the codigoDescripcionReturn value for this
	 * ConsultarCodigoDescripcionResponseType.
	 * 
	 * @return codigoDescripcionReturn
	 */
	public coop.guenoa.afip.FECredService.ConsultarCodigoDescripcionReturnType getCodigoDescripcionReturn() {
		return codigoDescripcionReturn;
	}

	/**
	 * Sets the codigoDescripcionReturn value for this
	 * ConsultarCodigoDescripcionResponseType.
	 * 
	 * @param codigoDescripcionReturn
	 */
	public void setCodigoDescripcionReturn(
			coop.guenoa.afip.FECredService.ConsultarCodigoDescripcionReturnType codigoDescripcionReturn) {
		this.codigoDescripcionReturn = codigoDescripcionReturn;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConsultarCodigoDescripcionResponseType))
			return false;
		ConsultarCodigoDescripcionResponseType other = (ConsultarCodigoDescripcionResponseType) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.codigoDescripcionReturn == null && other.getCodigoDescripcionReturn() == null)
				|| (this.codigoDescripcionReturn != null
						&& this.codigoDescripcionReturn.equals(other.getCodigoDescripcionReturn())));
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
		if (getCodigoDescripcionReturn() != null) {
			_hashCode += getCodigoDescripcionReturn().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ConsultarCodigoDescripcionResponseType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarCodigoDescripcionResponseType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("codigoDescripcionReturn");
		elemField.setXmlName(new javax.xml.namespace.QName("", "codigoDescripcionReturn"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarCodigoDescripcionReturnType"));
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
