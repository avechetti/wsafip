/**
 * BFEResponseLast_CMP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public class BFEResponseLast_CMP implements java.io.Serializable {
	private coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP_Response BFEResult_LastCMP;

	private coop.guenoa.afip.wsbfev1.ClsBFEErr BFEErr;

	private coop.guenoa.afip.wsbfev1.ClsBFEEvents BFEEvents;

	public BFEResponseLast_CMP() {
	}

	public BFEResponseLast_CMP(coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP_Response BFEResult_LastCMP, coop.guenoa.afip.wsbfev1.ClsBFEErr BFEErr,
			coop.guenoa.afip.wsbfev1.ClsBFEEvents BFEEvents) {
		this.BFEResult_LastCMP = BFEResult_LastCMP;
		this.BFEErr = BFEErr;
		this.BFEEvents = BFEEvents;
	}

	/**
	 * Gets the BFEResult_LastCMP value for this BFEResponseLast_CMP.
	 * 
	 * @return BFEResult_LastCMP
	 */
	public coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP_Response getBFEResult_LastCMP() {
		return BFEResult_LastCMP;
	}

	/**
	 * Sets the BFEResult_LastCMP value for this BFEResponseLast_CMP.
	 * 
	 * @param BFEResult_LastCMP
	 */
	public void setBFEResult_LastCMP(coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP_Response BFEResult_LastCMP) {
		this.BFEResult_LastCMP = BFEResult_LastCMP;
	}

	/**
	 * Gets the BFEErr value for this BFEResponseLast_CMP.
	 * 
	 * @return BFEErr
	 */
	public coop.guenoa.afip.wsbfev1.ClsBFEErr getBFEErr() {
		return BFEErr;
	}

	/**
	 * Sets the BFEErr value for this BFEResponseLast_CMP.
	 * 
	 * @param BFEErr
	 */
	public void setBFEErr(coop.guenoa.afip.wsbfev1.ClsBFEErr BFEErr) {
		this.BFEErr = BFEErr;
	}

	/**
	 * Gets the BFEEvents value for this BFEResponseLast_CMP.
	 * 
	 * @return BFEEvents
	 */
	public coop.guenoa.afip.wsbfev1.ClsBFEEvents getBFEEvents() {
		return BFEEvents;
	}

	/**
	 * Sets the BFEEvents value for this BFEResponseLast_CMP.
	 * 
	 * @param BFEEvents
	 */
	public void setBFEEvents(coop.guenoa.afip.wsbfev1.ClsBFEEvents BFEEvents) {
		this.BFEEvents = BFEEvents;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof BFEResponseLast_CMP))
			return false;
		BFEResponseLast_CMP other = (BFEResponseLast_CMP) obj;
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
				&& ((this.BFEResult_LastCMP == null && other.getBFEResult_LastCMP() == null)
						|| (this.BFEResult_LastCMP != null
								&& this.BFEResult_LastCMP.equals(other.getBFEResult_LastCMP())))
				&& ((this.BFEErr == null && other.getBFEErr() == null)
						|| (this.BFEErr != null && this.BFEErr.equals(other.getBFEErr())))
				&& ((this.BFEEvents == null && other.getBFEEvents() == null)
						|| (this.BFEEvents != null && this.BFEEvents.equals(other.getBFEEvents())));
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
		if (getBFEResult_LastCMP() != null) {
			_hashCode += getBFEResult_LastCMP().hashCode();
		}
		if (getBFEErr() != null) {
			_hashCode += getBFEErr().hashCode();
		}
		if (getBFEEvents() != null) {
			_hashCode += getBFEEvents().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			BFEResponseLast_CMP.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponseLast_CMP"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("BFEResult_LastCMP");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResult_LastCMP"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFE_LastCMP_Response"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("BFEErr");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEErr"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEErr"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("BFEEvents");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEEvents"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEEvents"));
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
