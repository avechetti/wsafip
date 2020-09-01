/**
 * Relacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

public class Relacion  implements java.io.Serializable {
    private java.util.Calendar ffRelacion;

    private java.util.Calendar ffVencimiento;

    private java.lang.Long idPersona;

    private java.lang.Long idPersonaAsociada;

    private java.lang.String subtipoRelacion;

    private java.lang.String tipoRelacion;

    public Relacion() {
    }

    public Relacion(
           java.util.Calendar ffRelacion,
           java.util.Calendar ffVencimiento,
           java.lang.Long idPersona,
           java.lang.Long idPersonaAsociada,
           java.lang.String subtipoRelacion,
           java.lang.String tipoRelacion) {
           this.ffRelacion = ffRelacion;
           this.ffVencimiento = ffVencimiento;
           this.idPersona = idPersona;
           this.idPersonaAsociada = idPersonaAsociada;
           this.subtipoRelacion = subtipoRelacion;
           this.tipoRelacion = tipoRelacion;
    }


    /**
     * Gets the ffRelacion value for this Relacion.
     * 
     * @return ffRelacion
     */
    public java.util.Calendar getFfRelacion() {
        return ffRelacion;
    }


    /**
     * Sets the ffRelacion value for this Relacion.
     * 
     * @param ffRelacion
     */
    public void setFfRelacion(java.util.Calendar ffRelacion) {
        this.ffRelacion = ffRelacion;
    }


    /**
     * Gets the ffVencimiento value for this Relacion.
     * 
     * @return ffVencimiento
     */
    public java.util.Calendar getFfVencimiento() {
        return ffVencimiento;
    }


    /**
     * Sets the ffVencimiento value for this Relacion.
     * 
     * @param ffVencimiento
     */
    public void setFfVencimiento(java.util.Calendar ffVencimiento) {
        this.ffVencimiento = ffVencimiento;
    }


    /**
     * Gets the idPersona value for this Relacion.
     * 
     * @return idPersona
     */
    public java.lang.Long getIdPersona() {
        return idPersona;
    }


    /**
     * Sets the idPersona value for this Relacion.
     * 
     * @param idPersona
     */
    public void setIdPersona(java.lang.Long idPersona) {
        this.idPersona = idPersona;
    }


    /**
     * Gets the idPersonaAsociada value for this Relacion.
     * 
     * @return idPersonaAsociada
     */
    public java.lang.Long getIdPersonaAsociada() {
        return idPersonaAsociada;
    }


    /**
     * Sets the idPersonaAsociada value for this Relacion.
     * 
     * @param idPersonaAsociada
     */
    public void setIdPersonaAsociada(java.lang.Long idPersonaAsociada) {
        this.idPersonaAsociada = idPersonaAsociada;
    }


    /**
     * Gets the subtipoRelacion value for this Relacion.
     * 
     * @return subtipoRelacion
     */
    public java.lang.String getSubtipoRelacion() {
        return subtipoRelacion;
    }


    /**
     * Sets the subtipoRelacion value for this Relacion.
     * 
     * @param subtipoRelacion
     */
    public void setSubtipoRelacion(java.lang.String subtipoRelacion) {
        this.subtipoRelacion = subtipoRelacion;
    }


    /**
     * Gets the tipoRelacion value for this Relacion.
     * 
     * @return tipoRelacion
     */
    public java.lang.String getTipoRelacion() {
        return tipoRelacion;
    }


    /**
     * Sets the tipoRelacion value for this Relacion.
     * 
     * @param tipoRelacion
     */
    public void setTipoRelacion(java.lang.String tipoRelacion) {
        this.tipoRelacion = tipoRelacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Relacion)) return false;
        Relacion other = (Relacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ffRelacion==null && other.getFfRelacion()==null) || 
             (this.ffRelacion!=null &&
              this.ffRelacion.equals(other.getFfRelacion()))) &&
            ((this.ffVencimiento==null && other.getFfVencimiento()==null) || 
             (this.ffVencimiento!=null &&
              this.ffVencimiento.equals(other.getFfVencimiento()))) &&
            ((this.idPersona==null && other.getIdPersona()==null) || 
             (this.idPersona!=null &&
              this.idPersona.equals(other.getIdPersona()))) &&
            ((this.idPersonaAsociada==null && other.getIdPersonaAsociada()==null) || 
             (this.idPersonaAsociada!=null &&
              this.idPersonaAsociada.equals(other.getIdPersonaAsociada()))) &&
            ((this.subtipoRelacion==null && other.getSubtipoRelacion()==null) || 
             (this.subtipoRelacion!=null &&
              this.subtipoRelacion.equals(other.getSubtipoRelacion()))) &&
            ((this.tipoRelacion==null && other.getTipoRelacion()==null) || 
             (this.tipoRelacion!=null &&
              this.tipoRelacion.equals(other.getTipoRelacion())));
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
        if (getFfRelacion() != null) {
            _hashCode += getFfRelacion().hashCode();
        }
        if (getFfVencimiento() != null) {
            _hashCode += getFfVencimiento().hashCode();
        }
        if (getIdPersona() != null) {
            _hashCode += getIdPersona().hashCode();
        }
        if (getIdPersonaAsociada() != null) {
            _hashCode += getIdPersonaAsociada().hashCode();
        }
        if (getSubtipoRelacion() != null) {
            _hashCode += getSubtipoRelacion().hashCode();
        }
        if (getTipoRelacion() != null) {
            _hashCode += getTipoRelacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Relacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "relacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ffRelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ffRelacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ffVencimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ffVencimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPersonaAsociada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPersonaAsociada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtipoRelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtipoRelacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoRelacion"));
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
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

	@Override
	public String toString() {
		return "Relacion [ffRelacion=" + ffRelacion + ", ffVencimiento=" + ffVencimiento + ", idPersona=" + idPersona
				+ ", idPersonaAsociada=" + idPersonaAsociada + ", subtipoRelacion=" + subtipoRelacion
				+ ", tipoRelacion=" + tipoRelacion + "]";
	}
    
   

}
