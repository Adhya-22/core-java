package com.xworkz.OverridingAndPolymorphism.Room;

public class Room
{
    int roomNumber;
    double rent;
    String[] facilities;
    RoomType roomType;
    Owner owner;

    public void rent()
    {
        System.out.println("rent in Room");
    }

    public void vacate()
    {
        System.out.println("vacate in Room");
    }

    @Override
    public String toString() {
        return "RoomNumber :"+roomNumber+",rent :"+rent+",facilities :"+ facilities+",roomType :"+roomType+",owner :"+owner;
    }
}
