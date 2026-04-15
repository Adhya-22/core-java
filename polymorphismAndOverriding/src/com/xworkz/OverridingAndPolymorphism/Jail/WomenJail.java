package com.xworkz.OverridingAndPolymorphism.Jail;

public class WomenJail extends Jail
{
    boolean hasWomenStaff;
    int womenInmates;

    public void monitor()
    {
        System.out.println("monitor in women jail");
    }

    public void inspection()
    {
        System.out.println("inspection in women jail");
    }

    @Override
    public String toString() {
        return "hasWomenStaff :"+hasWomenStaff+", womenInmates :"+womenInmates;
    }
}
