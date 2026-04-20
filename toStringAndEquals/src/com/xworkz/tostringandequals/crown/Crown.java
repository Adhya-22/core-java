package com.xworkz.tostringandequals.crown;

public class Crown
{
    String material;
    double weight;
    int jewels;

    public  Crown(String material, double weight, int jewels)
    {
        this.material=material;
        this.weight=weight;
        this.jewels=jewels;
    }

    @Override
    public String toString() {
        return "Material: "+material+", Weight: "+weight+", Jewels: "+jewels;
    }

    @Override
    public boolean equals(Object obj)
    {
        Crown leftSide=this;
        if(obj instanceof Crown)
        {
            Crown rightSide=(Crown)obj;
            if(leftSide.material==rightSide.material && leftSide.weight==rightSide.weight && leftSide.jewels==rightSide.jewels)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
