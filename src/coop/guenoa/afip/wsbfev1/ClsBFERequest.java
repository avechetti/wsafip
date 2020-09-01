/**
 * ClsBFERequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public class ClsBFERequest implements java.io.Serializable {
	private long id;

	private short tipo_doc;

	private long nro_doc;

	private short zona;

	private short tipo_cbte;

	private int punto_vta;

	private long cbte_nro;

	private double imp_total;

	private double imp_tot_conc;

	private double imp_neto;

	private double impto_liq;

	private double impto_liq_rni;

	private double imp_op_ex;

	private double imp_perc;

	private double imp_iibb;

	private double imp_perc_mun;

	private double imp_internos;

	private java.lang.String imp_moneda_Id;

	private double imp_moneda_ctz;

	private java.lang.String fecha_cbte;

	private coop.guenoa.afip.wsbfev1.Opcional[] opcionales;

	private coop.guenoa.afip.wsbfev1.Item[] items;

	public ClsBFERequest() {
	}

	public ClsBFERequest(long id, short tipo_doc, long nro_doc, short zona, short tipo_cbte, int punto_vta,
			long cbte_nro, double imp_total, double imp_tot_conc, double imp_neto, double impto_liq,
			double impto_liq_rni, double imp_op_ex, double imp_perc, double imp_iibb, double imp_perc_mun,
			double imp_internos, java.lang.String imp_moneda_Id, double imp_moneda_ctz, java.lang.String fecha_cbte,
			coop.guenoa.afip.wsbfev1.Opcional[] opcionales, coop.guenoa.afip.wsbfev1.Item[] items) {
		this.id = id;
		this.tipo_doc = tipo_doc;
		this.nro_doc = nro_doc;
		this.zona = zona;
		this.tipo_cbte = tipo_cbte;
		this.punto_vta = punto_vta;
		this.cbte_nro = cbte_nro;
		this.imp_total = imp_total;
		this.imp_tot_conc = imp_tot_conc;
		this.imp_neto = imp_neto;
		this.impto_liq = impto_liq;
		this.impto_liq_rni = impto_liq_rni;
		this.imp_op_ex = imp_op_ex;
		this.imp_perc = imp_perc;
		this.imp_iibb = imp_iibb;
		this.imp_perc_mun = imp_perc_mun;
		this.imp_internos = imp_internos;
		this.imp_moneda_Id = imp_moneda_Id;
		this.imp_moneda_ctz = imp_moneda_ctz;
		this.fecha_cbte = fecha_cbte;
		this.opcionales = opcionales;
		this.items = items;
	}

	/**
	 * Gets the id value for this ClsBFERequest.
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id value for this ClsBFERequest.
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the tipo_doc value for this ClsBFERequest.
	 * 
	 * @return tipo_doc
	 */
	public short getTipo_doc() {
		return tipo_doc;
	}

	/**
	 * Sets the tipo_doc value for this ClsBFERequest.
	 * 
	 * @param tipo_doc
	 */
	public void setTipo_doc(short tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	/**
	 * Gets the nro_doc value for this ClsBFERequest.
	 * 
	 * @return nro_doc
	 */
	public long getNro_doc() {
		return nro_doc;
	}

	/**
	 * Sets the nro_doc value for this ClsBFERequest.
	 * 
	 * @param nro_doc
	 */
	public void setNro_doc(long nro_doc) {
		this.nro_doc = nro_doc;
	}

	/**
	 * Gets the zona value for this ClsBFERequest.
	 * 
	 * @return zona
	 */
	public short getZona() {
		return zona;
	}

	/**
	 * Sets the zona value for this ClsBFERequest.
	 * 
	 * @param zona
	 */
	public void setZona(short zona) {
		this.zona = zona;
	}

	/**
	 * Gets the tipo_cbte value for this ClsBFERequest.
	 * 
	 * @return tipo_cbte
	 */
	public short getTipo_cbte() {
		return tipo_cbte;
	}

	/**
	 * Sets the tipo_cbte value for this ClsBFERequest.
	 * 
	 * @param tipo_cbte
	 */
	public void setTipo_cbte(short tipo_cbte) {
		this.tipo_cbte = tipo_cbte;
	}

	/**
	 * Gets the punto_vta value for this ClsBFERequest.
	 * 
	 * @return punto_vta
	 */
	public int getPunto_vta() {
		return punto_vta;
	}

	/**
	 * Sets the punto_vta value for this ClsBFERequest.
	 * 
	 * @param punto_vta
	 */
	public void setPunto_vta(int punto_vta) {
		this.punto_vta = punto_vta;
	}

	/**
	 * Gets the cbte_nro value for this ClsBFERequest.
	 * 
	 * @return cbte_nro
	 */
	public long getCbte_nro() {
		return cbte_nro;
	}

	/**
	 * Sets the cbte_nro value for this ClsBFERequest.
	 * 
	 * @param cbte_nro
	 */
	public void setCbte_nro(long cbte_nro) {
		this.cbte_nro = cbte_nro;
	}

	/**
	 * Gets the imp_total value for this ClsBFERequest.
	 * 
	 * @return imp_total
	 */
	public double getImp_total() {
		return imp_total;
	}

	/**
	 * Sets the imp_total value for this ClsBFERequest.
	 * 
	 * @param imp_total
	 */
	public void setImp_total(double imp_total) {
		this.imp_total = imp_total;
	}

	/**
	 * Gets the imp_tot_conc value for this ClsBFERequest.
	 * 
	 * @return imp_tot_conc
	 */
	public double getImp_tot_conc() {
		return imp_tot_conc;
	}

	/**
	 * Sets the imp_tot_conc value for this ClsBFERequest.
	 * 
	 * @param imp_tot_conc
	 */
	public void setImp_tot_conc(double imp_tot_conc) {
		this.imp_tot_conc = imp_tot_conc;
	}

	/**
	 * Gets the imp_neto value for this ClsBFERequest.
	 * 
	 * @return imp_neto
	 */
	public double getImp_neto() {
		return imp_neto;
	}

	/**
	 * Sets the imp_neto value for this ClsBFERequest.
	 * 
	 * @param imp_neto
	 */
	public void setImp_neto(double imp_neto) {
		this.imp_neto = imp_neto;
	}

	/**
	 * Gets the impto_liq value for this ClsBFERequest.
	 * 
	 * @return impto_liq
	 */
	public double getImpto_liq() {
		return impto_liq;
	}

	/**
	 * Sets the impto_liq value for this ClsBFERequest.
	 * 
	 * @param impto_liq
	 */
	public void setImpto_liq(double impto_liq) {
		this.impto_liq = impto_liq;
	}

	/**
	 * Gets the impto_liq_rni value for this ClsBFERequest.
	 * 
	 * @return impto_liq_rni
	 */
	public double getImpto_liq_rni() {
		return impto_liq_rni;
	}

	/**
	 * Sets the impto_liq_rni value for this ClsBFERequest.
	 * 
	 * @param impto_liq_rni
	 */
	public void setImpto_liq_rni(double impto_liq_rni) {
		this.impto_liq_rni = impto_liq_rni;
	}

	/**
	 * Gets the imp_op_ex value for this ClsBFERequest.
	 * 
	 * @return imp_op_ex
	 */
	public double getImp_op_ex() {
		return imp_op_ex;
	}

	/**
	 * Sets the imp_op_ex value for this ClsBFERequest.
	 * 
	 * @param imp_op_ex
	 */
	public void setImp_op_ex(double imp_op_ex) {
		this.imp_op_ex = imp_op_ex;
	}

	/**
	 * Gets the imp_perc value for this ClsBFERequest.
	 * 
	 * @return imp_perc
	 */
	public double getImp_perc() {
		return imp_perc;
	}

	/**
	 * Sets the imp_perc value for this ClsBFERequest.
	 * 
	 * @param imp_perc
	 */
	public void setImp_perc(double imp_perc) {
		this.imp_perc = imp_perc;
	}

	/**
	 * Gets the imp_iibb value for this ClsBFERequest.
	 * 
	 * @return imp_iibb
	 */
	public double getImp_iibb() {
		return imp_iibb;
	}

	/**
	 * Sets the imp_iibb value for this ClsBFERequest.
	 * 
	 * @param imp_iibb
	 */
	public void setImp_iibb(double imp_iibb) {
		this.imp_iibb = imp_iibb;
	}

	/**
	 * Gets the imp_perc_mun value for this ClsBFERequest.
	 * 
	 * @return imp_perc_mun
	 */
	public double getImp_perc_mun() {
		return imp_perc_mun;
	}

	/**
	 * Sets the imp_perc_mun value for this ClsBFERequest.
	 * 
	 * @param imp_perc_mun
	 */
	public void setImp_perc_mun(double imp_perc_mun) {
		this.imp_perc_mun = imp_perc_mun;
	}

	/**
	 * Gets the imp_internos value for this ClsBFERequest.
	 * 
	 * @return imp_internos
	 */
	public double getImp_internos() {
		return imp_internos;
	}

	/**
	 * Sets the imp_internos value for this ClsBFERequest.
	 * 
	 * @param imp_internos
	 */
	public void setImp_internos(double imp_internos) {
		this.imp_internos = imp_internos;
	}

	/**
	 * Gets the imp_moneda_Id value for this ClsBFERequest.
	 * 
	 * @return imp_moneda_Id
	 */
	public java.lang.String getImp_moneda_Id() {
		return imp_moneda_Id;
	}

	/**
	 * Sets the imp_moneda_Id value for this ClsBFERequest.
	 * 
	 * @param imp_moneda_Id
	 */
	public void setImp_moneda_Id(java.lang.String imp_moneda_Id) {
		this.imp_moneda_Id = imp_moneda_Id;
	}

	/**
	 * Gets the imp_moneda_ctz value for this ClsBFERequest.
	 * 
	 * @return imp_moneda_ctz
	 */
	public double getImp_moneda_ctz() {
		return imp_moneda_ctz;
	}

	/**
	 * Sets the imp_moneda_ctz value for this ClsBFERequest.
	 * 
	 * @param imp_moneda_ctz
	 */
	public void setImp_moneda_ctz(double imp_moneda_ctz) {
		this.imp_moneda_ctz = imp_moneda_ctz;
	}

	/**
	 * Gets the fecha_cbte value for this ClsBFERequest.
	 * 
	 * @return fecha_cbte
	 */
	public java.lang.String getFecha_cbte() {
		return fecha_cbte;
	}

	/**
	 * Sets the fecha_cbte value for this ClsBFERequest.
	 * 
	 * @param fecha_cbte
	 */
	public void setFecha_cbte(java.lang.String fecha_cbte) {
		this.fecha_cbte = fecha_cbte;
	}

	/**
	 * Gets the opcionales value for this ClsBFERequest.
	 * 
	 * @return opcionales
	 */
	public coop.guenoa.afip.wsbfev1.Opcional[] getOpcionales() {
		return opcionales;
	}

	/**
	 * Sets the opcionales value for this ClsBFERequest.
	 * 
	 * @param opcionales
	 */
	public void setOpcionales(coop.guenoa.afip.wsbfev1.Opcional[] opcionales) {
		this.opcionales = opcionales;
	}

	/**
	 * Gets the items value for this ClsBFERequest.
	 * 
	 * @return items
	 */
	public coop.guenoa.afip.wsbfev1.Item[] getItems() {
		return items;
	}

	/**
	 * Sets the items value for this ClsBFERequest.
	 * 
	 * @param items
	 */
	public void setItems(coop.guenoa.afip.wsbfev1.Item[] items) {
		this.items = items;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClsBFERequest))
			return false;
		ClsBFERequest other = (ClsBFERequest) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.id == other.getId() && this.tipo_doc == other.getTipo_doc()
				&& this.nro_doc == other.getNro_doc() && this.zona == other.getZona()
				&& this.tipo_cbte == other.getTipo_cbte() && this.punto_vta == other.getPunto_vta()
				&& this.cbte_nro == other.getCbte_nro() && this.imp_total == other.getImp_total()
				&& this.imp_tot_conc == other.getImp_tot_conc() && this.imp_neto == other.getImp_neto()
				&& this.impto_liq == other.getImpto_liq() && this.impto_liq_rni == other.getImpto_liq_rni()
				&& this.imp_op_ex == other.getImp_op_ex() && this.imp_perc == other.getImp_perc()
				&& this.imp_iibb == other.getImp_iibb() && this.imp_perc_mun == other.getImp_perc_mun()
				&& this.imp_internos == other.getImp_internos()
				&& ((this.imp_moneda_Id == null && other.getImp_moneda_Id() == null)
						|| (this.imp_moneda_Id != null && this.imp_moneda_Id.equals(other.getImp_moneda_Id())))
				&& this.imp_moneda_ctz == other.getImp_moneda_ctz()
				&& ((this.fecha_cbte == null && other.getFecha_cbte() == null)
						|| (this.fecha_cbte != null && this.fecha_cbte.equals(other.getFecha_cbte())))
				&& ((this.opcionales == null && other.getOpcionales() == null)
						|| (this.opcionales != null && java.util.Arrays.equals(this.opcionales, other.getOpcionales())))
				&& ((this.items == null && other.getItems() == null)
						|| (this.items != null && java.util.Arrays.equals(this.items, other.getItems())));
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
		_hashCode += getTipo_doc();
		_hashCode += new Long(getNro_doc()).hashCode();
		_hashCode += getZona();
		_hashCode += getTipo_cbte();
		_hashCode += getPunto_vta();
		_hashCode += new Long(getCbte_nro()).hashCode();
		_hashCode += new Double(getImp_total()).hashCode();
		_hashCode += new Double(getImp_tot_conc()).hashCode();
		_hashCode += new Double(getImp_neto()).hashCode();
		_hashCode += new Double(getImpto_liq()).hashCode();
		_hashCode += new Double(getImpto_liq_rni()).hashCode();
		_hashCode += new Double(getImp_op_ex()).hashCode();
		_hashCode += new Double(getImp_perc()).hashCode();
		_hashCode += new Double(getImp_iibb()).hashCode();
		_hashCode += new Double(getImp_perc_mun()).hashCode();
		_hashCode += new Double(getImp_internos()).hashCode();
		if (getImp_moneda_Id() != null) {
			_hashCode += getImp_moneda_Id().hashCode();
		}
		_hashCode += new Double(getImp_moneda_ctz()).hashCode();
		if (getFecha_cbte() != null) {
			_hashCode += getFecha_cbte().hashCode();
		}
		if (getOpcionales() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getOpcionales()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getOpcionales(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getItems() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getItems()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClsBFERequest.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFERequest"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipo_doc");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Tipo_doc"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nro_doc");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Nro_doc"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("zona");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Zona"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipo_cbte");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Tipo_cbte"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("punto_vta");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Punto_vta"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cbte_nro");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Cbte_nro"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_total");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_total"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_tot_conc");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_tot_conc"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_neto");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_neto"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("impto_liq");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Impto_liq"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("impto_liq_rni");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Impto_liq_rni"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_op_ex");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_op_ex"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_perc");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_perc"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_iibb");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_iibb"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_perc_mun");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_perc_mun"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_internos");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_internos"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_moneda_Id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_moneda_Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_moneda_ctz");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Imp_moneda_ctz"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fecha_cbte");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Fecha_cbte"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("opcionales");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Opcionales"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Opcional"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Opcional"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("items");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Items"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Item"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Item"));
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
