/**
 * Categoria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

public class Categoria  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String descripcionCategoria;

    private String estado;

    private Integer idCategoria;

    private Integer idImpuesto;

    private Integer periodo;

    public Categoria() {
    }

    public Categoria(
           String descripcionCategoria,
           String estado,
           Integer idCategoria,
           Integer idImpuesto,
           Integer periodo) {
           this.descripcionCategoria = descripcionCategoria;
           this.estado = estado;
           this.idCategoria = idCategoria;
           this.idImpuesto = idImpuesto;
           this.periodo = periodo;
    }


    /**
     * Gets the descripcionCategoria value for this Categoria.
     * 
     * @return descripcionCategoria
     */
    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }


    /**
     * Sets the descripcionCategoria value for this Categoria.
     * 
     * @param descripcionCategoria
     */
    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }


    /**
     * Gets the estado value for this Categoria.
     * 
     * @return estado
     */
    public String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Categoria.
     * 
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }


    /**
     * Gets the idCategoria value for this Categoria.
     * 
     * @return idCategoria
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }


    /**
     * Sets the idCategoria value for this Categoria.
     * 
     * @param idCategoria
     */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }


    /**
     * Gets the idImpuesto value for this Categoria.
     * 
     * @return idImpuesto
     */
    public Integer getIdImpuesto() {
        return idImpuesto;
    }


    /**
     * Sets the idImpuesto value for this Categoria.
     * 
     * @param idImpuesto
     */
    public void setIdImpuesto(Integer idImpuesto) {
        this.idImpuesto = idImpuesto;
    }


    /**
     * Gets the periodo value for this Categoria.
     * 
     * @return periodo
     */
    public Integer getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this Categoria.
     * 
     * @param periodo
     */
    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Categoria)) return false;
        Categoria other = (Categoria) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descripcionCategoria==null && other.getDescripcionCategoria()==null) || 
             (this.descripcionCategoria!=null &&
              this.descripcionCategoria.equals(other.getDescripcionCategoria()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.idCategoria==null && other.getIdCategoria()==null) || 
             (this.idCategoria!=null &&
              this.idCategoria.equals(other.getIdCategoria()))) &&
            ((this.idImpuesto==null && other.getIdImpuesto()==null) || 
             (this.idImpuesto!=null &&
              this.idImpuesto.equals(other.getIdImpuesto()))) &&
            ((this.periodo==null && other.getPeriodo()==null) || 
             (this.periodo!=null &&
              this.periodo.equals(other.getPeriodo())));
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
        if (getDescripcionCategoria() != null) {
            _hashCode += getDescripcionCategoria().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getIdCategoria() != null) {
            _hashCode += getIdCategoria().hashCode();
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
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Categoria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "categoria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionCategoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionCategoria"));
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
        elemField.setFieldName("idCategoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCategoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
		return "Categoria [descripcionCategoria=" + descripcionCategoria + ", estado=" + estado + ", idCategoria="
				+ idCategoria + ", idImpuesto=" + idImpuesto + ", periodo=" + periodo + "]";
	}
    
    

}
