/**
 * ConsultarHistorialEstadosCtaCteReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class ConsultarHistorialEstadosCtaCteReturnType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.IdCtaCteType idCtaCte;

	private coop.guenoa.afip.FECredService.EstadoCtaCteType[] arrayHistorialEstados;

	private coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayErrores;

	private coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] arrayErroresFormato;

	public ConsultarHistorialEstadosCtaCteReturnType() {
	}

	public ConsultarHistorialEstadosCtaCteReturnType(coop.guenoa.afip.FECredService.IdCtaCteType idCtaCte,
			coop.guenoa.afip.FECredService.EstadoCtaCteType[] arrayHistorialEstados,
			coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayErrores,
			coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] arrayErroresFormato) {
		this.idCtaCte = idCtaCte;
		this.arrayHistorialEstados = arrayHistorialEstados;
		this.arrayErrores = arrayErrores;
		this.arrayErroresFormato = arrayErroresFormato;
	}

	/**
	 * Gets the idCtaCte value for this ConsultarHistorialEstadosCtaCteReturnType.
	 * 
	 * @return idCtaCte
	 */
	public coop.guenoa.afip.FECredService.IdCtaCteType getIdCtaCte() {
		return idCtaCte;
	}

	/**
	 * Sets the idCtaCte value for this ConsultarHistorialEstadosCtaCteReturnType.
	 * 
	 * @param idCtaCte
	 */
	public void setIdCtaCte(coop.guenoa.afip.FECredService.IdCtaCteType idCtaCte) {
		this.idCtaCte = idCtaCte;
	}

	/**
	 * Gets the arrayHistorialEstados value for this
	 * ConsultarHistorialEstadosCtaCteReturnType.
	 * 
	 * @return arrayHistorialEstados
	 */
	public coop.guenoa.afip.FECredService.EstadoCtaCteType[] getArrayHistorialEstados() {
		return arrayHistorialEstados;
	}

	/**
	 * Sets the arrayHistorialEstados value for this
	 * ConsultarHistorialEstadosCtaCteReturnType.
	 * 
	 * @param arrayHistorialEstados
	 */
	public void setArrayHistorialEstados(coop.guenoa.afip.FECredService.EstadoCtaCteType[] arrayHistorialEstados) {
		this.arrayHistorialEstados = arrayHistorialEstados;
	}

	/**
	 * Gets the arrayErrores value for this
	 * ConsultarHistorialEstadosCtaCteReturnType.
	 * 
	 * @return arrayErrores
	 */
	public coop.guenoa.afip.FECredService.CodigoDescripcionType[] getArrayErrores() {
		return arrayErrores;
	}

	/**
	 * Sets the arrayErrores value for this
	 * ConsultarHistorialEstadosCtaCteReturnType.
	 * 
	 * @param arrayErrores
	 */
	public void setArrayErrores(coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayErrores) {
		this.arrayErrores = arrayErrores;
	}

	/**
	 * Gets the arrayErroresFormato value for this
	 * ConsultarHistorialEstadosCtaCteReturnType.
	 * 
	 * @return arrayErroresFormato
	 */
	public coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] getArrayErroresFormato() {
		return arrayErroresFormato;
	}

	/**
	 * Sets the arrayErroresFormato value for this
	 * ConsultarHistorialEstadosCtaCteReturnType.
	 * 
	 * @param arrayErroresFormato
	 */
	public void setArrayErroresFormato(
			coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] arrayErroresFormato) {
		this.arrayErroresFormato = arrayErroresFormato;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConsultarHistorialEstadosCtaCteReturnType))
			return false;
		ConsultarHistorialEstadosCtaCteReturnType other = (ConsultarHistorialEstadosCtaCteReturnType) obj;
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
				&& ((this.idCtaCte == null && other.getIdCtaCte() == null)
						|| (this.idCtaCte != null && this.idCtaCte.equals(other.getIdCtaCte())))
				&& ((this.arrayHistorialEstados == null && other.getArrayHistorialEstados() == null)
						|| (this.arrayHistorialEstados != null && java.util.Arrays.equals(this.arrayHistorialEstados,
								other.getArrayHistorialEstados())))
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
		if (getIdCtaCte() != null) {
			_hashCode += getIdCtaCte().hashCode();
		}
		if (getArrayHistorialEstados() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getArrayHistorialEstados()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getArrayHistorialEstados(), i);
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
			ConsultarHistorialEstadosCtaCteReturnType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"consultarHistorialEstadosCtaCteReturnType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idCtaCte");
		elemField.setXmlName(new javax.xml.namespace.QName("", "idCtaCte"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "IdCtaCteType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("arrayHistorialEstados");
		elemField.setXmlName(new javax.xml.namespace.QName("", "arrayHistorialEstados"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "EstadoCtaCteType"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "estadoHistorico"));
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
