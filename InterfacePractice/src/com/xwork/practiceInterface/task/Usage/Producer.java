package com.xwork.practiceInterface.task.Usage;

import com.xwork.practiceInterface.task.Supermarket;

public class Producer
{
    Supermarket supermarket;

    public Producer(Supermarket supermarket)
    {
        this.supermarket = supermarket;
    }

    public void sell()
    {
        System.out.println("sell in Producer");
        if(this.supermarket != null)
        {
            this.supermarket.purchase();
            this.supermarket.discount();
        }
    }
}
