/**
 * FECAEAResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsfev1;

public class FECAEAResponse implements java.io.Serializable {
	private coop.guenoa.afip.wsfev1.FECAEACabResponse feCabResp;

	private coop.guenoa.afip.wsfev1.FECAEADetResponse[] feDetResp;

	private coop.guenoa.afip.wsfev1.Evt[] events;

	private coop.guenoa.afip.wsfev1.Err[] errors;

	public FECAEAResponse() {
	}

	public FECAEAResponse(coop.guenoa.afip.wsfev1.FECAEACabResponse feCabResp, coop.guenoa.afip.wsfev1.FECAEADetResponse[] feDetResp, coop.guenoa.afip.wsfev1.Evt[] events,
			coop.guenoa.afip.wsfev1.Err[] errors) {
		this.feCabResp = feCabResp;
		this.feDetResp = feDetResp;
		this.events = events;
		this.errors = errors;
	}

	/**
	 * Gets the feCabResp value for this FECAEAResponse.
	 * 
	 * @return feCabResp
	 */
	public coop.guenoa.afip.wsfev1.FECAEACabResponse getFeCabResp() {
		return feCabResp;
	}

	/**
	 * Sets the feCabResp value for this FECAEAResponse.
	 * 
	 * @param feCabResp
	 */
	public void setFeCabResp(coop.guenoa.afip.wsfev1.FECAEACabResponse feCabResp) {
		this.feCabResp = feCabResp;
	}

	/**
	 * Gets the feDetResp value for this FECAEAResponse.
	 * 
	 * @return feDetResp
	 */
	public coop.guenoa.afip.wsfev1.FECAEADetResponse[] getFeDetResp() {
		return feDetResp;
	}

	/**
	 * Sets the feDetResp value for this FECAEAResponse.
	 * 
	 * @param feDetResp
	 */
	public void setFeDetResp(coop.guenoa.afip.wsfev1.FECAEADetResponse[] feDetResp) {
		this.feDetResp = feDetResp;
	}

	/**
	 * Gets the events value for this FECAEAResponse.
	 * 
	 * @return events
	 */
	public coop.guenoa.afip.wsfev1.Evt[] getEvents() {
		return events;
	}

	/**
	 * Sets the events value for this FECAEAResponse.
	 * 
	 * @param events
	 */
	public void setEvents(coop.guenoa.afip.wsfev1.Evt[] events) {
		this.events = events;
	}

	/**
	 * Gets the errors value for this FECAEAResponse.
	 * 
	 * @return errors
	 */
	public coop.guenoa.afip.wsfev1.Err[] getErrors() {
		return errors;
	}

	/**
	 * Sets the errors value for this FECAEAResponse.
	 * 
	 * @param errors
	 */
	public void setErrors(coop.guenoa.afip.wsfev1.Err[] errors) {
		this.errors = errors;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof FECAEAResponse))
			return false;
		FECAEAResponse other = (FECAEAResponse) obj;
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
				&& ((this.feCabResp == null && other.getFeCabResp() == null)
						|| (this.feCabResp != null && this.feCabResp.equals(other.getFeCabResp())))
				&& ((this.feDetResp == null && other.getFeDetResp() == null)
						|| (this.feDetResp != null && java.util.Arrays.equals(this.feDetResp, other.getFeDetResp())))
				&& ((this.events == null && other.getEvents() == null)
						|| (this.events != null && java.util.Arrays.equals(this.events, other.getEvents())))
				&& ((this.errors == null && other.getErrors() == null)
						|| (this.errors != null && java.util.Arrays.equals(this.errors, other.getErrors())));
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
		if (getFeCabResp() != null) {
			_hashCode += getFeCabResp().hashCode();
		}
		if (getFeDetResp() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getFeDetResp()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getFeDetResp(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getEvents() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getEvents()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getErrors() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getErrors()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			FECAEAResponse.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FECAEAResponse"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("feCabResp");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FeCabResp"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FECAEACabResponse"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("feDetResp");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FeDetResp"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FECAEADetResponse"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FECAEADetResponse"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("events");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Events"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Evt"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Evt"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("errors");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Errors"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Err"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Err"));
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
