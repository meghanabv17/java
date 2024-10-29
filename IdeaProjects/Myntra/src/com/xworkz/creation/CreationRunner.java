package com.xworkz.creation;

import com.xworkz.creation.dao.CreationDao;
import com.xworkz.creation.dto.CreationDto;

public class CreationRunner {

    public static void main(String []arg){
        CreationDto dto = new CreationDto();

        dto.userNm = "Mytri";
        dto.pwd = "Muu@12";
        dto.pNo = 9852361475l;
        dto.emailId = "mytri12@gmail.com";
        dto.doB = "17/08/2004";

        CreationDao dao = new CreationDao();
        dao.createAccount(dto);
        dao.grtDetails();

    }
}
