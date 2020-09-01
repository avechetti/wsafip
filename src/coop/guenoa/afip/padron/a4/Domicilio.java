/**
 * Domicilio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

public class Domicilio implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String codPostal;

	private String datoAdicional;

	private String descripcionProvincia;

	private String direccion;

	private Integer idProvincia;

	private String localidad;

	private Integer orden;

	private String tipoDatoAdicional;

	private String tipoDomicilio;

	public Domicilio() {
	}

	public Domicilio(String codPostal, String datoAdicional, String descripcionProvincia, String direccion,
			Integer idProvincia, String localidad, Integer orden, String tipoDatoAdicional, String tipoDomicilio) {
		this.codPostal = codPostal;
		this.datoAdicional = datoAdicional;
		this.descripcionProvincia = descripcionProvincia;
		this.direccion = direccion;
		this.idProvincia = idProvincia;
		this.localidad = localidad;
		this.orden = orden;
		this.tipoDatoAdicional = tipoDatoAdicional;
		this.tipoDomicilio = tipoDomicilio;
	}

	/**
	 * Gets the codPostal value for this Domicilio.
	 * 
	 * @return codPostal
	 */
	public String getCodPostal() {
		return codPostal;
	}

	/**
	 * Sets the codPostal value for this Domicilio.
	 * 
	 * @param codPostal
	 */
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	/**
	 * Gets the datoAdicional value for this Domicilio.
	 * 
	 * @return datoAdicional
	 */
	public String getDatoAdicional() {
		return datoAdicional;
	}

	/**
	 * Sets the datoAdicional value for this Domicilio.
	 * 
	 * @param datoAdicional
	 */
	public void setDatoAdicional(String datoAdicional) {
		this.datoAdicional = datoAdicional;
	}

	/**
	 * Gets the descripcionProvincia value for this Domicilio.
	 * 
	 * @return descripcionProvincia
	 */
	public String getDescripcionProvincia() {
		return descripcionProvincia;
	}

	/**
	 * Sets the descripcionProvincia value for this Domicilio.
	 * 
	 * @param descripcionProvincia
	 */
	public void setDescripcionProvincia(String descripcionProvincia) {
		this.descripcionProvincia = descripcionProvincia;
	}

	/**
	 * Gets the direccion value for this Domicilio.
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the direccion value for this Domicilio.
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Gets the idProvincia value for this Domicilio.
	 * 
	 * @return idProvincia
	 */
	public Integer getIdProvincia() {
		return idProvincia;
	}

	/**
	 * Sets the idProvincia value for this Domicilio.
	 * 
	 * @param idProvincia
	 */
	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}

	/**
	 * Gets the localidad value for this Domicilio.
	 * 
	 * @return localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * Sets the localidad value for this Domicilio.
	 * 
	 * @param localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * Gets the orden value for this Domicilio.
	 * 
	 * @return orden
	 */
	public Integer getOrden() {
		return orden;
	}

	/**
	 * Sets the orden value for this Domicilio.
	 * 
	 * @param orden
	 */
	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	/**
	 * Gets the tipoDatoAdicional value for this Domicilio.
	 * 
	 * @return tipoDatoAdicional
	 */
	public String getTipoDatoAdicional() {
		return tipoDatoAdicional;
	}

	/**
	 * Sets the tipoDatoAdicional value for this Domicilio.
	 * 
	 * @param tipoDatoAdicional
	 */
	public void setTipoDatoAdicional(String tipoDatoAdicional) {
		this.tipoDatoAdicional = tipoDatoAdicional;
	}

	/**
	 * Gets the tipoDomicilio value for this Domicilio.
	 * 
	 * @return tipoDomicilio
	 */
	public String getTipoDomicilio() {
		return tipoDomicilio;
	}

	/**
	 * Sets the tipoDomicilio value for this Domicilio.
	 * 
	 * @param tipoDomicilio
	 */
	public void setTipoDomicilio(String tipoDomicilio) {
		this.tipoDomicilio = tipoDomicilio;
	}

	private Object __equalsCalc = null;

	public synchronized boolean equals(Object obj) {
		if (!(obj instanceof Domicilio))
			return false;
		Domicilio other = (Domicilio) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.codPostal == null && other.getCodPostal() == null)
						|| (this.codPostal != null && this.codPostal.equals(other.getCodPostal())))
				&& ((this.datoAdicional == null && other.getDatoAdicional() == null)
						|| (this.datoAdicional != null && this.datoAdicional.equals(other.getDatoAdicional())))
				&& ((this.descripcionProvincia == null && other.getDescripcionProvincia() == null)
						|| (this.descripcionProvincia != null
								&& this.descripcionProvincia.equals(other.getDescripcionProvincia())))
				&& ((this.direccion == null && other.getDireccion() == null)
						|| (this.direccion != null && this.direccion.equals(other.getDireccion())))
				&& ((this.idProvincia == null && other.getIdProvincia() == null)
						|| (this.idProvincia != null && this.idProvincia.equals(other.getIdProvincia())))
				&& ((this.localidad == null && other.getLocalidad() == null)
						|| (this.localidad != null && this.localidad.equals(other.getLocalidad())))
				&& ((this.orden == null && other.getOrden() == null)
						|| (this.orden != null && this.orden.equals(other.getOrden())))
				&& ((this.tipoDatoAdicional == null && other.getTipoDatoAdicional() == null)
						|| (this.tipoDatoAdicional != null
								&& this.tipoDatoAdicional.equals(other.getTipoDatoAdicional())))
				&& ((this.tipoDomicilio == null && other.getTipoDomicilio() == null)
						|| (this.tipoDomicilio != null && this.tipoDomicilio.equals(other.getTipoDomicilio())));
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
		if (getCodPostal() != null) {
			_hashCode += getCodPostal().hashCode();
		}
		if (getDatoAdicional() != null) {
			_hashCode += getDatoAdicional().hashCode();
		}
		if (getDescripcionProvincia() != null) {
			_hashCode += getDescripcionProvincia().hashCode();
		}
		if (getDireccion() != null) {
			_hashCode += getDireccion().hashCode();
		}
		if (getIdProvincia() != null) {
			_hashCode += getIdProvincia().hashCode();
		}
		if (getLocalidad() != null) {
			_hashCode += getLocalidad().hashCode();
		}
		if (getOrden() != null) {
			_hashCode += getOrden().hashCode();
		}
		if (getTipoDatoAdicional() != null) {
			_hashCode += getTipoDatoAdicional().hashCode();
		}
		if (getTipoDomicilio() != null) {
			_hashCode += getTipoDomicilio().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Domicilio.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "domicilio"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("codPostal");
		elemField.setXmlName(new javax.xml.namespace.QName("", "codPostal"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datoAdicional");
		elemField.setXmlName(new javax.xml.namespace.QName("", "datoAdicional"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descripcionProvincia");
		elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionProvincia"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("direccion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "direccion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idProvincia");
		elemField.setXmlName(new javax.xml.namespace.QName("", "idProvincia"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("localidad");
		elemField.setXmlName(new javax.xml.namespace.QName("", "localidad"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
		elemField.setFieldName("tipoDatoAdicional");
		elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDatoAdicional"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipoDomicilio");
		elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDomicilio"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
	public static org.apache.axis.encoding.Serializer getSerializer(String mechType, Class<?> _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(String mechType, Class<?> _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

	@Override
	public String toString() {
		return "Domicilio [codPostal=" + codPostal + ", datoAdicional=" + datoAdicional + ", descripcionProvincia="
				+ descripcionProvincia + ", direccion=" + direccion + ", idProvincia=" + idProvincia + ", localidad="
				+ localidad + ", orden=" + orden + ", tipoDatoAdicional=" + tipoDatoAdicional + ", tipoDomicilio="
				+ tipoDomicilio + "]";
	}

}
