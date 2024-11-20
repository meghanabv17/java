package com.xworkz.engineerapp.cs;

import com.xworkz.engineerapp.engineer.Engineer;

public class CsEngineer extends Engineer {

    public CsEngineer() {
        System.out.println("CSEngineer object created");
    }

    @Override
    public void solveProblem() {
        System.out.println("CS engineer problem solving started");
        System.out.println("Solve complex problems by CS engineers");
        System.out.println("CS engineer problem solving ended");
    }
}

