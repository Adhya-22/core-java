package com.xwork.practiceInterface.task;

public class MoreSupermarket implements Supermarket
{
    public void purchase()
    {
        System.out.println("running purchase in MoreSupermarket");
    }

    public void discount()
    {
        System.out.println("running discount in MoreSupermarket");
    }
}
