/**
 * SEGResponse_Tipo_Cbte.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsseg;

public class SEGResponse_Tipo_Cbte implements java.io.Serializable {
	private coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_Cbte[] SEGResultGet;

	private coop.guenoa.afip.wsseg.ClsSEGErr SEGErr;

	private coop.guenoa.afip.wsseg.ClsSEGEvents SEGEvents;

	public SEGResponse_Tipo_Cbte() {
	}

	public SEGResponse_Tipo_Cbte(coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_Cbte[] SEGResultGet, coop.guenoa.afip.wsseg.ClsSEGErr SEGErr,
			coop.guenoa.afip.wsseg.ClsSEGEvents SEGEvents) {
		this.SEGResultGet = SEGResultGet;
		this.SEGErr = SEGErr;
		this.SEGEvents = SEGEvents;
	}

	/**
	 * Gets the SEGResultGet value for this SEGResponse_Tipo_Cbte.
	 * 
	 * @return SEGResultGet
	 */
	public coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_Cbte[] getSEGResultGet() {
		return SEGResultGet;
	}

	/**
	 * Sets the SEGResultGet value for this SEGResponse_Tipo_Cbte.
	 * 
	 * @param SEGResultGet
	 */
	public void setSEGResultGet(coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_Cbte[] SEGResultGet) {
		this.SEGResultGet = SEGResultGet;
	}

	/**
	 * Gets the SEGErr value for this SEGResponse_Tipo_Cbte.
	 * 
	 * @return SEGErr
	 */
	public coop.guenoa.afip.wsseg.ClsSEGErr getSEGErr() {
		return SEGErr;
	}

	/**
	 * Sets the SEGErr value for this SEGResponse_Tipo_Cbte.
	 * 
	 * @param SEGErr
	 */
	public void setSEGErr(coop.guenoa.afip.wsseg.ClsSEGErr SEGErr) {
		this.SEGErr = SEGErr;
	}

	/**
	 * Gets the SEGEvents value for this SEGResponse_Tipo_Cbte.
	 * 
	 * @return SEGEvents
	 */
	public coop.guenoa.afip.wsseg.ClsSEGEvents getSEGEvents() {
		return SEGEvents;
	}

	/**
	 * Sets the SEGEvents value for this SEGResponse_Tipo_Cbte.
	 * 
	 * @param SEGEvents
	 */
	public void setSEGEvents(coop.guenoa.afip.wsseg.ClsSEGEvents SEGEvents) {
		this.SEGEvents = SEGEvents;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SEGResponse_Tipo_Cbte))
			return false;
		SEGResponse_Tipo_Cbte other = (SEGResponse_Tipo_Cbte) obj;
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
				&& ((this.SEGResultGet == null && other.getSEGResultGet() == null) || (this.SEGResultGet != null
						&& java.util.Arrays.equals(this.SEGResultGet, other.getSEGResultGet())))
				&& ((this.SEGErr == null && other.getSEGErr() == null)
						|| (this.SEGErr != null && this.SEGErr.equals(other.getSEGErr())))
				&& ((this.SEGEvents == null && other.getSEGEvents() == null)
						|| (this.SEGEvents != null && this.SEGEvents.equals(other.getSEGEvents())));
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
		if (getSEGResultGet() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getSEGResultGet()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getSEGResultGet(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSEGErr() != null) {
			_hashCode += getSEGErr().hashCode();
		}
		if (getSEGEvents() != null) {
			_hashCode += getSEGEvents().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			SEGResponse_Tipo_Cbte.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_Tipo_Cbte"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("SEGResultGet");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResultGet"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_Cbte"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_Cbte"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("SEGErr");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGErr"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGErr"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("SEGEvents");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGEvents"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGEvents"));
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
