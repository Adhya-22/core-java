package com.xworkz.laptop;

public class Laptop
{
    String brand;
    String model;

    public Laptop(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

    public void update()
    {
        System.out.println("UPDATE form Parent");
    }


}
