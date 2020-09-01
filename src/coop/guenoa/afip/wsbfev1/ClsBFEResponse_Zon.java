/**
 * ClsBFEResponse_Zon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public class ClsBFEResponse_Zon implements java.io.Serializable {
	private short zon_Id;

	private java.lang.String zon_Ds;

	private java.lang.String zon_vig_desde;

	private java.lang.String zon_vig_hasta;

	public ClsBFEResponse_Zon() {
	}

	public ClsBFEResponse_Zon(short zon_Id, java.lang.String zon_Ds, java.lang.String zon_vig_desde,
			java.lang.String zon_vig_hasta) {
		this.zon_Id = zon_Id;
		this.zon_Ds = zon_Ds;
		this.zon_vig_desde = zon_vig_desde;
		this.zon_vig_hasta = zon_vig_hasta;
	}

	/**
	 * Gets the zon_Id value for this ClsBFEResponse_Zon.
	 * 
	 * @return zon_Id
	 */
	public short getZon_Id() {
		return zon_Id;
	}

	/**
	 * Sets the zon_Id value for this ClsBFEResponse_Zon.
	 * 
	 * @param zon_Id
	 */
	public void setZon_Id(short zon_Id) {
		this.zon_Id = zon_Id;
	}

	/**
	 * Gets the zon_Ds value for this ClsBFEResponse_Zon.
	 * 
	 * @return zon_Ds
	 */
	public java.lang.String getZon_Ds() {
		return zon_Ds;
	}

	/**
	 * Sets the zon_Ds value for this ClsBFEResponse_Zon.
	 * 
	 * @param zon_Ds
	 */
	public void setZon_Ds(java.lang.String zon_Ds) {
		this.zon_Ds = zon_Ds;
	}

	/**
	 * Gets the zon_vig_desde value for this ClsBFEResponse_Zon.
	 * 
	 * @return zon_vig_desde
	 */
	public java.lang.String getZon_vig_desde() {
		return zon_vig_desde;
	}

	/**
	 * Sets the zon_vig_desde value for this ClsBFEResponse_Zon.
	 * 
	 * @param zon_vig_desde
	 */
	public void setZon_vig_desde(java.lang.String zon_vig_desde) {
		this.zon_vig_desde = zon_vig_desde;
	}

	/**
	 * Gets the zon_vig_hasta value for this ClsBFEResponse_Zon.
	 * 
	 * @return zon_vig_hasta
	 */
	public java.lang.String getZon_vig_hasta() {
		return zon_vig_hasta;
	}

	/**
	 * Sets the zon_vig_hasta value for this ClsBFEResponse_Zon.
	 * 
	 * @param zon_vig_hasta
	 */
	public void setZon_vig_hasta(java.lang.String zon_vig_hasta) {
		this.zon_vig_hasta = zon_vig_hasta;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClsBFEResponse_Zon))
			return false;
		ClsBFEResponse_Zon other = (ClsBFEResponse_Zon) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.zon_Id == other.getZon_Id()
				&& ((this.zon_Ds == null && other.getZon_Ds() == null)
						|| (this.zon_Ds != null && this.zon_Ds.equals(other.getZon_Ds())))
				&& ((this.zon_vig_desde == null && other.getZon_vig_desde() == null)
						|| (this.zon_vig_desde != null && this.zon_vig_desde.equals(other.getZon_vig_desde())))
				&& ((this.zon_vig_hasta == null && other.getZon_vig_hasta() == null)
						|| (this.zon_vig_hasta != null && this.zon_vig_hasta.equals(other.getZon_vig_hasta())));
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
		_hashCode += getZon_Id();
		if (getZon_Ds() != null) {
			_hashCode += getZon_Ds().hashCode();
		}
		if (getZon_vig_desde() != null) {
			_hashCode += getZon_vig_desde().hashCode();
		}
		if (getZon_vig_hasta() != null) {
			_hashCode += getZon_vig_hasta().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClsBFEResponse_Zon.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Zon"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("zon_Id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Zon_Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("zon_Ds");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Zon_Ds"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("zon_vig_desde");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Zon_vig_desde"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("zon_vig_hasta");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Zon_vig_hasta"));
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
