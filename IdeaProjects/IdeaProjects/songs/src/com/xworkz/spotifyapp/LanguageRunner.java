package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.language.SongDetails;
import com.xworkz.spotifyapp.lyrics.User;

public class LanguageRunner {

    public static void main(String[] args) {
        User use = new User();
        use.input = 1;

        SongDetails details = new SongDetails();
        details.songName = "Chendutiya pakkadali tumba hattira ninthu";
        details.language = "Kannada";
        details.movieName = "Drama";
        details.singerName = "Sonu Nigam";
        details.duration = 4.30;
        details.songType = "Melody";
        details.getDetails();
    }
}
