package com.xworkz.OverridingAndPolymorphism.Helmet;

public class Runner
{
    public static void main(String[] args)
    {
        Helmet helmet = new Helmet();
        helmet.wear();
        helmet.protect();
        System.out.println(helmet);

        RacingHelmet racingHelmet = new RacingHelmet();
        racingHelmet.wear();
        racingHelmet.protect();
        System.out.println(racingHelmet);
    }
}
