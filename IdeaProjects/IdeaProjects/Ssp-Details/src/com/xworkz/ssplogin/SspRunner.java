package com.xworkz.ssplogin;

import com.xworkz.ssplogin.dao.SspDao;
import com.xworkz.ssplogin.dto.SspDto;

public class SspRunner {

    public static void main(String []arg){
        SspDto dto = new SspDto();

        dto.userName = "Anju";
        dto.adharNo = 5522336699771l;
        dto.capthar = "Adrf5";
        dto.gdr = "B.Com";

        SspDao dao = new SspDao();
        dao.login(dto);
        dao.getDetails();
    }
}
