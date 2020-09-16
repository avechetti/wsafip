/**
 * Telefono.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

import javax.xml.namespace.QName;

public class Telefono  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long numero;

    private String tipoLinea;

    private String tipoTelefono;

    public Telefono() {
    }

    public Telefono(
           Long numero,
           String tipoLinea,
           String tipoTelefono) {
           this.numero = numero;
           this.tipoLinea = tipoLinea;
           this.tipoTelefono = tipoTelefono;
    }


    /**
     * Gets the numero value for this Telefono.
     * 
     * @return numero
     */
    public Long getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Telefono.
     * 
     * @param numero
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }


    /**
     * Gets the tipoLinea value for this Telefono.
     * 
     * @return tipoLinea
     */
    public String getTipoLinea() {
        return tipoLinea;
    }


    /**
     * Sets the tipoLinea value for this Telefono.
     * 
     * @param tipoLinea
     */
    public void setTipoLinea(String tipoLinea) {
        this.tipoLinea = tipoLinea;
    }


    /**
     * Gets the tipoTelefono value for this Telefono.
     * 
     * @return tipoTelefono
     */
    public String getTipoTelefono() {
        return tipoTelefono;
    }


    /**
     * Sets the tipoTelefono value for this Telefono.
     * 
     * @param tipoTelefono
     */
    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Telefono)) return false;
        Telefono other = (Telefono) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.tipoLinea==null && other.getTipoLinea()==null) || 
             (this.tipoLinea!=null &&
              this.tipoLinea.equals(other.getTipoLinea()))) &&
            ((this.tipoTelefono==null && other.getTipoTelefono()==null) || 
             (this.tipoTelefono!=null &&
              this.tipoTelefono.equals(other.getTipoTelefono())));
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
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getTipoLinea() != null) {
            _hashCode += getTipoLinea().hashCode();
        }
        if (getTipoTelefono() != null) {
            _hashCode += getTipoTelefono().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Telefono.class, true);

    static {
        typeDesc.setXmlType(new QName("http://a4.soap.ws.server.puc.sr/", "telefono"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new QName("", "numero"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoLinea");
        elemField.setXmlName(new QName("", "tipoLinea"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTelefono");
        elemField.setXmlName(new QName("", "tipoTelefono"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
           QName _xmlType) {
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
           QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", tipoLinea=" + tipoLinea + ", tipoTelefono=" + tipoTelefono + "]";
	}
    
    

}
