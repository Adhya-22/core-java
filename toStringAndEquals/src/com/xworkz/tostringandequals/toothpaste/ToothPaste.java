package com.xworkz.tostringandequals.toothpaste;

public class ToothPaste
{
    String name;
    int quantity;
    double price;

    public  ToothPaste(String name, int quantity, double price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }

    @Override
    public boolean equals(Object obj)
    {
        ToothPaste leftSide=this;
        if(obj instanceof ToothPaste)
        {
            ToothPaste rightSide=(ToothPaste)obj;
            if(leftSide.name==rightSide.name && leftSide.quantity==rightSide.quantity &&  leftSide.price==rightSide.price)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
