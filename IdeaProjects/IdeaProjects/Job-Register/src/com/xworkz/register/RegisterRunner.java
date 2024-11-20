package com.xworkz.register;

import com.xworkz.register.dao.RegisterDao;
import com.xworkz.register.dto.RegisterDto;

public class RegisterRunner {

    public static void main(String []arg){
        RegisterDto dto = new RegisterDto();

        dto.fullNm = "Abbu";
        dto.phoneNo = 9586325874l;
        dto.emailid = "abbu12@gmail.com";
        dto.pwd = "Abbu@12";
        dto.jobtype = "Fulltime";

        RegisterDao dao = new RegisterDao();
        dao.createAccount(dto);
        dao.getDetails();
    }
}
