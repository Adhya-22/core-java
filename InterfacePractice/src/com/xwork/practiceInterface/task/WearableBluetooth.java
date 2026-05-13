package com.xwork.practiceInterface.task;

public class WearableBluetooth implements Bluetooth
{
    public void connect() {
        System.out.println("running connect in WearableBluetooth");
    }

    public void disConnect() {
        System.out.println("running Disconnect in WearableBluetooth");
    }
}
