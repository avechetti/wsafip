/**
 * FECredServiceSOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Vector;

import javax.xml.namespace.QName;

import org.apache.axis.AxisEngine;
import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;

public class FECredServiceSOAPStub extends Stub implements FECredServicePortType {
	private Vector cachedSerClasses = new Vector();
	private Vector cachedSerQNames = new Vector();
	private Vector cachedSerFactories = new Vector();
	private Vector cachedDeserFactories = new Vector();

	static OperationDesc[] _operations;

	static {
		_operations = new OperationDesc[20];
		_initOperationDesc1();
		_initOperationDesc2();
	}

	private static void _initOperationDesc1() {
		OperationDesc oper;
		ParameterDesc param;
		oper = new OperationDesc();
		oper.setName("dummy");
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/", "DummyResponseType"));
		oper.setReturnClass(DummyResponseType.class);
		oper.setReturnQName(new QName("http://ar.gob.afip.wsfecred/FECredService/", "dummyResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[0] = oper;

		oper = new OperationDesc();
		oper.setName("consultarComprobantes");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarComprobantesRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarComprobanteRequestType"),
				ConsultarComprobanteRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarComprobantesResponseType"));
		oper.setReturnClass(ConsultarComprobantesResponseType.class);
		oper.setReturnQName(new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarComprobantesResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[1] = oper;

		oper = new OperationDesc();
		oper.setName("rechazarFECred");
		param = new ParameterDesc(new QName("http://ar.gob.afip.wsfecred/FECredService/", "rechazarFECredRequest"),
				ParameterDesc.IN, new QName("http://ar.gob.afip.wsfecred/FECredService/", "RechazarFECredRequestType"),
				RechazarFECredRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/", "OperacionFECredResponseType"));
		oper.setReturnClass(OperacionFECredResponseType.class);
		oper.setReturnQName(new QName("http://ar.gob.afip.wsfecred/FECredService/", "rechazarFECredResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[2] = oper;

		oper = new OperationDesc();
		oper.setName("consultarCtasCtes");
		param = new ParameterDesc(new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarCtasCtesRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtasCtesRequestType"),
				ConsultarCtasCtesRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtasCtesResponseType"));
		oper.setReturnClass(ConsultarCtasCtesResponseType.class);
		oper.setReturnQName(new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarCtasCtesResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[3] = oper;

		oper = new OperationDesc();
		oper.setName("rechazarNotaDC");
		param = new ParameterDesc(new QName("http://ar.gob.afip.wsfecred/FECredService/", "rechazarNotaDCRequest"),
				ParameterDesc.IN, new QName("http://ar.gob.afip.wsfecred/FECredService/", "RechazarNotaDCRequestType"),
				RechazarNotaDCRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/", "RechazarNotaDCResponseType"));
		oper.setReturnClass(RechazarNotaDCResponseType.class);
		oper.setReturnQName(new QName("http://ar.gob.afip.wsfecred/FECredService/", "rechazarNotaDCResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[4] = oper;

		oper = new OperationDesc();
		oper.setName("informarFacturaAgtDptoCltv");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "informarFacturaAgtDptoCltvRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "InformarFacturaAgtDptoCltvRequestType"),
				InformarFacturaAgtDptoCltvRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/", "OperacionFECredResponseType"));
		oper.setReturnClass(OperacionFECredResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "informarFacturaAgtDptoCltvResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[5] = oper;

		oper = new OperationDesc();
		oper.setName("consultarTiposRetenciones");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarTiposRetencionesRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionRequestType"),
				ConsultarCodigoDescripcionRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarTiposRetencionesResponseType"));
		oper.setReturnClass(ConsultarTiposRetencionesResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarTiposRetencionesResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[6] = oper;

		oper = new OperationDesc();
		oper.setName("consultarObligadoRecepcion");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarObligadoRecepcionRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarObligadoRecepcionRequestType"),
				ConsultarObligadoRecepcionRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarObligadoRecepcionResponseType"));
		oper.setReturnClass(ConsultarObligadoRecepcionResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarObligadoRecepcionResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[7] = oper;

		oper = new OperationDesc();
		oper.setName("consultarFacturasAgtDptoCltv");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarFacturasAgtDptoCltvRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarFacturasAgtDptoCltvRequestType"),
				ConsultarFacturasAgtDptoCltvRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarFacturasAgtDptoCltvResponseType"));
		oper.setReturnClass(ConsultarFacturasAgtDptoCltvResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarFacturasAgtDptoCltvResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[8] = oper;

		oper = new OperationDesc();
		oper.setName("informarCancelacionTotalFECred");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "informarCancelacionTotalFECredRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "InformarCancelacionTotalFECredRequestType"),
				InformarCancelacionTotalFECredRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/", "OperacionFECredResponseType"));
		oper.setReturnClass(OperacionFECredResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "informarCancelacionTotalFECredResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[9] = oper;

	}

	private static void _initOperationDesc2() {
		OperationDesc oper;
		ParameterDesc param;
		oper = new OperationDesc();
		oper.setName("consultarTiposMotivosRechazo");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarTiposMotivosRechazoRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionRequestType"),
				ConsultarCodigoDescripcionRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionResponseType"));
		oper.setReturnClass(ConsultarCodigoDescripcionResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarTiposMotivosRechazoResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[10] = oper;

		oper = new OperationDesc();
		oper.setName("consultarTiposFormasCancelacion");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarTiposFormasCancelacionRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionRequestType"),
				ConsultarCodigoDescripcionRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionResponseType"));
		oper.setReturnClass(ConsultarCodigoDescripcionResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarTiposFormasCancelacionResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[11] = oper;

		oper = new OperationDesc();
		oper.setName("aceptarFECred");
		param = new ParameterDesc(new QName("http://ar.gob.afip.wsfecred/FECredService/", "aceptarFECredRequest"),
				ParameterDesc.IN, new QName("http://ar.gob.afip.wsfecred/FECredService/", "AceptarFECredRequestType"),
				AceptarFECredRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/", "OperacionFECredResponseType"));
		oper.setReturnClass(OperacionFECredResponseType.class);
		oper.setReturnQName(new QName("http://ar.gob.afip.wsfecred/FECredService/", "aceptarFECredResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[12] = oper;

		oper = new OperationDesc();
		oper.setName("consultarCtaCte");
		param = new ParameterDesc(new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarCtaCteRequest"),
				ParameterDesc.IN, new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtaCteRequestType"),
				ConsultarCtaCteRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtaCteResponseType"));
		oper.setReturnClass(ConsultarCtaCteResponseType.class);
		oper.setReturnQName(new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarCtaCteResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[13] = oper;

		oper = new OperationDesc();
		oper.setName("consultarCuentasComitente");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarCuentasComitenteRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCuentasComitenteRequestType"),
				ConsultarCuentasComitenteRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCuentasComitenteResponseType"));
		oper.setReturnClass(ConsultarCuentasComitenteResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarCuentasComitenteResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[14] = oper;

		oper = new OperationDesc();
		oper.setName("obtenerRemitos");
		param = new ParameterDesc(new QName("http://ar.gob.afip.wsfecred/FECredService/", "obtenerRemitosRequest"),
				ParameterDesc.IN, new QName("http://ar.gob.afip.wsfecred/FECredService/", "ObtenerRemitosRequestType"),
				ObtenerRemitosRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/", "ObtenerRemitosResponseType"));
		oper.setReturnClass(ObtenerRemitosResponseType.class);
		oper.setReturnQName(new QName("http://ar.gob.afip.wsfecred/FECredService/", "obtenerRemitosResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[15] = oper;

		oper = new OperationDesc();
		oper.setName("consultarHistorialEstadosComprobante");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarHistorialEstadosComprobanteRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/",
						"ConsultarHistorialEstadosComprobanteRequestType"),
				ConsultarHistorialEstadosComprobanteRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarHistorialEstadosComprobanteResponseType"));
		oper.setReturnClass(ConsultarHistorialEstadosComprobanteResponseType.class);
		oper.setReturnQName(new QName("http://ar.gob.afip.wsfecred/FECredService/",
				"consultarHistorialEstadosComprobanteResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[16] = oper;

		oper = new OperationDesc();
		oper.setName("consultarHistorialEstadosCtaCte");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarHistorialEstadosCtaCteRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarHistorialEstadosCtaCteRequestType"),
				ConsultarHistorialEstadosCtaCteRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarHistorialEstadosCtaCteResponseType"));
		oper.setReturnClass(ConsultarHistorialEstadosCtaCteResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarHistorialEstadosCtaCteResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[17] = oper;

		oper = new OperationDesc();
		oper.setName("consultarTiposAjustesOperacion");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarTiposAjustesOperacionRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionRequestType"),
				ConsultarCodigoDescripcionRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionResponseType"));
		oper.setReturnClass(ConsultarCodigoDescripcionResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarTiposAjustesOperacionResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[18] = oper;

		oper = new OperationDesc();
		oper.setName("consultarMontoObligadoRecepcion");
		param = new ParameterDesc(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarMontoObligadoRecepcionRequest"),
				ParameterDesc.IN,
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarMontoObligadoRecepcionRequestType"),
				ConsultarMontoObligadoRecepcionRequestType.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarMontoObligadoRecepcionResponseType"));
		oper.setReturnClass(ConsultarMontoObligadoRecepcionResponseType.class);
		oper.setReturnQName(
				new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarMontoObligadoRecepcionResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[19] = oper;

	}

	public FECredServiceSOAPStub() throws AxisFault {
		this(null);
	}

	public FECredServiceSOAPStub(URL endpointURL, Service service) throws AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public FECredServiceSOAPStub(Service service) throws AxisFault {
		if (service == null) {
			super.service = new Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
		java.lang.Class cls;
		QName qName;
		QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		addBindings0();
		addBindings1();
	}

	private void addBindings0() {
		java.lang.Class cls;
		QName qName;
		QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "AceptarFECredRequestType");
		cachedSerQNames.add(qName);
		cls = AceptarFECredRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "AjusteOperacionType");
		cachedSerQNames.add(qName);
		cls = AjusteOperacionType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayAjustesOperacionType");
		cachedSerQNames.add(qName);
		cls = AjusteOperacionType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "AjusteOperacionType");
		qName2 = new QName("", "ajuste");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayCodigosDescripcionesStringType");
		cachedSerQNames.add(qName);
		cls = CodigoDescripcionStringType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "CodigoDescripcionStringType");
		qName2 = new QName("", "codigoDescripcionString");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayCodigosDescripcionesType");
		cachedSerQNames.add(qName);
		cls = CodigoDescripcionType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "CodigoDescripcionType");
		qName2 = new QName("", "codigoDescripcion");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayComprobantesType");
		cachedSerQNames.add(qName);
		cls = ComprobanteType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ComprobanteType");
		qName2 = new QName("", "comprobante");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayConfirmarNotasType");
		cachedSerQNames.add(qName);
		cls = ConfirmarNotaDCType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConfirmarNotaDCType");
		qName2 = new QName("", "confirmarNota");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayCtasComitenteType");
		cachedSerQNames.add(qName);
		cls = CuentaComitenteType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "CuentaComitenteType");
		qName2 = new QName("", "ctaComitente");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayFacturasAgtDptoCltvType");
		cachedSerQNames.add(qName);
		cls = FacturaInformadaAgtDptoCltvType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "FacturaInformadaAgtDptoCltvType");
		qName2 = new QName("", "facturaInformada");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayHistorialEstadosComprobanteType");
		cachedSerQNames.add(qName);
		cls = EstadoCmpType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "EstadoCmpType");
		qName2 = new QName("", "estadoHistorico");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayHistorialEstadosCtaCteType");
		cachedSerQNames.add(qName);
		cls = EstadoCtaCteType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "EstadoCtaCteType");
		qName2 = new QName("", "estadoHistorico");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayIdsComprobantesType");
		cachedSerQNames.add(qName);
		cls = IdComprobanteType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "IdComprobanteType");
		qName2 = new QName("", "idsComprobantes");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayInfosCtaCteType");
		cachedSerQNames.add(qName);
		cls = InfoCtaCteType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "InfoCtaCteType");
		qName2 = new QName("", "infoCtaCte");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayItemsType");
		cachedSerQNames.add(qName);
		cls = ItemType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ItemType");
		qName2 = new QName("", "item");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayMotivosRechazoType");
		cachedSerQNames.add(qName);
		cls = MotivoRechazoType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "MotivoRechazoType");
		qName2 = new QName("", "motivoRechazo");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayOtrosTributosType");
		cachedSerQNames.add(qName);
		cls = OtroTributoType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "OtroTributoType");
		qName2 = new QName("", "otroTributo");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayRetencionesType");
		cachedSerQNames.add(qName);
		cls = RetencionType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "RetencionType");
		qName2 = new QName("", "retencion");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArraySubtotalesIVAType");
		cachedSerQNames.add(qName);
		cls = SubtotalIVAType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "SubtotalIVAType");
		qName2 = new QName("", "subtotalIVA");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayTexto250SimpleType");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "Texto250SimpleType");
		qName2 = new QName("", "texto");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ArrayTiposRetencionesType");
		cachedSerQNames.add(qName);
		cls = TipoRetencionType[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "TipoRetencionType");
		qName2 = new QName("", "tipoRetencion");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "AuthRequestType");
		cachedSerQNames.add(qName);
		cls = AuthRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "CBUSimpleType");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "CodigoDescripcionStringType");
		cachedSerQNames.add(qName);
		cls = CodigoDescripcionStringType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "CodigoDescripcionType");
		cachedSerQNames.add(qName);
		cls = CodigoDescripcionType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ComprobanteType");
		cachedSerQNames.add(qName);
		cls = ComprobanteType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConfirmarNotaDCType");
		cachedSerQNames.add(qName);
		cls = ConfirmarNotaDCType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCmpReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarCmpReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarCodigoDescripcionRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarCodigoDescripcionResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCodigoDescripcionReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarCodigoDescripcionReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarComprobanteRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarComprobanteRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarComprobantesResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarComprobantesResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtaCteRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarCtaCteRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtaCteResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarCtaCteResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtaCteReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarCtaCteReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtasCtesRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarCtasCtesRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtasCtesResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarCtasCtesResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCtasCtesReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarCtasCtesReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCuentasComitenteRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarCuentasComitenteRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCuentasComitenteResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarCuentasComitenteResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarCuentasComitenteReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarCuentasComitenteReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarFacturasAgtDptoCltvRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarFacturasAgtDptoCltvRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarFacturasAgtDptoCltvResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarFacturasAgtDptoCltvResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarFacturasAgtDptoCltvReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarFacturasAgtDptoCltvReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarHistorialEstadosComprobanteRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarHistorialEstadosComprobanteRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarHistorialEstadosComprobanteResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarHistorialEstadosComprobanteResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/",
				"ConsultarHistorialEstadosComprobanteReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarHistorialEstadosComprobanteReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarHistorialEstadosCtaCteRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarHistorialEstadosCtaCteRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarHistorialEstadosCtaCteResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarHistorialEstadosCtaCteResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarHistorialEstadosCtaCteReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarHistorialEstadosCtaCteReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarMontoObligadoRecepcionRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarMontoObligadoRecepcionRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarMontoObligadoRecepcionResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarMontoObligadoRecepcionResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarMontoObligadoRecepcionReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarMontoObligadoRecepcionReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarObligadoRecepcionRequestType");
		cachedSerQNames.add(qName);
		cls = ConsultarObligadoRecepcionRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarObligadoRecepcionResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarObligadoRecepcionResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "consultarObligadoRecepcionReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarObligadoRecepcionReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarTiposRetencionesResponseType");
		cachedSerQNames.add(qName);
		cls = ConsultarTiposRetencionesResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ConsultarTiposRetencionesReturnType");
		cachedSerQNames.add(qName);
		cls = ConsultarTiposRetencionesReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "CuentaComitenteType");
		cachedSerQNames.add(qName);
		cls = CuentaComitenteType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "CuentaCorrienteType");
		cachedSerQNames.add(qName);
		cls = CuentaCorrienteType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "CuitSimpleType");
		cachedSerQNames.add(qName);
		cls = long.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "DecimalSimpleType");
		cachedSerQNames.add(qName);
		cls = java.math.BigDecimal.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "DummyResponseType");
		cachedSerQNames.add(qName);
		cls = DummyResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "DummyReturnType");
		cachedSerQNames.add(qName);
		cls = DummyReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "EstadoCmpSimpleType");
		cachedSerQNames.add(qName);
		cls = EstadoCmpSimpleType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "EstadoCmpType");
		cachedSerQNames.add(qName);
		cls = EstadoCmpType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "EstadoCtaCteSimpleType");
		cachedSerQNames.add(qName);
		cls = EstadoCtaCteSimpleType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "EstadoCtaCteType");
		cachedSerQNames.add(qName);
		cls = EstadoCtaCteType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "FacturaInformadaAgtDptoCltvType");
		cachedSerQNames.add(qName);
		cls = FacturaInformadaAgtDptoCltvType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "FiltroFechaType");
		cachedSerQNames.add(qName);
		cls = FiltroFechaType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "IdComprobanteType");
		cachedSerQNames.add(qName);
		cls = IdComprobanteType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "IdCtaCteType");
		cachedSerQNames.add(qName);
		cls = IdCtaCteType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ImporteSimpleType");
		cachedSerQNames.add(qName);
		cls = java.math.BigDecimal.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "InfoCtaCteType");
		cachedSerQNames.add(qName);
		cls = InfoCtaCteType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "InformarCancelacionTotalFECredRequestType");
		cachedSerQNames.add(qName);
		cls = InformarCancelacionTotalFECredRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "InformarFacturaAgtDptoCltvRequestType");
		cachedSerQNames.add(qName);
		cls = InformarFacturaAgtDptoCltvRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ItemType");
		cachedSerQNames.add(qName);
		cls = ItemType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "MotivoRechazoType");
		cachedSerQNames.add(qName);
		cls = MotivoRechazoType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "NumeroComprobanteSimpleType");
		cachedSerQNames.add(qName);
		cls = long.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ObtenerRemitosRequestType");
		cachedSerQNames.add(qName);
		cls = ObtenerRemitosRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ObtenerRemitosResponseType");
		cachedSerQNames.add(qName);
		cls = ObtenerRemitosResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ObtenerRemitosReturnType");
		cachedSerQNames.add(qName);
		cls = ObtenerRemitosReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "OperacionFECredResponseType");
		cachedSerQNames.add(qName);
		cls = OperacionFECredResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "OperacionFECredReturnType");
		cachedSerQNames.add(qName);
		cls = OperacionFECredReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "OtroTributoType");
		cachedSerQNames.add(qName);
		cls = OtroTributoType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "PorcentajeSimpleType");
		cachedSerQNames.add(qName);
		cls = java.math.BigDecimal.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "PuntoVentaSimpleType");
		cachedSerQNames.add(qName);
		cls = int.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "RechazarFECredRequestType");
		cachedSerQNames.add(qName);
		cls = RechazarFECredRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "RechazarNotaDCRequestType");
		cachedSerQNames.add(qName);
		cls = RechazarNotaDCRequestType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "RechazarNotaDCResponseType");
		cachedSerQNames.add(qName);
		cls = RechazarNotaDCResponseType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "RechazarNotaDCReturnType");
		cachedSerQNames.add(qName);
		cls = RechazarNotaDCReturnType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "ResultadoSimpleType");
		cachedSerQNames.add(qName);
		cls = ResultadoSimpleType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "RetencionType");
		cachedSerQNames.add(qName);
		cls = RetencionType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "RolSimpleType");
		cachedSerQNames.add(qName);
		cls = RolSimpleType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "SiNoSimpleType");
		cachedSerQNames.add(qName);
		cls = SiNoSimpleType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "SubtotalIVAType");
		cachedSerQNames.add(qName);
		cls = SubtotalIVAType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "Texto250SimpleType");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "TipoAceptacionSimpleType");
		cachedSerQNames.add(qName);
		cls = TipoAceptacionSimpleType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "TipoCancelacionSimpleType");
		cachedSerQNames.add(qName);
		cls = TipoCancelacionSimpleType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "TipoCodAutorizacionType");
		cachedSerQNames.add(qName);
		cls = TipoCodAutorizacionType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

	}

	private void addBindings1() {
		java.lang.Class cls;
		QName qName;
		QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "TipoFechaSimpleType");
		cachedSerQNames.add(qName);
		cls = TipoFechaSimpleType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new QName("http://ar.gob.afip.wsfecred/FECredService/", "TipoRetencionType");
		cachedSerQNames.add(qName);
		cls = TipoRetencionType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall() throws RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
						QName qName = (QName) cachedSerQNames.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class) cachedSerFactories.get(i);
							java.lang.Class df = (java.lang.Class) cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
		}
	}

	public DummyResponseType dummy() throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/dummy");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "dummy"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (DummyResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (DummyResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, DummyResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarComprobantesResponseType consultarComprobantes(ConsultarComprobanteRequestType parameters)
			throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarComprobantes");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarComprobantes"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarComprobantesResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarComprobantesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarComprobantesResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public OperacionFECredResponseType rechazarFECred(RechazarFECredRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/rechazarFECred");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "rechazarFECred"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (OperacionFECredResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (OperacionFECredResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							OperacionFECredResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarCtasCtesResponseType consultarCtasCtes(ConsultarCtasCtesRequestType parameters)
			throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarCtasCtes");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarCtasCtes"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarCtasCtesResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarCtasCtesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarCtasCtesResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public RechazarNotaDCResponseType rechazarNotaDC(RechazarNotaDCRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/rechazarNotaDC");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "rechazarNotaDC"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (RechazarNotaDCResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (RechazarNotaDCResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							RechazarNotaDCResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public OperacionFECredResponseType informarFacturaAgtDptoCltv(InformarFacturaAgtDptoCltvRequestType parameters)
			throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/informarFacturaAgtDptoCltv");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "informarFacturaAgtDptoCltv"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (OperacionFECredResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (OperacionFECredResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							OperacionFECredResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarTiposRetencionesResponseType consultarTiposRetenciones(
			ConsultarCodigoDescripcionRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarTiposRetenciones");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarTiposRetenciones"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarTiposRetencionesResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarTiposRetencionesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarTiposRetencionesResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarObligadoRecepcionResponseType consultarObligadoRecepcion(
			ConsultarObligadoRecepcionRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarObligadoRecepcion");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarObligadoRecepcion"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarObligadoRecepcionResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarObligadoRecepcionResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarObligadoRecepcionResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarFacturasAgtDptoCltvResponseType consultarFacturasAgtDptoCltv(
			ConsultarFacturasAgtDptoCltvRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarFacturasAgtDptoCltv");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarFacturasAgtDptoCltv"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarFacturasAgtDptoCltvResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarFacturasAgtDptoCltvResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarFacturasAgtDptoCltvResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public OperacionFECredResponseType informarCancelacionTotalFECred(
			InformarCancelacionTotalFECredRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/informarCancelacionTotalFECred");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "informarCancelacionTotalFECred"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (OperacionFECredResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (OperacionFECredResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							OperacionFECredResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarCodigoDescripcionResponseType consultarTiposMotivosRechazo(
			ConsultarCodigoDescripcionRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarTiposMotivosRechazo");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarTiposMotivosRechazo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarCodigoDescripcionResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarCodigoDescripcionResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarCodigoDescripcionResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarCodigoDescripcionResponseType consultarTiposFormasCancelacion(
			ConsultarCodigoDescripcionRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarTiposFormasCancelacion");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarTiposFormasCancelacion"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarCodigoDescripcionResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarCodigoDescripcionResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarCodigoDescripcionResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public OperacionFECredResponseType aceptarFECred(AceptarFECredRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/aceptarFECred");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "aceptarFECred"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (OperacionFECredResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (OperacionFECredResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							OperacionFECredResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarCtaCteResponseType consultarCtaCte(ConsultarCtaCteRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarCtaCte");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarCtaCte"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarCtaCteResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarCtaCteResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarCtaCteResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarCuentasComitenteResponseType consultarCuentasComitente(
			ConsultarCuentasComitenteRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[14]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarCuentasComitente");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarCuentasComitente"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarCuentasComitenteResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarCuentasComitenteResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarCuentasComitenteResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ObtenerRemitosResponseType obtenerRemitos(ObtenerRemitosRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[15]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/obtenerRemitos");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "obtenerRemitos"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ObtenerRemitosResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ObtenerRemitosResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ObtenerRemitosResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarHistorialEstadosComprobanteResponseType consultarHistorialEstadosComprobante(
			ConsultarHistorialEstadosComprobanteRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[16]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarHistorialEstadosComprobante");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarHistorialEstadosComprobante"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarHistorialEstadosComprobanteResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarHistorialEstadosComprobanteResponseType) org.apache.axis.utils.JavaUtils
							.convert(_resp, ConsultarHistorialEstadosComprobanteResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarHistorialEstadosCtaCteResponseType consultarHistorialEstadosCtaCte(
			ConsultarHistorialEstadosCtaCteRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[17]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarHistorialEstadosCtaCte");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarHistorialEstadosCtaCte"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarHistorialEstadosCtaCteResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarHistorialEstadosCtaCteResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarHistorialEstadosCtaCteResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarCodigoDescripcionResponseType consultarTiposAjustesOperacion(
			ConsultarCodigoDescripcionRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[18]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarTiposAjustesOperacion");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarTiposAjustesOperacion"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarCodigoDescripcionResponseType) _resp;
				} catch (Exception _exception) {
					return (ConsultarCodigoDescripcionResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarCodigoDescripcionResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public ConsultarMontoObligadoRecepcionResponseType consultarMontoObligadoRecepcion(
			ConsultarMontoObligadoRecepcionRequestType parameters) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[19]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gob.afip.wsfecred/FECredService/consultarMontoObligadoRecepcion");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "consultarMontoObligadoRecepcion"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (ConsultarMontoObligadoRecepcionResponseType) _resp;
				} catch (java.lang.Exception _exception) {
					return (ConsultarMontoObligadoRecepcionResponseType) org.apache.axis.utils.JavaUtils.convert(_resp,
							ConsultarMontoObligadoRecepcionResponseType.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
