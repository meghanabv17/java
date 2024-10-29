package com.xworkz.ssplogin.dao;

import com.xworkz.ssplogin.dto.SspDto;

public class SspDao {
    SspDto dto;

    public boolean login(SspDto dto) {
        System.out.println("Login started");
        boolean isloggingin = false;
        if (dto != null) {
            this.dto = dto;
            isloggingin = true;
        } else {
            System.out.println("Please provide valid details");
        }
        System.out.println("Login completed");
        return isloggingin;
    }
        public void getDetails()
        {
            System.out.println("The user name is: "+dto.userName);
            System.out.println("The adhar number is: "+dto.adharNo);
            System.out.println("The grade is: "+dto.gdr);
            System.out.println("The capta is: "+dto.capthar);
        }
}
