/**
 * FEXResponse_DST_pais.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsfexv1;

public class FEXResponse_DST_pais implements java.io.Serializable {
	private coop.guenoa.afip.wsfexv1.ClsFEXResponse_DST_pais[] FEXResultGet;

	private coop.guenoa.afip.wsfexv1.ClsFEXErr FEXErr;

	private coop.guenoa.afip.wsfexv1.ClsFEXEvents FEXEvents;

	public FEXResponse_DST_pais() {
	}

	public FEXResponse_DST_pais(coop.guenoa.afip.wsfexv1.ClsFEXResponse_DST_pais[] FEXResultGet, coop.guenoa.afip.wsfexv1.ClsFEXErr FEXErr,
			coop.guenoa.afip.wsfexv1.ClsFEXEvents FEXEvents) {
		this.FEXResultGet = FEXResultGet;
		this.FEXErr = FEXErr;
		this.FEXEvents = FEXEvents;
	}

	/**
	 * Gets the FEXResultGet value for this FEXResponse_DST_pais.
	 * 
	 * @return FEXResultGet
	 */
	public coop.guenoa.afip.wsfexv1.ClsFEXResponse_DST_pais[] getFEXResultGet() {
		return FEXResultGet;
	}

	/**
	 * Sets the FEXResultGet value for this FEXResponse_DST_pais.
	 * 
	 * @param FEXResultGet
	 */
	public void setFEXResultGet(coop.guenoa.afip.wsfexv1.ClsFEXResponse_DST_pais[] FEXResultGet) {
		this.FEXResultGet = FEXResultGet;
	}

	/**
	 * Gets the FEXErr value for this FEXResponse_DST_pais.
	 * 
	 * @return FEXErr
	 */
	public coop.guenoa.afip.wsfexv1.ClsFEXErr getFEXErr() {
		return FEXErr;
	}

	/**
	 * Sets the FEXErr value for this FEXResponse_DST_pais.
	 * 
	 * @param FEXErr
	 */
	public void setFEXErr(coop.guenoa.afip.wsfexv1.ClsFEXErr FEXErr) {
		this.FEXErr = FEXErr;
	}

	/**
	 * Gets the FEXEvents value for this FEXResponse_DST_pais.
	 * 
	 * @return FEXEvents
	 */
	public coop.guenoa.afip.wsfexv1.ClsFEXEvents getFEXEvents() {
		return FEXEvents;
	}

	/**
	 * Sets the FEXEvents value for this FEXResponse_DST_pais.
	 * 
	 * @param FEXEvents
	 */
	public void setFEXEvents(coop.guenoa.afip.wsfexv1.ClsFEXEvents FEXEvents) {
		this.FEXEvents = FEXEvents;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof FEXResponse_DST_pais))
			return false;
		FEXResponse_DST_pais other = (FEXResponse_DST_pais) obj;
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
				&& ((this.FEXResultGet == null && other.getFEXResultGet() == null) || (this.FEXResultGet != null
						&& java.util.Arrays.equals(this.FEXResultGet, other.getFEXResultGet())))
				&& ((this.FEXErr == null && other.getFEXErr() == null)
						|| (this.FEXErr != null && this.FEXErr.equals(other.getFEXErr())))
				&& ((this.FEXEvents == null && other.getFEXEvents() == null)
						|| (this.FEXEvents != null && this.FEXEvents.equals(other.getFEXEvents())));
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
		if (getFEXResultGet() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getFEXResultGet()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getFEXResultGet(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getFEXErr() != null) {
			_hashCode += getFEXErr().hashCode();
		}
		if (getFEXEvents() != null) {
			_hashCode += getFEXEvents().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			FEXResponse_DST_pais.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.fexv1/", "FEXResponse_DST_pais"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("FEXResultGet");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.fexv1/", "FEXResultGet"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.fexv1/", "ClsFEXResponse_DST_pais"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.fexv1/", "ClsFEXResponse_DST_pais"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("FEXErr");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.fexv1/", "FEXErr"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.fexv1/", "ClsFEXErr"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("FEXEvents");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.fexv1/", "FEXEvents"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.fexv1/", "ClsFEXEvents"));
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
