package com.xworkz.bankapp.current;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class CurrentAccount extends BankAccount {

   public CurrentAccount(double minBalance) {
        setBalance(minBalance);
    }
}
