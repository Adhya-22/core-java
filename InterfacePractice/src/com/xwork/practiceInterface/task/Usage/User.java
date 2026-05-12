package com.xwork.practiceInterface.task.Usage;

import com.xwork.practiceInterface.task.Remote;

public class User
{
    private Remote remote;

    public User(Remote remote)
    {
        this.remote=remote;
    }

    public void changeChannel(String channel)
    {
        System.out.println("running changeChannel in User");
        if(this.remote!=null)
        {
            this.remote.turnOn();
            System.out.println("changing channel to : "+channel);
            this.remote.turnOff();
        }
    }

}
