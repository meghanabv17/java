package com.xworkz.application.dao;

import com.xworkz.application.dto.ApplicatioDto;

public class ApplicationDao {
    ApplicatioDto dto;

    public boolean createApplication(ApplicatioDto dto)
    {
        System.out.println("Application started");
        boolean isApplicationCreated = false;
        if(dto != null)
        {
            this.dto = dto;
            isApplicationCreated = true;
        }else{
            System.out.println("please provide valid information");
        }
        System.out.println("Application created");
        return isApplicationCreated;
    }
    public void getApplication(){
        System.out.println("The account number is: "+dto.bankAccountNo);
        System.out.println("The bank name is: "+dto.bankNm);
        System.out.println("The credit score is: "+dto.creditSc);
        System.out.println("The intrest is: "+dto.rateOfInt);
        System.out.println("The type of loan is: "+dto.typeOfLoan);
    }
}
