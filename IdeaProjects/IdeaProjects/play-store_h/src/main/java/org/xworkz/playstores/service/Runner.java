package org.xworkz.playstores.service;

import org.xworkz.playstores.dto.AppDto;

public class Runner {

    public static void main(String[] args) {

    AppDto appDto = new AppDto(1,4.7,"100M+","1/12/12","Shree ganesha labs","5.4 MB");
    AppDto appDto1 = new AppDto(62,5.3,"200M+","2/2/2011","Duolingo","39MB");
    AppService service = new AppServiceImpl();


    service.validateAndSaveApp(appDto);
   service.addApps(appDto1);
    //AppDto getdetails = service.getAppById(50);
        //System.out.println(getdetails);
   // AppDto Update = service.updateDownloadSizeById("20MB",25);
      //  System.out.println(Update);
    //service.removeApp(10);
}
}
