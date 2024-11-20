package com.xworkz.examapp.hallticket;

public class HallTicket {

    public String candidateName;
    public String usn;
    public String subjectName;
    public String subjectCode;

public void getDetails(){
    System.out.println("The candidate name is: "+this.candidateName);
    System.out.println("The usn of the candidate is: "+this.usn);
    System.out.println("The subject name is: "+this.subjectName);
    System.out.println("The subject code is: "+this.subjectCode);
}
}
