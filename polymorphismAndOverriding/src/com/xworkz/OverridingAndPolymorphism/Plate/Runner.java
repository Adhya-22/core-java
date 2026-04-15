package com.xworkz.OverridingAndPolymorphism.Plate;

public class Runner
{
    public static void main(String[] args)
    {
        Plate plate = new Plate();
        plate.stack();
        plate.wash();
        System.out.println(plate);

        DisposablePlate disposablePlate = new DisposablePlate();
        disposablePlate.stack();
        disposablePlate.wash();
        System.out.println(disposablePlate);
    }
}
