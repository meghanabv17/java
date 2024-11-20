package com.xworkz.createpassport;

import com.xworkz.createpassport.dao.PassportDao;
import com.xworkz.createpassport.dto.PassportDto;

public class PassportRunner {

    public static void main(String []args){
        PassportDto dto = new PassportDto();

        dto.cprLoc = "PO";
        dto.dcdrLoc = 8;
        dto.surNm = "Venkatesh";
        dto.givenNm = "Megha";
        dto.doB = "17/06/2002";
        dto.eMail = "meghajaanu75@gmail.com";
        dto.isemailLoginSm = true;
        dto.Pwd = "me123";
        dto.confirmPwd = "me123";
        dto.hintQue = "fav ques";
        dto.hintAnswer = "Violet";
        dto.capthar = "12Ry3";

        PassportDao dao = new PassportDao();
        dao.createPassportUserDetails(dto);
        dao.getdetails();
    }
}

