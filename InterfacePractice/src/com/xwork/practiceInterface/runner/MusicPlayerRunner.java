package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.MusicPlayer;
import com.xwork.practiceInterface.interfacesClasses.Spotify;

public class MusicPlayerRunner {

    public static void main(String[] args) {

        MusicPlayer musicPlayer = new Spotify();

        musicPlayer.playSong();
        musicPlayer.pauseSong();
        musicPlayer.nextSong();
        musicPlayer.previousSong();

        MusicPlayer.playerInfo();
    }
}
