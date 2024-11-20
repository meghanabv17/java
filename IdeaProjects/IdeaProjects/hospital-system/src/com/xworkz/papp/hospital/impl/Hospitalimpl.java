package com.xworkz.papp.hospital.impl;

import com.xworkz.papp.hospital.Hospital;
import com.xworkz.papp.patient.Patient;

public class Hospitalimpl implements Hospital {
    Patient patient[] = {null, null, null};
    int index;

    @Override
    public boolean addPatient(Patient patient) {
        boolean isAdded = false;
        if (patient != null) {
            if (patient.getPatientName() != null) {
                this.patient[index++] = patient;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void getPatient() {
        for (Patient patient : patient) {
                System.out.println("Patient details is: " + patient);

        }
    }

    @Override
    public boolean updatePatientAge(int patientId, int newAge) {
        for (int i = 0; i < patient.length; i++) {
            if (patient[i] != null && patient[i].getPatientId() == patientId) {
                patient[i].setAge(newAge);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deletePatient(int patientId) {
        for (int i = 0; i < patient.length; i++) {
            if (patient[i] != null && patient[i].getPatientId() == patientId) {
                patient[i] = null;
                return true;
            }
        }
        return false;
    }
}
