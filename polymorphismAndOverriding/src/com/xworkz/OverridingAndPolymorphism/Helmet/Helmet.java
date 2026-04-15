package com.xworkz.OverridingAndPolymorphism.Helmet;

public class Helmet
{
    int size;
    double weight;
    String[] availableColors;
    HelmetType helmetType;
    Manufacturer manufacturer;

    public void wear()
    {
        System.out.println("wear in Helmet.");
    }
    public void protect()
    {
        System.out.println("Protecting in Helmet.");
    }

    @Override
    public String toString() {
        return "size : " + size + ", weight : " + weight + ", type : " + helmetType + ", manufacturer : " + manufacturer;
    }
}
