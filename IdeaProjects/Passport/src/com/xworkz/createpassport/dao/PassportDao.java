package com.xworkz.createpassport.dao;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.xworkz.createpassport.dto.PassportDto;

public class PassportDao {
    PassportDto dto;

    public boolean createPassportUserDetails(PassportDto dto)
    {
        System.out.println("Creating passport details");
        boolean isDtocreated = false;
        if(null!=dto)
        {
            this.dto=dto;
            isDtocreated=true;
        }else{
            System.out.println("Please provide valid surname");
        }
        System.out.println("passport created");
        return isDtocreated;
    }
    public void getdetails(){
        System.out.println("The cpr location is:"+dto.cprLoc);
        System.out.println("The dcdr location is: "+dto.dcdrLoc);
        System.out.println("The surname is: "+dto.surNm);
        System.out.println("The given name is: "+dto.givenNm);
        System.out.println("The dob is: "+dto.doB);
        

    }
}
