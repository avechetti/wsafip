/**
 * Actividad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

public class Actividad implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1476687704868224831L;

	private String descripcionActividad;

	private Long idActividad;

	private Integer nomenclador;

	private Integer orden;

	private Integer periodo;

	public Actividad() {
	}

	public Actividad(String descripcionActividad, Long idActividad, Integer nomenclador,
			Integer orden, Integer periodo) {
		this.descripcionActividad = descripcionActividad;
		this.idActividad = idActividad;
		this.nomenclador = nomenclador;
		this.orden = orden;
		this.periodo = periodo;
	}

	/**
	 * Gets the descripcionActividad value for this Actividad.
	 * 
	 * @return descripcionActividad
	 */
	public String getDescripcionActividad() {
		return descripcionActividad;
	}

	/**
	 * Sets the descripcionActividad value for this Actividad.
	 * 
	 * @param descripcionActividad
	 */
	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
	}

	/**
	 * Gets the idActividad value for this Actividad.
	 * 
	 * @return idActividad
	 */
	public Long getIdActividad() {
		return idActividad;
	}

	/**
	 * Sets the idActividad value for this Actividad.
	 * 
	 * @param idActividad
	 */
	public void setIdActividad(Long idActividad) {
		this.idActividad = idActividad;
	}

	/**
	 * Gets the nomenclador value for this Actividad.
	 * 
	 * @return nomenclador
	 */
	public Integer getNomenclador() {
		return nomenclador;
	}

	/**
	 * Sets the nomenclador value for this Actividad.
	 * 
	 * @param nomenclador
	 */
	public void setNomenclador(Integer nomenclador) {
		this.nomenclador = nomenclador;
	}

	/**
	 * Gets the orden value for this Actividad.
	 * 
	 * @return orden
	 */
	public Integer getOrden() {
		return orden;
	}

	/**
	 * Sets the orden value for this Actividad.
	 * 
	 * @param orden
	 */
	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	/**
	 * Gets the periodo value for this Actividad.
	 * 
	 * @return periodo
	 */
	public Integer getPeriodo() {
		return periodo;
	}

	/**
	 * Sets the periodo value for this Actividad.
	 * 
	 * @param periodo
	 */
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	private Object __equalsCalc = null;

	public synchronized boolean equals(Object obj) {
		if (!(obj instanceof Actividad))
			return false;
		Actividad other = (Actividad) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.descripcionActividad == null && other.getDescripcionActividad() == null)
						|| (this.descripcionActividad != null
								&& this.descripcionActividad.equals(other.getDescripcionActividad())))
				&& ((this.idActividad == null && other.getIdActividad() == null)
						|| (this.idActividad != null && this.idActividad.equals(other.getIdActividad())))
				&& ((this.nomenclador == null && other.getNomenclador() == null)
						|| (this.nomenclador != null && this.nomenclador.equals(other.getNomenclador())))
				&& ((this.orden == null && other.getOrden() == null)
						|| (this.orden != null && this.orden.equals(other.getOrden())))
				&& ((this.periodo == null && other.getPeriodo() == null)
						|| (this.periodo != null && this.periodo.equals(other.getPeriodo())));
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
		if (getDescripcionActividad() != null) {
			_hashCode += getDescripcionActividad().hashCode();
		}
		if (getIdActividad() != null) {
			_hashCode += getIdActividad().hashCode();
		}
		if (getNomenclador() != null) {
			_hashCode += getNomenclador().hashCode();
		}
		if (getOrden() != null) {
			_hashCode += getOrden().hashCode();
		}
		if (getPeriodo() != null) {
			_hashCode += getPeriodo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Actividad.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "actividad"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descripcionActividad");
		elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionActividad"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idActividad");
		elemField.setXmlName(new javax.xml.namespace.QName("", "idActividad"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nomenclador");
		elemField.setXmlName(new javax.xml.namespace.QName("", "nomenclador"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("orden");
		elemField.setXmlName(new javax.xml.namespace.QName("", "orden"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("periodo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "periodo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
	public static org.apache.axis.encoding.Serializer getSerializer(String mechType,
			Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(String mechType,
			Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

	@Override
	public String toString() {
		return "Actividad [descripcionActividad=" + descripcionActividad + ", idActividad=" + idActividad
				+ ", nomenclador=" + nomenclador + ", orden=" + orden + ", periodo=" + periodo + "]";
	}
	
	

}
