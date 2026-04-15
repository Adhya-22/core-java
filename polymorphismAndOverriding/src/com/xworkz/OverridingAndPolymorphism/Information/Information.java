package com.xworkz.OverridingAndPolymorphism.Information;

import java.util.Arrays;

public class Information
{
    int dataSize;
    double accuracy;
    String[] keywords;
    Type type;
    Source source;

    public void decode()
    {
        System.out.println("Decode in Information");
    }

    public void encode()
    {
        System.out.println("Encode in Information");
    }

    @Override
    public String toString() {
        return "dataSize :"+dataSize+" ,accuracy :"+accuracy+" ,Type :"+type+" ,source :"+source ;
    }
}
