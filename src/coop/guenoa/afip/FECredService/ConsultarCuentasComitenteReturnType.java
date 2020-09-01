/**
 * ConsultarCuentasComitenteReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class ConsultarCuentasComitenteReturnType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.CuentaComitenteType[] arrayCtasComitente;

	private coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayObservacion;

	private coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayErrores;

	private coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] arrayErroresFormato;

	public ConsultarCuentasComitenteReturnType() {
	}

	public ConsultarCuentasComitenteReturnType(coop.guenoa.afip.FECredService.CuentaComitenteType[] arrayCtasComitente,
			coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayObservacion,
			coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayErrores,
			coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] arrayErroresFormato) {
		this.arrayCtasComitente = arrayCtasComitente;
		this.arrayObservacion = arrayObservacion;
		this.arrayErrores = arrayErrores;
		this.arrayErroresFormato = arrayErroresFormato;
	}

	/**
	 * Gets the arrayCtasComitente value for this
	 * ConsultarCuentasComitenteReturnType.
	 * 
	 * @return arrayCtasComitente
	 */
	public coop.guenoa.afip.FECredService.CuentaComitenteType[] getArrayCtasComitente() {
		return arrayCtasComitente;
	}

	/**
	 * Sets the arrayCtasComitente value for this
	 * ConsultarCuentasComitenteReturnType.
	 * 
	 * @param arrayCtasComitente
	 */
	public void setArrayCtasComitente(coop.guenoa.afip.FECredService.CuentaComitenteType[] arrayCtasComitente) {
		this.arrayCtasComitente = arrayCtasComitente;
	}

	/**
	 * Gets the arrayObservacion value for this ConsultarCuentasComitenteReturnType.
	 * 
	 * @return arrayObservacion
	 */
	public coop.guenoa.afip.FECredService.CodigoDescripcionType[] getArrayObservacion() {
		return arrayObservacion;
	}

	/**
	 * Sets the arrayObservacion value for this ConsultarCuentasComitenteReturnType.
	 * 
	 * @param arrayObservacion
	 */
	public void setArrayObservacion(coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayObservacion) {
		this.arrayObservacion = arrayObservacion;
	}

	/**
	 * Gets the arrayErrores value for this ConsultarCuentasComitenteReturnType.
	 * 
	 * @return arrayErrores
	 */
	public coop.guenoa.afip.FECredService.CodigoDescripcionType[] getArrayErrores() {
		return arrayErrores;
	}

	/**
	 * Sets the arrayErrores value for this ConsultarCuentasComitenteReturnType.
	 * 
	 * @param arrayErrores
	 */
	public void setArrayErrores(coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayErrores) {
		this.arrayErrores = arrayErrores;
	}

	/**
	 * Gets the arrayErroresFormato value for this
	 * ConsultarCuentasComitenteReturnType.
	 * 
	 * @return arrayErroresFormato
	 */
	public coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] getArrayErroresFormato() {
		return arrayErroresFormato;
	}

	/**
	 * Sets the arrayErroresFormato value for this
	 * ConsultarCuentasComitenteReturnType.
	 * 
	 * @param arrayErroresFormato
	 */
	public void setArrayErroresFormato(
			coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] arrayErroresFormato) {
		this.arrayErroresFormato = arrayErroresFormato;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConsultarCuentasComitenteReturnType))
			return false;
		ConsultarCuentasComitenteReturnType other = (ConsultarCuentasComitenteReturnType) obj;
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
				&& ((this.arrayCtasComitente == null && other.getArrayCtasComitente() == null)
						|| (this.arrayCtasComitente != null
								&& java.util.Arrays.equals(this.arrayCtasComitente, other.getArrayCtasComitente())))
				&& ((this.arrayObservacion == null && other.getArrayObservacion() == null)
						|| (this.arrayObservacion != null
								&& java.util.Arrays.equals(this.arrayObservacion, other.getArrayObservacion())))
				&& ((this.arrayErrores == null && other.getArrayErrores() == null) || (this.arrayErrores != null
						&& java.util.Arrays.equals(this.arrayErrores, other.getArrayErrores())))
				&& ((this.arrayErroresFormato == null && other.getArrayErroresFormato() == null)
						|| (this.arrayErroresFormato != null
								&& java.util.Arrays.equals(this.arrayErroresFormato, other.getArrayErroresFormato())));
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
		if (getArrayCtasComitente() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getArrayCtasComitente()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getArrayCtasComitente(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getArrayObservacion() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getArrayObservacion()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getArrayObservacion(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getArrayErrores() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getArrayErrores()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getArrayErrores(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getArrayErroresFormato() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getArrayErroresFormato()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getArrayErroresFormato(), i);
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
			ConsultarCuentasComitenteReturnType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarCuentasComitenteReturnType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("arrayCtasComitente");
		elemField.setXmlName(new javax.xml.namespace.QName("", "arrayCtasComitente"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "CuentaComitenteType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "ctaComitente"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("arrayObservacion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "arrayObservacion"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "CodigoDescripcionType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "codigoDescripcion"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("arrayErrores");
		elemField.setXmlName(new javax.xml.namespace.QName("", "arrayErrores"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "CodigoDescripcionType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "codigoDescripcion"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("arrayErroresFormato");
		elemField.setXmlName(new javax.xml.namespace.QName("", "arrayErroresFormato"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"CodigoDescripcionStringType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "codigoDescripcionString"));
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
