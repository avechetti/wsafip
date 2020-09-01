/**
 * Persona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Persona implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4896416699962635231L;

	private Actividad[] actividad;
	private String apellido;
	private Integer cantidadSociosEmpresaMono;
	private Categoria[] categoria;
	private Long[] claveInactivaAsociada;
	private Dependencia dependencia;
	private Domicilio[] domicilio;
	private Email[] email;
	private String estadoClave;
	private java.util.Calendar fechaContratoSocial;
	private java.util.Calendar fechaFallecimiento;
	private java.util.Calendar fechaInscripcion;
	private java.util.Calendar fechaJubilado;
	private java.util.Calendar fechaNacimiento;
	private java.util.Calendar fechaVencimientoMigracion;
	private String formaJuridica;
	private Long idPersona;
	private Impuesto[] impuesto;
	private Integer leyJubilacion;
	private String localidadInscripcion;
	private Integer mesCierre;
	private String nombre;
	private String numeroDocumento;
	private Long numeroInscripcion;
	private String organismoInscripcion;
	private String organismoOriginante;
	private Double porcentajeCapitalNacional;
	private String provinciaInscripcion;
	private String razonSocial;
	private Regimen[] regimen;
	private Relacion[] relacion;
	private String sexo;
	private Telefono[] telefono;
	private String tipoClave;
	private String tipoDocumento;
	private String tipoOrganismoOriginante;
	private String tipoPersona;
	private String tipoResidencia;

	public Persona() {
	}

	public Persona(Actividad[] actividad, String apellido,
			Integer cantidadSociosEmpresaMono, Categoria[] categoria,
			Long[] claveInactivaAsociada, Dependencia dependencia,
			Domicilio[] domicilio, Email[] email,
			String estadoClave, java.util.Calendar fechaContratoSocial, java.util.Calendar fechaFallecimiento,
			java.util.Calendar fechaInscripcion, java.util.Calendar fechaJubilado, java.util.Calendar fechaNacimiento,
			java.util.Calendar fechaVencimientoMigracion, String formaJuridica, Long idPersona,
			Impuesto[] impuesto, Integer leyJubilacion,
			String localidadInscripcion, Integer mesCierre, String nombre,
			String numeroDocumento, Long numeroInscripcion, String organismoInscripcion,
			String organismoOriginante, Double porcentajeCapitalNacional,
			String provinciaInscripcion, String razonSocial,
			Regimen[] regimen, Relacion[] relacion,
			String sexo, Telefono[] telefono, String tipoClave,
			String tipoDocumento, String tipoOrganismoOriginante, String tipoPersona,
			String tipoResidencia) {
		this.actividad = actividad;
		this.apellido = apellido;
		this.cantidadSociosEmpresaMono = cantidadSociosEmpresaMono;
		this.categoria = categoria;
		this.claveInactivaAsociada = claveInactivaAsociada;
		this.dependencia = dependencia;
		this.domicilio = domicilio;
		this.email = email;
		this.estadoClave = estadoClave;
		this.fechaContratoSocial = fechaContratoSocial;
		this.fechaFallecimiento = fechaFallecimiento;
		this.fechaInscripcion = fechaInscripcion;
		this.fechaJubilado = fechaJubilado;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaVencimientoMigracion = fechaVencimientoMigracion;
		this.formaJuridica = formaJuridica;
		this.idPersona = idPersona;
		this.impuesto = impuesto;
		this.leyJubilacion = leyJubilacion;
		this.localidadInscripcion = localidadInscripcion;
		this.mesCierre = mesCierre;
		this.nombre = nombre;
		this.numeroDocumento = numeroDocumento;
		this.numeroInscripcion = numeroInscripcion;
		this.organismoInscripcion = organismoInscripcion;
		this.organismoOriginante = organismoOriginante;
		this.porcentajeCapitalNacional = porcentajeCapitalNacional;
		this.provinciaInscripcion = provinciaInscripcion;
		this.razonSocial = razonSocial;
		this.regimen = regimen;
		this.relacion = relacion;
		this.sexo = sexo;
		this.telefono = telefono;
		this.tipoClave = tipoClave;
		this.tipoDocumento = tipoDocumento;
		this.tipoOrganismoOriginante = tipoOrganismoOriginante;
		this.tipoPersona = tipoPersona;
		this.tipoResidencia = tipoResidencia;
	}

	/**
	 * Gets the actividad value for this Persona.
	 * 
	 * @return actividad
	 */
	public Actividad[] getActividad() {
		return actividad;
	}

	/**
	 * Sets the actividad value for this Persona.
	 * 
	 * @param actividad
	 */
	public void setActividad(Actividad[] actividad) {
		this.actividad = actividad;
	}

	public Actividad getActividad(int i) {
		return this.actividad[i];
	}

	public void setActividad(int i, Actividad _value) {
		this.actividad[i] = _value;
	}

	/**
	 * Gets the apellido value for this Persona.
	 * 
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Sets the apellido value for this Persona.
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Gets the cantidadSociosEmpresaMono value for this Persona.
	 * 
	 * @return cantidadSociosEmpresaMono
	 */
	public Integer getCantidadSociosEmpresaMono() {
		return cantidadSociosEmpresaMono;
	}

	/**
	 * Sets the cantidadSociosEmpresaMono value for this Persona.
	 * 
	 * @param cantidadSociosEmpresaMono
	 */
	public void setCantidadSociosEmpresaMono(Integer cantidadSociosEmpresaMono) {
		this.cantidadSociosEmpresaMono = cantidadSociosEmpresaMono;
	}

	/**
	 * Gets the categoria value for this Persona.
	 * 
	 * @return categoria
	 */
	public Categoria[] getCategoria() {
		return categoria;
	}

	/**
	 * Sets the categoria value for this Persona.
	 * 
	 * @param categoria
	 */
	public void setCategoria(Categoria[] categoria) {
		this.categoria = categoria;
	}

	public Categoria getCategoria(int i) {
		return this.categoria[i];
	}

	public void setCategoria(int i, Categoria _value) {
		this.categoria[i] = _value;
	}

	/**
	 * Gets the claveInactivaAsociada value for this Persona.
	 * 
	 * @return claveInactivaAsociada
	 */
	public Long[] getClaveInactivaAsociada() {
		return claveInactivaAsociada;
	}

	/**
	 * Sets the claveInactivaAsociada value for this Persona.
	 * 
	 * @param claveInactivaAsociada
	 */
	public void setClaveInactivaAsociada(Long[] claveInactivaAsociada) {
		this.claveInactivaAsociada = claveInactivaAsociada;
	}

	public Long getClaveInactivaAsociada(int i) {
		return this.claveInactivaAsociada[i];
	}

	public void setClaveInactivaAsociada(int i, Long _value) {
		this.claveInactivaAsociada[i] = _value;
	}

	/**
	 * Gets the dependencia value for this Persona.
	 * 
	 * @return dependencia
	 */
	public Dependencia getDependencia() {
		return dependencia;
	}

	/**
	 * Sets the dependencia value for this Persona.
	 * 
	 * @param dependencia
	 */
	public void setDependencia(Dependencia dependencia) {
		this.dependencia = dependencia;
	}

	/**
	 * Gets the domicilio value for this Persona.
	 * 
	 * @return domicilio
	 */
	public Domicilio[] getDomicilio() {
		return domicilio;
	}

	/**
	 * Sets the domicilio value for this Persona.
	 * 
	 * @param domicilio
	 */
	public void setDomicilio(Domicilio[] domicilio) {
		this.domicilio = domicilio;
	}

	public Domicilio getDomicilio(int i) {
		return this.domicilio[i];
	}

	public void setDomicilio(int i, Domicilio _value) {
		this.domicilio[i] = _value;
	}

	/**
	 * Gets the email value for this Persona.
	 * 
	 * @return email
	 */
	public Email[] getEmail() {
		return email;
	}

	/**
	 * Sets the email value for this Persona.
	 * 
	 * @param email
	 */
	public void setEmail(Email[] email) {
		this.email = email;
	}

	public Email getEmail(int i) {
		return this.email[i];
	}

	public void setEmail(int i, Email _value) {
		this.email[i] = _value;
	}

	/**
	 * Gets the estadoClave value for this Persona.
	 * 
	 * @return estadoClave
	 */
	public String getEstadoClave() {
		return estadoClave;
	}

	/**
	 * Sets the estadoClave value for this Persona.
	 * 
	 * @param estadoClave
	 */
	public void setEstadoClave(String estadoClave) {
		this.estadoClave = estadoClave;
	}

	/**
	 * Gets the fechaContratoSocial value for this Persona.
	 * 
	 * @return fechaContratoSocial
	 */
	public java.util.Calendar getFechaContratoSocial() {
		return fechaContratoSocial;
	}

	/**
	 * Sets the fechaContratoSocial value for this Persona.
	 * 
	 * @param fechaContratoSocial
	 */
	public void setFechaContratoSocial(java.util.Calendar fechaContratoSocial) {
		this.fechaContratoSocial = fechaContratoSocial;
	}

	/**
	 * Gets the fechaFallecimiento value for this Persona.
	 * 
	 * @return fechaFallecimiento
	 */
	public java.util.Calendar getFechaFallecimiento() {
		return fechaFallecimiento;
	}

	/**
	 * Sets the fechaFallecimiento value for this Persona.
	 * 
	 * @param fechaFallecimiento
	 */
	public void setFechaFallecimiento(java.util.Calendar fechaFallecimiento) {
		this.fechaFallecimiento = fechaFallecimiento;
	}

	/**
	 * Gets the fechaInscripcion value for this Persona.
	 * 
	 * @return fechaInscripcion
	 */
	public java.util.Calendar getFechaInscripcion() {
		return fechaInscripcion;
	}

	/**
	 * Sets the fechaInscripcion value for this Persona.
	 * 
	 * @param fechaInscripcion
	 */
	public void setFechaInscripcion(java.util.Calendar fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	/**
	 * Gets the fechaJubilado value for this Persona.
	 * 
	 * @return fechaJubilado
	 */
	public java.util.Calendar getFechaJubilado() {
		return fechaJubilado;
	}

	/**
	 * Sets the fechaJubilado value for this Persona.
	 * 
	 * @param fechaJubilado
	 */
	public void setFechaJubilado(java.util.Calendar fechaJubilado) {
		this.fechaJubilado = fechaJubilado;
	}

	/**
	 * Gets the fechaNacimiento value for this Persona.
	 * 
	 * @return fechaNacimiento
	 */
	public java.util.Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Sets the fechaNacimiento value for this Persona.
	 * 
	 * @param fechaNacimiento
	 */
	public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Gets the fechaVencimientoMigracion value for this Persona.
	 * 
	 * @return fechaVencimientoMigracion
	 */
	public java.util.Calendar getFechaVencimientoMigracion() {
		return fechaVencimientoMigracion;
	}

	/**
	 * Sets the fechaVencimientoMigracion value for this Persona.
	 * 
	 * @param fechaVencimientoMigracion
	 */
	public void setFechaVencimientoMigracion(java.util.Calendar fechaVencimientoMigracion) {
		this.fechaVencimientoMigracion = fechaVencimientoMigracion;
	}

	/**
	 * Gets the formaJuridica value for this Persona.
	 * 
	 * @return formaJuridica
	 */
	public String getFormaJuridica() {
		return formaJuridica;
	}

	/**
	 * Sets the formaJuridica value for this Persona.
	 * 
	 * @param formaJuridica
	 */
	public void setFormaJuridica(String formaJuridica) {
		this.formaJuridica = formaJuridica;
	}

	/**
	 * Gets the idPersona value for this Persona.
	 * 
	 * @return idPersona
	 */
	public Long getIdPersona() {
		return idPersona;
	}

	/**
	 * Sets the idPersona value for this Persona.
	 * 
	 * @param idPersona
	 */
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * Gets the impuesto value for this Persona.
	 * 
	 * @return impuesto
	 */
	public Impuesto[] getImpuesto() {
		return impuesto;
	}

	/**
	 * Sets the impuesto value for this Persona.
	 * 
	 * @param impuesto
	 */
	public void setImpuesto(Impuesto[] impuesto) {
		this.impuesto = impuesto;
	}

	public Impuesto getImpuesto(int i) {
		return this.impuesto[i];
	}

	public void setImpuesto(int i, Impuesto _value) {
		this.impuesto[i] = _value;
	}

	/**
	 * Gets the leyJubilacion value for this Persona.
	 * 
	 * @return leyJubilacion
	 */
	public Integer getLeyJubilacion() {
		return leyJubilacion;
	}

	/**
	 * Sets the leyJubilacion value for this Persona.
	 * 
	 * @param leyJubilacion
	 */
	public void setLeyJubilacion(Integer leyJubilacion) {
		this.leyJubilacion = leyJubilacion;
	}

	/**
	 * Gets the localidadInscripcion value for this Persona.
	 * 
	 * @return localidadInscripcion
	 */
	public String getLocalidadInscripcion() {
		return localidadInscripcion;
	}

	/**
	 * Sets the localidadInscripcion value for this Persona.
	 * 
	 * @param localidadInscripcion
	 */
	public void setLocalidadInscripcion(String localidadInscripcion) {
		this.localidadInscripcion = localidadInscripcion;
	}

	/**
	 * Gets the mesCierre value for this Persona.
	 * 
	 * @return mesCierre
	 */
	public Integer getMesCierre() {
		return mesCierre;
	}

	/**
	 * Sets the mesCierre value for this Persona.
	 * 
	 * @param mesCierre
	 */
	public void setMesCierre(Integer mesCierre) {
		this.mesCierre = mesCierre;
	}

	/**
	 * Gets the nombre value for this Persona.
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre value for this Persona.
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the numeroDocumento value for this Persona.
	 * 
	 * @return numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * Sets the numeroDocumento value for this Persona.
	 * 
	 * @param numeroDocumento
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Gets the numeroInscripcion value for this Persona.
	 * 
	 * @return numeroInscripcion
	 */
	public Long getNumeroInscripcion() {
		return numeroInscripcion;
	}

	/**
	 * Sets the numeroInscripcion value for this Persona.
	 * 
	 * @param numeroInscripcion
	 */
	public void setNumeroInscripcion(Long numeroInscripcion) {
		this.numeroInscripcion = numeroInscripcion;
	}

	/**
	 * Gets the organismoInscripcion value for this Persona.
	 * 
	 * @return organismoInscripcion
	 */
	public String getOrganismoInscripcion() {
		return organismoInscripcion;
	}

	/**
	 * Sets the organismoInscripcion value for this Persona.
	 * 
	 * @param organismoInscripcion
	 */
	public void setOrganismoInscripcion(String organismoInscripcion) {
		this.organismoInscripcion = organismoInscripcion;
	}

	/**
	 * Gets the organismoOriginante value for this Persona.
	 * 
	 * @return organismoOriginante
	 */
	public String getOrganismoOriginante() {
		return organismoOriginante;
	}

	/**
	 * Sets the organismoOriginante value for this Persona.
	 * 
	 * @param organismoOriginante
	 */
	public void setOrganismoOriginante(String organismoOriginante) {
		this.organismoOriginante = organismoOriginante;
	}

	/**
	 * Gets the porcentajeCapitalNacional value for this Persona.
	 * 
	 * @return porcentajeCapitalNacional
	 */
	public Double getPorcentajeCapitalNacional() {
		return porcentajeCapitalNacional;
	}

	/**
	 * Sets the porcentajeCapitalNacional value for this Persona.
	 * 
	 * @param porcentajeCapitalNacional
	 */
	public void setPorcentajeCapitalNacional(Double porcentajeCapitalNacional) {
		this.porcentajeCapitalNacional = porcentajeCapitalNacional;
	}

	/**
	 * Gets the provinciaInscripcion value for this Persona.
	 * 
	 * @return provinciaInscripcion
	 */
	public String getProvinciaInscripcion() {
		return provinciaInscripcion;
	}

	/**
	 * Sets the provinciaInscripcion value for this Persona.
	 * 
	 * @param provinciaInscripcion
	 */
	public void setProvinciaInscripcion(String provinciaInscripcion) {
		this.provinciaInscripcion = provinciaInscripcion;
	}

	/**
	 * Gets the razonSocial value for this Persona.
	 * 
	 * @return razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * Sets the razonSocial value for this Persona.
	 * 
	 * @param razonSocial
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * Gets the regimen value for this Persona.
	 * 
	 * @return regimen
	 */
	public Regimen[] getRegimen() {
		return regimen;
	}

	/**
	 * Sets the regimen value for this Persona.
	 * 
	 * @param regimen
	 */
	public void setRegimen(Regimen[] regimen) {
		this.regimen = regimen;
	}

	public Regimen getRegimen(int i) {
		return this.regimen[i];
	}

	public void setRegimen(int i, Regimen _value) {
		this.regimen[i] = _value;
	}

	/**
	 * Gets the relacion value for this Persona.
	 * 
	 * @return relacion
	 */
	public Relacion[] getRelacion() {
		return relacion;
	}

	/**
	 * Sets the relacion value for this Persona.
	 * 
	 * @param relacion
	 */
	public void setRelacion(Relacion[] relacion) {
		this.relacion = relacion;
	}

	public Relacion getRelacion(int i) {
		return this.relacion[i];
	}

	public void setRelacion(int i, Relacion _value) {
		this.relacion[i] = _value;
	}

	/**
	 * Gets the sexo value for this Persona.
	 * 
	 * @return sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Sets the sexo value for this Persona.
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Gets the telefono value for this Persona.
	 * 
	 * @return telefono
	 */
	public Telefono[] getTelefono() {
		return telefono;
	}

	/**
	 * Sets the telefono value for this Persona.
	 * 
	 * @param telefono
	 */
	public void setTelefono(Telefono[] telefono) {
		this.telefono = telefono;
	}

	public Telefono getTelefono(int i) {
		return this.telefono[i];
	}

	public void setTelefono(int i, Telefono _value) {
		this.telefono[i] = _value;
	}

	/**
	 * Gets the tipoClave value for this Persona.
	 * 
	 * @return tipoClave
	 */
	public String getTipoClave() {
		return tipoClave;
	}

	/**
	 * Sets the tipoClave value for this Persona.
	 * 
	 * @param tipoClave
	 */
	public void setTipoClave(String tipoClave) {
		this.tipoClave = tipoClave;
	}

	/**
	 * Gets the tipoDocumento value for this Persona.
	 * 
	 * @return tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * Sets the tipoDocumento value for this Persona.
	 * 
	 * @param tipoDocumento
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * Gets the tipoOrganismoOriginante value for this Persona.
	 * 
	 * @return tipoOrganismoOriginante
	 */
	public String getTipoOrganismoOriginante() {
		return tipoOrganismoOriginante;
	}

	/**
	 * Sets the tipoOrganismoOriginante value for this Persona.
	 * 
	 * @param tipoOrganismoOriginante
	 */
	public void setTipoOrganismoOriginante(String tipoOrganismoOriginante) {
		this.tipoOrganismoOriginante = tipoOrganismoOriginante;
	}

	/**
	 * Gets the tipoPersona value for this Persona.
	 * 
	 * @return tipoPersona
	 */
	public String getTipoPersona() {
		return tipoPersona;
	}

	/**
	 * Sets the tipoPersona value for this Persona.
	 * 
	 * @param tipoPersona
	 */
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	/**
	 * Gets the tipoResidencia value for this Persona.
	 * 
	 * @return tipoResidencia
	 */
	public String getTipoResidencia() {
		return tipoResidencia;
	}

	/**
	 * Sets the tipoResidencia value for this Persona.
	 * 
	 * @param tipoResidencia
	 */
	public void setTipoResidencia(String tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

	private Object __equalsCalc = null;

	public synchronized boolean equals(Object obj) {
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.actividad == null && other.getActividad() == null)
						|| (this.actividad != null && java.util.Arrays.equals(this.actividad, other.getActividad())))
				&& ((this.apellido == null && other.getApellido() == null)
						|| (this.apellido != null && this.apellido.equals(other.getApellido())))
				&& ((this.cantidadSociosEmpresaMono == null && other.getCantidadSociosEmpresaMono() == null)
						|| (this.cantidadSociosEmpresaMono != null
								&& this.cantidadSociosEmpresaMono.equals(other.getCantidadSociosEmpresaMono())))
				&& ((this.categoria == null && other.getCategoria() == null)
						|| (this.categoria != null && java.util.Arrays.equals(this.categoria, other.getCategoria())))
				&& ((this.claveInactivaAsociada == null && other.getClaveInactivaAsociada() == null)
						|| (this.claveInactivaAsociada != null && java.util.Arrays.equals(this.claveInactivaAsociada,
								other.getClaveInactivaAsociada())))
				&& ((this.dependencia == null && other.getDependencia() == null)
						|| (this.dependencia != null && this.dependencia.equals(other.getDependencia())))
				&& ((this.domicilio == null && other.getDomicilio() == null)
						|| (this.domicilio != null && java.util.Arrays.equals(this.domicilio, other.getDomicilio())))
				&& ((this.email == null && other.getEmail() == null)
						|| (this.email != null && java.util.Arrays.equals(this.email, other.getEmail())))
				&& ((this.estadoClave == null && other.getEstadoClave() == null)
						|| (this.estadoClave != null && this.estadoClave.equals(other.getEstadoClave())))
				&& ((this.fechaContratoSocial == null && other.getFechaContratoSocial() == null)
						|| (this.fechaContratoSocial != null
								&& this.fechaContratoSocial.equals(other.getFechaContratoSocial())))
				&& ((this.fechaFallecimiento == null && other.getFechaFallecimiento() == null)
						|| (this.fechaFallecimiento != null
								&& this.fechaFallecimiento.equals(other.getFechaFallecimiento())))
				&& ((this.fechaInscripcion == null && other.getFechaInscripcion() == null)
						|| (this.fechaInscripcion != null && this.fechaInscripcion.equals(other.getFechaInscripcion())))
				&& ((this.fechaJubilado == null && other.getFechaJubilado() == null)
						|| (this.fechaJubilado != null && this.fechaJubilado.equals(other.getFechaJubilado())))
				&& ((this.fechaNacimiento == null && other.getFechaNacimiento() == null)
						|| (this.fechaNacimiento != null && this.fechaNacimiento.equals(other.getFechaNacimiento())))
				&& ((this.fechaVencimientoMigracion == null && other.getFechaVencimientoMigracion() == null)
						|| (this.fechaVencimientoMigracion != null
								&& this.fechaVencimientoMigracion.equals(other.getFechaVencimientoMigracion())))
				&& ((this.formaJuridica == null && other.getFormaJuridica() == null)
						|| (this.formaJuridica != null && this.formaJuridica.equals(other.getFormaJuridica())))
				&& ((this.idPersona == null && other.getIdPersona() == null)
						|| (this.idPersona != null && this.idPersona.equals(other.getIdPersona())))
				&& ((this.impuesto == null && other.getImpuesto() == null)
						|| (this.impuesto != null && java.util.Arrays.equals(this.impuesto, other.getImpuesto())))
				&& ((this.leyJubilacion == null && other.getLeyJubilacion() == null)
						|| (this.leyJubilacion != null && this.leyJubilacion.equals(other.getLeyJubilacion())))
				&& ((this.localidadInscripcion == null && other.getLocalidadInscripcion() == null)
						|| (this.localidadInscripcion != null
								&& this.localidadInscripcion.equals(other.getLocalidadInscripcion())))
				&& ((this.mesCierre == null && other.getMesCierre() == null)
						|| (this.mesCierre != null && this.mesCierre.equals(other.getMesCierre())))
				&& ((this.nombre == null && other.getNombre() == null)
						|| (this.nombre != null && this.nombre.equals(other.getNombre())))
				&& ((this.numeroDocumento == null && other.getNumeroDocumento() == null)
						|| (this.numeroDocumento != null && this.numeroDocumento.equals(other.getNumeroDocumento())))
				&& ((this.numeroInscripcion == null && other.getNumeroInscripcion() == null)
						|| (this.numeroInscripcion != null
								&& this.numeroInscripcion.equals(other.getNumeroInscripcion())))
				&& ((this.organismoInscripcion == null && other.getOrganismoInscripcion() == null)
						|| (this.organismoInscripcion != null
								&& this.organismoInscripcion.equals(other.getOrganismoInscripcion())))
				&& ((this.organismoOriginante == null && other.getOrganismoOriginante() == null)
						|| (this.organismoOriginante != null
								&& this.organismoOriginante.equals(other.getOrganismoOriginante())))
				&& ((this.porcentajeCapitalNacional == null && other.getPorcentajeCapitalNacional() == null)
						|| (this.porcentajeCapitalNacional != null
								&& this.porcentajeCapitalNacional.equals(other.getPorcentajeCapitalNacional())))
				&& ((this.provinciaInscripcion == null && other.getProvinciaInscripcion() == null)
						|| (this.provinciaInscripcion != null
								&& this.provinciaInscripcion.equals(other.getProvinciaInscripcion())))
				&& ((this.razonSocial == null && other.getRazonSocial() == null)
						|| (this.razonSocial != null && this.razonSocial.equals(other.getRazonSocial())))
				&& ((this.regimen == null && other.getRegimen() == null)
						|| (this.regimen != null && java.util.Arrays.equals(this.regimen, other.getRegimen())))
				&& ((this.relacion == null && other.getRelacion() == null)
						|| (this.relacion != null && java.util.Arrays.equals(this.relacion, other.getRelacion())))
				&& ((this.sexo == null && other.getSexo() == null)
						|| (this.sexo != null && this.sexo.equals(other.getSexo())))
				&& ((this.telefono == null && other.getTelefono() == null)
						|| (this.telefono != null && java.util.Arrays.equals(this.telefono, other.getTelefono())))
				&& ((this.tipoClave == null && other.getTipoClave() == null)
						|| (this.tipoClave != null && this.tipoClave.equals(other.getTipoClave())))
				&& ((this.tipoDocumento == null && other.getTipoDocumento() == null)
						|| (this.tipoDocumento != null && this.tipoDocumento.equals(other.getTipoDocumento())))
				&& ((this.tipoOrganismoOriginante == null && other.getTipoOrganismoOriginante() == null)
						|| (this.tipoOrganismoOriginante != null
								&& this.tipoOrganismoOriginante.equals(other.getTipoOrganismoOriginante())))
				&& ((this.tipoPersona == null && other.getTipoPersona() == null)
						|| (this.tipoPersona != null && this.tipoPersona.equals(other.getTipoPersona())))
				&& ((this.tipoResidencia == null && other.getTipoResidencia() == null)
						|| (this.tipoResidencia != null && this.tipoResidencia.equals(other.getTipoResidencia())));
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
		if (getActividad() != null) {
			for (int i = 0; i < Array.getLength(getActividad()); i++) {
				Object obj = Array.get(getActividad(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getApellido() != null) {
			_hashCode += getApellido().hashCode();
		}
		if (getCantidadSociosEmpresaMono() != null) {
			_hashCode += getCantidadSociosEmpresaMono().hashCode();
		}
		if (getCategoria() != null) {
			for (int i = 0; i < Array.getLength(getCategoria()); i++) {
				Object obj = Array.get(getCategoria(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getClaveInactivaAsociada() != null) {
			for (int i = 0; i < Array.getLength(getClaveInactivaAsociada()); i++) {
				Object obj = Array.get(getClaveInactivaAsociada(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDependencia() != null) {
			_hashCode += getDependencia().hashCode();
		}
		if (getDomicilio() != null) {
			for (int i = 0; i < Array.getLength(getDomicilio()); i++) {
				Object obj = Array.get(getDomicilio(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getEmail() != null) {
			for (int i = 0; i < Array.getLength(getEmail()); i++) {
				Object obj = Array.get(getEmail(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getEstadoClave() != null) {
			_hashCode += getEstadoClave().hashCode();
		}
		if (getFechaContratoSocial() != null) {
			_hashCode += getFechaContratoSocial().hashCode();
		}
		if (getFechaFallecimiento() != null) {
			_hashCode += getFechaFallecimiento().hashCode();
		}
		if (getFechaInscripcion() != null) {
			_hashCode += getFechaInscripcion().hashCode();
		}
		if (getFechaJubilado() != null) {
			_hashCode += getFechaJubilado().hashCode();
		}
		if (getFechaNacimiento() != null) {
			_hashCode += getFechaNacimiento().hashCode();
		}
		if (getFechaVencimientoMigracion() != null) {
			_hashCode += getFechaVencimientoMigracion().hashCode();
		}
		if (getFormaJuridica() != null) {
			_hashCode += getFormaJuridica().hashCode();
		}
		if (getIdPersona() != null) {
			_hashCode += getIdPersona().hashCode();
		}
		if (getImpuesto() != null) {
			for (int i = 0; i < Array.getLength(getImpuesto()); i++) {
				Object obj = Array.get(getImpuesto(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getLeyJubilacion() != null) {
			_hashCode += getLeyJubilacion().hashCode();
		}
		if (getLocalidadInscripcion() != null) {
			_hashCode += getLocalidadInscripcion().hashCode();
		}
		if (getMesCierre() != null) {
			_hashCode += getMesCierre().hashCode();
		}
		if (getNombre() != null) {
			_hashCode += getNombre().hashCode();
		}
		if (getNumeroDocumento() != null) {
			_hashCode += getNumeroDocumento().hashCode();
		}
		if (getNumeroInscripcion() != null) {
			_hashCode += getNumeroInscripcion().hashCode();
		}
		if (getOrganismoInscripcion() != null) {
			_hashCode += getOrganismoInscripcion().hashCode();
		}
		if (getOrganismoOriginante() != null) {
			_hashCode += getOrganismoOriginante().hashCode();
		}
		if (getPorcentajeCapitalNacional() != null) {
			_hashCode += getPorcentajeCapitalNacional().hashCode();
		}
		if (getProvinciaInscripcion() != null) {
			_hashCode += getProvinciaInscripcion().hashCode();
		}
		if (getRazonSocial() != null) {
			_hashCode += getRazonSocial().hashCode();
		}
		if (getRegimen() != null) {
			for (int i = 0; i < Array.getLength(getRegimen()); i++) {
				Object obj = Array.get(getRegimen(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getRelacion() != null) {
			for (int i = 0; i < Array.getLength(getRelacion()); i++) {
				Object obj = Array.get(getRelacion(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSexo() != null) {
			_hashCode += getSexo().hashCode();
		}
		if (getTelefono() != null) {
			for (int i = 0; i < Array.getLength(getTelefono()); i++) {
				Object obj = Array.get(getTelefono(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getTipoClave() != null) {
			_hashCode += getTipoClave().hashCode();
		}
		if (getTipoDocumento() != null) {
			_hashCode += getTipoDocumento().hashCode();
		}
		if (getTipoOrganismoOriginante() != null) {
			_hashCode += getTipoOrganismoOriginante().hashCode();
		}
		if (getTipoPersona() != null) {
			_hashCode += getTipoPersona().hashCode();
		}
		if (getTipoResidencia() != null) {
			_hashCode += getTipoResidencia().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Persona.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "persona"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("actividad");
		elemField.setXmlName(new javax.xml.namespace.QName("", "actividad"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "actividad"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("apellido");
		elemField.setXmlName(new javax.xml.namespace.QName("", "apellido"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cantidadSociosEmpresaMono");
		elemField.setXmlName(new javax.xml.namespace.QName("", "cantidadSociosEmpresaMono"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("categoria");
		elemField.setXmlName(new javax.xml.namespace.QName("", "categoria"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "categoria"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("claveInactivaAsociada");
		elemField.setXmlName(new javax.xml.namespace.QName("", "claveInactivaAsociada"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dependencia");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dependencia"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "dependencia"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("domicilio");
		elemField.setXmlName(new javax.xml.namespace.QName("", "domicilio"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "domicilio"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("email");
		elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "email"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("estadoClave");
		elemField.setXmlName(new javax.xml.namespace.QName("", "estadoClave"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fechaContratoSocial");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fechaContratoSocial"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fechaFallecimiento");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fechaFallecimiento"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fechaInscripcion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fechaInscripcion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fechaJubilado");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fechaJubilado"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fechaNacimiento");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fechaNacimiento"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fechaVencimientoMigracion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fechaVencimientoMigracion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("formaJuridica");
		elemField.setXmlName(new javax.xml.namespace.QName("", "formaJuridica"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
		elemField.setFieldName("impuesto");
		elemField.setXmlName(new javax.xml.namespace.QName("", "impuesto"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "impuesto"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leyJubilacion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "leyJubilacion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("localidadInscripcion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "localidadInscripcion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mesCierre");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mesCierre"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nombre");
		elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numeroDocumento");
		elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDocumento"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numeroInscripcion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "numeroInscripcion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("organismoInscripcion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "organismoInscripcion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("organismoOriginante");
		elemField.setXmlName(new javax.xml.namespace.QName("", "organismoOriginante"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("porcentajeCapitalNacional");
		elemField.setXmlName(new javax.xml.namespace.QName("", "porcentajeCapitalNacional"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("provinciaInscripcion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "provinciaInscripcion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("razonSocial");
		elemField.setXmlName(new javax.xml.namespace.QName("", "razonSocial"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("regimen");
		elemField.setXmlName(new javax.xml.namespace.QName("", "regimen"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "regimen"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("relacion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "relacion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "relacion"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sexo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "sexo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("telefono");
		elemField.setXmlName(new javax.xml.namespace.QName("", "telefono"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://a4.soap.ws.server.puc.sr/", "telefono"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipoClave");
		elemField.setXmlName(new javax.xml.namespace.QName("", "tipoClave"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipoDocumento");
		elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipoOrganismoOriginante");
		elemField.setXmlName(new javax.xml.namespace.QName("", "tipoOrganismoOriginante"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipoPersona");
		elemField.setXmlName(new javax.xml.namespace.QName("", "tipoPersona"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipoResidencia");
		elemField.setXmlName(new javax.xml.namespace.QName("", "tipoResidencia"));
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
	public static org.apache.axis.encoding.Serializer getSerializer(String mechType,
			Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(String mechType,
			Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

	@Override
	public String toString() {
		return "Persona [actividad=" + Arrays.toString(actividad) + ", apellido=" + apellido
				+ ", cantidadSociosEmpresaMono=" + cantidadSociosEmpresaMono + ", categoria="
				+ Arrays.toString(categoria) + ", claveInactivaAsociada=" + Arrays.toString(claveInactivaAsociada)
				+ ", dependencia=" + dependencia + ", domicilio=" + Arrays.toString(domicilio) + ", email="
				+ Arrays.toString(email) + ", estadoClave=" + estadoClave + ", fechaContratoSocial="
				+ fechaContratoSocial + ", fechaFallecimiento=" + fechaFallecimiento + ", fechaInscripcion="
				+ fechaInscripcion + ", fechaJubilado=" + fechaJubilado + ", fechaNacimiento=" + fechaNacimiento
				+ ", fechaVencimientoMigracion=" + fechaVencimientoMigracion + ", formaJuridica=" + formaJuridica
				+ ", idPersona=" + idPersona + ", impuesto=" + Arrays.toString(impuesto) + ", leyJubilacion="
				+ leyJubilacion + ", localidadInscripcion=" + localidadInscripcion + ", mesCierre=" + mesCierre
				+ ", nombre=" + nombre + ", numeroDocumento=" + numeroDocumento + ", numeroInscripcion="
				+ numeroInscripcion + ", organismoInscripcion=" + organismoInscripcion + ", organismoOriginante="
				+ organismoOriginante + ", porcentajeCapitalNacional=" + porcentajeCapitalNacional
				+ ", provinciaInscripcion=" + provinciaInscripcion + ", razonSocial=" + razonSocial + ", regimen="
				+ Arrays.toString(regimen) + ", relacion=" + Arrays.toString(relacion) + ", sexo=" + sexo
				+ ", telefono=" + Arrays.toString(telefono) + ", tipoClave=" + tipoClave + ", tipoDocumento="
				+ tipoDocumento + ", tipoOrganismoOriginante=" + tipoOrganismoOriginante + ", tipoPersona="
				+ tipoPersona + ", tipoResidencia=" + tipoResidencia + "]";
	}
	
	
	

}
