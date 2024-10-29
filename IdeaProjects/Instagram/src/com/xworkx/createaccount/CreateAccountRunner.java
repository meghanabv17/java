package com.xworkx.createaccount;

import com.xworkx.createaccount.dao.CreateAccountDao;
import com.xworkx.createaccount.dto.CreateAccountDto;

public class CreateAccountRunner {

    public static void main(String []arg){
        CreateAccountDto dto = new CreateAccountDto();

        dto.userNm = "Venkatesh__megha";
        dto.pwd = "Megha@123";
        dto.phoneNo = "8020235655";
        dto.emailid = "megha@123gmail.com";
        dto.doB = "12/5/2010";

        CreateAccountDao dao = new CreateAccountDao();
        dao.createNewAccount(dto);
        dao.getdetails();
    }
}
