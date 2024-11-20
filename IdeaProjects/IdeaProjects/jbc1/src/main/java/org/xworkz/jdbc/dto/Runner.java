package org.xworkz.jdbc.dto;

import org.xworkz.jdbc.dao.GuiceDao;
import org.xworkz.jdbc.dao.GuiceDaoImpl;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main started");
        AddsDto addsDto = new AddsDto();
        addsDto.setId(2);
        addsDto.setName("Kiwi");
        addsDto.setQuantity(2);
        addsDto.setPrice(120.0);
        GuiceDao guiceDao = new GuiceDaoImpl();
        guiceDao.insertGuice(addsDto);

        System.out.println("Main ended");
    }
}
