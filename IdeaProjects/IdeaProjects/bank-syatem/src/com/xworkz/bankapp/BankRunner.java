package com.xworkz.bankapp;

import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankRunner {

    public static void main(String[] args) {
        System.out.println("Main started");

        SavingsAccount saving = new SavingsAccount();
        System.out.println(saving.getBalance());
        System.out.println("******************************************************************");

        SavingsAccount savings = new SavingsAccount(1200);
        System.out.println(savings.getBalance());

        savings.withdraw(200);
        System.out.println(savings.getBalance());

        savings.deposit(500);
        System.out.println(savings.getBalance());
        System.out.println("********************************************************************");

        System.out.println("another account started");

        SavingsAccount savings1 = new SavingsAccount(2000);
        System.out.println("The balance amount is: "+ savings1.getBalance());

        savings1.deposit(500);
        System.out.println("The balance after depositing a amount is: "+savings1.getBalance());

        savings1.withdraw(200);
        System.out.println("The balance amount after withdraw is: "+savings1.getBalance());

        savings1.rateOfIntrest();
        System.out.println("The final balance is: "+savings1.getBalance());
        System.out.println("********************************************************************");

        SavingsAccount savings2 = new SavingsAccount(5000);
        System.out.println(savings2.getBalance());

        savings2.withdraw(200);
        System.out.println(savings2.getBalance());

        savings2.deposit(500);
        System.out.println(savings2.getBalance());

        savings2.rateOfIntrest();
        System.out.println("the balance2 amount is: "+savings2.getBalance());
        System.out.println("********************************************************************");

        SavingsAccount savings3 = new SavingsAccount(45000);
        System.out.println(savings3.getBalance());

        savings3.withdraw(1200);
        System.out.println(savings3.getBalance());

        savings3.deposit(5500);
        System.out.println(savings3.getBalance());

        savings3.rateOfIntrest();
        System.out.println("the balance2 amount is: "+savings3.getBalance());
        System.out.println("********************************************************************");

        SavingsAccount savings4 = new SavingsAccount(45000);
        System.out.println(savings4.getBalance());

        savings4.withdraw(1200);
        System.out.println(savings4.getBalance());

        savings4.deposit(5500);
        System.out.println(savings4.getBalance());

        savings4.rateOfIntrest();
        System.out.println("the balance2 amount is: "+savings4.getBalance());
        System.out.println("********************************************************************");

        SavingsAccount savings5 = new SavingsAccount(4000);
        System.out.println("The minimum balance is: "+savings5.getBalance());

        savings5.withdraw(2000);
        System.out.println(savings5.getBalance());

        savings5.deposit(5500);
        System.out.println(savings5.getBalance());

        savings5.rateOfIntrest();
        System.out.println("the balance2 amount is: "+savings5.getBalance());
        System.out.println("********************************************************************");

        SavingsAccount savings6 = new SavingsAccount(15000);
        System.out.println(savings6.getBalance());

        savings6.withdraw(1200);
        System.out.println(savings6.getBalance());

        savings6.deposit(55000);
        System.out.println(savings6.getBalance());

        savings6.rateOfIntrest();
        System.out.println("the balance2 amount is: "+savings6.getBalance());
        System.out.println("********************************************************************");

        System.out.println("Transfering a amount started");
        SavingsAccount account1 = new SavingsAccount(15000);
        System.out.println(account1.getBalance());

        account1.withdraw(1200);
        System.out.println(account1.getBalance());

        account1.deposit(5000);
        System.out.println(account1.getBalance());

        account1.rateOfIntrest();
        System.out.println("the balance2 amount is: "+account1.getBalance());
        System.out.println("********************************************************************");

        SavingsAccount account2 = new SavingsAccount(1000);
        account1.transfer(account2 , 2000);
        System.out.println("account1 balance is: "+account1.getBalance());
        System.out.println("account2 balance is: "+account2.getBalance());

        SavingsAccount brothersaccount = new SavingsAccount();
        account1.transfer(brothersaccount , 500);
        System.out.println("account1 balance is: "+account1.getBalance());
        System.out.println("brothers account balance is: "+brothersaccount.getBalance());

        SavingsAccount momsaccount = new SavingsAccount(78);
        account1.transfer(momsaccount, 522);
        System.out.println("account1 balance is: "+account1.getBalance());
        System.out.println("mom's account balance is: "+momsaccount.getBalance());

        SavingsAccount sistersaccount = new SavingsAccount(5000);
        account1.transfer(sistersaccount, 10000);
        System.out.println("account1 balance is: "+account1.getBalance());
        System.out.println("sister's account balance is: "+sistersaccount.getBalance());

        SavingsAccount friendsaccount = new SavingsAccount(111);
        account1.transfer(friendsaccount, 5000);
        System.out.println("account1 balance is: "+account1.getBalance());
        System.out.println("friend's account balance is: "+friendsaccount.getBalance());

        SavingsAccount dadsaccount = new SavingsAccount(10000);
        account1.transfer(dadsaccount, 1000);
        System.out.println("account1 balance is: "+account1.getBalance());
        System.out.println("dad's account balance is: "+dadsaccount.getBalance());
        System.out.println("transfer ended");

        System.out.println("crediting started");
        SavingsAccount dads = new SavingsAccount(10000);
        account1.credit(dadsaccount, 1000);
        System.out.println("account1 balance is: "+account1.getBalance());
        System.out.println("dad's account balance is: "+dadsaccount.getBalance());

        SavingsAccount dads1 = new SavingsAccount(10000);
        account1.credit(dadsaccount, 5000);
        System.out.println("account1 balance is: "+account1.getBalance());
        System.out.println("dad's account balance is: "+dadsaccount.getBalance());
        System.out.println("credit ended");

        System.out.println("Main ended");
    }
}
