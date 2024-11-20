package com.xworkz.wynkapp;

import com.xworkz.wynkapp.app.App;
import com.xworkz.wynkapp.impl.WynkImpl;
import com.xworkz.wynkapp.songs.Songs;

import java.util.Scanner;

public class WynkRunner {
    public static void main(String[] args) {

        App app = new WynkImpl();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 1; index++) {
            Songs songs = new Songs();
            songs.setId(1);
            songs.setName("Sevanthiye sevantiye");
            songs.setArtist(new String[] {"Balasubramanya"});
            songs.setTimings(4.36);
            songs.setNoOfPlays(100);
            app.addSongs(songs);
            app.getAllSongs();

            Songs songs1 = new Songs();
            songs1.setId(2);
            songs1.setName("Tu sagar mera");
            songs1.setArtist(new String[] {""});
            songs1.setTimings(4.23);
            songs1.setNoOfPlays(25);
            app.addSongs(songs1);
            app.getAllSongs();

            Songs song2 = new Songs();
            song2.setId(3);
            song2.setName("Neralanu kaanada latheyanthe");
            song2.setArtist(new String[]{"Balasubramanya"});
           /* System.out.println("Enter the id of the song");
            int id = scanner.nextInt();
            songs.setId(id);

            System.out.println("Enter the name of the song");
            String name = scanner.next();
            songs.setName(name);*/


        }

    }
}
