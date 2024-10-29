package com.xworkz.spotifyapp.lyrics;

import com.xworkz.spotifyapp.language.SongDetails;

public class User {

    public SongDetails selection;
    public int input =0;
    public boolean type(){
        boolean isthere = false;
        if(input == 1){
            System.out.println("kannada songs");
            if(selection != null){
                this.selection = selection;
                this.selection.getDetails();
                isthere = true;
            }
        }else System.out.println("Selected language cannot be added");
        return isthere;
    }
}
