package com.xworkz.tostringandequals.diamond;

public class Diamond
{
    double carat;
    String color;
    double price;

    public Diamond(double carat, String color, double price)
    {
        this.carat = carat;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Carat : "+carat+", Color : "+color+", Price : "+price;
    }

    @Override
    public boolean equals(Object obj)
    {
        Diamond leftSide=this;
        if(obj instanceof Diamond)
        {
            Diamond rightSide=(Diamond)obj;
            if(leftSide.carat==rightSide.carat && leftSide.color==rightSide.color && leftSide.price==rightSide.price)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
