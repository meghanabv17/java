package org.xworkz.playstores.service;

import org.xworkz.playstores.dao.AppDao;
import org.xworkz.playstores.dao.AppDaoImpl;
import org.xworkz.playstores.dto.AppDto;

public class AppServiceImpl implements AppService {

    boolean isValidated = false;
    boolean isIdValidated = false;
    boolean isAppAdded = false;

    AppDao appDao = new AppDaoImpl();

    @Override
    public boolean validateAndSaveApp(AppDto dto) {
        if (dto != null) {
            if (dto.getDownloads() != null && !dto.getDownloads().isEmpty()) {
                System.out.println("downloads validated");
                isValidated = true;
            }
            if(dto.getId() > 0){
                System.out.println("Id validated");
                isIdValidated = true;
            }
            if(dto.getDownloadSize() != null)
                System.out.println("Download size validated");
        }
        return isValidated;
    }

    @Override
    public void addApps(AppDto appdto) {
        if(appdto != null){
            System.out.println("product added successfully");
            isAppAdded = true;
        }else{
            System.out.println("Invalid app");
        }
            appDao.addApp(appdto);
    }

    @Override
    public AppDto getAppById(int id) {
        if(id>0){
            System.out.println("Get app details successfully");
            return appDao.getAppById(id);
        }
        return appDao.getAppById(id);
    }

    @Override
    public AppDto updateDownloadSizeById(String UpdatedSize, int id) {
        if(id>0 && UpdatedSize!=null)
        return appDao.updateDownloadSizeById(UpdatedSize,id);
        return null;
    }

    @Override
    public void removeApp(int id) {
        System.out.println("removed successfully");
    }
}
