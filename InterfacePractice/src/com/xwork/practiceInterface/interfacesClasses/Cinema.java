package com.xwork.practiceInterface.interfacesClasses;

public interface Cinema {

    int screens = 5;
    String theatreName = "PVR";
    double popcornPrice = 250;

    void bookMovie();
    void cancelMovie();

    default void watchTrailer() {
        System.out.println("running watchTrailer in cinema interface");
    }

    default void orderSnacks() {
        System.out.println("running orderSnacks in cinema interface");
    }

    static void cinemaInfo() {
        System.out.println("running CinemaInfo in cinema interface");
    }
}