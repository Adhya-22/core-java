package com.xworkz.OverridingAndPolymorphism.Concert;

public class FundRaisingConcert extends Concert
{
    String cause;
    boolean donationBased;

    @Override
    public void perform() {
        System.out.println("perform in FundRaisingConcert");
    }

    @Override
    public void controlLight() {
        System.out.println("controlLight in FundRaisingConcert");
    }

    public String toString()
    {
        return "Cause :"+cause+", donationBased :"+donationBased;
    }
}
