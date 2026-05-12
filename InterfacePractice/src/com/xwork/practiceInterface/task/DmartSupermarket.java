package com.xwork.practiceInterface.task;

public class DmartSupermarket implements Supermarket
{
    public void purchase()
    {
        System.out.println("running purchase in Dmart");
    }

    public void discount()
    {
        System.out.println("running discount in Dmart");
    }
}
