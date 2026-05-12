package com.xwork.practiceInterface.task;

public class WindowsOperatingSystem implements OperatingSystem
{

    public void boot() {
        System.out.println("running boot in WindowsOperatingSystem");
    }

    public void start() {
        System.out.println("running start in WindowsOperatingSystem");
    }

    public void stop() {
        System.out.println("running stop in WindowsOperatingSystem");
    }
}
