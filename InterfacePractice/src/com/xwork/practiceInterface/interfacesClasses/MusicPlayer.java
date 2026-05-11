package com.xwork.practiceInterface.interfacesClasses;

public interface MusicPlayer {

    int songs = 100;
    String appName = "Spotify";
    double subscription = 999;

    void playSong();
    void pauseSong();

    default void nextSong() {
        System.out.println("running next song in music player interface");
    }

    default void previousSong() {
        System.out.println("running previous song in music player interface");
    }

    static void playerInfo() {
        System.out.println("running player in music player interface");
    }
}
