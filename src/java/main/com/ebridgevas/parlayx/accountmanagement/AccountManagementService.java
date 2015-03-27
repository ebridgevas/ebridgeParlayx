//package com.ebridgevas.parlayx.accountmanagement;
//
//import org.csapi.www.wsdl.parlayx.account_management.v2_2._interface.AccountManagement;
//import org.csapi.www.schema.parlayx.account_management.v2_2.Balance;
//import org.csapi.www.schema.parlayx.account_management.v2_2.BalanceExpireDetails;
//import org.csapi.www.schema.parlayx.account_management.v2_2.DatedTransaction;
//import org.csapi.www.schema.parlayx.common.v2_1.PolicyException;
//import org.csapi.www.schema.parlayx.common.v2_1.ServiceException;
//
//import java.math.BigDecimal;
//import java.rmi.RemoteException;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Iterator;
//
//public class AccountManagementService implements AccountManagement {
//
//
//    public Balance[] getBalance(String endUserIdentifier, String endUserPin) {
//
//        Balance[] balances = (Balance[])null;
//        if("0733000000".equalsIgnoreCase(endUserIdentifier)) {
//            balances = new Balance[]{new Balance(), null};
//            balances[0].setBalanceType("Core");
//            balances[0].setAmount(new BigDecimal(115.33D));
//            balances[1] = new Balance();
//            balances[1].setBalanceType("Bonus");
//            balances[1].setAmount(new BigDecimal(505.45D));
//            return balances;
//        } else {
//            try {
//                ArrayList e = new ArrayList();
//                Iterator var6 = this.ppsClient.getBalance(endUserIdentifier).iterator();
//
//                while(var6.hasNext()) {
//                    BalanceDTO ex1 = (BalanceDTO)var6.next();
//                    Balance balance = new Balance();
//                    balance.setBalanceType(ex1.getBalanceType());
//                    balance.setAmount(ex1.getAmount());
//                    e.add(balance);
//                }
//
//                balances = new Balance[e.size()];
//                e.toArray(balances);
//                return balances;
//            } catch (TransactionFailedException var8) {
//                ServiceException ex = new ServiceException();
//                ex.setFaultCodeAsString("008");
//                ex.setText(var8.getMessage());
//                throw ex;
//            }
//        }
//    }
//
//    public BalanceExpireDetails[] getCreditExpiryDate(URI endUserIdentifier, String endUserPin) throws RemoteException, PolicyException, ServiceException {
//        return null;
//    }
//
//    public void balanceUpdate(String endUserIdentifier, String endUserPin, String referenceCode, String balanceType, BigDecimal amount, Integer period) throws RemoteException, PolicyException, ServiceException {
//        System.out.println(endUserIdentifier + " - " + endUserPin + " - " + referenceCode + " - " + balanceType + " - " + amount + " - " + period);
//        String serviceProviderWallet = "263731000030";
//
//        try {
//            if(amount.compareTo(BigDecimal.ZERO) < 0) {
//                this.ppsClient.transfer(referenceCode, endUserPin, serviceProviderWallet, amount);
//            } else if(amount.compareTo(BigDecimal.ZERO) > 0) {
//                this.ppsClient.transfer(referenceCode, serviceProviderWallet, endUserPin, amount);
//            }
//
//        } catch (TransactionFailedException var10) {
//            ServiceException ex = new ServiceException();
//            ex.setFaultCodeAsString("008");
//            ex.setText(var10.getMessage());
//            throw ex;
//        }
//    }
//
//    public void voucherUpdate(URI endUserIdentifier, String endUserPin, String referenceCode, String voucherIdentifier, String voucherPin) throws RemoteException, PolicyException, ServiceException {
//    }
//
//    public DatedTransaction[] getHistory(URI endUserIdentifier, String endUserPin, Calendar date, Integer maxEntries) throws RemoteException, PolicyException, ServiceException {
//        return null;
//    }
//
//    public String[] getBalanceTypes(String endUserIdentifier, String endUserPin) throws RemoteException, PolicyException, ServiceException {
//        return null;
//    }