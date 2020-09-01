/**
 * FECredServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

import java.rmi.Remote;

public interface FECredServicePortType extends Remote {

	/**
	 * Metodo dummy.
	 */
	public DummyResponseType dummy() throws java.rmi.RemoteException;

	/**
	 * Método que permite obtener información sobre los comprobates Emitidos y
	 * Recibidos.
	 */
	public ConsultarComprobantesResponseType consultarComprobantes(ConsultarComprobanteRequestType parameters)
			throws java.rmi.RemoteException;

	/**
	 * Método que permite al Comprador rechazar Notas de Débito / Crédito
	 * individualmente para desafectarlas del cálculo del saldo de la Cta. Cte.
	 * vinculada.
	 */
	public RechazarNotaDCResponseType rechazarNotaDC(RechazarNotaDCRequestType parameters)
			throws java.rmi.RemoteException;

	/**
	 * Método que permite obtener las cuentas corrientes que fueron generadas a
	 * partir de la facturación, que coinciden con los parámetros de búsqueda.
	 */
	public ConsultarCtasCtesResponseType consultarCtasCtes(ConsultarCtasCtesRequestType parameters)
			throws java.rmi.RemoteException;

	/**
	 * Método que permite obtener el detalle y composición de una cuenta corriente.
	 */
	public ConsultarCtaCteResponseType consultarCtaCte(ConsultarCtaCteRequestType parameters)
			throws java.rmi.RemoteException;

	/**
	 * Método por el cual el Comprador informa que le ha cancelado (pagado)
	 * totalmente la deuda al vendedor, debiendo indicar la forma de pago.Solo puede
	 * cancelar las aceptadas dentros de los plazos establecidos
	 */
	public OperacionFECredResponseType informarCancelacionTotalFECred(
			InformarCancelacionTotalFECredRequestType parameters) throws java.rmi.RemoteException;

	/**
	 * Método que permite al Comprador Aceptar el saldo actual de la Cta. Cte. de
	 * una Factura de Crédito pudiendo indicar: pagos parciales, retenciones y/o
	 * embargos.
	 */
	public OperacionFECredResponseType aceptarFECred(AceptarFECredRequestType parameters)
			throws java.rmi.RemoteException;

	/**
	 * Método que permite al Comprador Rechazar la Cta. Cte. de una Factura de
	 * Crédito debiendo indicar el motivo del rechazo.
	 */
	public OperacionFECredResponseType rechazarFECred(RechazarFECredRequestType parameters)
			throws java.rmi.RemoteException;

	/**
	 * Método que permite al Vendedor solicitar la transeferencia (al Agente de
	 * Depósito Colectivo) de la factura de crédito con el saldo resultante de la
	 * cuenta corriente vinculada aceptada por el comprador, debiendo indicar la
	 * Cuenta Comitente.
	 */
	public OperacionFECredResponseType informarFacturaAgtDptoCltv(InformarFacturaAgtDptoCltvRequestType parameters)
			throws java.rmi.RemoteException;

	/**
	 * Método que permite obtener información sobre las transeferencias realizadas
	 * al Agente de Depósito Colectivo.
	 */
	public ConsultarFacturasAgtDptoCltvResponseType consultarFacturasAgtDptoCltv(
			ConsultarFacturasAgtDptoCltvRequestType parameters) throws java.rmi.RemoteException;

	/**
	 * Método que permite al Vendedor consultar sus cuentas comitente
	 */
	public ConsultarCuentasComitenteResponseType consultarCuentasComitente(
			ConsultarCuentasComitenteRequestType parameters) throws java.rmi.RemoteException;

	/**
	 * Método que permite a partir de una CUIT conocer su obligación respecto a la
	 * emisión o recepción de facturas de créditos
	 */
	public ConsultarObligadoRecepcionResponseType consultarObligadoRecepcion(
			ConsultarObligadoRecepcionRequestType parameters) throws java.rmi.RemoteException;

	/**
	 * Método que permite consultar los tipos de retenciones habilitadas con sus
	 * respectivos porcentajes.
	 */
	public ConsultarTiposRetencionesResponseType consultarTiposRetenciones(
			ConsultarCodigoDescripcionRequestType parameters) throws java.rmi.RemoteException;

	/**
	 * Método que permite listar los tipos de motivos de rechazo habilitados para
	 * una cta. cte.
	 */
	public ConsultarCodigoDescripcionResponseType consultarTiposMotivosRechazo(
			ConsultarCodigoDescripcionRequestType parameters) throws java.rmi.RemoteException;

	/**
	 * Método que permite listar los tipos de formas de pago habilitados para una
	 * factura de crédito.
	 */
	public ConsultarCodigoDescripcionResponseType consultarTiposFormasCancelacion(
			ConsultarCodigoDescripcionRequestType parameters) throws java.rmi.RemoteException;

	public ObtenerRemitosResponseType obtenerRemitos(ObtenerRemitosRequestType parameters)
			throws java.rmi.RemoteException;

	public ConsultarHistorialEstadosComprobanteResponseType consultarHistorialEstadosComprobante(
			ConsultarHistorialEstadosComprobanteRequestType parameters) throws java.rmi.RemoteException;

	public ConsultarHistorialEstadosCtaCteResponseType consultarHistorialEstadosCtaCte(
			ConsultarHistorialEstadosCtaCteRequestType parameters) throws java.rmi.RemoteException;

	public ConsultarCodigoDescripcionResponseType consultarTiposAjustesOperacion(
			ConsultarCodigoDescripcionRequestType parameters) throws java.rmi.RemoteException;

	public ConsultarMontoObligadoRecepcionResponseType consultarMontoObligadoRecepcion(
			ConsultarMontoObligadoRecepcionRequestType parameters) throws java.rmi.RemoteException;
}
