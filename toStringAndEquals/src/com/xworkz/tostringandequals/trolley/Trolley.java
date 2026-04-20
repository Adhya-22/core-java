package com.xworkz.tostringandequals.trolley;

public class Trolley
{
    int wheels;
    boolean hasLock;
    String material;

    public Trolley(int wheels, boolean hasLock, String material)
    {
        this.wheels = wheels;
        this.hasLock = hasLock;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheels + ", Has Lock: " + hasLock + ", Material: " + material;
    }

    @Override
    public boolean equals(Object obj)
    {
        Trolley leftSide=this;
        if(obj instanceof Trolley)
        {
            Trolley rightSide=(Trolley)obj;
            if(leftSide.wheels==rightSide.wheels && leftSide.hasLock==rightSide.hasLock &&  leftSide.material==rightSide.material)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
