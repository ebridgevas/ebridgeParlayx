/**
 * AccountManagement_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebridge.parlayx.accountmanagement.ws;

public interface AccountManagement_PortType extends java.rmi.Remote {
    public com.ebridge.parlayx.accountmanagement.ws.Balance[] getBalance(java.lang.String endUserIdentifier, java.lang.String endUserPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException;
    public com.ebridge.parlayx.accountmanagement.ws.BalanceExpireDetails[] getCreditExpiryDate(org.apache.axis.types.URI endUserIdentifier, java.lang.String endUserPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException;
    public void balanceUpdate(java.lang.String endUserIdentifier, java.lang.String endUserPin, java.lang.String referenceCode, java.lang.String balanceType, java.math.BigDecimal amount, java.lang.Integer period) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException;
    public void voucherUpdate(org.apache.axis.types.URI endUserIdentifier, java.lang.String endUserPin, java.lang.String referenceCode, java.lang.String voucherIdentifier, java.lang.String voucherPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException;
    public com.ebridge.parlayx.accountmanagement.ws.DatedTransaction[] getHistory(org.apache.axis.types.URI endUserIdentifier, java.lang.String endUserPin, java.util.Calendar date, java.lang.Integer maxEntries) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException;
    public java.lang.String[] getBalanceTypes(java.lang.String endUserIdentifier, java.lang.String endUserPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException;
}
