package com.xwork.practiceInterface.interfacesClasses;

public interface Bus {

    int buses = 40;
    String depot = "KSRTC";
    double ticketRate = 120;

    void bookSeat();
    void cancelSeat();

    default void trackBus() {
        System.out.println("running track bus in bus interface");
    }

    default void emergencyContact() {
        System.out.println("running emergency contact in bus interface");
    }

    static void serviceInfo() {
        System.out.println("running service info in bus interface");
    }
}
