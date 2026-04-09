package com.xworks.overriding.Burger;

public class CheeseBurger extends Burger
{
    @Override
    public void taste()
    {
        System.out.println("Cheesey Taste");
    }
}
