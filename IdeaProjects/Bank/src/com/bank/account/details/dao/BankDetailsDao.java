package com.bank.account.details.dao;

import com.bank.account.details.dto.BankDetailsDto;

public class BankDetailsDao {
    BankDetailsDto dto;

    public boolean CreateAccount(BankDetailsDto dto)
    {
        System.out.println("Account creation started");
        boolean iscreated = false;
        if(dto != null)
        {
            this.dto = dto;
            iscreated = true;
        }else{
            System.out.println("Please provide a valid details");
        }
        System.out.println("Account created");
        return iscreated;
    }
    public void getdetails(){
        System.out.println("The account name is: "+dto.Account);
        System.out.println("The operation is: "+dto.Opration);
        System.out.println("need a cheque: "+dto.cheque);
        System.out.println("Need a ATM: "+dto.ATM);
        System.out.println("The name of the bank is: "+dto.nm);
    }
}
