package com.towel.store;

public class Towel
{
    String color;
    String size;

    public Towel(String color, String size)
    {
        this.color = color;
        this.size = size;
    }

    public void info()
    {
        System.out.println("color: "+this.color);
        System.out.println("size: "+this.size);
    }
}
