package org.xworkz.playstores.dao;

import org.xworkz.playstores.dto.AppDto;

public interface AppDao {

    void addApp(AppDto appDto);
    AppDto getAppById(int id);
    AppDto updateDownloadSizeById(String UpdatedSize, int id);
    void removeApp(int id);
}
