package com.xworkz.OverridingAndPolymorphism.Slipper;

public class OutdoorSlipper extends Slipper
{
    boolean waterproof;
    String design;

    @Override
    public void slip() {
        System.out.println("Outdoor slipper slipping in OutdoorSlipper");
    }

    @Override
    public void wear() {
        System.out.println("Outdoor slipper wearing in OutdoorSlipper");
    }

    @Override
    public String toString() {
        return "waterproof: " + waterproof+ " design: " + design;
    }
}
