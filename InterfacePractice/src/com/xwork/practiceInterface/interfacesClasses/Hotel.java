package com.xwork.practiceInterface.interfacesClasses;

public interface Hotel {

    int rooms = 50;
    String hotelName = "Royal Stay";
    float rent = 2500.5f;

    void checkIn();
    void checkOut();

    default void roomService() {
        System.out.println("running room service in Hotel interface");
    }

    default void wifiService() {
        System.out.println("running wifi service in Hotel interface");
    }

    static void hotelInfo() {
        System.out.println("running hotel info in Hotel interface");
    }
}
