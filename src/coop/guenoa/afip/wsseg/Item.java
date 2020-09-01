/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsseg;

public class Item implements java.io.Serializable {
	private java.lang.String poliza;

	private java.lang.String endoso;

	private java.lang.String ds;

	private double qty;

	private double precio_uni;

	private double imp_bonif;

	private double imp_total;

	private double imp_valor_aseg;

	private java.lang.String imp_moneda_vaseg;

	private short iva_id;

	public Item() {
	}

	public Item(java.lang.String poliza, java.lang.String endoso, java.lang.String ds, double qty, double precio_uni,
			double imp_bonif, double imp_total, double imp_valor_aseg, java.lang.String imp_moneda_vaseg,
			short iva_id) {
		this.poliza = poliza;
		this.endoso = endoso;
		this.ds = ds;
		this.qty = qty;
		this.precio_uni = precio_uni;
		this.imp_bonif = imp_bonif;
		this.imp_total = imp_total;
		this.imp_valor_aseg = imp_valor_aseg;
		this.imp_moneda_vaseg = imp_moneda_vaseg;
		this.iva_id = iva_id;
	}

	/**
	 * Gets the poliza value for this Item.
	 * 
	 * @return poliza
	 */
	public java.lang.String getPoliza() {
		return poliza;
	}

	/**
	 * Sets the poliza value for this Item.
	 * 
	 * @param poliza
	 */
	public void setPoliza(java.lang.String poliza) {
		this.poliza = poliza;
	}

	/**
	 * Gets the endoso value for this Item.
	 * 
	 * @return endoso
	 */
	public java.lang.String getEndoso() {
		return endoso;
	}

	/**
	 * Sets the endoso value for this Item.
	 * 
	 * @param endoso
	 */
	public void setEndoso(java.lang.String endoso) {
		this.endoso = endoso;
	}

	/**
	 * Gets the ds value for this Item.
	 * 
	 * @return ds
	 */
	public java.lang.String getDs() {
		return ds;
	}

	/**
	 * Sets the ds value for this Item.
	 * 
	 * @param ds
	 */
	public void setDs(java.lang.String ds) {
		this.ds = ds;
	}

	/**
	 * Gets the qty value for this Item.
	 * 
	 * @return qty
	 */
	public double getQty() {
		return qty;
	}

	/**
	 * Sets the qty value for this Item.
	 * 
	 * @param qty
	 */
	public void setQty(double qty) {
		this.qty = qty;
	}

	/**
	 * Gets the precio_uni value for this Item.
	 * 
	 * @return precio_uni
	 */
	public double getPrecio_uni() {
		return precio_uni;
	}

	/**
	 * Sets the precio_uni value for this Item.
	 * 
	 * @param precio_uni
	 */
	public void setPrecio_uni(double precio_uni) {
		this.precio_uni = precio_uni;
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
	 * Gets the imp_valor_aseg value for this Item.
	 * 
	 * @return imp_valor_aseg
	 */
	public double getImp_valor_aseg() {
		return imp_valor_aseg;
	}

	/**
	 * Sets the imp_valor_aseg value for this Item.
	 * 
	 * @param imp_valor_aseg
	 */
	public void setImp_valor_aseg(double imp_valor_aseg) {
		this.imp_valor_aseg = imp_valor_aseg;
	}

	/**
	 * Gets the imp_moneda_vaseg value for this Item.
	 * 
	 * @return imp_moneda_vaseg
	 */
	public java.lang.String getImp_moneda_vaseg() {
		return imp_moneda_vaseg;
	}

	/**
	 * Sets the imp_moneda_vaseg value for this Item.
	 * 
	 * @param imp_moneda_vaseg
	 */
	public void setImp_moneda_vaseg(java.lang.String imp_moneda_vaseg) {
		this.imp_moneda_vaseg = imp_moneda_vaseg;
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
				&& ((this.poliza == null && other.getPoliza() == null)
						|| (this.poliza != null && this.poliza.equals(other.getPoliza())))
				&& ((this.endoso == null && other.getEndoso() == null)
						|| (this.endoso != null && this.endoso.equals(other.getEndoso())))
				&& ((this.ds == null && other.getDs() == null) || (this.ds != null && this.ds.equals(other.getDs())))
				&& this.qty == other.getQty() && this.precio_uni == other.getPrecio_uni()
				&& this.imp_bonif == other.getImp_bonif() && this.imp_total == other.getImp_total()
				&& this.imp_valor_aseg == other.getImp_valor_aseg()
				&& ((this.imp_moneda_vaseg == null && other.getImp_moneda_vaseg() == null)
						|| (this.imp_moneda_vaseg != null && this.imp_moneda_vaseg.equals(other.getImp_moneda_vaseg())))
				&& this.iva_id == other.getIva_id();
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
		if (getPoliza() != null) {
			_hashCode += getPoliza().hashCode();
		}
		if (getEndoso() != null) {
			_hashCode += getEndoso().hashCode();
		}
		if (getDs() != null) {
			_hashCode += getDs().hashCode();
		}
		_hashCode += new Double(getQty()).hashCode();
		_hashCode += new Double(getPrecio_uni()).hashCode();
		_hashCode += new Double(getImp_bonif()).hashCode();
		_hashCode += new Double(getImp_total()).hashCode();
		_hashCode += new Double(getImp_valor_aseg()).hashCode();
		if (getImp_moneda_vaseg() != null) {
			_hashCode += getImp_moneda_vaseg().hashCode();
		}
		_hashCode += getIva_id();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(Item.class,
			true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Item"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("poliza");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Poliza"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("endoso");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Endoso"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ds");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Ds"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("qty");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Qty"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("precio_uni");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Precio_uni"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_bonif");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_bonif"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_total");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_total"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_valor_aseg");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_valor_aseg"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_moneda_vaseg");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_moneda_vaseg"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("iva_id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Iva_id"));
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
