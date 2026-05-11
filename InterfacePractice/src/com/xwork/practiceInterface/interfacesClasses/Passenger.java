package com.xwork.practiceInterface.interfacesClasses;

public class Passenger implements Airport {

    public void arrival() {
        System.out.println("implemented arrival in Passenger class");
    }

    public void departure() {
        System.out.println("implemented departure in Passenger class");
    }
}
