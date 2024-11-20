package org.xworkz.playstores.service;

import org.xworkz.playstores.dto.AppDto;

public interface AppService {

    boolean validateAndSaveApp(AppDto dto);
    void addApps(AppDto appdto);
    AppDto getAppById(int id);
    AppDto updateDownloadSizeById(String UpdatedSize, int id);
    void removeApp(int id);
}
