package com.xworkz.tostringandequals.watermelon;

public class WaterMelon
{
    double weight;
    double cost;
    boolean stripped;

    public WaterMelon(double weight, double cost, boolean stripped)
    {
        this.weight = weight;
        this.cost = cost;
        this.stripped = stripped;
    }

    @Override
    public String toString()
    {
        return "Weight: " + weight + ", Cost: " + cost + ", Stripped: " + stripped;
    }

    @Override
    public boolean equals(Object obj)
    {
        WaterMelon leftSide=this;
        if(obj instanceof WaterMelon)
        {
            WaterMelon rightSide=(WaterMelon)obj;
            if(leftSide.weight==rightSide.weight && leftSide.cost==rightSide.cost && leftSide.stripped==rightSide.stripped)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
