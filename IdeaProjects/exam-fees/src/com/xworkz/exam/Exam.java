package com.xworkz.exam;

public abstract class Exam {
    private int fees;

    public int getFees() {
        return fees;
    }
    public Exam(int fees){
        this.fees = fees;
    }
}
