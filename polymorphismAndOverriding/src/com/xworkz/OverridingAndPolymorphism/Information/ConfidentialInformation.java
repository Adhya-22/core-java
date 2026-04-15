package com.xworkz.OverridingAndPolymorphism.Information;

public class ConfidentialInformation extends Information
{
    String accessLevel;
    boolean encrypted;

    @Override
    public String toString() {
        return "AccessLevel : "+accessLevel+" encrypted: "+encrypted;
    }

    @Override
    public void decode()
    {
        System.out.println("decode in ConfidentialInformation");
    }

    @Override
    public void encode()
    {
        System.out.println("encode in ConfidentialInformation");
    }
}
