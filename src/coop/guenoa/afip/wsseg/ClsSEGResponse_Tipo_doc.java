/**
 * ClsSEGResponse_Tipo_doc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsseg;

public class ClsSEGResponse_Tipo_doc implements java.io.Serializable {
	private short doc_Id;

	private java.lang.String doc_Ds;

	private java.lang.String doc_vig_desde;

	private java.lang.String doc_vig_hasta;

	public ClsSEGResponse_Tipo_doc() {
	}

	public ClsSEGResponse_Tipo_doc(short doc_Id, java.lang.String doc_Ds, java.lang.String doc_vig_desde,
			java.lang.String doc_vig_hasta) {
		this.doc_Id = doc_Id;
		this.doc_Ds = doc_Ds;
		this.doc_vig_desde = doc_vig_desde;
		this.doc_vig_hasta = doc_vig_hasta;
	}

	/**
	 * Gets the doc_Id value for this ClsSEGResponse_Tipo_doc.
	 * 
	 * @return doc_Id
	 */
	public short getDoc_Id() {
		return doc_Id;
	}

	/**
	 * Sets the doc_Id value for this ClsSEGResponse_Tipo_doc.
	 * 
	 * @param doc_Id
	 */
	public void setDoc_Id(short doc_Id) {
		this.doc_Id = doc_Id;
	}

	/**
	 * Gets the doc_Ds value for this ClsSEGResponse_Tipo_doc.
	 * 
	 * @return doc_Ds
	 */
	public java.lang.String getDoc_Ds() {
		return doc_Ds;
	}

	/**
	 * Sets the doc_Ds value for this ClsSEGResponse_Tipo_doc.
	 * 
	 * @param doc_Ds
	 */
	public void setDoc_Ds(java.lang.String doc_Ds) {
		this.doc_Ds = doc_Ds;
	}

	/**
	 * Gets the doc_vig_desde value for this ClsSEGResponse_Tipo_doc.
	 * 
	 * @return doc_vig_desde
	 */
	public java.lang.String getDoc_vig_desde() {
		return doc_vig_desde;
	}

	/**
	 * Sets the doc_vig_desde value for this ClsSEGResponse_Tipo_doc.
	 * 
	 * @param doc_vig_desde
	 */
	public void setDoc_vig_desde(java.lang.String doc_vig_desde) {
		this.doc_vig_desde = doc_vig_desde;
	}

	/**
	 * Gets the doc_vig_hasta value for this ClsSEGResponse_Tipo_doc.
	 * 
	 * @return doc_vig_hasta
	 */
	public java.lang.String getDoc_vig_hasta() {
		return doc_vig_hasta;
	}

	/**
	 * Sets the doc_vig_hasta value for this ClsSEGResponse_Tipo_doc.
	 * 
	 * @param doc_vig_hasta
	 */
	public void setDoc_vig_hasta(java.lang.String doc_vig_hasta) {
		this.doc_vig_hasta = doc_vig_hasta;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClsSEGResponse_Tipo_doc))
			return false;
		ClsSEGResponse_Tipo_doc other = (ClsSEGResponse_Tipo_doc) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.doc_Id == other.getDoc_Id()
				&& ((this.doc_Ds == null && other.getDoc_Ds() == null)
						|| (this.doc_Ds != null && this.doc_Ds.equals(other.getDoc_Ds())))
				&& ((this.doc_vig_desde == null && other.getDoc_vig_desde() == null)
						|| (this.doc_vig_desde != null && this.doc_vig_desde.equals(other.getDoc_vig_desde())))
				&& ((this.doc_vig_hasta == null && other.getDoc_vig_hasta() == null)
						|| (this.doc_vig_hasta != null && this.doc_vig_hasta.equals(other.getDoc_vig_hasta())));
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
		_hashCode += getDoc_Id();
		if (getDoc_Ds() != null) {
			_hashCode += getDoc_Ds().hashCode();
		}
		if (getDoc_vig_desde() != null) {
			_hashCode += getDoc_vig_desde().hashCode();
		}
		if (getDoc_vig_hasta() != null) {
			_hashCode += getDoc_vig_hasta().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClsSEGResponse_Tipo_doc.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_doc"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("doc_Id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Doc_Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("doc_Ds");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Doc_Ds"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("doc_vig_desde");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Doc_vig_desde"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("doc_vig_hasta");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Doc_vig_hasta"));
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
