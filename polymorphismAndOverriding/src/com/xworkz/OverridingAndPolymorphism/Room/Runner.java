package com.xworkz.OverridingAndPolymorphism.Room;

public class Runner
{
    public static void main(String[] args)
    {
        Room room = new Room();
        room.rent();
        room.vacate();
        System.out.println(room);

        HotelRoom hotelRoom = new HotelRoom();
        hotelRoom.rent();
        hotelRoom.vacate();
        System.out.println(hotelRoom);
    }
}
