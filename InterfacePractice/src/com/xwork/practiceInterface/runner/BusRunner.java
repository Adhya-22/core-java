package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.Bus;
import com.xwork.practiceInterface.interfacesClasses.SleeperCoach;

public class BusRunner {

    public static void main(String[] args) {

        Bus bus = new SleeperCoach();

        bus.bookSeat();
        bus.cancelSeat();
        bus.trackBus();
        bus.emergencyContact();

        Bus.serviceInfo();
    }
}
