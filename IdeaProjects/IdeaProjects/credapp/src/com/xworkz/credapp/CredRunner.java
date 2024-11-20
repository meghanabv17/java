package com.xworkz.credapp;

import com.xworkz.credapp.dto.CredDto;

public class CredRunner {

    public static void main(String[] args) {
        System.out.println("Main started");
        CredDto credDto = new CredDto();
        credDto.setCardId(12);
        credDto.setCardHolderName("Megha");
        credDto.setCvv(365);
        credDto.setCardNumber(2563987412365147L);
        credDto.setExpiryDate("24/26");
        System.out.println(credDto.getCardId());
        System.out.println(credDto.getCardHolderName());
        System.out.println(credDto.getCvv());
        System.out.println(credDto.getCardNumber());
        System.out.println(credDto.getExpiryDate());
        System.out.println("Main ended");
    }
}
