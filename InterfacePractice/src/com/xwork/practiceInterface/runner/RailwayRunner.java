package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.RailwayStation;
import com.xwork.practiceInterface.interfacesClasses.Traveller;

public class RailwayRunner
{
    public static void main(String[] args) {

        RailwayStation railwayStation = new Traveller();

        railwayStation.bookTicket();
        railwayStation.cancelTicket();
        railwayStation.enquiry();
        railwayStation.waitingRoom();

        RailwayStation.stationInfo();
    }
}
