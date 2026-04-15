package com.xworkz.OverridingAndPolymorphism.Slipper;

public class Slipper
{
    int size;
    double price;
    String[] colors;
    Type type;
    Brand brand;

    public void slip()
    {
        System.out.println("Slipper slipping in Slipper");
    }

    public void wear()
    {
        System.out.println("Slipper wearing in Slipper");
    }

    public String toString() {
        return "Size: "+size+",Price: "+price+", Type: "+type+", brand: "+brand;
    }
}
