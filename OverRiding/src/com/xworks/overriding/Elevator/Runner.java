package com.xworks.overriding.Elevator;

public class Runner 
{
    public static void main(String[] args)
    {
        GlassElevator glassElevator=new GlassElevator();
        glassElevator.view();

        Elevator elevator1=new GlassElevator();
        elevator1.view();

        Elevator elevator2=new Elevator();
        elevator2.view();

    }
}
