package com.xworkz.exam;

import java.util.Scanner;

public class ExamRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fees that they wants to pay");
        int fees = scanner.nextInt();
        Exam exam = new CompetativeExam(fees);
        System.out.println("The fees is: "+exam.getFees());
        //cannot be created because You CAN instantiate an abstract class.
        // You only need to provide a concrete subclass
        //Exam exam1 = new Exam();
    }
}
