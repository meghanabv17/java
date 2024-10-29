package com.bank.account.details;

import com.bank.account.details.dao.BankDetailsDao;
import com.bank.account.details.dto.BankDetailsDto;

public class BankDetailsRunner {

    public static void main(String [] args){
        BankDetailsDto ref = new BankDetailsDto();

        ref.Account = "Savings";
        ref.Opration = "Store money";
        ref.cheque = true;
        ref.ATM = true;
        ref.nm = "Axis bank";

        BankDetailsDao dao = new BankDetailsDao();
        dao.CreateAccount(ref);
        dao.getdetails();
    }
}
