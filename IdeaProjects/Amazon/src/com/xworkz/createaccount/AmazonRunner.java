package com.xworkz.createaccount;

import com.xworkz.createaccount.dao.CreateAccountdao;
import com.xworkz.createaccount.dto.CreateAccountDto;

public class AmazonRunner {

    public static void main(String [] args){
        CreateAccountDto dto = new CreateAccountDto();

        dto.userNm = "Meena";
        dto.pwd = "Meena@123";
        dto.pNo = 9632587412L;
        dto.doB = "17/02/2003";
        dto.emailId = "Meena12@gmail.com";

        CreateAccountdao dao = new CreateAccountdao();
        dao.CreateAccountDetails(dto);
        dao.getDetails();
    }
}
