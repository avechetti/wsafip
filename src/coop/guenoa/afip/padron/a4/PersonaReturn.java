/**
 * PersonaReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

public class PersonaReturn implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Metadata metadata;

	private Persona persona;

	public PersonaReturn() {
	}

	public PersonaReturn(Metadata metadata, Persona persona) {
		this.metadata = metadata;
		this.persona = persona;
	}

	/**
	 * Gets the metadata value for this PersonaReturn.
	 * 
	 * @return metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * Sets the metadata value for this PersonaReturn.
	 * 
	 * @param metadata
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	/**
	 * Gets the persona value for this PersonaReturn.
	 * 
	 * @return persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * Sets the persona value for this PersonaReturn.
	 * 
	 * @param persona
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	private Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PersonaReturn))
			return false;
		PersonaReturn other = (PersonaReturn) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.metadata == null && other.getMetadata() == null)
						|| (this.metadata != null && this.metadata.equals(other.getMetadata())))
				&& ((this.persona == null && other.getPersona() == null)
						|| (this.persona != null && this.persona.equals(other.getPersona())));
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
		if (getMetadata() != null) {
			_hashCode += getMetadata().hashCode();
		}
		if (getPersona() != null) {
			_hashCode += getPersona().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PersonaReturn.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "personaReturn"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("metadata");
		elemField.setXmlName(new javax.xml.namespace.QName("", "metadata"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "metadata"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("persona");
		elemField.setXmlName(new javax.xml.namespace.QName("", "persona"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "persona"));
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
