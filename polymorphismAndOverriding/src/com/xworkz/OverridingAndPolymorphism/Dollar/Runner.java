package com.xworkz.OverridingAndPolymorphism.Dollar;

public class Runner
{
    public static void main(String[] args) {

        Dollar dollar = new Dollar();
        dollar.convert();
        dollar.pay();
        System.out.println(dollar);

        USDoller usDoller = new USDoller();
        usDoller.convert();
        usDoller.pay();
        System.out.println(usDoller);
    }
}
