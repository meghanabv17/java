package com.xworkz.application;

import com.xworkz.application.dao.ApplicationDao;
import com.xworkz.application.dto.ApplicatioDto;

public class ApplicationRunner {

    public static void main(String []agr){
        ApplicatioDto dto = new ApplicatioDto();

        dto.bankAccountNo = 12365478963l;
        dto.bankNm = "Axis bank";
        dto.creditSc = 750;
        dto.rateOfInt = 5.00;
        dto.typeOfLoan = "Educational loan";

        ApplicationDao dao = new ApplicationDao();
        dao.createApplication(dto);
        dao.getApplication();
    }
}
