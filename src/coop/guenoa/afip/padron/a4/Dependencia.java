/**
 * Dependencia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

public class Dependencia implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String descripcionDependencia;

	private Integer idDependencia;

	public Dependencia() {
	}

	public Dependencia(String descripcionDependencia, Integer idDependencia) {
		this.descripcionDependencia = descripcionDependencia;
		this.idDependencia = idDependencia;
	}

	/**
	 * Gets the descripcionDependencia value for this Dependencia.
	 * 
	 * @return descripcionDependencia
	 */
	public String getDescripcionDependencia() {
		return descripcionDependencia;
	}

	/**
	 * Sets the descripcionDependencia value for this Dependencia.
	 * 
	 * @param descripcionDependencia
	 */
	public void setDescripcionDependencia(String descripcionDependencia) {
		this.descripcionDependencia = descripcionDependencia;
	}

	/**
	 * Gets the idDependencia value for this Dependencia.
	 * 
	 * @return idDependencia
	 */
	public Integer getIdDependencia() {
		return idDependencia;
	}

	/**
	 * Sets the idDependencia value for this Dependencia.
	 * 
	 * @param idDependencia
	 */
	public void setIdDependencia(Integer idDependencia) {
		this.idDependencia = idDependencia;
	}

	private Object __equalsCalc = null;

	public synchronized boolean equals(Object obj) {
		if (!(obj instanceof Dependencia))
			return false;
		Dependencia other = (Dependencia) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.descripcionDependencia == null && other.getDescripcionDependencia() == null)
						|| (this.descripcionDependencia != null
								&& this.descripcionDependencia.equals(other.getDescripcionDependencia())))
				&& ((this.idDependencia == null && other.getIdDependencia() == null)
						|| (this.idDependencia != null && this.idDependencia.equals(other.getIdDependencia())));
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
		if (getDescripcionDependencia() != null) {
			_hashCode += getDescripcionDependencia().hashCode();
		}
		if (getIdDependencia() != null) {
			_hashCode += getIdDependencia().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Dependencia.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "dependencia"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descripcionDependencia");
		elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionDependencia"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idDependencia");
		elemField.setXmlName(new javax.xml.namespace.QName("", "idDependencia"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
	public static org.apache.axis.encoding.Serializer getSerializer(String mechType,
			Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(String mechType,
			Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

	@Override
	public String toString() {
		return "Dependencia [descripcionDependencia=" + descripcionDependencia + ", idDependencia=" + idDependencia
				+ "]";
	}

}
