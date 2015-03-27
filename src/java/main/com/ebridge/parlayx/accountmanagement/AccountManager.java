package com.ebridge.parlayx.accountmanagement;

import com.ebridge.billingplatform.BillingPlatformInterface;
import com.ebridge.billingplatform.inject.BillingPlatformInterfaceModule;
import com.ebridge.commons.dto.BalanceDTO;
import com.ebridge.commons.util.TransactionException;
import com.ebridge.parlayx.accountmanagement.ws.*;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.axis.types.URI;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Set;

import static java.util.UUID.randomUUID;
import static com.ebridge.parlayx.accountmanagement.util.Util.balances;

/**
 * @author david@tekeshe.com
 */
public class AccountManager {

    private BillingPlatformInterface billingPlatformInterface;

    public void AccountManager() {

        Injector injector = Guice.createInjector(new BillingPlatformInterfaceModule());
        billingPlatformInterface = injector.getInstance(BillingPlatformInterface.class);
    }

    /**
     * Balance Enquiry
     *
     * @param endUserIdentifier
     * @param endUserPin
     * @return
     * @throws TransactionException
     */
    public Balance[] getBalance(String endUserIdentifier, String endUserPin)
            throws RemoteException {

        return balances( billingPlatformInterface.balances(endUserIdentifier) );
    }

    public BalanceExpireDetails[] getCreditExpiryDate(URI endUserIdentifier, String endUserPin)
            throws RemoteException, PolicyException, ServiceException {
        return null;
    }

    /**
     *  Data Bundle Purchase
     *
     * @param endUserIdentifier
     * @param endUserPin
     * @param referenceCode
     * @param balanceType
     * @param amount
     * @param period
     * @throws TransactionException
     */
    public void balanceUpdate( String endUserIdentifier,
                              String endUserPin,
                              String referenceCode,
                              String balanceType,
                              BigDecimal amount,
                              Integer period)
            throws RemoteException  {

        try {

            String uuid = randomUUID().toString().replaceAll("-","").toUpperCase();
            String productCode = referenceCode;
            String paymentMethod = "AIRTIME";
            String oneTimePassword = "";
            String dataBundleServiceCommand = "";

            billingPlatformInterface.dataBundlePurchase ( uuid,
                                                          endUserIdentifier,
                                                          productCode,
                                                          endUserIdentifier,
                                                          paymentMethod,
                                                          oneTimePassword,
                                                          dataBundleServiceCommand );

        } catch (TransactionException e) {
            throw new RemoteException( e.getMessage() );
        }
    }

    public void voucherUpdate( URI endUserIdentifier,
                                      String endUserPin,
                                      String referenceCode,
                                      String voucherIdentifier,
                                      String voucherPin)
            throws java.rmi.RemoteException, PolicyException, ServiceException {
    }

    public DatedTransaction[] getHistory( URI endUserIdentifier,
                                                 String endUserPin,
                                                 Calendar date,
                                                 Integer maxEntries)
            throws RemoteException, PolicyException, ServiceException {

        return null;
    }

    public String[] getBalanceTypes( String endUserIdentifier,
                                            String endUserPin)
            throws RemoteException, PolicyException, ServiceException {

        return null;
    }
}
