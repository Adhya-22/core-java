package com.xwork.practiceInterface.task.Usage;

import com.xwork.practiceInterface.task.OperatingSystem;

public class Dell
{
    private OperatingSystem operatingSystem;

    public Dell(OperatingSystem operatingSystem)
    {
        this.operatingSystem = operatingSystem;
    }

    public void run()
    {
        System.out.println("running run in Dell");
        if(this.operatingSystem!=null)
        {
            this.operatingSystem.start();
            this.operatingSystem.boot();
            this.operatingSystem.stop();
        }
    }
}
