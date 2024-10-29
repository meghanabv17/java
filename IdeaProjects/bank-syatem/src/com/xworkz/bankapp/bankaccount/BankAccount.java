package com.xworkz.bankapp.bankaccount;

public class BankAccount {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit sucessfull");
        }
        else System.out.println("Amount cannot be zero");
    }

    public void withdraw(double amount){
        if(amount <= balance) {
            System.out.println("withDraw sucessfull");
            balance = balance - amount;
        }
        else System.out.println("Insufficient Funds");
    }

    public void transfer(BankAccount account, double amount){
        System.out.println("Transfer started");
        this.withdraw(amount);
        System.out.println("Amount debited successfully");
        account.deposit(amount);
        System.out.println("Amounet credited successfully");
        System.out.println("transfr ended");
    }

    public void credit(BankAccount account, double amount){
        this.deposit(amount);
        account.withdraw(amount);
    }
}
