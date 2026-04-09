package com.xworks.overriding.Train;

public class BulletTrain extends Train
{
    @Override
    public void travel()
    {
        System.out.println("Fast speed");
    }
}
