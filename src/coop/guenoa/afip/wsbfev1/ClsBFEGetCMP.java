/**
 * ClsBFEGetCMP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public class ClsBFEGetCMP implements java.io.Serializable {
	private short tipo_cbte;

	private int punto_vta;

	private long cbte_nro;

	public ClsBFEGetCMP() {
	}

	public ClsBFEGetCMP(short tipo_cbte, int punto_vta, long cbte_nro) {
		this.tipo_cbte = tipo_cbte;
		this.punto_vta = punto_vta;
		this.cbte_nro = cbte_nro;
	}

	/**
	 * Gets the tipo_cbte value for this ClsBFEGetCMP.
	 * 
	 * @return tipo_cbte
	 */
	public short getTipo_cbte() {
		return tipo_cbte;
	}

	/**
	 * Sets the tipo_cbte value for this ClsBFEGetCMP.
	 * 
	 * @param tipo_cbte
	 */
	public void setTipo_cbte(short tipo_cbte) {
		this.tipo_cbte = tipo_cbte;
	}

	/**
	 * Gets the punto_vta value for this ClsBFEGetCMP.
	 * 
	 * @return punto_vta
	 */
	public int getPunto_vta() {
		return punto_vta;
	}

	/**
	 * Sets the punto_vta value for this ClsBFEGetCMP.
	 * 
	 * @param punto_vta
	 */
	public void setPunto_vta(int punto_vta) {
		this.punto_vta = punto_vta;
	}

	/**
	 * Gets the cbte_nro value for this ClsBFEGetCMP.
	 * 
	 * @return cbte_nro
	 */
	public long getCbte_nro() {
		return cbte_nro;
	}

	/**
	 * Sets the cbte_nro value for this ClsBFEGetCMP.
	 * 
	 * @param cbte_nro
	 */
	public void setCbte_nro(long cbte_nro) {
		this.cbte_nro = cbte_nro;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClsBFEGetCMP))
			return false;
		ClsBFEGetCMP other = (ClsBFEGetCMP) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.tipo_cbte == other.getTipo_cbte() && this.punto_vta == other.getPunto_vta()
				&& this.cbte_nro == other.getCbte_nro();
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
		_hashCode += getTipo_cbte();
		_hashCode += getPunto_vta();
		_hashCode += new Long(getCbte_nro()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClsBFEGetCMP.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEGetCMP"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipo_cbte");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Tipo_cbte"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("punto_vta");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Punto_vta"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cbte_nro");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Cbte_nro"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
