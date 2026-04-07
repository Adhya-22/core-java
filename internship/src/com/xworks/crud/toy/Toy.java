package com.xworks.crud.toy;

public class Toy
{
    double price;
    int ageGroup;
    double weight;
    int toyId;
    boolean isBatteryOperated;

    public Toy(double price, int ageGroup, double weight, int toyId, boolean isBatteryOperated)
    {
        this.price = price;
        this.ageGroup = ageGroup;
        this.weight = weight;
        this.toyId = toyId;
        this.isBatteryOperated = isBatteryOperated;
    }

    public void displayInfo()
    {
        System.out.println("Toy Id: "+this.toyId);
        System.out.println("Price: "+this.price);
        System.out.println("AgeGroup: "+this.ageGroup);
        System.out.println("Weight: "+this.weight);
        System.out.println("Toy Battery Operated: "+this.isBatteryOperated);
    }

}
