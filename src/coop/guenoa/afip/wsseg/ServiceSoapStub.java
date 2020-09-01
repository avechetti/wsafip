/**
 * ServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.wsseg;

public class ServiceSoapStub extends org.apache.axis.client.Stub implements coop.guenoa.afip.wsseg.ServiceSoap {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[9];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SEGAuthorize");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGAuthRequest"),
				coop.guenoa.afip.wsseg.ClsSEGAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Cmp"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGRequest"),
				coop.guenoa.afip.wsseg.ClsSEGRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponseAuthorize"));
		oper.setReturnClass(coop.guenoa.afip.wsseg.SEGResponseAuthorize.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGAuthorizeResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SEGGetCMP");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGAuthRequest"),
				coop.guenoa.afip.wsseg.ClsSEGAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Cmp"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGGetCMP"), coop.guenoa.afip.wsseg.ClsSEGGetCMP.class,
				false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetCMPResponse"));
		oper.setReturnClass(coop.guenoa.afip.wsseg.SEGGetCMPResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetCMPResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SEGGetPARAM_Tipo_doc");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGAuthRequest"),
				coop.guenoa.afip.wsseg.ClsSEGAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_Tipo_doc"));
		oper.setReturnClass(coop.guenoa.afip.wsseg.SEGResponse_Tipo_doc.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetPARAM_Tipo_docResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SEGGetPARAM_Tipo_IVA");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGAuthRequest"),
				coop.guenoa.afip.wsseg.ClsSEGAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_Tipo_IVA"));
		oper.setReturnClass(coop.guenoa.afip.wsseg.SEGResponse_Tipo_IVA.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetPARAM_Tipo_IVAResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SEGGetPARAM_Tipo_Cbte");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGAuthRequest"),
				coop.guenoa.afip.wsseg.ClsSEGAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_Tipo_Cbte"));
		oper.setReturnClass(coop.guenoa.afip.wsseg.SEGResponse_Tipo_Cbte.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetPARAM_Tipo_CbteResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SEGGetPARAM_MON");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGAuthRequest"),
				coop.guenoa.afip.wsseg.ClsSEGAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_Mon"));
		oper.setReturnClass(coop.guenoa.afip.wsseg.SEGResponse_Mon.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetPARAM_MONResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SEGGetLast_CMP");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEG_LastCMP"),
				coop.guenoa.afip.wsseg.ClsSEG_LastCMP.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponseLast_CMP"));
		oper.setReturnClass(coop.guenoa.afip.wsseg.SEGResponseLast_CMP.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetLast_CMPResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SEGDummy");
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "DummyResponse"));
		oper.setReturnClass(coop.guenoa.afip.wsseg.DummyResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGDummyResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SEGGetLast_ID");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Auth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGAuthRequest"),
				coop.guenoa.afip.wsseg.ClsSEGAuthRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_LastID"));
		oper.setReturnClass(coop.guenoa.afip.wsseg.SEGResponse_LastID.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetLast_IDResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[8] = oper;

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
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ArrayOfClsSEGResponse_Mon");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGResponse_Mon[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Mon");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Mon");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ArrayOfClsSEGResponse_Tipo_Cbte");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_Cbte[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_Cbte");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_Cbte");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ArrayOfClsSEGResponse_Tipo_doc");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_doc[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_doc");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_doc");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ArrayOfClsSEGResponse_Tipo_IVA");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_IVA[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_IVA");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_IVA");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ArrayOfItem");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.Item[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Item");
		qName2 = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Item");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEG_LastCMP");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEG_LastCMP.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEG_LastCMP_Response");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEG_LastCMP_Response.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGAuthRequest");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGAuthRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGErr");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGErr.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGEvents");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGEvents.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGGetCMP");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGGetCMP.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGGetCMPR");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGGetCMPR.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGOutAuthorize");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGOutAuthorize.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGRequest");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_LastID");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGResponse_LastID.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Mon");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGResponse_Mon.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_Cbte");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_Cbte.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_doc");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_doc.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "ClsSEGResponse_Tipo_IVA");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.ClsSEGResponse_Tipo_IVA.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "DummyResponse");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.DummyResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "Item");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.Item.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetCMPResponse");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.SEGGetCMPResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_LastID");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.SEGResponse_LastID.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_Mon");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.SEGResponse_Mon.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_Tipo_Cbte");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.SEGResponse_Tipo_Cbte.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_Tipo_doc");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.SEGResponse_Tipo_doc.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponse_Tipo_IVA");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.SEGResponse_Tipo_IVA.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponseAuthorize");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.SEGResponseAuthorize.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGResponseLast_CMP");
		cachedSerQNames.add(qName);
		cls = coop.guenoa.afip.wsseg.SEGResponseLast_CMP.class;
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

	public coop.guenoa.afip.wsseg.SEGResponseAuthorize SEGAuthorize(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth, coop.guenoa.afip.wsseg.ClsSEGRequest cmp)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.seg/SEGAuthorize");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGAuthorize"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth, cmp });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsseg.SEGResponseAuthorize) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsseg.SEGResponseAuthorize) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsseg.SEGResponseAuthorize.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsseg.SEGGetCMPResponse SEGGetCMP(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth, coop.guenoa.afip.wsseg.ClsSEGGetCMP cmp)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.seg/SEGGetCMP");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetCMP"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth, cmp });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsseg.SEGGetCMPResponse) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsseg.SEGGetCMPResponse) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsseg.SEGGetCMPResponse.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsseg.SEGResponse_Tipo_doc SEGGetPARAM_Tipo_doc(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.seg/SEGGetPARAM_Tipo_doc");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetPARAM_Tipo_doc"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsseg.SEGResponse_Tipo_doc) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsseg.SEGResponse_Tipo_doc) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsseg.SEGResponse_Tipo_doc.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsseg.SEGResponse_Tipo_IVA SEGGetPARAM_Tipo_IVA(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.seg/SEGGetPARAM_Tipo_IVA");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetPARAM_Tipo_IVA"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsseg.SEGResponse_Tipo_IVA) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsseg.SEGResponse_Tipo_IVA) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsseg.SEGResponse_Tipo_IVA.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsseg.SEGResponse_Tipo_Cbte SEGGetPARAM_Tipo_Cbte(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.seg/SEGGetPARAM_Tipo_Cbte");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetPARAM_Tipo_Cbte"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsseg.SEGResponse_Tipo_Cbte) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsseg.SEGResponse_Tipo_Cbte) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsseg.SEGResponse_Tipo_Cbte.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsseg.SEGResponse_Mon SEGGetPARAM_MON(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.seg/SEGGetPARAM_MON");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetPARAM_MON"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsseg.SEGResponse_Mon) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsseg.SEGResponse_Mon) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsseg.SEGResponse_Mon.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsseg.SEGResponseLast_CMP SEGGetLast_CMP(coop.guenoa.afip.wsseg.ClsSEG_LastCMP auth) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.seg/SEGGetLast_CMP");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetLast_CMP"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsseg.SEGResponseLast_CMP) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsseg.SEGResponseLast_CMP) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsseg.SEGResponseLast_CMP.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsseg.DummyResponse SEGDummy() throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.seg/SEGDummy");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGDummy"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsseg.DummyResponse) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsseg.DummyResponse) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsseg.DummyResponse.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public coop.guenoa.afip.wsseg.SEGResponse_LastID SEGGetLast_ID(coop.guenoa.afip.wsseg.ClsSEGAuthRequest auth) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://ar.gov.afip.dif.seg/SEGGetLast_ID");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.seg/", "SEGGetLast_ID"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { auth });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (coop.guenoa.afip.wsseg.SEGResponse_LastID) _resp;
				} catch (java.lang.Exception _exception) {
					return (coop.guenoa.afip.wsseg.SEGResponse_LastID) org.apache.axis.utils.JavaUtils.convert(_resp,
							coop.guenoa.afip.wsseg.SEGResponse_LastID.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
