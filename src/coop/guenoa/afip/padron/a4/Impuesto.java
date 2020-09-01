/**
 * Impuesto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

public class Impuesto implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String descripcionImpuesto;

	private Integer diaPeriodo;

	private String estado;

	private java.util.Calendar ffInscripcion;

	private Integer idImpuesto;

	private Integer periodo;

	public Impuesto() {
	}

	public Impuesto(String descripcionImpuesto, Integer diaPeriodo, String estado, java.util.Calendar ffInscripcion,
			Integer idImpuesto, Integer periodo) {
		this.descripcionImpuesto = descripcionImpuesto;
		this.diaPeriodo = diaPeriodo;
		this.estado = estado;
		this.ffInscripcion = ffInscripcion;
		this.idImpuesto = idImpuesto;
		this.periodo = periodo;
	}

	/**
	 * Gets the descripcionImpuesto value for this Impuesto.
	 * 
	 * @return descripcionImpuesto
	 */
	public String getDescripcionImpuesto() {
		return descripcionImpuesto;
	}

	/**
	 * Sets the descripcionImpuesto value for this Impuesto.
	 * 
	 * @param descripcionImpuesto
	 */
	public void setDescripcionImpuesto(String descripcionImpuesto) {
		this.descripcionImpuesto = descripcionImpuesto;
	}

	/**
	 * Gets the diaPeriodo value for this Impuesto.
	 * 
	 * @return diaPeriodo
	 */
	public Integer getDiaPeriodo() {
		return diaPeriodo;
	}

	/**
	 * Sets the diaPeriodo value for this Impuesto.
	 * 
	 * @param diaPeriodo
	 */
	public void setDiaPeriodo(Integer diaPeriodo) {
		this.diaPeriodo = diaPeriodo;
	}

	/**
	 * Gets the estado value for this Impuesto.
	 * 
	 * @return estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Sets the estado value for this Impuesto.
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Gets the ffInscripcion value for this Impuesto.
	 * 
	 * @return ffInscripcion
	 */
	public java.util.Calendar getFfInscripcion() {
		return ffInscripcion;
	}

	/**
	 * Sets the ffInscripcion value for this Impuesto.
	 * 
	 * @param ffInscripcion
	 */
	public void setFfInscripcion(java.util.Calendar ffInscripcion) {
		this.ffInscripcion = ffInscripcion;
	}

	/**
	 * Gets the idImpuesto value for this Impuesto.
	 * 
	 * @return idImpuesto
	 */
	public Integer getIdImpuesto() {
		return idImpuesto;
	}

	/**
	 * Sets the idImpuesto value for this Impuesto.
	 * 
	 * @param idImpuesto
	 */
	public void setIdImpuesto(Integer idImpuesto) {
		this.idImpuesto = idImpuesto;
	}

	/**
	 * Gets the periodo value for this Impuesto.
	 * 
	 * @return periodo
	 */
	public Integer getPeriodo() {
		return periodo;
	}

	/**
	 * Sets the periodo value for this Impuesto.
	 * 
	 * @param periodo
	 */
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	private Object __equalsCalc = null;

	public synchronized boolean equals(Object obj) {
		if (!(obj instanceof Impuesto))
			return false;
		Impuesto other = (Impuesto) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.descripcionImpuesto == null && other.getDescripcionImpuesto() == null)
						|| (this.descripcionImpuesto != null
								&& this.descripcionImpuesto.equals(other.getDescripcionImpuesto())))
				&& ((this.diaPeriodo == null && other.getDiaPeriodo() == null)
						|| (this.diaPeriodo != null && this.diaPeriodo.equals(other.getDiaPeriodo())))
				&& ((this.estado == null && other.getEstado() == null)
						|| (this.estado != null && this.estado.equals(other.getEstado())))
				&& ((this.ffInscripcion == null && other.getFfInscripcion() == null)
						|| (this.ffInscripcion != null && this.ffInscripcion.equals(other.getFfInscripcion())))
				&& ((this.idImpuesto == null && other.getIdImpuesto() == null)
						|| (this.idImpuesto != null && this.idImpuesto.equals(other.getIdImpuesto())))
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
		if (getDescripcionImpuesto() != null) {
			_hashCode += getDescripcionImpuesto().hashCode();
		}
		if (getDiaPeriodo() != null) {
			_hashCode += getDiaPeriodo().hashCode();
		}
		if (getEstado() != null) {
			_hashCode += getEstado().hashCode();
		}
		if (getFfInscripcion() != null) {
			_hashCode += getFfInscripcion().hashCode();
		}
		if (getIdImpuesto() != null) {
			_hashCode += getIdImpuesto().hashCode();
		}
		if (getPeriodo() != null) {
			_hashCode += getPeriodo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Impuesto.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "impuesto"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descripcionImpuesto");
		elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionImpuesto"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diaPeriodo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "diaPeriodo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("estado");
		elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ffInscripcion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "ffInscripcion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idImpuesto");
		elemField.setXmlName(new javax.xml.namespace.QName("", "idImpuesto"));
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
		return "Impuesto [descripcionImpuesto=" + descripcionImpuesto + ", diaPeriodo=" + diaPeriodo + ", estado="
				+ estado + ", ffInscripcion=" + ffInscripcion + ", idImpuesto=" + idImpuesto + ", periodo=" + periodo
				+ "]";
	}

}
