package com.xworkz.laptopapp.motherboard;

import com.xworkz.laptopapp.laptop.Laptop;

public class MotherBoard extends Laptop {
    public String model;
    public String ramCapacity;
    public String processor;
    public String graphicsCard;

    public void details() {
        System.out.println("Motherboard Details...");
        System.out.println("Model: " + model);
        System.out.println("RAM Capacity: " + ramCapacity);
        System.out.println("Processor: " + processor);
        System.out.println("Graphics Card: " + graphicsCard);
    }
}
