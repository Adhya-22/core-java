package com.xworks.overriding.Turbine;

public class Fan extends Turbine{

    @Override
    public void rotate() {
        System.out.println("blows cool air");
    }
}
