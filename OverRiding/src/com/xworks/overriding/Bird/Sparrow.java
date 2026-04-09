package com.xworks.overriding.Bird;

public class Sparrow extends Bird{

    @Override
    public void fly()
    {
        System.out.println("Sparrow flies faster");
    }
}
