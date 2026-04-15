package com.xworkz.OverridingAndPolymorphism.Moviee;

public class Movie
{
    int duration;
    double rating;
    String[] cast;
    Genre genre;
    Director director;

    public void play()
    {
        System.out.println("Playing Movie in Movie");
    }

    public void pause()
    {
        System.out.println("Pausing Movie in Movie");
    }

    @Override
    public String toString() {
        return "Duration : "+duration+"Rating : "+rating+" Genre : "+genre+" Director : "+director;
    }
}
