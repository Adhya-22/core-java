package com.xworkz.OverridingAndPolymorphism.Jail;

public class Runner
{
    public static void main(String[] args) {

        Jail jail = new Jail();
        jail.monitor();
        jail.inspection();
        System.out.println(jail);

        WomenJail womenJail = new WomenJail();
        womenJail.monitor();
        womenJail.inspection();
        System.out.println(womenJail);
    }
}
