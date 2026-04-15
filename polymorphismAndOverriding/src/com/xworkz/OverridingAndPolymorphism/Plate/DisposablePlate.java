package com.xworkz.OverridingAndPolymorphism.Plate;

public class DisposablePlate extends Plate
{
    boolean biodegradable;
    String materialType;

    public void stack()
    {
        System.out.println("stack in DisposablePlate");
    }

    public void wash()
    {
        System.out.println("wash in DisposablePlate");
    }

    @Override
    public String toString() {
        return "biodegradable :"+biodegradable+" ,materialType :"+materialType;
    }
}
