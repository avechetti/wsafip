/**
 * ClsBFEResponse_NCM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public class ClsBFEResponse_NCM implements java.io.Serializable {
	private java.lang.String NCM_Codigo;

	private java.lang.String NCM_Ds;

	private java.lang.String NCM_Nota;

	private java.lang.String NCM_vig_desde;

	private java.lang.String NCM_vig_hasta;

	public ClsBFEResponse_NCM() {
	}

	public ClsBFEResponse_NCM(java.lang.String NCM_Codigo, java.lang.String NCM_Ds, java.lang.String NCM_Nota,
			java.lang.String NCM_vig_desde, java.lang.String NCM_vig_hasta) {
		this.NCM_Codigo = NCM_Codigo;
		this.NCM_Ds = NCM_Ds;
		this.NCM_Nota = NCM_Nota;
		this.NCM_vig_desde = NCM_vig_desde;
		this.NCM_vig_hasta = NCM_vig_hasta;
	}

	/**
	 * Gets the NCM_Codigo value for this ClsBFEResponse_NCM.
	 * 
	 * @return NCM_Codigo
	 */
	public java.lang.String getNCM_Codigo() {
		return NCM_Codigo;
	}

	/**
	 * Sets the NCM_Codigo value for this ClsBFEResponse_NCM.
	 * 
	 * @param NCM_Codigo
	 */
	public void setNCM_Codigo(java.lang.String NCM_Codigo) {
		this.NCM_Codigo = NCM_Codigo;
	}

	/**
	 * Gets the NCM_Ds value for this ClsBFEResponse_NCM.
	 * 
	 * @return NCM_Ds
	 */
	public java.lang.String getNCM_Ds() {
		return NCM_Ds;
	}

	/**
	 * Sets the NCM_Ds value for this ClsBFEResponse_NCM.
	 * 
	 * @param NCM_Ds
	 */
	public void setNCM_Ds(java.lang.String NCM_Ds) {
		this.NCM_Ds = NCM_Ds;
	}

	/**
	 * Gets the NCM_Nota value for this ClsBFEResponse_NCM.
	 * 
	 * @return NCM_Nota
	 */
	public java.lang.String getNCM_Nota() {
		return NCM_Nota;
	}

	/**
	 * Sets the NCM_Nota value for this ClsBFEResponse_NCM.
	 * 
	 * @param NCM_Nota
	 */
	public void setNCM_Nota(java.lang.String NCM_Nota) {
		this.NCM_Nota = NCM_Nota;
	}

	/**
	 * Gets the NCM_vig_desde value for this ClsBFEResponse_NCM.
	 * 
	 * @return NCM_vig_desde
	 */
	public java.lang.String getNCM_vig_desde() {
		return NCM_vig_desde;
	}

	/**
	 * Sets the NCM_vig_desde value for this ClsBFEResponse_NCM.
	 * 
	 * @param NCM_vig_desde
	 */
	public void setNCM_vig_desde(java.lang.String NCM_vig_desde) {
		this.NCM_vig_desde = NCM_vig_desde;
	}

	/**
	 * Gets the NCM_vig_hasta value for this ClsBFEResponse_NCM.
	 * 
	 * @return NCM_vig_hasta
	 */
	public java.lang.String getNCM_vig_hasta() {
		return NCM_vig_hasta;
	}

	/**
	 * Sets the NCM_vig_hasta value for this ClsBFEResponse_NCM.
	 * 
	 * @param NCM_vig_hasta
	 */
	public void setNCM_vig_hasta(java.lang.String NCM_vig_hasta) {
		this.NCM_vig_hasta = NCM_vig_hasta;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClsBFEResponse_NCM))
			return false;
		ClsBFEResponse_NCM other = (ClsBFEResponse_NCM) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.NCM_Codigo == null && other.getNCM_Codigo() == null)
						|| (this.NCM_Codigo != null && this.NCM_Codigo.equals(other.getNCM_Codigo())))
				&& ((this.NCM_Ds == null && other.getNCM_Ds() == null)
						|| (this.NCM_Ds != null && this.NCM_Ds.equals(other.getNCM_Ds())))
				&& ((this.NCM_Nota == null && other.getNCM_Nota() == null)
						|| (this.NCM_Nota != null && this.NCM_Nota.equals(other.getNCM_Nota())))
				&& ((this.NCM_vig_desde == null && other.getNCM_vig_desde() == null)
						|| (this.NCM_vig_desde != null && this.NCM_vig_desde.equals(other.getNCM_vig_desde())))
				&& ((this.NCM_vig_hasta == null && other.getNCM_vig_hasta() == null)
						|| (this.NCM_vig_hasta != null && this.NCM_vig_hasta.equals(other.getNCM_vig_hasta())));
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
		if (getNCM_Codigo() != null) {
			_hashCode += getNCM_Codigo().hashCode();
		}
		if (getNCM_Ds() != null) {
			_hashCode += getNCM_Ds().hashCode();
		}
		if (getNCM_Nota() != null) {
			_hashCode += getNCM_Nota().hashCode();
		}
		if (getNCM_vig_desde() != null) {
			_hashCode += getNCM_vig_desde().hashCode();
		}
		if (getNCM_vig_hasta() != null) {
			_hashCode += getNCM_vig_hasta().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClsBFEResponse_NCM.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_NCM"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("NCM_Codigo");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "NCM_Codigo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("NCM_Ds");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "NCM_Ds"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("NCM_Nota");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "NCM_Nota"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("NCM_vig_desde");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "NCM_vig_desde"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("NCM_vig_hasta");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "NCM_vig_hasta"));
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
