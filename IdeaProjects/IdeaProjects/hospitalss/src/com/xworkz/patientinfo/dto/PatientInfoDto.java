package com.xworkz.patientinfo.dto;

public class PatientInfoDto {

    private String patientName;
    private String hospitalName;
    private String PatientAlive;
    private String address;
    private long patientWifeNo;

    public void setPatientName(String patientName){
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setPatientAlive(String patientAlive) {
        PatientAlive = patientAlive;
    }

    public String getPatientAlive() {
        return PatientAlive;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPatientWifeNo(long patientWifeNo) {
        this.patientWifeNo = patientWifeNo;
    }

    public long getPatientWifeNo() {
        return patientWifeNo;
    }
}
