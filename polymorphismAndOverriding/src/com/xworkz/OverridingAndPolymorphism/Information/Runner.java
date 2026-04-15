package com.xworkz.OverridingAndPolymorphism.Information;

public class Runner
{
    public static void main(String[] args)
    {
        Information information = new Information();
        information.decode();
        information.encode();
        System.out.println(information);

        ConfidentialInformation confidentialInformation = new ConfidentialInformation();
        confidentialInformation.decode();
        confidentialInformation.encode();
        System.out.println(confidentialInformation);
    }
}
