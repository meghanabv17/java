package com.xworkz.supermarketapp;


import com.xworkz.supermarketapp.supermarket.SuperMarket;
import com.xworkz.supermarketapp.worker.Worker;


public class SuperMarketRunner {
    public static void main(String[] args) {

        SuperMarket supermarket = new SuperMarket();
        supermarket.isOpen = true;

        Worker worker =new Worker();
        worker.workerName = "John Doe";
        worker.position = "Cashier";
        worker.salary = 30000.0f;
        worker.experienceYears = 5;

        supermarket.hire(worker);
    }

}
