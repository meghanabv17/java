package com.xworkz.wynkapp.impl;

import com.xworkz.wynkapp.app.App;
import com.xworkz.wynkapp.songs.Songs;

public class WynkImpl implements App {

    Songs songs[] = new Songs[1];
    int index;
    boolean isAdded = false;
    @Override
    public void addSongs(Songs songs) {
        if(songs != null){
            if(songs.id > 0 && songs.name != null){
                this.songs[index] = songs;
                isAdded = true;
            }
        }
    }

    @Override
    public void getAllSongs() {
        for(Songs ref : songs)
            System.out.println("Songs details are: "+ref);
    }

    @Override
    public String getSongById(int id) {
        return "";
    }

    @Override
    public String getSongArtistByName(String name) {
        return "";
    }

    @Override
    public String getNameById(int id) {
        return "";
    }

    @Override
    public int getNumberOPlaysByName(String name) {
        return 0;
    }

    @Override
    public double getTimingsById(int id) {
        return 0;
    }
}
