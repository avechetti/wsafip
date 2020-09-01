/**
 * Email.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

public class Email  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String direccion;

    private String estado;

    private String tipoEmail;

    public Email() {
    }

    public Email(
           String direccion,
           String estado,
           String tipoEmail) {
           this.direccion = direccion;
           this.estado = estado;
           this.tipoEmail = tipoEmail;
    }


    /**
     * Gets the direccion value for this Email.
     * 
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this Email.
     * 
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the estado value for this Email.
     * 
     * @return estado
     */
    public String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Email.
     * 
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }


    /**
     * Gets the tipoEmail value for this Email.
     * 
     * @return tipoEmail
     */
    public String getTipoEmail() {
        return tipoEmail;
    }


    /**
     * Sets the tipoEmail value for this Email.
     * 
     * @param tipoEmail
     */
    public void setTipoEmail(String tipoEmail) {
        this.tipoEmail = tipoEmail;
    }
    
    private Object __equalsCalc = null;
    
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Email)) return false;
        Email other = (Email) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.tipoEmail==null && other.getTipoEmail()==null) || 
             (this.tipoEmail!=null &&
              this.tipoEmail.equals(other.getTipoEmail())));
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
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getTipoEmail() != null) {
            _hashCode += getTipoEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Email.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "email"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tipoEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoEmail"));
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
           String mechType, 
           Class<?> _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType, 
           Class<?> _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

	@Override
	public String toString() {
		return "Email [direccion=" + direccion + ", estado=" + estado + ", tipoEmail=" + tipoEmail + "]";
	}
    
    

}
