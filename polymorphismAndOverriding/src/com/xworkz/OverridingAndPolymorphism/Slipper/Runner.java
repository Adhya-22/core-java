package com.xworkz.OverridingAndPolymorphism.Slipper;

public class Runner
{
    public static void main(String[] args) {

        Slipper slipper = new Slipper();
        slipper.slip();
        slipper.wear();
        System.out.println(slipper);

        OutdoorSlipper outdoor = new OutdoorSlipper();
        outdoor.slip();
        outdoor.wear();
        System.out.println(outdoor);
    }
}
