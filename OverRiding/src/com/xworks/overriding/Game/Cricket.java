package com.xworks.overriding.Game;

public class Cricket extends Game{

    @Override
    public void play() {
        System.out.println("cricket is played between 2 teams");
    }
}
