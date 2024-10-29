package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;
import com.xworkz.examapp.supplementary.SupplementaryExam;

public class ExamRunner {

    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.fees = 1800;


        HallTicket ticket = new HallTicket();
        ticket.candidateName = "Munna";
        ticket.usn = "4CACSEC010";
        ticket.subjectName = "DSA";
        ticket.subjectCode = "18CS53";
        ticket.getDetails();
        exam.allow(ticket);

        Exam exam1 = new SupplementaryExam();
        exam1.fees= 300;
        exam1.allow(ticket);
    }
}
