/**
 * ConfirmarNotaDCType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class ConfirmarNotaDCType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SiNoSimpleType acepta;

	private IdComprobanteType idNota;

	public ConfirmarNotaDCType() {
	}

	public ConfirmarNotaDCType(SiNoSimpleType acepta, IdComprobanteType idNota) {
		this.acepta = acepta;
		this.idNota = idNota;
	}

	/**
	 * Gets the acepta value for this ConfirmarNotaDCType.
	 * 
	 * @return acepta
	 */
	public SiNoSimpleType getAcepta() {
		return acepta;
	}

	/**
	 * Sets the acepta value for this ConfirmarNotaDCType.
	 * 
	 * @param acepta
	 */
	public void setAcepta(SiNoSimpleType acepta) {
		this.acepta = acepta;
	}

	/**
	 * Gets the idNota value for this ConfirmarNotaDCType.
	 * 
	 * @return idNota
	 */
	public IdComprobanteType getIdNota() {
		return idNota;
	}

	/**
	 * Sets the idNota value for this ConfirmarNotaDCType.
	 * 
	 * @param idNota
	 */
	public void setIdNota(IdComprobanteType idNota) {
		this.idNota = idNota;
	}

	private Object __equalsCalc = null;

	public synchronized boolean equals(Object obj) {
		if (!(obj instanceof ConfirmarNotaDCType))
			return false;
		ConfirmarNotaDCType other = (ConfirmarNotaDCType) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.acepta == null && other.getAcepta() == null)
						|| (this.acepta != null && this.acepta.equals(other.getAcepta())))
				&& ((this.idNota == null && other.getIdNota() == null)
						|| (this.idNota != null && this.idNota.equals(other.getIdNota())));
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
		if (getAcepta() != null) {
			_hashCode += getAcepta().hashCode();
		}
		if (getIdNota() != null) {
			_hashCode += getIdNota().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ConfirmarNotaDCType.class, true);

	static {
		typeDesc.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "ConfirmarNotaDCType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("acepta");
		elemField.setXmlName(new javax.xml.namespace.QName("", "acepta"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "SiNoSimpleType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idNota");
		elemField.setXmlName(new javax.xml.namespace.QName("", "idNota"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "IdComprobanteType"));
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
	public static org.apache.axis.encoding.Serializer getSerializer(String mechType, Class<?> _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(String mechType, Class<?> _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
