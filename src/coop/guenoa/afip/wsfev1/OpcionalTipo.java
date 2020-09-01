/**
 * OpcionalTipo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsfev1;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;

public class OpcionalTipo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String desc;

	private String fchDesde;

	private String fchHasta;

	public OpcionalTipo() {
	}

	public OpcionalTipo(String id, String desc, String fchDesde, String fchHasta) {
		this.id = id;
		this.desc = desc;
		this.fchDesde = fchDesde;
		this.fchHasta = fchHasta;
	}

	/**
	 * Gets the id value for this OpcionalTipo.
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id value for this OpcionalTipo.
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the desc value for this OpcionalTipo.
	 * 
	 * @return desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets the desc value for this OpcionalTipo.
	 * 
	 * @param desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * Gets the fchDesde value for this OpcionalTipo.
	 * 
	 * @return fchDesde
	 */
	public String getFchDesde() {
		return fchDesde;
	}

	/**
	 * Sets the fchDesde value for this OpcionalTipo.
	 * 
	 * @param fchDesde
	 */
	public void setFchDesde(String fchDesde) {
		this.fchDesde = fchDesde;
	}

	/**
	 * Gets the fchHasta value for this OpcionalTipo.
	 * 
	 * @return fchHasta
	 */
	public String getFchHasta() {
		return fchHasta;
	}

	/**
	 * Sets the fchHasta value for this OpcionalTipo.
	 * 
	 * @param fchHasta
	 */
	public void setFchHasta(String fchHasta) {
		this.fchHasta = fchHasta;
	}

	private Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(Object obj) {
		if (!(obj instanceof OpcionalTipo))
			return false;
		OpcionalTipo other = (OpcionalTipo) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id.equals(other.getId())))
				&& ((this.desc == null && other.getDesc() == null)
						|| (this.desc != null && this.desc.equals(other.getDesc())))
				&& ((this.fchDesde == null && other.getFchDesde() == null)
						|| (this.fchDesde != null && this.fchDesde.equals(other.getFchDesde())))
				&& ((this.fchHasta == null && other.getFchHasta() == null)
						|| (this.fchHasta != null && this.fchHasta.equals(other.getFchHasta())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getDesc() != null) {
			_hashCode += getDesc().hashCode();
		}
		if (getFchDesde() != null) {
			_hashCode += getFchDesde().hashCode();
		}
		if (getFchHasta() != null) {
			_hashCode += getFchHasta().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(OpcionalTipo.class, true);

	static {
		typeDesc.setXmlType(new QName("http://ar.gov.afip.dif.FEV1/", "OpcionalTipo"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new QName("http://ar.gov.afip.dif.FEV1/", "Id"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("desc");
		elemField.setXmlName(new QName("http://ar.gov.afip.dif.FEV1/", "Desc"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("fchDesde");
		elemField.setXmlName(new QName("http://ar.gov.afip.dif.FEV1/", "FchDesde"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("fchHasta");
		elemField.setXmlName(new QName("http://ar.gov.afip.dif.FEV1/", "FchHasta"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
		return new BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

	@Override
	public String toString() {
		return "OpcionalTipo [id=" + id + ", desc=" + desc + ", fchDesde=" + fchDesde + ", fchHasta=" + fchHasta + "]";
	}
	
	

}
