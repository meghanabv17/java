package com.xworkz.wynkapp.app;

import com.xworkz.wynkapp.songs.Songs;

public interface App {
     void addSongs(Songs songs);
     void getAllSongs();
     String getSongById(int id);
     String getSongArtistByName(String name);
     String getNameById(int id);
     int getNumberOPlaysByName(String name);
     double getTimingsById(int id);
}
