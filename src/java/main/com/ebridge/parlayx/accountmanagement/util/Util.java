package com.ebridge.parlayx.accountmanagement.util;

import com.ebridge.commons.dto.BalanceDTO;
import com.ebridge.parlayx.accountmanagement.ws.Balance;
import com.google.gson.Gson;

import java.util.Set;

/**
 * @author david@tekeshe.com
 */
public class Util {

    public static Balance[] balances( Set<BalanceDTO> input ) {

        Balance[] result = new Balance[input.size()];

        int idx = 0;
        for (BalanceDTO item : input) {

            result[ idx ] = new Balance(new Gson().toJson(item, BalanceDTO.class), item.getBalance());
            ++idx;
        }

        return result;
    }
}
