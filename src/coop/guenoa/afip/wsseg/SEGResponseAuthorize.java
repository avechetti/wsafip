/**
 * SEGResponseAuthorize.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsseg;

public class SEGResponseAuthorize implements java.io.Serializable {
	private coop.guenoa.afip.wsseg.ClsSEGOutAuthorize SEGResultAuth;

	private coop.guenoa.afip.wsseg.ClsSEGErr SEGErr;

	private coop.guenoa.afip.wsseg.ClsSEGEvents SEGEvents;

	public SEGResponseAuthorize() {
	}

	public SEGResponseAuthorize(coop.guenoa.afip.wsseg.ClsSEGOutAuthorize SEGResultAuth, coop.guenoa.afip.wsseg.ClsSEGErr SEGErr,
			coop.guenoa.afip.wsseg.ClsSEGEvents SEGEvents) {
		this.SEGResultAuth = SEGResultAuth;
		this.SEGErr = SEGErr;
		this.SEGEvents = SEGEvents;
	}

	/**
	 * Gets the SEGResultAuth value for this SEGResponseAuthorize.
	 * 
	 * @return SEGResultAuth
	 */
	public coop.guenoa.afip.wsseg.ClsSEGOutAuthorize getSEGResultAuth() {
		return SEGResultAuth;
	}

	/**
	 * Sets the SEGResultAuth value for this SEGResponseAuthorize.
	 * 
	 * @param SEGResultAuth
	 */
	public void setSEGResultAuth(coop.guenoa.afip.wsseg.ClsSEGOutAuthorize SEGResultAuth) {
		this.SEGResultAuth = SEGResultAuth;
	}

	/**
	 * Gets the SEGErr value for this SEGResponseAuthorize.
	 * 
	 * @return SEGErr
	 */
	public coop.guenoa.afip.wsseg.ClsSEGErr getSEGErr() {
		return SEGErr;
	}

	/**
	 * Sets the SEGErr value for this SEGResponseAuthorize.
	 * 
	 * @param SEGErr
	 */
	public void setSEGErr(coop.guenoa.afip.wsseg.ClsSEGErr SEGErr) {
		this.SEGErr = SEGErr;
	}

	/**
	 * Gets the SEGEvents value for this SEGResponseAuthorize.
	 * 
	 * @return SEGEvents
	 */
	public coop.guenoa.afip.wsseg.ClsSEGEvents getSEGEvents() {
		return SEGEvents;
	}

	/**
	 * Sets the SEGEvents value for this SEGResponseAuthorize.
	 * 
	 * @param SEGEvents
	 */
	public void setSEGEvents(coop.guenoa.afip.wsseg.ClsSEGEvents SEGEvents) {
		this.SEGEvents = SEGEvents;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SEGResponseAuthorize))
			return false;
		SEGResponseAuthorize other = (SEGResponseAuthorize) obj;
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
				&& ((this.SEGResultAuth == null && other.getSEGResultAuth() == null)
						|| (this.SEGResultAuth != null && this.SEGResultAuth.equals(other.getSEGResultAuth())))
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
		if (getSEGResultAuth() != null) {
			_hashCode += getSEGResultAuth().hashCode();
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
			SEGResponseAuthorize.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponseAuthorize"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("SEGResultAuth");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResultAuth"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGOutAuthorize"));
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
