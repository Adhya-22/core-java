package com.xwork.practiceInterface.task.Usage;

import com.xwork.practiceInterface.task.Bluetooth;

public class Device
{
    private Bluetooth bluetooth;

    public Device(Bluetooth bluetooth)
    {
        this.bluetooth=bluetooth;
    }

    public void shareFiles()
    {
        System.out.println("Share files in Device");
        if(this.bluetooth!=null)
        {
            this.bluetooth.connect();
            System.out.println("sharing files");
            this.bluetooth.disConnect();
            System.out.println("disconnected from Device");
        }


    }



}
