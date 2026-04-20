package com.xworkz.tostringandequals.sim;

public class Sim
{
    String networkType;
    boolean isActive;
    String planType;

    public Sim(String networkType,boolean isActive,String planType)
    {
        this.networkType=networkType;
        this.isActive=isActive;
        this.planType=planType;
    }

    @Override
    public String toString() {
        return "Network Type : "+networkType+" ,Active : "+isActive+" ,Plan Type : "+planType;
    }

    @Override
    public boolean equals(Object obj)
    {
        Sim leftSide=this;
        if(obj instanceof Sim)
        {
            Sim rightSide=(Sim)obj;
            if(leftSide.networkType==rightSide.networkType && leftSide.isActive==rightSide.isActive && leftSide.planType==rightSide.planType)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
