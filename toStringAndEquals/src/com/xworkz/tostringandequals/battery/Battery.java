package com.xworkz.tostringandequals.battery;

public class Battery
{
    String type;
    int capacity;
    double voltage;

    public  Battery(String type, int capacity, double voltage)
    {
        this.type=type;
        this.capacity=capacity;
        this.voltage=voltage;
    }

    @Override
    public String toString() {
        return "Type : "+type+" Capacity : "+capacity+" Voltage : "+voltage;
    }

    @Override
    public boolean equals(Object obj)
    {
        Battery leftSide=this;
        if(obj instanceof Battery)
        {
            Battery rightSide=(Battery)obj;
            if(leftSide.type==rightSide.type && leftSide.capacity==rightSide.capacity && leftSide.voltage==rightSide.voltage);
        }
        return super.equals(obj);
    }
}
