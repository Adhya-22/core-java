package com.xworkz.OverridingAndPolymorphism.Helmet;

public class RacingHelmet extends Helmet
{
    double Rating;
    boolean fireResistant;

    @Override
    public String toString() {
        return "Rating : " + Rating + ", fireResistant : " + fireResistant;
    }

    @Override
    public void wear()
    {
        System.out.println("wear in RacingHelmet");
    }

    @Override
    public void protect() {
        System.out.println("protecting in RacingHelmet");
    }
}
