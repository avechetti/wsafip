/**
 * Persona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a5;

public class Persona  implements java.io.Serializable {
    private coop.guenoa.afip.padron.a5.DatosGenerales datosGenerales;

    private coop.guenoa.afip.padron.a5.DatosMonotributo datosMonotributo;

    private coop.guenoa.afip.padron.a5.DatosRegimenGeneral datosRegimenGeneral;

    private coop.guenoa.afip.padron.a5.ErrorConstancia errorConstancia;

    private coop.guenoa.afip.padron.a5.ErrorMonotributo errorMonotributo;

    private coop.guenoa.afip.padron.a5.ErrorRegimenGeneral errorRegimenGeneral;

    public Persona() {
    }

    public Persona(
           coop.guenoa.afip.padron.a5.DatosGenerales datosGenerales,
           coop.guenoa.afip.padron.a5.DatosMonotributo datosMonotributo,
           coop.guenoa.afip.padron.a5.DatosRegimenGeneral datosRegimenGeneral,
           coop.guenoa.afip.padron.a5.ErrorConstancia errorConstancia,
           coop.guenoa.afip.padron.a5.ErrorMonotributo errorMonotributo,
           coop.guenoa.afip.padron.a5.ErrorRegimenGeneral errorRegimenGeneral) {
           this.datosGenerales = datosGenerales;
           this.datosMonotributo = datosMonotributo;
           this.datosRegimenGeneral = datosRegimenGeneral;
           this.errorConstancia = errorConstancia;
           this.errorMonotributo = errorMonotributo;
           this.errorRegimenGeneral = errorRegimenGeneral;
    }


    /**
     * Gets the datosGenerales value for this Persona.
     * 
     * @return datosGenerales
     */
    public coop.guenoa.afip.padron.a5.DatosGenerales getDatosGenerales() {
        return datosGenerales;
    }


    /**
     * Sets the datosGenerales value for this Persona.
     * 
     * @param datosGenerales
     */
    public void setDatosGenerales(coop.guenoa.afip.padron.a5.DatosGenerales datosGenerales) {
        this.datosGenerales = datosGenerales;
    }


    /**
     * Gets the datosMonotributo value for this Persona.
     * 
     * @return datosMonotributo
     */
    public coop.guenoa.afip.padron.a5.DatosMonotributo getDatosMonotributo() {
        return datosMonotributo;
    }


    /**
     * Sets the datosMonotributo value for this Persona.
     * 
     * @param datosMonotributo
     */
    public void setDatosMonotributo(coop.guenoa.afip.padron.a5.DatosMonotributo datosMonotributo) {
        this.datosMonotributo = datosMonotributo;
    }


    /**
     * Gets the datosRegimenGeneral value for this Persona.
     * 
     * @return datosRegimenGeneral
     */
    public coop.guenoa.afip.padron.a5.DatosRegimenGeneral getDatosRegimenGeneral() {
        return datosRegimenGeneral;
    }


    /**
     * Sets the datosRegimenGeneral value for this Persona.
     * 
     * @param datosRegimenGeneral
     */
    public void setDatosRegimenGeneral(coop.guenoa.afip.padron.a5.DatosRegimenGeneral datosRegimenGeneral) {
        this.datosRegimenGeneral = datosRegimenGeneral;
    }


    /**
     * Gets the errorConstancia value for this Persona.
     * 
     * @return errorConstancia
     */
    public coop.guenoa.afip.padron.a5.ErrorConstancia getErrorConstancia() {
        return errorConstancia;
    }


    /**
     * Sets the errorConstancia value for this Persona.
     * 
     * @param errorConstancia
     */
    public void setErrorConstancia(coop.guenoa.afip.padron.a5.ErrorConstancia errorConstancia) {
        this.errorConstancia = errorConstancia;
    }


    /**
     * Gets the errorMonotributo value for this Persona.
     * 
     * @return errorMonotributo
     */
    public coop.guenoa.afip.padron.a5.ErrorMonotributo getErrorMonotributo() {
        return errorMonotributo;
    }


    /**
     * Sets the errorMonotributo value for this Persona.
     * 
     * @param errorMonotributo
     */
    public void setErrorMonotributo(coop.guenoa.afip.padron.a5.ErrorMonotributo errorMonotributo) {
        this.errorMonotributo = errorMonotributo;
    }


    /**
     * Gets the errorRegimenGeneral value for this Persona.
     * 
     * @return errorRegimenGeneral
     */
    public coop.guenoa.afip.padron.a5.ErrorRegimenGeneral getErrorRegimenGeneral() {
        return errorRegimenGeneral;
    }


    /**
     * Sets the errorRegimenGeneral value for this Persona.
     * 
     * @param errorRegimenGeneral
     */
    public void setErrorRegimenGeneral(coop.guenoa.afip.padron.a5.ErrorRegimenGeneral errorRegimenGeneral) {
        this.errorRegimenGeneral = errorRegimenGeneral;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Persona)) return false;
        Persona other = (Persona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosGenerales==null && other.getDatosGenerales()==null) || 
             (this.datosGenerales!=null &&
              this.datosGenerales.equals(other.getDatosGenerales()))) &&
            ((this.datosMonotributo==null && other.getDatosMonotributo()==null) || 
             (this.datosMonotributo!=null &&
              this.datosMonotributo.equals(other.getDatosMonotributo()))) &&
            ((this.datosRegimenGeneral==null && other.getDatosRegimenGeneral()==null) || 
             (this.datosRegimenGeneral!=null &&
              this.datosRegimenGeneral.equals(other.getDatosRegimenGeneral()))) &&
            ((this.errorConstancia==null && other.getErrorConstancia()==null) || 
             (this.errorConstancia!=null &&
              this.errorConstancia.equals(other.getErrorConstancia()))) &&
            ((this.errorMonotributo==null && other.getErrorMonotributo()==null) || 
             (this.errorMonotributo!=null &&
              this.errorMonotributo.equals(other.getErrorMonotributo()))) &&
            ((this.errorRegimenGeneral==null && other.getErrorRegimenGeneral()==null) || 
             (this.errorRegimenGeneral!=null &&
              this.errorRegimenGeneral.equals(other.getErrorRegimenGeneral())));
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
        if (getDatosGenerales() != null) {
            _hashCode += getDatosGenerales().hashCode();
        }
        if (getDatosMonotributo() != null) {
            _hashCode += getDatosMonotributo().hashCode();
        }
        if (getDatosRegimenGeneral() != null) {
            _hashCode += getDatosRegimenGeneral().hashCode();
        }
        if (getErrorConstancia() != null) {
            _hashCode += getErrorConstancia().hashCode();
        }
        if (getErrorMonotributo() != null) {
            _hashCode += getErrorMonotributo().hashCode();
        }
        if (getErrorRegimenGeneral() != null) {
            _hashCode += getErrorRegimenGeneral().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Persona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "persona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosGenerales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosGenerales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "datosGenerales"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosMonotributo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosMonotributo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "datosMonotributo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosRegimenGeneral");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosRegimenGeneral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "datosRegimenGeneral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorConstancia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorConstancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "errorConstancia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMonotributo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMonotributo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "errorMonotributo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorRegimenGeneral");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorRegimenGeneral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "errorRegimenGeneral"));
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

}
