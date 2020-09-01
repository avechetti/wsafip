/**
 * ClsSEGGetCMPR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsseg;

public class ClsSEGGetCMPR implements java.io.Serializable {
	private long id;

	private long cuit;

	private short tipo_doc;

	private long nro_doc;

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

	private double imp_otrib_prov;

	private java.lang.String fecha_cbte_orig;

	private java.lang.String fecha_cbte_cae;

	private java.lang.String fch_venc_Cae;

	private java.lang.String cae;

	private java.lang.String resultado;

	private java.lang.String obs;

	private coop.guenoa.afip.wsseg.Item[] items;

	public ClsSEGGetCMPR() {
	}

	public ClsSEGGetCMPR(long id, long cuit, short tipo_doc, long nro_doc, short tipo_cbte, int punto_vta,
			long cbte_nro, double imp_total, double imp_tot_conc, double imp_neto, double impto_liq,
			double impto_liq_rni, double imp_op_ex, double imp_perc, double imp_iibb, double imp_perc_mun,
			double imp_internos, java.lang.String imp_moneda_Id, double imp_moneda_ctz, double imp_otrib_prov,
			java.lang.String fecha_cbte_orig, java.lang.String fecha_cbte_cae, java.lang.String fch_venc_Cae,
			java.lang.String cae, java.lang.String resultado, java.lang.String obs, coop.guenoa.afip.wsseg.Item[] items) {
		this.id = id;
		this.cuit = cuit;
		this.tipo_doc = tipo_doc;
		this.nro_doc = nro_doc;
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
		this.imp_otrib_prov = imp_otrib_prov;
		this.fecha_cbte_orig = fecha_cbte_orig;
		this.fecha_cbte_cae = fecha_cbte_cae;
		this.fch_venc_Cae = fch_venc_Cae;
		this.cae = cae;
		this.resultado = resultado;
		this.obs = obs;
		this.items = items;
	}

	/**
	 * Gets the id value for this ClsSEGGetCMPR.
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id value for this ClsSEGGetCMPR.
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the cuit value for this ClsSEGGetCMPR.
	 * 
	 * @return cuit
	 */
	public long getCuit() {
		return cuit;
	}

	/**
	 * Sets the cuit value for this ClsSEGGetCMPR.
	 * 
	 * @param cuit
	 */
	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	/**
	 * Gets the tipo_doc value for this ClsSEGGetCMPR.
	 * 
	 * @return tipo_doc
	 */
	public short getTipo_doc() {
		return tipo_doc;
	}

	/**
	 * Sets the tipo_doc value for this ClsSEGGetCMPR.
	 * 
	 * @param tipo_doc
	 */
	public void setTipo_doc(short tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	/**
	 * Gets the nro_doc value for this ClsSEGGetCMPR.
	 * 
	 * @return nro_doc
	 */
	public long getNro_doc() {
		return nro_doc;
	}

	/**
	 * Sets the nro_doc value for this ClsSEGGetCMPR.
	 * 
	 * @param nro_doc
	 */
	public void setNro_doc(long nro_doc) {
		this.nro_doc = nro_doc;
	}

	/**
	 * Gets the tipo_cbte value for this ClsSEGGetCMPR.
	 * 
	 * @return tipo_cbte
	 */
	public short getTipo_cbte() {
		return tipo_cbte;
	}

	/**
	 * Sets the tipo_cbte value for this ClsSEGGetCMPR.
	 * 
	 * @param tipo_cbte
	 */
	public void setTipo_cbte(short tipo_cbte) {
		this.tipo_cbte = tipo_cbte;
	}

	/**
	 * Gets the punto_vta value for this ClsSEGGetCMPR.
	 * 
	 * @return punto_vta
	 */
	public int getPunto_vta() {
		return punto_vta;
	}

	/**
	 * Sets the punto_vta value for this ClsSEGGetCMPR.
	 * 
	 * @param punto_vta
	 */
	public void setPunto_vta(int punto_vta) {
		this.punto_vta = punto_vta;
	}

	/**
	 * Gets the cbte_nro value for this ClsSEGGetCMPR.
	 * 
	 * @return cbte_nro
	 */
	public long getCbte_nro() {
		return cbte_nro;
	}

	/**
	 * Sets the cbte_nro value for this ClsSEGGetCMPR.
	 * 
	 * @param cbte_nro
	 */
	public void setCbte_nro(long cbte_nro) {
		this.cbte_nro = cbte_nro;
	}

	/**
	 * Gets the imp_total value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_total
	 */
	public double getImp_total() {
		return imp_total;
	}

	/**
	 * Sets the imp_total value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_total
	 */
	public void setImp_total(double imp_total) {
		this.imp_total = imp_total;
	}

	/**
	 * Gets the imp_tot_conc value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_tot_conc
	 */
	public double getImp_tot_conc() {
		return imp_tot_conc;
	}

	/**
	 * Sets the imp_tot_conc value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_tot_conc
	 */
	public void setImp_tot_conc(double imp_tot_conc) {
		this.imp_tot_conc = imp_tot_conc;
	}

	/**
	 * Gets the imp_neto value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_neto
	 */
	public double getImp_neto() {
		return imp_neto;
	}

	/**
	 * Sets the imp_neto value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_neto
	 */
	public void setImp_neto(double imp_neto) {
		this.imp_neto = imp_neto;
	}

	/**
	 * Gets the impto_liq value for this ClsSEGGetCMPR.
	 * 
	 * @return impto_liq
	 */
	public double getImpto_liq() {
		return impto_liq;
	}

	/**
	 * Sets the impto_liq value for this ClsSEGGetCMPR.
	 * 
	 * @param impto_liq
	 */
	public void setImpto_liq(double impto_liq) {
		this.impto_liq = impto_liq;
	}

	/**
	 * Gets the impto_liq_rni value for this ClsSEGGetCMPR.
	 * 
	 * @return impto_liq_rni
	 */
	public double getImpto_liq_rni() {
		return impto_liq_rni;
	}

	/**
	 * Sets the impto_liq_rni value for this ClsSEGGetCMPR.
	 * 
	 * @param impto_liq_rni
	 */
	public void setImpto_liq_rni(double impto_liq_rni) {
		this.impto_liq_rni = impto_liq_rni;
	}

	/**
	 * Gets the imp_op_ex value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_op_ex
	 */
	public double getImp_op_ex() {
		return imp_op_ex;
	}

	/**
	 * Sets the imp_op_ex value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_op_ex
	 */
	public void setImp_op_ex(double imp_op_ex) {
		this.imp_op_ex = imp_op_ex;
	}

	/**
	 * Gets the imp_perc value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_perc
	 */
	public double getImp_perc() {
		return imp_perc;
	}

	/**
	 * Sets the imp_perc value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_perc
	 */
	public void setImp_perc(double imp_perc) {
		this.imp_perc = imp_perc;
	}

	/**
	 * Gets the imp_iibb value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_iibb
	 */
	public double getImp_iibb() {
		return imp_iibb;
	}

	/**
	 * Sets the imp_iibb value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_iibb
	 */
	public void setImp_iibb(double imp_iibb) {
		this.imp_iibb = imp_iibb;
	}

	/**
	 * Gets the imp_perc_mun value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_perc_mun
	 */
	public double getImp_perc_mun() {
		return imp_perc_mun;
	}

	/**
	 * Sets the imp_perc_mun value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_perc_mun
	 */
	public void setImp_perc_mun(double imp_perc_mun) {
		this.imp_perc_mun = imp_perc_mun;
	}

	/**
	 * Gets the imp_internos value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_internos
	 */
	public double getImp_internos() {
		return imp_internos;
	}

	/**
	 * Sets the imp_internos value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_internos
	 */
	public void setImp_internos(double imp_internos) {
		this.imp_internos = imp_internos;
	}

	/**
	 * Gets the imp_moneda_Id value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_moneda_Id
	 */
	public java.lang.String getImp_moneda_Id() {
		return imp_moneda_Id;
	}

	/**
	 * Sets the imp_moneda_Id value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_moneda_Id
	 */
	public void setImp_moneda_Id(java.lang.String imp_moneda_Id) {
		this.imp_moneda_Id = imp_moneda_Id;
	}

	/**
	 * Gets the imp_moneda_ctz value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_moneda_ctz
	 */
	public double getImp_moneda_ctz() {
		return imp_moneda_ctz;
	}

	/**
	 * Sets the imp_moneda_ctz value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_moneda_ctz
	 */
	public void setImp_moneda_ctz(double imp_moneda_ctz) {
		this.imp_moneda_ctz = imp_moneda_ctz;
	}

	/**
	 * Gets the imp_otrib_prov value for this ClsSEGGetCMPR.
	 * 
	 * @return imp_otrib_prov
	 */
	public double getImp_otrib_prov() {
		return imp_otrib_prov;
	}

	/**
	 * Sets the imp_otrib_prov value for this ClsSEGGetCMPR.
	 * 
	 * @param imp_otrib_prov
	 */
	public void setImp_otrib_prov(double imp_otrib_prov) {
		this.imp_otrib_prov = imp_otrib_prov;
	}

	/**
	 * Gets the fecha_cbte_orig value for this ClsSEGGetCMPR.
	 * 
	 * @return fecha_cbte_orig
	 */
	public java.lang.String getFecha_cbte_orig() {
		return fecha_cbte_orig;
	}

	/**
	 * Sets the fecha_cbte_orig value for this ClsSEGGetCMPR.
	 * 
	 * @param fecha_cbte_orig
	 */
	public void setFecha_cbte_orig(java.lang.String fecha_cbte_orig) {
		this.fecha_cbte_orig = fecha_cbte_orig;
	}

	/**
	 * Gets the fecha_cbte_cae value for this ClsSEGGetCMPR.
	 * 
	 * @return fecha_cbte_cae
	 */
	public java.lang.String getFecha_cbte_cae() {
		return fecha_cbte_cae;
	}

	/**
	 * Sets the fecha_cbte_cae value for this ClsSEGGetCMPR.
	 * 
	 * @param fecha_cbte_cae
	 */
	public void setFecha_cbte_cae(java.lang.String fecha_cbte_cae) {
		this.fecha_cbte_cae = fecha_cbte_cae;
	}

	/**
	 * Gets the fch_venc_Cae value for this ClsSEGGetCMPR.
	 * 
	 * @return fch_venc_Cae
	 */
	public java.lang.String getFch_venc_Cae() {
		return fch_venc_Cae;
	}

	/**
	 * Sets the fch_venc_Cae value for this ClsSEGGetCMPR.
	 * 
	 * @param fch_venc_Cae
	 */
	public void setFch_venc_Cae(java.lang.String fch_venc_Cae) {
		this.fch_venc_Cae = fch_venc_Cae;
	}

	/**
	 * Gets the cae value for this ClsSEGGetCMPR.
	 * 
	 * @return cae
	 */
	public java.lang.String getCae() {
		return cae;
	}

	/**
	 * Sets the cae value for this ClsSEGGetCMPR.
	 * 
	 * @param cae
	 */
	public void setCae(java.lang.String cae) {
		this.cae = cae;
	}

	/**
	 * Gets the resultado value for this ClsSEGGetCMPR.
	 * 
	 * @return resultado
	 */
	public java.lang.String getResultado() {
		return resultado;
	}

	/**
	 * Sets the resultado value for this ClsSEGGetCMPR.
	 * 
	 * @param resultado
	 */
	public void setResultado(java.lang.String resultado) {
		this.resultado = resultado;
	}

	/**
	 * Gets the obs value for this ClsSEGGetCMPR.
	 * 
	 * @return obs
	 */
	public java.lang.String getObs() {
		return obs;
	}

	/**
	 * Sets the obs value for this ClsSEGGetCMPR.
	 * 
	 * @param obs
	 */
	public void setObs(java.lang.String obs) {
		this.obs = obs;
	}

	/**
	 * Gets the items value for this ClsSEGGetCMPR.
	 * 
	 * @return items
	 */
	public coop.guenoa.afip.wsseg.Item[] getItems() {
		return items;
	}

	/**
	 * Sets the items value for this ClsSEGGetCMPR.
	 * 
	 * @param items
	 */
	public void setItems(coop.guenoa.afip.wsseg.Item[] items) {
		this.items = items;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClsSEGGetCMPR))
			return false;
		ClsSEGGetCMPR other = (ClsSEGGetCMPR) obj;
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
				&& this.tipo_doc == other.getTipo_doc() && this.nro_doc == other.getNro_doc()
				&& this.tipo_cbte == other.getTipo_cbte() && this.punto_vta == other.getPunto_vta()
				&& this.cbte_nro == other.getCbte_nro() && this.imp_total == other.getImp_total()
				&& this.imp_tot_conc == other.getImp_tot_conc() && this.imp_neto == other.getImp_neto()
				&& this.impto_liq == other.getImpto_liq() && this.impto_liq_rni == other.getImpto_liq_rni()
				&& this.imp_op_ex == other.getImp_op_ex() && this.imp_perc == other.getImp_perc()
				&& this.imp_iibb == other.getImp_iibb() && this.imp_perc_mun == other.getImp_perc_mun()
				&& this.imp_internos == other.getImp_internos()
				&& ((this.imp_moneda_Id == null && other.getImp_moneda_Id() == null)
						|| (this.imp_moneda_Id != null && this.imp_moneda_Id.equals(other.getImp_moneda_Id())))
				&& this.imp_moneda_ctz == other.getImp_moneda_ctz() && this.imp_otrib_prov == other.getImp_otrib_prov()
				&& ((this.fecha_cbte_orig == null && other.getFecha_cbte_orig() == null)
						|| (this.fecha_cbte_orig != null && this.fecha_cbte_orig.equals(other.getFecha_cbte_orig())))
				&& ((this.fecha_cbte_cae == null && other.getFecha_cbte_cae() == null)
						|| (this.fecha_cbte_cae != null && this.fecha_cbte_cae.equals(other.getFecha_cbte_cae())))
				&& ((this.fch_venc_Cae == null && other.getFch_venc_Cae() == null)
						|| (this.fch_venc_Cae != null && this.fch_venc_Cae.equals(other.getFch_venc_Cae())))
				&& ((this.cae == null && other.getCae() == null)
						|| (this.cae != null && this.cae.equals(other.getCae())))
				&& ((this.resultado == null && other.getResultado() == null)
						|| (this.resultado != null && this.resultado.equals(other.getResultado())))
				&& ((this.obs == null && other.getObs() == null)
						|| (this.obs != null && this.obs.equals(other.getObs())))
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
		_hashCode += new Long(getCuit()).hashCode();
		_hashCode += getTipo_doc();
		_hashCode += new Long(getNro_doc()).hashCode();
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
		_hashCode += new Double(getImp_otrib_prov()).hashCode();
		if (getFecha_cbte_orig() != null) {
			_hashCode += getFecha_cbte_orig().hashCode();
		}
		if (getFecha_cbte_cae() != null) {
			_hashCode += getFecha_cbte_cae().hashCode();
		}
		if (getFch_venc_Cae() != null) {
			_hashCode += getFch_venc_Cae().hashCode();
		}
		if (getCae() != null) {
			_hashCode += getCae().hashCode();
		}
		if (getResultado() != null) {
			_hashCode += getResultado().hashCode();
		}
		if (getObs() != null) {
			_hashCode += getObs().hashCode();
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
			ClsSEGGetCMPR.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGGetCMPR"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cuit");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Cuit"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipo_doc");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Tipo_doc"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nro_doc");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Nro_doc"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipo_cbte");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Tipo_cbte"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("punto_vta");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Punto_vta"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cbte_nro");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Cbte_nro"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_total");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_total"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_tot_conc");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_tot_conc"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_neto");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_neto"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("impto_liq");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Impto_liq"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("impto_liq_rni");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Impto_liq_rni"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_op_ex");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_op_ex"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_perc");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_perc"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_iibb");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_iibb"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_perc_mun");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_perc_mun"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_internos");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_internos"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_moneda_Id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_moneda_Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_moneda_ctz");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_moneda_ctz"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imp_otrib_prov");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Imp_otrib_prov"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fecha_cbte_orig");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Fecha_cbte_orig"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fecha_cbte_cae");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Fecha_cbte_cae"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fch_venc_Cae");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Fch_venc_Cae"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cae");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Cae"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("resultado");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Resultado"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("obs");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Obs"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("items");
		elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Items"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Item"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Item"));
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
