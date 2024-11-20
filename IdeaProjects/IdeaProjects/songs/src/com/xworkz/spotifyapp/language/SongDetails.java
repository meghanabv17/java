package com.xworkz.spotifyapp.language;

public class SongDetails {

        public String songName;
        public String language;
        public String movieName;
        public String singerName;
        public double duration;
        public String songType;

        public void getDetails(){
            System.out.println("The song name is: "+this.songName);
            System.out.println("The language of the song is: "+this.language);
            System.out.println("The movie name is: "+this.movieName);
            System.out.println("The singer name is: "+this.singerName);
            System.out.println("The duration of the song is: "+duration);
            System.out.println("The song type is: "+this.songType);
        }
}


