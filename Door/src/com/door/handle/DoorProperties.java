package com.door.handle;

public class DoorProperties
{
    double height;
    double width;
    double thickness;

    public DoorProperties(double height, double width, double thickness) {
        this.height = height;
        this.width = width;
        this.thickness = thickness;
    }

    public void info()
    {
        System.out.println("Height: "+this.height);
        System.out.println("Width: "+this.width);
        System.out.println("Thickness: "+this.thickness);
    }
}
