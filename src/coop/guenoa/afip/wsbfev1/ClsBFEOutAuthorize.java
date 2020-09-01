/**
 * ClsBFEOutAuthorize.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public class ClsBFEOutAuthorize implements java.io.Serializable {
	private long id;

	private long cuit;

	private java.lang.String cae;

	private java.lang.String fch_venc_Cae;

	private java.lang.String fch_cbte;

	private java.lang.String resultado;

	private java.lang.String reproceso;

	private java.lang.String obs;

	public ClsBFEOutAuthorize() {
	}

	public ClsBFEOutAuthorize(long id, long cuit, java.lang.String cae, java.lang.String fch_venc_Cae,
			java.lang.String fch_cbte, java.lang.String resultado, java.lang.String reproceso, java.lang.String obs) {
		this.id = id;
		this.cuit = cuit;
		this.cae = cae;
		this.fch_venc_Cae = fch_venc_Cae;
		this.fch_cbte = fch_cbte;
		this.resultado = resultado;
		this.reproceso = reproceso;
		this.obs = obs;
	}

	/**
	 * Gets the id value for this ClsBFEOutAuthorize.
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id value for this ClsBFEOutAuthorize.
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the cuit value for this ClsBFEOutAuthorize.
	 * 
	 * @return cuit
	 */
	public long getCuit() {
		return cuit;
	}

	/**
	 * Sets the cuit value for this ClsBFEOutAuthorize.
	 * 
	 * @param cuit
	 */
	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	/**
	 * Gets the cae value for this ClsBFEOutAuthorize.
	 * 
	 * @return cae
	 */
	public java.lang.String getCae() {
		return cae;
	}

	/**
	 * Sets the cae value for this ClsBFEOutAuthorize.
	 * 
	 * @param cae
	 */
	public void setCae(java.lang.String cae) {
		this.cae = cae;
	}

	/**
	 * Gets the fch_venc_Cae value for this ClsBFEOutAuthorize.
	 * 
	 * @return fch_venc_Cae
	 */
	public java.lang.String getFch_venc_Cae() {
		return fch_venc_Cae;
	}

	/**
	 * Sets the fch_venc_Cae value for this ClsBFEOutAuthorize.
	 * 
	 * @param fch_venc_Cae
	 */
	public void setFch_venc_Cae(java.lang.String fch_venc_Cae) {
		this.fch_venc_Cae = fch_venc_Cae;
	}

	/**
	 * Gets the fch_cbte value for this ClsBFEOutAuthorize.
	 * 
	 * @return fch_cbte
	 */
	public java.lang.String getFch_cbte() {
		return fch_cbte;
	}

	/**
	 * Sets the fch_cbte value for this ClsBFEOutAuthorize.
	 * 
	 * @param fch_cbte
	 */
	public void setFch_cbte(java.lang.String fch_cbte) {
		this.fch_cbte = fch_cbte;
	}

	/**
	 * Gets the resultado value for this ClsBFEOutAuthorize.
	 * 
	 * @return resultado
	 */
	public java.lang.String getResultado() {
		return resultado;
	}

	/**
	 * Sets the resultado value for this ClsBFEOutAuthorize.
	 * 
	 * @param resultado
	 */
	public void setResultado(java.lang.String resultado) {
		this.resultado = resultado;
	}

	/**
	 * Gets the reproceso value for this ClsBFEOutAuthorize.
	 * 
	 * @return reproceso
	 */
	public java.lang.String getReproceso() {
		return reproceso;
	}

	/**
	 * Sets the reproceso value for this ClsBFEOutAuthorize.
	 * 
	 * @param reproceso
	 */
	public void setReproceso(java.lang.String reproceso) {
		this.reproceso = reproceso;
	}

	/**
	 * Gets the obs value for this ClsBFEOutAuthorize.
	 * 
	 * @return obs
	 */
	public java.lang.String getObs() {
		return obs;
	}

	/**
	 * Sets the obs value for this ClsBFEOutAuthorize.
	 * 
	 * @param obs
	 */
	public void setObs(java.lang.String obs) {
		this.obs = obs;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClsBFEOutAuthorize))
			return false;
		ClsBFEOutAuthorize other = (ClsBFEOutAuthorize) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.id == other.getId() && this.cuit == other.getCuit()
				&& ((this.cae == null && other.getCae() == null)
						|| (this.cae != null && this.cae.equals(other.getCae())))
				&& ((this.fch_venc_Cae == null && other.getFch_venc_Cae() == null)
						|| (this.fch_venc_Cae != null && this.fch_venc_Cae.equals(other.getFch_venc_Cae())))
				&& ((this.fch_cbte == null && other.getFch_cbte() == null)
						|| (this.fch_cbte != null && this.fch_cbte.equals(other.getFch_cbte())))
				&& ((this.resultado == null && other.getResultado() == null)
						|| (this.resultado != null && this.resultado.equals(other.getResultado())))
				&& ((this.reproceso == null && other.getReproceso() == null)
						|| (this.reproceso != null && this.reproceso.equals(other.getReproceso())))
				&& ((this.obs == null && other.getObs() == null)
						|| (this.obs != null && this.obs.equals(other.getObs())));
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
		_hashCode += new Long(getId()).hashCode();
		_hashCode += new Long(getCuit()).hashCode();
		if (getCae() != null) {
			_hashCode += getCae().hashCode();
		}
		if (getFch_venc_Cae() != null) {
			_hashCode += getFch_venc_Cae().hashCode();
		}
		if (getFch_cbte() != null) {
			_hashCode += getFch_cbte().hashCode();
		}
		if (getResultado() != null) {
			_hashCode += getResultado().hashCode();
		}
		if (getReproceso() != null) {
			_hashCode += getReproceso().hashCode();
		}
		if (getObs() != null) {
			_hashCode += getObs().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClsBFEOutAuthorize.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEOutAuthorize"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cuit");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Cuit"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cae");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Cae"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fch_venc_Cae");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Fch_venc_Cae"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fch_cbte");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Fch_cbte"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("resultado");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Resultado"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reproceso");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Reproceso"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("obs");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Obs"));
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
