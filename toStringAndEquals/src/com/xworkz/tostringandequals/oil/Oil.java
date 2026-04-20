package com.xworkz.tostringandequals.oil;

public class Oil
{
    String type;
    double price;
    int quantity;

    public  Oil(String type, double price, int quantity)
    {
        this.type=type;
        this.price=price;
        this.quantity=quantity;
    }

    @Override
    public String toString()
    {
        return "Type: "+type+", Price: "+price+", Quantity: "+quantity;
    }

    @Override
    public boolean equals(Object obj)
    {
        Oil leftSide=this;
        if(obj instanceof Oil)
        {
            Oil rightSide=(Oil)obj;
            if(leftSide.type==rightSide.type && leftSide.price==rightSide.price && leftSide.quantity==rightSide.quantity)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
