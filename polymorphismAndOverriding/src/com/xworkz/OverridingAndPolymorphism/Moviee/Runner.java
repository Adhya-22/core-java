package com.xworkz.OverridingAndPolymorphism.Moviee;

public class Runner
{
    public static void main(String[] args)
    {
        Movie movie = new Movie();
        movie.play();
        movie.pause();
        System.out.println(movie);

        DocumentaryMovie documentaryMovie = new DocumentaryMovie();
        documentaryMovie.play();
        documentaryMovie.pause();
        System.out.println(documentaryMovie);
    }
}
