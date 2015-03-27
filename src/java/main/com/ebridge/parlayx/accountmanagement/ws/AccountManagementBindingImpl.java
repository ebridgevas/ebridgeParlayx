/**
 * AccountManagementBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebridge.parlayx.accountmanagement.ws;

import com.ebridge.parlayx.accountmanagement.AccountManager;

public class AccountManagementBindingImpl implements com.ebridge.parlayx.accountmanagement.ws.AccountManagement_PortType{

    private AccountManager accountManager;

    public AccountManagementBindingImpl() {
        accountManager = new AccountManager();
    }

    public com.ebridge.parlayx.accountmanagement.ws.Balance[] getBalance(java.lang.String endUserIdentifier, java.lang.String endUserPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        return accountManager.getBalance(endUserIdentifier, endUserPin);
    }

    public com.ebridge.parlayx.accountmanagement.ws.BalanceExpireDetails[] getCreditExpiryDate(org.apache.axis.types.URI endUserIdentifier, java.lang.String endUserPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        return null;
    }

    public void balanceUpdate(java.lang.String endUserIdentifier, java.lang.String endUserPin, java.lang.String referenceCode, java.lang.String balanceType, java.math.BigDecimal amount, java.lang.Integer period) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
    }

    public void voucherUpdate(org.apache.axis.types.URI endUserIdentifier, java.lang.String endUserPin, java.lang.String referenceCode, java.lang.String voucherIdentifier, java.lang.String voucherPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
    }

    public com.ebridge.parlayx.accountmanagement.ws.DatedTransaction[] getHistory(org.apache.axis.types.URI endUserIdentifier, java.lang.String endUserPin, java.util.Calendar date, java.lang.Integer maxEntries) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        return null;
    }

    public java.lang.String[] getBalanceTypes(java.lang.String endUserIdentifier, java.lang.String endUserPin) throws java.rmi.RemoteException, com.ebridge.parlayx.accountmanagement.ws.PolicyException, com.ebridge.parlayx.accountmanagement.ws.ServiceException {
        return null;
    }

}
