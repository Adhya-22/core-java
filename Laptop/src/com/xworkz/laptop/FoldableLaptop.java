package com.xworkz.laptop;

public class FoldableLaptop extends Laptop
{

    public FoldableLaptop(String brand, String model)
    {
        super(brand, model);
    }

    public void update()
    {
        System.out.println("UPDATE form child");
    }
}
