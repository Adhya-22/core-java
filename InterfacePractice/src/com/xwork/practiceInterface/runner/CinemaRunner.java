package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.Cinema;
import com.xwork.practiceInterface.interfacesClasses.Viewer;

public class CinemaRunner {

    public static void main(String[] args) {

        Cinema cinema = new Viewer();

        cinema.bookMovie();
        cinema.cancelMovie();
        cinema.watchTrailer();
        cinema.orderSnacks();

        Cinema.cinemaInfo();
    }
}
