/**
 * AccountManagementBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebridge.parlayx.accountmanagement.ws;

public class AccountManagementBindingStub extends org.apache.axis.client.Stub implements com.ebridge.parlayx.accountmanagement.ws.AccountManagement_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserPin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2", "Balance"));
        oper.setReturnClass(com.ebridge.parlayx.accountmanagement.ws.Balance[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"),
                      "com.ebridge.parlayx.accountmanagement.ws.PolicyException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"),
                      "com.ebridge.parlayx.accountmanagement.ws.ServiceException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreditExpiryDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"), org.apache.axis.types.URI.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserPin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2", "BalanceExpireDetails"));
        oper.setReturnClass(com.ebridge.parlayx.accountmanagement.ws.BalanceExpireDetails[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"),
                      "com.ebridge.parlayx.accountmanagement.ws.PolicyException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"),
                      "com.ebridge.parlayx.accountmanagement.ws.ServiceException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("balanceUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserPin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "referenceCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "balanceType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"),
                      "com.ebridge.parlayx.accountmanagement.ws.PolicyException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"),
                      "com.ebridge.parlayx.accountmanagement.ws.ServiceException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("voucherUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"), org.apache.axis.types.URI.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserPin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "referenceCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "voucherIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "voucherPin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"),
                      "com.ebridge.parlayx.accountmanagement.ws.PolicyException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"),
                      "com.ebridge.parlayx.accountmanagement.ws.ServiceException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"), org.apache.axis.types.URI.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserPin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "maxEntries"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2", "DatedTransaction"));
        oper.setReturnClass(com.ebridge.parlayx.accountmanagement.ws.DatedTransaction[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"),
                      "com.ebridge.parlayx.accountmanagement.ws.PolicyException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"),
                      "com.ebridge.parlayx.accountmanagement.ws.ServiceException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBalanceTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "endUserPin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"),
                      "com.ebridge.parlayx.accountmanagement.ws.PolicyException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"),
                      "com.ebridge.parlayx.accountmanagement.ws.ServiceException",
                      new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException"), 
                      true
                     ));
        _operations[5] = oper;

    }

    public AccountManagementBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AccountManagementBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AccountManagementBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
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
            qName = new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2", "Balance");
            cachedSerQNames.add(qName);
            cls = com.ebridge.parlayx.accountmanagement.ws.Balance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2", "BalanceExpireDetails");
            cachedSerQNames.add(qName);
            cls = com.ebridge.parlayx.accountmanagement.ws.BalanceExpireDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2", "DatedTransaction");
            cachedSerQNames.add(qName);
            cls = com.ebridge.parlayx.accountmanagement.ws.DatedTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "PolicyException");
            cachedSerQNames.add(qName);
            cls = com.ebridge.parlayx.accountmanagement.ws.PolicyException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/common/v2_1", "ServiceException");
            cachedSerQNames.add(qName);
            cls = com.ebridge.parlayx.accountmanagement.ws.ServiceException.class;
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
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.ebridge.parlayx.accountmanagement.ws.Balance[] getBalance(java.lang.String endUserIdentifier, java.lang.String endUserPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "getBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endUserIdentifier, endUserPin});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ebridge.parlayx.accountmanagement.ws.Balance[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ebridge.parlayx.accountmanagement.ws.Balance[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ebridge.parlayx.accountmanagement.ws.Balance[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.PolicyException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.PolicyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.ServiceException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.ServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ebridge.parlayx.accountmanagement.ws.BalanceExpireDetails[] getCreditExpiryDate(org.apache.axis.types.URI endUserIdentifier, java.lang.String endUserPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "getCreditExpiryDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endUserIdentifier, endUserPin});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ebridge.parlayx.accountmanagement.ws.BalanceExpireDetails[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ebridge.parlayx.accountmanagement.ws.BalanceExpireDetails[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ebridge.parlayx.accountmanagement.ws.BalanceExpireDetails[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.PolicyException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.PolicyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.ServiceException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.ServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void balanceUpdate(java.lang.String endUserIdentifier, java.lang.String endUserPin, java.lang.String referenceCode, java.lang.String balanceType, java.math.BigDecimal amount, java.lang.Integer period) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "balanceUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endUserIdentifier, endUserPin, referenceCode, balanceType, amount, period});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.PolicyException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.PolicyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.ServiceException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.ServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void voucherUpdate(org.apache.axis.types.URI endUserIdentifier, java.lang.String endUserPin, java.lang.String referenceCode, java.lang.String voucherIdentifier, java.lang.String voucherPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "voucherUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endUserIdentifier, endUserPin, referenceCode, voucherIdentifier, voucherPin});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.PolicyException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.PolicyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.ServiceException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.ServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ebridge.parlayx.accountmanagement.ws.DatedTransaction[] getHistory(org.apache.axis.types.URI endUserIdentifier, java.lang.String endUserPin, java.util.Calendar date, java.lang.Integer maxEntries) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "getHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endUserIdentifier, endUserPin, date, maxEntries});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ebridge.parlayx.accountmanagement.ws.DatedTransaction[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ebridge.parlayx.accountmanagement.ws.DatedTransaction[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ebridge.parlayx.accountmanagement.ws.DatedTransaction[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.PolicyException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.PolicyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.ServiceException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.ServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getBalanceTypes(java.lang.String endUserIdentifier, java.lang.String endUserPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csapi.org/schema/parlayx/account_management/v2_2/local", "getBalanceTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endUserIdentifier, endUserPin});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.PolicyException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.PolicyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ebridge.parlayx.accountmanagement.ws.ServiceException) {
              throw (com.ebridge.parlayx.accountmanagement.ws.ServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
