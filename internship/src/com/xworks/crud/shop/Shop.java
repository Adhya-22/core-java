package com.xworks.crud.shop;

public class Shop
{
    String ownerName;
    String location;
    long contactNumber;
    String openingTime;
    String closingTime;

    public Shop(String ownerName, String location, long contactNumber, String openingTime, String closingTime) {
        this.ownerName = ownerName;
        this.location = location;
        this.contactNumber = contactNumber;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public void displayInfo()
    {
        System.out.println("owner Name "+this.ownerName);
        System.out.println("Location: "+this.location);
        System.out.println("contact Number: "+this.contactNumber);
        System.out.println("opening Time: "+this.openingTime);
        System.out.println("Closing Time : "+this.closingTime);
    }
}
