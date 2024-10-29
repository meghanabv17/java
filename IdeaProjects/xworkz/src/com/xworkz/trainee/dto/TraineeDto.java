package com.xworkz.trainee.dto;

public class TraineeDto {

    private String traineeName;
    private long phoneNumber;
    private String USN;
    private int refId;
    private String emailId;

    public TraineeDto()
    {
        System.out.println("Registration successfully");
    }

    public void setraineeName(String traineeName){
        this.traineeName = traineeName;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setUSN(String USN){
        this.USN = USN;
    }

    public String getUSN() {
        return USN;
    }

    public void setRefId(int refId){
        this.refId = refId;
    }

    public int getRefId() {
        return refId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }
}



