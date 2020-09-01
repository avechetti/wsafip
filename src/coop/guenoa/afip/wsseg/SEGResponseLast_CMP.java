/**
 * SEGResponseLast_CMP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsseg;

public class SEGResponseLast_CMP implements java.io.Serializable {
	private coop.guenoa.afip.wsseg.ClsSEG_LastCMP_Response SEGResult_LastCMP;

	private coop.guenoa.afip.wsseg.ClsSEGErr SEGErr;

	private coop.guenoa.afip.wsseg.ClsSEGEvents SEGEvents;

	public SEGResponseLast_CMP() {
	}

	public SEGResponseLast_CMP(coop.guenoa.afip.wsseg.ClsSEG_LastCMP_Response SEGResult_LastCMP, coop.guenoa.afip.wsseg.ClsSEGErr SEGErr,
			coop.guenoa.afip.wsseg.ClsSEGEvents SEGEvents) {
		this.SEGResult_LastCMP = SEGResult_LastCMP;
		this.SEGErr = SEGErr;
		this.SEGEvents = SEGEvents;
	}

	/**
	 * Gets the SEGResult_LastCMP value for this SEGResponseLast_CMP.
	 * 
	 * @return SEGResult_LastCMP
	 */
	public coop.guenoa.afip.wsseg.ClsSEG_LastCMP_Response getSEGResult_LastCMP() {
		return SEGResult_LastCMP;
	}

	/**
	 * Sets the SEGResult_LastCMP value for this SEGResponseLast_CMP.
	 * 
	 * @param SEGResult_LastCMP
	 */
	public void setSEGResult_LastCMP(coop.guenoa.afip.wsseg.ClsSEG_LastCMP_Response SEGResult_LastCMP) {
		this.SEGResult_LastCMP = SEGResult_LastCMP;
	}

	/**
	 * Gets the SEGErr value for this SEGResponseLast_CMP.
	 * 
	 * @return SEGErr
	 */
	public coop.guenoa.afip.wsseg.ClsSEGErr getSEGErr() {
		return SEGErr;
	}

	/**
	 * Sets the SEGErr value for this SEGResponseLast_CMP.
	 * 
	 * @param SEGErr
	 */
	public void setSEGErr(coop.guenoa.afip.wsseg.ClsSEGErr SEGErr) {
		this.SEGErr = SEGErr;
	}

	/**
	 * Gets the SEGEvents value for this SEGResponseLast_CMP.
	 * 
	 * @return SEGEvents
	 */
	public coop.guenoa.afip.wsseg.ClsSEGEvents getSEGEvents() {
		return SEGEvents;
	}

	/**
	 * Sets the SEGEvents value for this SEGResponseLast_CMP.
	 * 
	 * @param SEGEvents
	 */
	public void setSEGEvents(coop.guenoa.afip.wsseg.ClsSEGEvents SEGEvents) {
		this.SEGEvents = SEGEvents;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SEGResponseLast_CMP))
			return false;
		SEGResponseLast_CMP other = (SEGResponseLast_CMP) obj;
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
				&& ((this.SEGResult_LastCMP == null && other.getSEGResult_LastCMP() == null)
						|| (this.SEGResult_LastCMP != null
								&& this.SEGResult_LastCMP.equals(other.getSEGResult_LastCMP())))
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
		if (getSEGResult_LastCMP() != null) {
			_hashCode += getSEGResult_LastCMP().hashCode();
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
			SEGResponseLast_CMP.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponseLast_CMP"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("SEGResult_LastCMP");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResult_LastCMP"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEG_LastCMP_Response"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
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
