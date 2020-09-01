/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public class Item implements java.io.Serializable {
	private java.lang.String pro_codigo_ncm;

	private java.lang.String pro_codigo_sec;

	private java.lang.String pro_ds;

	private double pro_qty;

	private int pro_umed;

	private double pro_precio_uni;

	private double imp_bonif;

	private double imp_total;

	private short iva_id;

	public Item() {
	}

	public Item(java.lang.String pro_codigo_ncm, java.lang.String pro_codigo_sec, java.lang.String pro_ds,
			double pro_qty, int pro_umed, double pro_precio_uni, double imp_bonif, double imp_total, short iva_id) {
		this.pro_codigo_ncm = pro_codigo_ncm;
		this.pro_codigo_sec = pro_codigo_sec;
		this.pro_ds = pro_ds;
		this.pro_qty = pro_qty;
		this.pro_umed = pro_umed;
		this.pro_precio_uni = pro_precio_uni;
		this.imp_bonif = imp_bonif;
		this.imp_total = imp_total;
		this.iva_id = iva_id;
	}

	/**
	 * Gets the pro_codigo_ncm value for this Item.
	 * 
	 * @return pro_codigo_ncm
	 */
	public java.lang.String getPro_codigo_ncm() {
		return pro_codigo_ncm;
	}

	/**
	 * Sets the pro_codigo_ncm value for this Item.
	 * 
	 * @param pro_codigo_ncm
	 */
	public void setPro_codigo_ncm(java.lang.String pro_codigo_ncm) {
		this.pro_codigo_ncm = pro_codigo_ncm;
	}

	/**
	 * Gets the pro_codigo_sec value for this Item.
	 * 
	 * @return pro_codigo_sec
	 */
	public java.lang.String getPro_codigo_sec() {
		return pro_codigo_sec;
	}

	/**
	 * Sets the pro_codigo_sec value for this Item.
	 * 
	 * @param pro_codigo_sec
	 */
	public void setPro_codigo_sec(java.lang.String pro_codigo_sec) {
		this.pro_codigo_sec = pro_codigo_sec;
	}

	/**
	 * Gets the pro_ds value for this Item.
	 * 
	 * @return pro_ds
	 */
	public java.lang.String getPro_ds() {
		return pro_ds;
	}

	/**
	 * Sets the pro_ds value for this Item.
	 * 
	 * @param pro_ds
	 */
	public void setPro_ds(java.lang.String pro_ds) {
		this.pro_ds = pro_ds;
	}

	/**
	 * Gets the pro_qty value for this Item.
	 * 
	 * @return pro_qty
	 */
	public double getPro_qty() {
		return pro_qty;
	}

	/**
	 * Sets the pro_qty value for this Item.
	 * 
	 * @param pro_qty
	 */
	public void setPro_qty(double pro_qty) {
		this.pro_qty = pro_qty;
	}

	/**
	 * Gets the pro_umed value for this Item.
	 * 
	 * @return pro_umed
	 */
	public int getPro_umed() {
		return pro_umed;
	}

	/**
	 * Sets the pro_umed value for this Item.
	 * 
	 * @param pro_umed
	 */
	public void setPro_umed(int pro_umed) {
		this.pro_umed = pro_umed;
	}

	/**
	 * Gets the pro_precio_uni value for this Item.
	 * 
	 * @return pro_precio_uni
	 */
	public double getPro_precio_uni() {
		return pro_precio_uni;
	}

	/**
	 * Sets the pro_precio_uni value for this Item.
	 * 
	 * @param pro_precio_uni
	 */
	public void setPro_precio_uni(double pro_precio_uni) {
		this.pro_precio_uni = pro_precio_uni;
	}

	/**
	 * Gets the imp_bonif value for this Item.
	 * 
	 * @return imp_bonif
	 */
	public double getImp_bonif() {
		return imp_bonif;
	}

	/**
	 * Sets the imp_bonif value for this Item.
	 * 
	 * @param imp_bonif
	 */
	public void setImp_bonif(double imp_bonif) {
		this.imp_bonif = imp_bonif;
	}

	/**
	 * Gets the imp_total value for this Item.
	 * 
	 * @return imp_total
	 */
	public double getImp_total() {
		return imp_total;
	}

	/**
	 * Sets the imp_total value for this Item.
	 * 
	 * @param imp_total
	 */
	public void setImp_total(double imp_total) {
		this.imp_total = imp_total;
	}

	/**
	 * Gets the iva_id value for this Item.
	 * 
	 * @return iva_id
	 */
	public short getIva_id() {
		return iva_id;
	}

	/**
	 * Sets the iva_id value for this Item.
	 * 
	 * @param iva_id
	 */
	public void setIva_id(short iva_id) {
		this.iva_id = iva_id;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Item))
			return false;
		Item other = (Item) obj;
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
				&& ((this.pro_codigo_ncm == null && other.getPro_codigo_ncm() == null)
						|| (this.pro_codigo_ncm != null && this.pro_codigo_ncm.equals(other.getPro_codigo_ncm())))
				&& ((this.pro_codigo_sec == null && other.getPro_codigo_sec() == null)
						|| (this.pro_codigo_sec != null && this.pro_codigo_sec.equals(other.getPro_codigo_sec())))
				&& ((this.pro_ds == null && other.getPro_ds() == null)
						|| (this.pro_ds != null && this.pro_ds.equals(other.getPro_ds())))
				&& this.pro_qty == other.getPro_qty() && this.pro_umed == other.getPro_umed()
				&& this.pro_precio_uni == other.getPro_precio_uni() && this.imp_bonif == other.getImp_bonif()
				&& this.imp_total == other.getImp_total() && this.iva_id == other.getIva_id();
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
		if (getPro_codigo_ncm() != null) {
			_hashCode += getPro_codigo_ncm().hashCode();
		}
		if (getPro_codigo_sec() != null) {
			_hashCode += getPro_codigo_sec().hashCode();
		}
		if (getPro_ds() != null) {
			_hashCode += getPro_ds().hashCode();
		}
		_hashCode += new Double(getPro_qty()).hashCode();
		_hashCode += getPro_umed();
		_hashCode += new Double(getPro_precio_uni()).hashCode();
		_hashCode += new Double(getImp_bonif()).hashCode();
		_hashCode += new Double(getImp_total()).hashCode();
		_hashCode += getIva_id();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(Item.class,
			true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Item"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pro_codigo_ncm");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Pro_codigo_ncm"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pro_codigo_sec");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Pro_codigo_sec"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pro_ds");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Pro_ds"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pro_qty");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Pro_qty"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pro_umed");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Pro_umed"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pro_precio_uni");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Pro_precio_uni"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_bonif");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_bonif"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_total");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_total"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("iva_id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Iva_id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
