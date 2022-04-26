package com.company;

import java.util.List;

public class Musician extends Human {
    // Create musician fields and these are private fields
    private String musicSchool;
    private String genre;
    private List<String> songs;

    public Musician(String name, int age, Gender gender, float height, String musicSchool, String genre) {
        super(name, age, gender, height);
        this.musicSchool = musicSchool;
        this.genre = genre;
    }

    public String getMusicSchool() {
        return musicSchool;
    }

    public void setMusicSchool(String musicSchool) {
        this.musicSchool = musicSchool;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public int getTimeToLive(){
        return (LIFESPAN - getAge())/2;

    }
}
