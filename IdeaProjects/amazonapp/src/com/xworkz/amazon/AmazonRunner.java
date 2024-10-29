package com.xworkz.amazon;

import com.xworkz.amazon.dao.AmazonDao;
import com.xworkz.amazon.dto.AmazonDto;

    public class AmazonRunner {
        public static void main(String args[]) {
            AmazonDto amazonDto=new AmazonDto();
            amazonDto.setEmail("meghana@gmail.com");
            amazonDto.setPassword("abcd@12");
            amazonDto.setPhoneNo("8050266396");
            amazonDto.setAddresss("Mysore, karnakata");
            amazonDto.setUserName("akshatha");

            AmazonDao amazonDao=new AmazonDao();
            //amazonDao.createAmazonAccount(amazonDto);
            amazonDao.getDetails(amazonDto);
        }
}
