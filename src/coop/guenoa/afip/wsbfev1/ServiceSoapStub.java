/**
 * ServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsbfev1;

public class ServiceSoapStub extends org.apache.axis.client.Stub implements coop.guenoa.afip.wsbfev1.IServiceSoap {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[13];
		_initOperationDesc1();
		_initOperationDesc2();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEAuthorize");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Cmp"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFERequest"),
				coop.guenoa.afip.wsbfev1.ClsBFERequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponseAuthorize"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponseAuthorize.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEAuthorizeResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetCMP");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Cmp"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEGetCMP"),
				coop.guenoa.afip.wsbfev1.ClsBFEGetCMP.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetCMPResponse"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEGetCMPResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetCMPResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetPARAM_Tipo_doc");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Tipo_doc"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_doc.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_Tipo_docResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetPARAM_Tipo_IVA");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Tipo_IVA"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_IVA.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_Tipo_IVAResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetPARAM_Tipo_Opc");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Opc"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponse_Opc.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_Tipo_OpcResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetPARAM_Zonas");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Zon"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponse_Zon.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_ZonasResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetPARAM_Tipo_Cbte");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Tipo_Cbte"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_Cbte.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_Tipo_CbteResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetPARAM_UMed");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Umed"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponse_Umed.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_UMedResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetPARAM_NCM");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_NCM"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponse_NCM.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_NCMResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetPARAM_MON");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Mon"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponse_Mon.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_MONResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[9] = oper;

	}

	private static void _initOperationDesc2() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetLast_CMP");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFE_LastCMP"),
				coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponseLast_CMP"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponseLast_CMP.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetLast_CMPResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEDummy");
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "DummyResponse"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.DummyResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEDummyResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("BFEGetLast_ID");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest"),
				coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_LastID"));
		oper.setReturnClass(coop.guenoa.afip.wsbfev1.BFEResponse_LastID.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetLast_IDResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[12] = oper;

	}

	public ServiceSoapStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public ServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public ServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
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
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfClsBFEResponse_Mon");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Mon[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Mon");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Mon");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfClsBFEResponse_NCM");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_NCM[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_NCM");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_NCM");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfClsBFEResponse_Opc");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Opc[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Opc");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Opc");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfClsBFEResponse_Tipo_Cbte");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Tipo_Cbte[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Tipo_Cbte");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Tipo_Cbte");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfClsBFEResponse_Tipo_doc");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Tipo_doc[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Tipo_doc");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Tipo_doc");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfClsBFEResponse_Tipo_IVA");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Tipo_IVA[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Tipo_IVA");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Tipo_IVA");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfClsBFEResponse_UMed");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_UMed[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_UMed");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_UMed");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfClsBFEResponse_Zon");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Zon[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Zon");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Zon");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfItem");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.Item[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Item");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Item");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ArrayOfOpcional");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.Opcional[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Opcional");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Opcional");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetCMPResponse");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEGetCMPResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_LastID");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponse_LastID.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Mon");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponse_Mon.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_NCM");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponse_NCM.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Opc");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponse_Opc.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Tipo_Cbte");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_Cbte.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Tipo_doc");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_doc.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Tipo_IVA");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_IVA.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Umed");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponse_Umed.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponse_Zon");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponse_Zon.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponseAuthorize");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponseAuthorize.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEResponseLast_CMP");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.BFEResponseLast_CMP.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFE_LastCMP");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFE_LastCMP_Response");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP_Response.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEAuthRequest");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEErr");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEErr.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEEvents");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEEvents.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEGetCMP");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEGetCMP.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEGetCMPR");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEGetCMPR.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEOutAuthorize");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEOutAuthorize.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFERequest");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFERequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_LastID");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_LastID.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Mon");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Mon.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_NCM");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_NCM.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Opc");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Opc.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Tipo_Cbte");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Tipo_Cbte.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Tipo_doc");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Tipo_doc.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Tipo_IVA");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Tipo_IVA.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_UMed");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_UMed.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "ClsBFEResponse_Zon");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.ClsBFEResponse_Zon.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "DummyResponse");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.DummyResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Item");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.Item.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "Opcional");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsbfev1.Opcional.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
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
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames.get(i);
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

	public coop.guenoa.afip.wsbfev1.BFEResponseAuthorize BFEAuthorize(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth, coop.guenoa.afip.wsbfev1.ClsBFERequest cmp)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEAuthorize");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEAuthorize"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth, cmp });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponseAuthorize) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponseAuthorize) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponseAuthorize.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEGetCMPResponse BFEGetCMP(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth, coop.guenoa.afip.wsbfev1.ClsBFEGetCMP cmp)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetCMP");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetCMP"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth, cmp });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEGetCMPResponse) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEGetCMPResponse) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEGetCMPResponse.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_doc BFEGetPARAM_Tipo_doc(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetPARAM_Tipo_doc");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_Tipo_doc"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_doc) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_doc) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_doc.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_IVA BFEGetPARAM_Tipo_IVA(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetPARAM_Tipo_IVA");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_Tipo_IVA"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_IVA) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_IVA) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_IVA.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Opc BFEGetPARAM_Tipo_Opc(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetPARAM_Tipo_Opc");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_Tipo_Opc"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Opc) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Opc) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponse_Opc.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Zon BFEGetPARAM_Zonas(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetPARAM_Zonas");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_Zonas"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Zon) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Zon) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponse_Zon.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_Cbte BFEGetPARAM_Tipo_Cbte(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetPARAM_Tipo_Cbte");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_Tipo_Cbte"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_Cbte) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_Cbte) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponse_Tipo_Cbte.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Umed BFEGetPARAM_UMed(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetPARAM_UMed");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_UMed"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Umed) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Umed) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponse_Umed.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_NCM BFEGetPARAM_NCM(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetPARAM_NCM");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_NCM"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_NCM) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_NCM) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponse_NCM.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_Mon BFEGetPARAM_MON(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetPARAM_MON");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetPARAM_MON"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Mon) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_Mon) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponse_Mon.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponseLast_CMP BFEGetLast_CMP(coop.guenoa.afip.wsbfev1.ClsBFE_LastCMP auth) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetLast_CMP");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetLast_CMP"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponseLast_CMP) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponseLast_CMP) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponseLast_CMP.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.DummyResponse BFEDummy() throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEDummy");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEDummy"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.DummyResponse) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.DummyResponse) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.DummyResponse.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsbfev1.BFEResponse_LastID BFEGetLast_ID(coop.guenoa.afip.wsbfev1.ClsBFEAuthRequest auth) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.bfev1/BFEGetLast_ID");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.bfev1/", "BFEGetLast_ID"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_LastID) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsbfev1.BFEResponse_LastID) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsbfev1.BFEResponse_LastID.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
