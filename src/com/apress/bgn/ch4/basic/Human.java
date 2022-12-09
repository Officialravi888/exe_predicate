package com.apress.bgn.ch4.basic;

import com.Method.Human;

import java.util.List;

import static com.Method.Human.LIFESPAN;

class Musician extends Human {
    private String musicSchool;
    private String genre;
    private List<String> songs;
    public Musician(String name, int age, float height,
                    String musicSchool, String genre) {
        super();
        this.musicSchool = musicSchool;
        this.genre = genre;
    }
    public int getTimeToLive() {
        return (LIFESPAN - getAge()) / 2;
    }

    private int getAge() {
        return 0;
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
}