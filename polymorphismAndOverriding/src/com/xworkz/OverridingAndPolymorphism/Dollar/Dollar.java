package com.xworkz.OverridingAndPolymorphism.Dollar;

public class Dollar
{
    int serialNumber;
    double valueInINR;
    String[] usagePlaces;
    Status status;
    Issuer issuer;

    public void pay()
    {
        System.out.println("Pay in Dollar");
    }

    public void convert()
    {
        System.out.println("Convert to Dollar");
    }

    public String toString() {
        return "Serial: " + serialNumber + ", ValueINR: " + valueInINR + ", Status: " + status + ", " + issuer;
    }
}
