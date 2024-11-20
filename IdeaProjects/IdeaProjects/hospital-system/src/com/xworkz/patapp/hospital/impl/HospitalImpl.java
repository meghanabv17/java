package com.xworkz.patapp.hospital.impl;

import com.xworkz.patapp.hospital.Hospital;
import com.xworkz.patapp.patient.Patient;

public class HospitalImpl implements Hospital{
Patient patient;
    @Override


    public boolean patient(Patient patient) {
        boolean isAdded = false;
        if(patient != null){
            if(patient.getName() != null){
                this.patient = patient;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void getPatientDetails() {
        System.out.println("The patient details is: "+this.patient);
    }

    @Override
    public boolean updatePatientAge() {
        return false;
    }

    @Override
    public boolean deletePatientDetails() {
        return false;
    }
}
