package com.xwork.practiceInterface.task;

public class HathwayRemote implements Remote
{
    public void turnOff() {
        System.out.println("running turn off in HathwayRemote");
    }

    public void turnOn()
    {
        System.out.println("running turn on in HathwayRemote");
    }

}
