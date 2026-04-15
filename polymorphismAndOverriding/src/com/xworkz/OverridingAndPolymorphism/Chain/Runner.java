package com.xworkz.OverridingAndPolymorphism.Chain;

public class Runner
{
    public static void main(String[] args)
    {
        Chain chain = new Chain();
        chain.attach();
        chain.detach();
        System.out.println(chain);

        DecorativeChain decorativeChain = new DecorativeChain();
        decorativeChain.attach();
        decorativeChain.detach();
        System.out.println(decorativeChain);
    }
}
