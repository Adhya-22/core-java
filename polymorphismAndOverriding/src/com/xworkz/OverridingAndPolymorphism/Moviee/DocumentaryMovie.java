package com.xworkz.OverridingAndPolymorphism.Moviee;

public class DocumentaryMovie extends Movie
{
    String topic;
    boolean realFootage;

    @Override
    public void play() {
        System.out.println("Playing in DocumentaryMovie");
    }

    @Override
    public void pause() {
        System.out.println("Paused in DocumentaryMovie");
    }

    @Override
    public String toString() {
        return "Topic : "+topic+"realFootage : "+realFootage;
    }
}
