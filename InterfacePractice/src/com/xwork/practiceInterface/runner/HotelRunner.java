package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.Guest;
import com.xwork.practiceInterface.interfacesClasses.Hotel;

public class HotelRunner {

    public static void main(String[] args) {

        Hotel hotel = new Guest();

        hotel.checkIn();
        hotel.checkOut();
        hotel.roomService();
        hotel.wifiService();

        Hotel.hotelInfo();
    }
}
