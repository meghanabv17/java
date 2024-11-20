package com.xworkz.patientinfo.dao;

import com.xworkz.patientinfo.dto.PatientInfoDto;

public class PatientInfoDao {

    public void getDetails(PatientInfoDto ref){
        System.out.println("The patient name is: "+ref.getPatientName());
        System.out.println("The hospital name is: "+ref.getHospitalName());
        System.out.println("Is patient is out of danger: "+ref.getPatientAlive());
        System.out.println("The address is: "+ref.getAddress());
        System.out.println("The patient wife number is: "+ref.getPatientWifeNo());
    }
}
