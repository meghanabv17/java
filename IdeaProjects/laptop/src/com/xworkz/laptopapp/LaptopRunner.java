package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.Laptop;
import com.xworkz.laptopapp.motherboard.MotherBoard;

public class LaptopRunner {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.isPowerOn = true;

        MotherBoard motherboard = new MotherBoard();
        motherboard.model = "Intel Z590";
        motherboard.ramCapacity = "32GB";
        motherboard.processor = "Intel Core i7";
        motherboard.graphicsCard = "NVIDIA GeForce RTX 3080";

        laptop.installMotherboard(motherboard);
    }
}
