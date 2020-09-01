/**
 * ClsSEGResponse_Tipo_IVA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsseg;

public class ClsSEGResponse_Tipo_IVA implements java.io.Serializable {
	private short IVA_Id;

	private java.lang.String IVA_Ds;

	private java.lang.String IVA_vig_desde;

	private java.lang.String IVA_vig_hasta;

	public ClsSEGResponse_Tipo_IVA() {
	}

	public ClsSEGResponse_Tipo_IVA(short IVA_Id, java.lang.String IVA_Ds, java.lang.String IVA_vig_desde,
			java.lang.String IVA_vig_hasta) {
		this.IVA_Id = IVA_Id;
		this.IVA_Ds = IVA_Ds;
		this.IVA_vig_desde = IVA_vig_desde;
		this.IVA_vig_hasta = IVA_vig_hasta;
	}

	/**
	 * Gets the IVA_Id value for this ClsSEGResponse_Tipo_IVA.
	 * 
	 * @return IVA_Id
	 */
	public short getIVA_Id() {
		return IVA_Id;
	}

	/**
	 * Sets the IVA_Id value for this ClsSEGResponse_Tipo_IVA.
	 * 
	 * @param IVA_Id
	 */
	public void setIVA_Id(short IVA_Id) {
		this.IVA_Id = IVA_Id;
	}

	/**
	 * Gets the IVA_Ds value for this ClsSEGResponse_Tipo_IVA.
	 * 
	 * @return IVA_Ds
	 */
	public java.lang.String getIVA_Ds() {
		return IVA_Ds;
	}

	/**
	 * Sets the IVA_Ds value for this ClsSEGResponse_Tipo_IVA.
	 * 
	 * @param IVA_Ds
	 */
	public void setIVA_Ds(java.lang.String IVA_Ds) {
		this.IVA_Ds = IVA_Ds;
	}

	/**
	 * Gets the IVA_vig_desde value for this ClsSEGResponse_Tipo_IVA.
	 * 
	 * @return IVA_vig_desde
	 */
	public java.lang.String getIVA_vig_desde() {
		return IVA_vig_desde;
	}

	/**
	 * Sets the IVA_vig_desde value for this ClsSEGResponse_Tipo_IVA.
	 * 
	 * @param IVA_vig_desde
	 */
	public void setIVA_vig_desde(java.lang.String IVA_vig_desde) {
		this.IVA_vig_desde = IVA_vig_desde;
	}

	/**
	 * Gets the IVA_vig_hasta value for this ClsSEGResponse_Tipo_IVA.
	 * 
	 * @return IVA_vig_hasta
	 */
	public java.lang.String getIVA_vig_hasta() {
		return IVA_vig_hasta;
	}

	/**
	 * Sets the IVA_vig_hasta value for this ClsSEGResponse_Tipo_IVA.
	 * 
	 * @param IVA_vig_hasta
	 */
	public void setIVA_vig_hasta(java.lang.String IVA_vig_hasta) {
		this.IVA_vig_hasta = IVA_vig_hasta;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClsSEGResponse_Tipo_IVA))
			return false;
		ClsSEGResponse_Tipo_IVA other = (ClsSEGResponse_Tipo_IVA) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.IVA_Id == other.getIVA_Id()
				&& ((this.IVA_Ds == null && other.getIVA_Ds() == null)
						|| (this.IVA_Ds != null && this.IVA_Ds.equals(other.getIVA_Ds())))
				&& ((this.IVA_vig_desde == null && other.getIVA_vig_desde() == null)
						|| (this.IVA_vig_desde != null && this.IVA_vig_desde.equals(other.getIVA_vig_desde())))
				&& ((this.IVA_vig_hasta == null && other.getIVA_vig_hasta() == null)
						|| (this.IVA_vig_hasta != null && this.IVA_vig_hasta.equals(other.getIVA_vig_hasta())));
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
		_hashCode += getIVA_Id();
		if (getIVA_Ds() != null) {
			_hashCode += getIVA_Ds().hashCode();
		}
		if (getIVA_vig_desde() != null) {
			_hashCode += getIVA_vig_desde().hashCode();
		}
		if (getIVA_vig_hasta() != null) {
			_hashCode += getIVA_vig_hasta().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClsSEGResponse_Tipo_IVA.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_IVA"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IVA_Id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "IVA_Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IVA_Ds");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "IVA_Ds"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IVA_vig_desde");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "IVA_vig_desde"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IVA_vig_hasta");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "IVA_vig_hasta"));
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
