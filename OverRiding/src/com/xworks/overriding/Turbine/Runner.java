package com.xworks.overriding.Turbine;

public class Runner 
{
    public static void main(String[] args)
    {
        Fan fan=new Fan();
        fan.rotate();

        Turbine turbine1=new Fan();
        turbine1.rotate();

        Turbine turbine2=new Turbine();
        turbine2.rotate();
    }
}
