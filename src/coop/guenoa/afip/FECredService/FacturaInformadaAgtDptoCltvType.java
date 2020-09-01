/**
 * FacturaInformadaAgtDptoCltvType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

public class FacturaInformadaAgtDptoCltvType implements java.io.Serializable {
	private coop.guenoa.afip.FECredService.IdComprobanteType idFactura;

	private java.util.Date fechaInfo;

	private coop.guenoa.afip.FECredService.CuentaComitenteType ctaComitente;

	private coop.guenoa.afip.FECredService.SiNoSimpleType recibida;

	private java.util.Date fechaRecep;

	private coop.guenoa.afip.FECredService.SiNoSimpleType aceptada;

	public FacturaInformadaAgtDptoCltvType() {
	}

	public FacturaInformadaAgtDptoCltvType(coop.guenoa.afip.FECredService.IdComprobanteType idFactura,
			java.util.Date fechaInfo, coop.guenoa.afip.FECredService.CuentaComitenteType ctaComitente,
			coop.guenoa.afip.FECredService.SiNoSimpleType recibida, java.util.Date fechaRecep,
			coop.guenoa.afip.FECredService.SiNoSimpleType aceptada) {
		this.idFactura = idFactura;
		this.fechaInfo = fechaInfo;
		this.ctaComitente = ctaComitente;
		this.recibida = recibida;
		this.fechaRecep = fechaRecep;
		this.aceptada = aceptada;
	}

	/**
	 * Gets the idFactura value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @return idFactura
	 */
	public coop.guenoa.afip.FECredService.IdComprobanteType getIdFactura() {
		return idFactura;
	}

	/**
	 * Sets the idFactura value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @param idFactura
	 */
	public void setIdFactura(coop.guenoa.afip.FECredService.IdComprobanteType idFactura) {
		this.idFactura = idFactura;
	}

	/**
	 * Gets the fechaInfo value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @return fechaInfo
	 */
	public java.util.Date getFechaInfo() {
		return fechaInfo;
	}

	/**
	 * Sets the fechaInfo value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @param fechaInfo
	 */
	public void setFechaInfo(java.util.Date fechaInfo) {
		this.fechaInfo = fechaInfo;
	}

	/**
	 * Gets the ctaComitente value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @return ctaComitente
	 */
	public coop.guenoa.afip.FECredService.CuentaComitenteType getCtaComitente() {
		return ctaComitente;
	}

	/**
	 * Sets the ctaComitente value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @param ctaComitente
	 */
	public void setCtaComitente(coop.guenoa.afip.FECredService.CuentaComitenteType ctaComitente) {
		this.ctaComitente = ctaComitente;
	}

	/**
	 * Gets the recibida value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @return recibida
	 */
	public coop.guenoa.afip.FECredService.SiNoSimpleType getRecibida() {
		return recibida;
	}

	/**
	 * Sets the recibida value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @param recibida
	 */
	public void setRecibida(coop.guenoa.afip.FECredService.SiNoSimpleType recibida) {
		this.recibida = recibida;
	}

	/**
	 * Gets the fechaRecep value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @return fechaRecep
	 */
	public java.util.Date getFechaRecep() {
		return fechaRecep;
	}

	/**
	 * Sets the fechaRecep value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @param fechaRecep
	 */
	public void setFechaRecep(java.util.Date fechaRecep) {
		this.fechaRecep = fechaRecep;
	}

	/**
	 * Gets the aceptada value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @return aceptada
	 */
	public coop.guenoa.afip.FECredService.SiNoSimpleType getAceptada() {
		return aceptada;
	}

	/**
	 * Sets the aceptada value for this FacturaInformadaAgtDptoCltvType.
	 * 
	 * @param aceptada
	 */
	public void setAceptada(coop.guenoa.afip.FECredService.SiNoSimpleType aceptada) {
		this.aceptada = aceptada;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof FacturaInformadaAgtDptoCltvType))
			return false;
		FacturaInformadaAgtDptoCltvType other = (FacturaInformadaAgtDptoCltvType) obj;
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
				&& ((this.idFactura == null && other.getIdFactura() == null)
						|| (this.idFactura != null && this.idFactura.equals(other.getIdFactura())))
				&& ((this.fechaInfo == null && other.getFechaInfo() == null)
						|| (this.fechaInfo != null && this.fechaInfo.equals(other.getFechaInfo())))
				&& ((this.ctaComitente == null && other.getCtaComitente() == null)
						|| (this.ctaComitente != null && this.ctaComitente.equals(other.getCtaComitente())))
				&& ((this.recibida == null && other.getRecibida() == null)
						|| (this.recibida != null && this.recibida.equals(other.getRecibida())))
				&& ((this.fechaRecep == null && other.getFechaRecep() == null)
						|| (this.fechaRecep != null && this.fechaRecep.equals(other.getFechaRecep())))
				&& ((this.aceptada == null && other.getAceptada() == null)
						|| (this.aceptada != null && this.aceptada.equals(other.getAceptada())));
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
		if (getIdFactura() != null) {
			_hashCode += getIdFactura().hashCode();
		}
		if (getFechaInfo() != null) {
			_hashCode += getFechaInfo().hashCode();
		}
		if (getCtaComitente() != null) {
			_hashCode += getCtaComitente().hashCode();
		}
		if (getRecibida() != null) {
			_hashCode += getRecibida().hashCode();
		}
		if (getFechaRecep() != null) {
			_hashCode += getFechaRecep().hashCode();
		}
		if (getAceptada() != null) {
			_hashCode += getAceptada().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			FacturaInformadaAgtDptoCltvType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"FacturaInformadaAgtDptoCltvType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idFactura");
		elemField.setXmlName(new javax.xml.namespace.QName("", "idFactura"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "IdComprobanteType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fechaInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fechaInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ctaComitente");
		elemField.setXmlName(new javax.xml.namespace.QName("", "ctaComitente"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "CuentaComitenteType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("recibida");
		elemField.setXmlName(new javax.xml.namespace.QName("", "recibida"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "SiNoSimpleType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fechaRecep");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fechaRecep"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("aceptada");
		elemField.setXmlName(new javax.xml.namespace.QName("", "aceptada"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/", "SiNoSimpleType"));
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
