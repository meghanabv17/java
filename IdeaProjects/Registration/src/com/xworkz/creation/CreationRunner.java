package com.xworkz.creation;

import com.xworkz.creation.dao.CreationDao;
import com.xworkz.creation.dto.CreationDto;

public class CreationRunner {

    public static void main(String []arg){
        CreationDto dto = new CreationDto();

        dto.Name = "Melana";
        dto.fatherName = "Rudra";
        dto.motherName = "Rudri";
        dto.mobileNumber = 9599885520l;
        dto.securityQue = "Whats your fav colour";
        dto.securityAnswer = "Violet";

        CreationDao dao = new CreationDao();
        dao.createAccount(dto);
        dao.getDetails();

    }
        }
