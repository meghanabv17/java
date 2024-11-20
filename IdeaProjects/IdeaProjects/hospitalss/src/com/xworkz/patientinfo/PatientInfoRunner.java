package com.xworkz.patientinfo;

import com.xworkz.patientinfo.dao.PatientInfoDao;
import com.xworkz.patientinfo.dto.PatientInfoDto;

public class PatientInfoRunner {

    public static void main(String[] args) {
        PatientInfoDto dto = new PatientInfoDto();
        dto.setPatientName("Shiva");
        dto.setHospitalName("Neuro care");
        dto.setPatientAlive("False");
        dto.setAddress("Banglore");
        dto.setPatientWifeNo(8523698741l);

        PatientInfoDao dao = new PatientInfoDao();
        dao.getDetails(dto);

        PatientInfoDto dto1 = new PatientInfoDto();
        dto1.setPatientName("Anil");
        dto1.setHospitalName("Neuro Zone");
        dto1.setPatientAlive("True");
        dto1.setAddress("Banglore");
        dto1.setPatientWifeNo(8547988852l);

        PatientInfoDao dao1 = new PatientInfoDao();
        dao.getDetails(dto1);
    }
}
