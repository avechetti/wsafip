/**
 * RechazarNotaDCResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class RechazarNotaDCResponseType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.RechazarNotaDCReturnType rechazarNotaDCReturn;

	public RechazarNotaDCResponseType() {
	}

	public RechazarNotaDCResponseType(coop.guenoa.afip.FECredService.RechazarNotaDCReturnType rechazarNotaDCReturn) {
		this.rechazarNotaDCReturn = rechazarNotaDCReturn;
	}

	/**
	 * Gets the rechazarNotaDCReturn value for this RechazarNotaDCResponseType.
	 * 
	 * @return rechazarNotaDCReturn
	 */
	public coop.guenoa.afip.FECredService.RechazarNotaDCReturnType getRechazarNotaDCReturn() {
		return rechazarNotaDCReturn;
	}

	/**
	 * Sets the rechazarNotaDCReturn value for this RechazarNotaDCResponseType.
	 * 
	 * @param rechazarNotaDCReturn
	 */
	public void setRechazarNotaDCReturn(coop.guenoa.afip.FECredService.RechazarNotaDCReturnType rechazarNotaDCReturn) {
		this.rechazarNotaDCReturn = rechazarNotaDCReturn;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof RechazarNotaDCResponseType))
			return false;
		RechazarNotaDCResponseType other = (RechazarNotaDCResponseType) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.rechazarNotaDCReturn == null && other.getRechazarNotaDCReturn() == null)
				|| (this.rechazarNotaDCReturn != null
						&& this.rechazarNotaDCReturn.equals(other.getRechazarNotaDCReturn())));
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
		if (getRechazarNotaDCReturn() != null) {
			_hashCode += getRechazarNotaDCReturn().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			RechazarNotaDCResponseType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"RechazarNotaDCResponseType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rechazarNotaDCReturn");
		elemField.setXmlName(new javax.xml.namespace.QName("", "rechazarNotaDCReturn"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"RechazarNotaDCReturnType"));
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
