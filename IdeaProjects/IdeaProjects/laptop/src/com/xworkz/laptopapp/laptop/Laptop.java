package com.xworkz.laptopapp.laptop;

import com.xworkz.laptopapp.motherboard.MotherBoard;

public class Laptop {
    public boolean isPowerOn;
    public MotherBoard motherboard;

    public boolean installMotherboard(MotherBoard motherboard) {
        boolean isInstalled = false;
        if (isPowerOn) {
            if (motherboard != null) {
                this.motherboard = motherboard;
                this.motherboard.details();
                isInstalled = true;
            } else {
                System.out.println("Please provide valid motherboard details.");
            }
        } else {
            System.out.println("Laptop is powered off.");
        }
        return isInstalled;
    }
}
