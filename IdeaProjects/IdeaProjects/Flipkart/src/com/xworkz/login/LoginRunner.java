package com.xworkz.login;

import com.xworkz.login.dao.LoginDao;
import com.xworkz.login.dto.LoginDto;

public class LoginRunner {

    public static void main(String []arg){
        LoginDto dto = new LoginDto();

        dto.userNm = "bujji";
        dto.pwd = "bu@12";
        dto.pNo = 9874521365l;
        dto.doB = "12/1/2001";
        dto.emailId = "bujji212@gmail.com";

        LoginDao dao = new LoginDao();
        dao.createAccount(dto);
        dao.getdetails();
    }
}
