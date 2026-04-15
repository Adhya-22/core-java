package com.xworkz.OverridingAndPolymorphism.Plate;

public class Plate
{
    int diameter;
    double price;
    String[] designs;
    PlateType plateType;
    ManufacturerDetail manufacturerDetail;

    public void stack()
    {
        System.out.println("stack in Plate");
    }

    public void wash()
    {
        System.out.println("wash in Plate");
    }

    @Override
    public String toString() {
        return "Diameter :"+diameter+" ,Price :"+price+" ,Designs :"+designs+", plateType :"+plateType+" ,manufacturerDetail :"+manufacturerDetail;
    }
}
