package com.xworkz.patient.hospital;

import com.xworkz.patient.patienta.Patienta;

public class Hospital {

        Patienta patient;
        public static String cityName;
    public void admission(Hospital hospital)
    {
        System.out.println("Patient admitted in "+hospital.getClass().getSimpleName());
    }

        public boolean addPatient(Patienta patient) {
            System.out.println("Parent class started");
            boolean isPatientAdded = false;
            if (patient != null) {
                if (patient.pName != null) {
                    this.patient = patient;
                    System.out.println("Patient was eligable to admit in our zone.....!!");
                    isPatientAdded=true;
                    System.out.println("parent class ended");
                }
            }
            return isPatientAdded;

        }



    }
