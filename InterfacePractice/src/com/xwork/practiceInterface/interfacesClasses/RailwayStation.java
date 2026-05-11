package com.xwork.practiceInterface.interfacesClasses;

public interface RailwayStation {

    int platforms = 8;
    String stationName = "Mysore Junction";
    float fare = 150.5f;

    void bookTicket();
    void cancelTicket();

    default void enquiry() {
        System.out.println("running enquiry in RailwayStation interface");
    }

    default void waitingRoom() {
        System.out.println("running waitingRoom in RailwayStation interface");
    }

    static void stationInfo() {
        System.out.println("running stationInfo in RailwayStation interface");
    }
}
