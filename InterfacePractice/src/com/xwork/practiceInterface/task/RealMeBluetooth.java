package com.xwork.practiceInterface.task;

public class RealMeBluetooth implements Bluetooth
{

    public void connect() {
        System.out.println("running connect in RealMeBluetooth");
    }

    public void disConnect() {
        System.out.println("running Disconnect in RealMeBluetooth");
    }

}
