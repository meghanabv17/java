package com.xworkz.insuranceapp;

import com.xworkz.insuranceapp.bike.BikeInsurance;
import com.xworkz.insuranceapp.car.CarInsurance;
import com.xworkz.insuranceapp.health.HealthInsurance;
import com.xworkz.insuranceapp.life.LifeInsurance;

public class InsuranceRunner {
    public static void main(String[] args) {
        Insurance insurance = new BikeInsurance();
        insurance.claim();
        CarInsurance carinsurance = new CarInsurance();
        carinsurance.claim();
        HealthInsurance healthinsurance = new HealthInsurance();
        healthinsurance.claim();
        LifeInsurance lifeinsurance = new LifeInsurance();
        lifeinsurance.claim();
    }
}
