package com.xworkz.patient.hospital;

import com.xworkz.patient.patienta.Patienta;

public class Vidyanarayana extends Hospital{

    public boolean isAmountPaid=true;

    @Override
    public boolean addPatient(Patienta patient) {
        System.out.println("Child class started");
        boolean isPatientAdded=false;
        if(isAmountPaid==true) {
            super.addPatient(patient);
            isPatientAdded = true;
            System.out.println("Child class ended");
        }
        else System.out.println("Please Pay the Amount........");
        return isPatientAdded;
    }

}
