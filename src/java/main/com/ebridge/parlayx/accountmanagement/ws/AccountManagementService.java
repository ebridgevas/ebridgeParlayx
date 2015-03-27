/**
 * AccountManagementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebridge.parlayx.accountmanagement.ws;

public interface AccountManagementService extends javax.xml.rpc.Service {
    public java.lang.String getAccountManagementAddress();

    public com.ebridge.parlayx.accountmanagement.ws.AccountManagement_PortType getAccountManagement() throws javax.xml.rpc.ServiceException;

    public com.ebridge.parlayx.accountmanagement.ws.AccountManagement_PortType getAccountManagement(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
