package com.xwork.practiceInterface.task;

public class LinuxOperatingSystem implements OperatingSystem
{
    public void boot() {
        System.out.println("running boot in LinuxOperatingSystem");
    }

    public void start() {
        System.out.println("running start in LinuxOperatingSystem");
    }

    public void stop() {
        System.out.println("running stop in LinuxOperatingSystem");
    }
}
