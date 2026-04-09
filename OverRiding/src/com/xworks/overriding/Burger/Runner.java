package com.xworks.overriding.Burger;

public class Runner 
{
    public static void main(String[] args) {

        CheeseBurger cheeseBurger=new CheeseBurger();
        cheeseBurger.taste();

        Burger burger1=new CheeseBurger();
        burger1.taste();

        Burger burger2=new Burger();
        burger2.taste();

    }
}
