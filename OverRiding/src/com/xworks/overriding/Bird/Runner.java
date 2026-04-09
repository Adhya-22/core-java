package com.xworks.overriding.Bird;

public class Runner 
{
    public static void main(String[] args)
    {
        Sparrow sparrow=new Sparrow();
        sparrow.fly();

        Bird bird1=new Sparrow();
        bird1.fly();

        Bird bird2=new Bird();
        bird2.fly();
    }
}
