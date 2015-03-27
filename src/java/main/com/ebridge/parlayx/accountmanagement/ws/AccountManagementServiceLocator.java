/**
 * AccountManagementServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebridge.parlayx.accountmanagement.ws;

public class AccountManagementServiceLocator extends org.apache.axis.client.Service implements com.ebridge.parlayx.accountmanagement.ws.AccountManagementService {

    public AccountManagementServiceLocator() {
    }


    public AccountManagementServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AccountManagementServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AccountManagement
    private java.lang.String AccountManagement_address = "http://196.2.77.17:8080/axis/services/AccountManagementService";

    public java.lang.String getAccountManagementAddress() {
        return AccountManagement_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountManagementWSDDServiceName = "AccountManagement";

    public java.lang.String getAccountManagementWSDDServiceName() {
        return AccountManagementWSDDServiceName;
    }

    public void setAccountManagementWSDDServiceName(java.lang.String name) {
        AccountManagementWSDDServiceName = name;
    }

    public com.ebridge.parlayx.accountmanagement.ws.AccountManagement_PortType getAccountManagement() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountManagement_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountManagement(endpoint);
    }

    public com.ebridge.parlayx.accountmanagement.ws.AccountManagement_PortType getAccountManagement(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ebridge.parlayx.accountmanagement.ws.AccountManagementBindingStub _stub = new com.ebridge.parlayx.accountmanagement.ws.AccountManagementBindingStub(portAddress, this);
            _stub.setPortName(getAccountManagementWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAccountManagementEndpointAddress(java.lang.String address) {
        AccountManagement_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ebridge.parlayx.accountmanagement.ws.AccountManagement_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ebridge.parlayx.accountmanagement.ws.AccountManagementBindingStub _stub = new com.ebridge.parlayx.accountmanagement.ws.AccountManagementBindingStub(new java.net.URL(AccountManagement_address), this);
                _stub.setPortName(getAccountManagementWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AccountManagement".equals(inputPortName)) {
            return getAccountManagement();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.csapi.org/wsdl/parlayx/account_management/v2_2/service", "AccountManagementService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.csapi.org/wsdl/parlayx/account_management/v2_2/service", "AccountManagement"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AccountManagement".equals(portName)) {
            setAccountManagementEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
