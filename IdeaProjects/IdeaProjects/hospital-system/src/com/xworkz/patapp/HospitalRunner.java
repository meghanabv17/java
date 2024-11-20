package com.xworkz.patapp;

import com.xworkz.patapp.hospital.Hospital;
import com.xworkz.patapp.hospital.impl.HospitalImpl;
import com.xworkz.patapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.setPatientId(12);
        patient.setName("Baba");
        patient.setAge(72);
        patient.setAddress("Banglore");
        Hospital hospital = new HospitalImpl();
        hospital.patient(patient);
        hospital.getPatientDetails();
    }
}
