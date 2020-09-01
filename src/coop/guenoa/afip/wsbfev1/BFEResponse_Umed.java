/**
 * BFEResponse_Umed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public class BFEResponse_Umed implements java.io.Serializable {
	private coop.guenoa.afip.wsbfev1.ClsBFEResponse_UMed[] BFEResultGet;

	private coop.guenoa.afip.wsbfev1.ClsBFEErr BFEErr;

	private coop.guenoa.afip.wsbfev1.ClsBFEEvents BFEEvents;

	public BFEResponse_Umed() {
	}

	public BFEResponse_Umed(coop.guenoa.afip.wsbfev1.ClsBFEResponse_UMed[] BFEResultGet, coop.guenoa.afip.wsbfev1.ClsBFEErr BFEErr,
			coop.guenoa.afip.wsbfev1.ClsBFEEvents BFEEvents) {
		this.BFEResultGet = BFEResultGet;
		this.BFEErr = BFEErr;
		this.BFEEvents = BFEEvents;
	}

	/**
	 * Gets the BFEResultGet value for this BFEResponse_Umed.
	 * 
	 * @return BFEResultGet
	 */
	public coop.guenoa.afip.wsbfev1.ClsBFEResponse_UMed[] getBFEResultGet() {
		return BFEResultGet;
	}

	/**
	 * Sets the BFEResultGet value for this BFEResponse_Umed.
	 * 
	 * @param BFEResultGet
	 */
	public void setBFEResultGet(coop.guenoa.afip.wsbfev1.ClsBFEResponse_UMed[] BFEResultGet) {
		this.BFEResultGet = BFEResultGet;
	}

	/**
	 * Gets the BFEErr value for this BFEResponse_Umed.
	 * 
	 * @return BFEErr
	 */
	public coop.guenoa.afip.wsbfev1.ClsBFEErr getBFEErr() {
		return BFEErr;
	}

	/**
	 * Sets the BFEErr value for this BFEResponse_Umed.
	 * 
	 * @param BFEErr
	 */
	public void setBFEErr(coop.guenoa.afip.wsbfev1.ClsBFEErr BFEErr) {
		this.BFEErr = BFEErr;
	}

	/**
	 * Gets the BFEEvents value for this BFEResponse_Umed.
	 * 
	 * @return BFEEvents
	 */
	public coop.guenoa.afip.wsbfev1.ClsBFEEvents getBFEEvents() {
		return BFEEvents;
	}

	/**
	 * Sets the BFEEvents value for this BFEResponse_Umed.
	 * 
	 * @param BFEEvents
	 */
	public void setBFEEvents(coop.guenoa.afip.wsbfev1.ClsBFEEvents BFEEvents) {
		this.BFEEvents = BFEEvents;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof BFEResponse_Umed))
			return false;
		BFEResponse_Umed other = (BFEResponse_Umed) obj;
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
				&& ((this.BFEResultGet == null && other.getBFEResultGet() == null) || (this.BFEResultGet != null
						&& java.util.Arrays.equals(this.BFEResultGet, other.getBFEResultGet())))
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
		if (getBFEResultGet() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getBFEResultGet()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getBFEResultGet(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
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
			BFEResponse_Umed.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Umed"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("BFEResultGet");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResultGet"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_UMed"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_UMed"));
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
