/**
 * RechazarFECredRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class RechazarFECredRequestType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.AuthRequestType authRequest;

	private coop.guenoa.afip.FECredService.IdCtaCteType idCtaCte;

	private coop.guenoa.afip.FECredService.MotivoRechazoType[] arrayMotivosRechazo;

	public RechazarFECredRequestType() {
	}

	public RechazarFECredRequestType(coop.guenoa.afip.FECredService.AuthRequestType authRequest,
			coop.guenoa.afip.FECredService.IdCtaCteType idCtaCte,
			coop.guenoa.afip.FECredService.MotivoRechazoType[] arrayMotivosRechazo) {
		this.authRequest = authRequest;
		this.idCtaCte = idCtaCte;
		this.arrayMotivosRechazo = arrayMotivosRechazo;
	}

	/**
	 * Gets the authRequest value for this RechazarFECredRequestType.
	 * 
	 * @return authRequest
	 */
	public coop.guenoa.afip.FECredService.AuthRequestType getAuthRequest() {
		return authRequest;
	}

	/**
	 * Sets the authRequest value for this RechazarFECredRequestType.
	 * 
	 * @param authRequest
	 */
	public void setAuthRequest(coop.guenoa.afip.FECredService.AuthRequestType authRequest) {
		this.authRequest = authRequest;
	}

	/**
	 * Gets the idCtaCte value for this RechazarFECredRequestType.
	 * 
	 * @return idCtaCte
	 */
	public coop.guenoa.afip.FECredService.IdCtaCteType getIdCtaCte() {
		return idCtaCte;
	}

	/**
	 * Sets the idCtaCte value for this RechazarFECredRequestType.
	 * 
	 * @param idCtaCte
	 */
	public void setIdCtaCte(coop.guenoa.afip.FECredService.IdCtaCteType idCtaCte) {
		this.idCtaCte = idCtaCte;
	}

	/**
	 * Gets the arrayMotivosRechazo value for this RechazarFECredRequestType.
	 * 
	 * @return arrayMotivosRechazo
	 */
	public coop.guenoa.afip.FECredService.MotivoRechazoType[] getArrayMotivosRechazo() {
		return arrayMotivosRechazo;
	}

	/**
	 * Sets the arrayMotivosRechazo value for this RechazarFECredRequestType.
	 * 
	 * @param arrayMotivosRechazo
	 */
	public void setArrayMotivosRechazo(coop.guenoa.afip.FECredService.MotivoRechazoType[] arrayMotivosRechazo) {
		this.arrayMotivosRechazo = arrayMotivosRechazo;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof RechazarFECredRequestType))
			return false;
		RechazarFECredRequestType other = (RechazarFECredRequestType) obj;
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
				&& ((this.authRequest == null && other.getAuthRequest() == null)
						|| (this.authRequest != null && this.authRequest.equals(other.getAuthRequest())))
				&& ((this.idCtaCte == null && other.getIdCtaCte() == null)
						|| (this.idCtaCte != null && this.idCtaCte.equals(other.getIdCtaCte())))
				&& ((this.arrayMotivosRechazo == null && other.getArrayMotivosRechazo() == null)
						|| (this.arrayMotivosRechazo != null
								&& java.util.Arrays.equals(this.arrayMotivosRechazo, other.getArrayMotivosRechazo())));
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
		if (getAuthRequest() != null) {
			_hashCode += getAuthRequest().hashCode();
		}
		if (getIdCtaCte() != null) {
			_hashCode += getIdCtaCte().hashCode();
		}
		if (getArrayMotivosRechazo() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getArrayMotivosRechazo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getArrayMotivosRechazo(), i);
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
			RechazarFECredRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"RechazarFECredRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("authRequest");
		elemField.setXmlName(new javax.xml.namespace.QName("", "authRequest"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "AuthRequestType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idCtaCte");
		elemField.setXmlName(new javax.xml.namespace.QName("", "idCtaCte"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "IdCtaCteType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("arrayMotivosRechazo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "arrayMotivosRechazo"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "MotivoRechazoType"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "motivoRechazo"));
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
