/**
 * CuentaComitenteType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class CuentaComitenteType implements java.io.Serializable {
	private int cuentaDepositante;

	private long subcuentaComitente;

	private java.lang.String denominacion;

	public CuentaComitenteType() {
	}

	public CuentaComitenteType(int cuentaDepositante, long subcuentaComitente, java.lang.String denominacion) {
		this.cuentaDepositante = cuentaDepositante;
		this.subcuentaComitente = subcuentaComitente;
		this.denominacion = denominacion;
	}

	/**
	 * Gets the cuentaDepositante value for this CuentaComitenteType.
	 * 
	 * @return cuentaDepositante
	 */
	public int getCuentaDepositante() {
		return cuentaDepositante;
	}

	/**
	 * Sets the cuentaDepositante value for this CuentaComitenteType.
	 * 
	 * @param cuentaDepositante
	 */
	public void setCuentaDepositante(int cuentaDepositante) {
		this.cuentaDepositante = cuentaDepositante;
	}

	/**
	 * Gets the subcuentaComitente value for this CuentaComitenteType.
	 * 
	 * @return subcuentaComitente
	 */
	public long getSubcuentaComitente() {
		return subcuentaComitente;
	}

	/**
	 * Sets the subcuentaComitente value for this CuentaComitenteType.
	 * 
	 * @param subcuentaComitente
	 */
	public void setSubcuentaComitente(long subcuentaComitente) {
		this.subcuentaComitente = subcuentaComitente;
	}

	/**
	 * Gets the denominacion value for this CuentaComitenteType.
	 * 
	 * @return denominacion
	 */
	public java.lang.String getDenominacion() {
		return denominacion;
	}

	/**
	 * Sets the denominacion value for this CuentaComitenteType.
	 * 
	 * @param denominacion
	 */
	public void setDenominacion(java.lang.String denominacion) {
		this.denominacion = denominacion;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CuentaComitenteType))
			return false;
		CuentaComitenteType other = (CuentaComitenteType) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.cuentaDepositante == other.getCuentaDepositante()
				&& this.subcuentaComitente == other.getSubcuentaComitente()
				&& ((this.denominacion == null && other.getDenominacion() == null)
						|| (this.denominacion != null && this.denominacion.equals(other.getDenominacion())));
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
		_hashCode += getCuentaDepositante();
		_hashCode += new Long(getSubcuentaComitente()).hashCode();
		if (getDenominacion() != null) {
			_hashCode += getDenominacion().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CuentaComitenteType.class, true);

	static {
		typeDesc.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "CuentaComitenteType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cuentaDepositante");
		elemField.setXmlName(new javax.xml.namespace.QName("", "cuentaDepositante"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subcuentaComitente");
		elemField.setXmlName(new javax.xml.namespace.QName("", "subcuentaComitente"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("denominacion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "denominacion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
