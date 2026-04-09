package com.xworks.overriding.Train;

public class Runner 
{
    public static void main(String[] args)
    {
        BulletTrain bulletTrain=new BulletTrain();
        bulletTrain.travel();

        Train train1=new BulletTrain();
        train1.travel();

        Train train2=new Train();
        train2.travel();

    }
}
