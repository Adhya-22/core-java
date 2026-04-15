package com.xworkz.OverridingAndPolymorphism.Chain;

public class DecorativeChain extends Chain
{
    String theme;
    boolean handmade;

    public void attach()
    {
        System.out.println("attach in DecorativeChain");
    }

    public void detach()
    {
        System.out.println("detach in DecorativeChain");
    }

    @Override
    public String toString()
    {
        return "theme :"+theme+" ,handmade :"+handmade;
    }
}
