package com.xworkz.OverridingAndPolymorphism.Chain;

public class Chain
{
    int length;
    double price;
    String[] patterns;
    Usage usage;
    BrandDetail brandDetail;

    public void attach()
    {
        System.out.println("attach in Chain");
    }

    public void detach()
    {
        System.out.println("detach in Chain");
    }

    @Override
    public String toString() {
        return "length :"+length+", price :"+price+" ,usage :"+usage+" ,brandDetail :"+brandDetail;
    }
}
