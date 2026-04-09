package com.xworks.overriding.Elevator;

public class GlassElevator extends Elevator
{
    @Override
    public void view()
    {
        System.out.println("outside view");
    }

}
