package com.xworkz.patapp.hospital;

import com.xworkz.patapp.patient.Patient;

public interface Hospital {

    boolean patient(Patient patient);
    void getPatientDetails();
    boolean updatePatientAge();
    boolean deletePatientDetails();
}
