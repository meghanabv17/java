package com.xworkz.patient;

import com.xworkz.patient.address.Address;
import com.xworkz.patient.area.Area;
import com.xworkz.patient.city.City;
import com.xworkz.patient.country.Country;
import com.xworkz.patient.hospital.*;
import com.xworkz.patient.patienta.Patienta;
import com.xworkz.patient.state.State;
import com.xworkz.patient.street.Street;

import static com.xworkz.patient.constant.BloodGroup.AB_POSITIVE;
import static com.xworkz.patient.constant.Gender.*;

public class PatientRunner
{

    public static void main(String[] args)
    {

        Street street = new Street(1, "church");
        Area area = new Area("mejastic", street);
        City city = new City("bangalore", area);
        State state = new State("Karnataka", city);
        Country country = new Country("India", state);
        Address address = new Address(country);

        Patienta patient = new Patienta("Bhavya", address);
        //static import;
        // patient.gender = FEMALE;
        // patient.gender = MALE;

        // using enum;
        patient.gender = Female;
        patient.bloodGroup = AB_POSITIVE;
        patient.display();


        Hospital.cityName = "Banglore";
        //polymorphism
        Hospital hospital = new janardhanHospital();
        //typecasting
        janardhanHospital janardhan = (janardhanHospital) hospital;
        //down casting
        janardhan.isAmountPaid = true;

        hospital.addPatient(patient);
        hospital.admission(janardhan);
        System.out.println("janardhan hospital location is: "+Hospital.cityName);
        //System.out.println(hospital.hospitalName);

        //down casting --> explicit typecasting
        janardhanHospital janardan = (janardhanHospital) hospital;
        janardan.canteen();

        apolo apollo = new apolo();
        System.out.println("apolo hospital location is: "+Hospital.cityName);

        Vidyanarayana vidya = new Vidyanarayana();
        System.out.println("Vidyanarayana hospital location is: "+Hospital.cityName);

        Brundavana brundavana = new Brundavana();
        System.out.println("Brundavana hospital location is: "+Hospital.cityName);

    }
}