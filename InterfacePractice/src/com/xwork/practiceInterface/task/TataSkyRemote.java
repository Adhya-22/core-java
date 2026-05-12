package com.xwork.practiceInterface.task;

public class TataSkyRemote implements Remote
{
    public void turnOff() {
        System.out.println("running turn off in TataSkyRemote");
    }

    public void turnOn()
    {
        System.out.println("running turn on in TataSkyRemote");
    }
}
