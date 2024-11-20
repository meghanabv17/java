package com.xworkz.engineerapp;

import com.xworkz.engineerapp.cs.CsEngineer;
import com.xworkz.engineerapp.engineer.Engineer;

public class EngineerRunner
{
    public static void main(String[] args)
    {
        System.out.println("Main started");
        //parent ref = new child(); --> polymorphism;
        Engineer engineer = new Ecengineer();
        Engineer cs = new CsEngineer();
        cs.solveProblem();
        engineer.solveProblem();
        System.out.println("Main ended");
    }

    public static class Ecengineer extends Engineer {

        public Ecengineer() {
            System.out.println("ECEngineer object created");
        }

        @Override
        public void solveProblem() {
            System.out.println("EC engineer problem solving started");
            System.out.println("Solve complex problems by EC engineers");
            System.out.println("EC engineer problem solving ended");
        }
    }
}

//14 packages in java java.lang is the default one;
