package com.xworkz.OverridingAndPolymorphism.Room;

public class HotelRoom extends Room
{
    boolean includesBreakfast;
    int numberOfBeds;

    public void rent()
    {
        System.out.println("rent in HotelRoom");
    }

    public void vacate()
    {
        System.out.println("vacate in HotelRoom");
    }

    @Override
    public String toString() {
        return "includesBreakfast=" + includesBreakfast + ", numberOfBeds=" + numberOfBeds;
    }
}
