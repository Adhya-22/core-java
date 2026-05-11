package com.xwork.practiceInterface.interfacesClasses;

public interface Airport {

    int terminals = 3;
    String city = "Bangalore";
    float ticketPrice = 4500.5f;

    void arrival();
    void departure();

    default void securityCheck() {
        System.out.println("running securityCheck in Airport interface");
    }

    default void boarding() {
        System.out.println("running boarding in Airport interface");
    }

    static void airportInfo() {
        System.out.println("running airportInfo in Airport interface");
    }
}

