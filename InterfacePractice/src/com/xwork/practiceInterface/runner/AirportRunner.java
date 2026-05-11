package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.Airport;
import com.xwork.practiceInterface.interfacesClasses.Passenger;

public class AirportRunner {
    public static void main(String[] args) {

    Airport airport = new Passenger();

    airport.arrival();
    airport.departure();
    airport.securityCheck();
    airport.boarding();

    Airport.airportInfo();
}
}
