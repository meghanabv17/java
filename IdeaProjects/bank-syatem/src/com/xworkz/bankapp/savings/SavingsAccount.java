package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class SavingsAccount extends BankAccount {
    double intrest = 6.5;

    public SavingsAccount() {

    }

    public SavingsAccount(double minBalance) {
        setBalance(minBalance);
    }

    public void rateOfIntrest() {
        double intrestAmount = (getBalance() * intrest) / 100;
        deposit(intrestAmount);
    }
}

