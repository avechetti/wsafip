/**
 * ConsultarCtasCtesReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class ConsultarCtasCtesReturnType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.InfoCtaCteType[] arrayInfosCtaCte;

	private coop.guenoa.afip.FECredService.CodigoDescripcionType evento;

	private coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayObservaciones;

	private coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayErrores;

	private coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] arrayErroresFormato;

	public ConsultarCtasCtesReturnType() {
	}

	public ConsultarCtasCtesReturnType(coop.guenoa.afip.FECredService.InfoCtaCteType[] arrayInfosCtaCte,
			coop.guenoa.afip.FECredService.CodigoDescripcionType evento,
			coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayObservaciones,
			coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayErrores,
			coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] arrayErroresFormato) {
		this.arrayInfosCtaCte = arrayInfosCtaCte;
		this.evento = evento;
		this.arrayObservaciones = arrayObservaciones;
		this.arrayErrores = arrayErrores;
		this.arrayErroresFormato = arrayErroresFormato;
	}

	/**
	 * Gets the arrayInfosCtaCte value for this ConsultarCtasCtesReturnType.
	 * 
	 * @return arrayInfosCtaCte
	 */
	public coop.guenoa.afip.FECredService.InfoCtaCteType[] getArrayInfosCtaCte() {
		return arrayInfosCtaCte;
	}

	/**
	 * Sets the arrayInfosCtaCte value for this ConsultarCtasCtesReturnType.
	 * 
	 * @param arrayInfosCtaCte
	 */
	public void setArrayInfosCtaCte(coop.guenoa.afip.FECredService.InfoCtaCteType[] arrayInfosCtaCte) {
		this.arrayInfosCtaCte = arrayInfosCtaCte;
	}

	/**
	 * Gets the evento value for this ConsultarCtasCtesReturnType.
	 * 
	 * @return evento
	 */
	public coop.guenoa.afip.FECredService.CodigoDescripcionType getEvento() {
		return evento;
	}

	/**
	 * Sets the evento value for this ConsultarCtasCtesReturnType.
	 * 
	 * @param evento
	 */
	public void setEvento(coop.guenoa.afip.FECredService.CodigoDescripcionType evento) {
		this.evento = evento;
	}

	/**
	 * Gets the arrayObservaciones value for this ConsultarCtasCtesReturnType.
	 * 
	 * @return arrayObservaciones
	 */
	public coop.guenoa.afip.FECredService.CodigoDescripcionType[] getArrayObservaciones() {
		return arrayObservaciones;
	}

	/**
	 * Sets the arrayObservaciones value for this ConsultarCtasCtesReturnType.
	 * 
	 * @param arrayObservaciones
	 */
	public void setArrayObservaciones(coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayObservaciones) {
		this.arrayObservaciones = arrayObservaciones;
	}

	/**
	 * Gets the arrayErrores value for this ConsultarCtasCtesReturnType.
	 * 
	 * @return arrayErrores
	 */
	public coop.guenoa.afip.FECredService.CodigoDescripcionType[] getArrayErrores() {
		return arrayErrores;
	}

	/**
	 * Sets the arrayErrores value for this ConsultarCtasCtesReturnType.
	 * 
	 * @param arrayErrores
	 */
	public void setArrayErrores(coop.guenoa.afip.FECredService.CodigoDescripcionType[] arrayErrores) {
		this.arrayErrores = arrayErrores;
	}

	/**
	 * Gets the arrayErroresFormato value for this ConsultarCtasCtesReturnType.
	 * 
	 * @return arrayErroresFormato
	 */
	public coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] getArrayErroresFormato() {
		return arrayErroresFormato;
	}

	/**
	 * Sets the arrayErroresFormato value for this ConsultarCtasCtesReturnType.
	 * 
	 * @param arrayErroresFormato
	 */
	public void setArrayErroresFormato(
			coop.guenoa.afip.FECredService.CodigoDescripcionStringType[] arrayErroresFormato) {
		this.arrayErroresFormato = arrayErroresFormato;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConsultarCtasCtesReturnType))
			return false;
		ConsultarCtasCtesReturnType other = (ConsultarCtasCtesReturnType) obj;
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
				&& ((this.arrayInfosCtaCte == null && other.getArrayInfosCtaCte() == null)
						|| (this.arrayInfosCtaCte != null
								&& java.util.Arrays.equals(this.arrayInfosCtaCte, other.getArrayInfosCtaCte())))
				&& ((this.evento == null && other.getEvento() == null)
						|| (this.evento != null && this.evento.equals(other.getEvento())))
				&& ((this.arrayObservaciones == null && other.getArrayObservaciones() == null)
						|| (this.arrayObservaciones != null
								&& java.util.Arrays.equals(this.arrayObservaciones, other.getArrayObservaciones())))
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
		if (getArrayInfosCtaCte() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getArrayInfosCtaCte()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getArrayInfosCtaCte(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getEvento() != null) {
			_hashCode += getEvento().hashCode();
		}
		if (getArrayObservaciones() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getArrayObservaciones()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getArrayObservaciones(), i);
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
			ConsultarCtasCtesReturnType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarCtasCtesReturnType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("arrayInfosCtaCte");
		elemField.setXmlName(new javax.xml.namespace.QName("", "arrayInfosCtaCte"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "InfoCtaCteType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "infoCtaCte"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("evento");
		elemField.setXmlName(new javax.xml.namespace.QName("", "evento"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "CodigoDescripcionType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("arrayObservaciones");
		elemField.setXmlName(new javax.xml.namespace.QName("", "arrayObservaciones"));
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
