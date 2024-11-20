package com.xworkz.wynkapp.songs;

import java.util.Arrays;

public class Songs {

    public int id;
    public String name;
    public String artist[];
    public double timings;
    public int noOfPlays;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArtist(String artist[]) {
        this.artist = artist;
    }

    public String[] getArtist() {
        return artist;
    }

    public void setTimings(double timings) {
        this.timings = timings;
    }

    public double getTimings() {
        return timings;
    }

    public void setNoOfPlays(int noOfPlays) {
        this.noOfPlays = noOfPlays;
    }

    public int getNoOfPlays() {
        return noOfPlays;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artist=" + Arrays.toString(artist) +
                ", timings=" + timings +
                ", noOfPlays=" + noOfPlays +
                '}';
    }
}
