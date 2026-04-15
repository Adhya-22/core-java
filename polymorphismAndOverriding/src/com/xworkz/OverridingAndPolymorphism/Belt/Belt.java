package com.xworkz.OverridingAndPolymorphism.Belt;

public class Belt
{
    int holeCount;
    double thickness;
    String[] colors;
    UsageType usageType;
    BrandInfo brandInfo;

    public void tighten()
    {
        System.out.println("tighten in Belt");
    }

    public void loosen()
    {
        System.out.println("loosen in Belt");
    }

    public String toString()
    {
        return "holeCount :"+holeCount+", thickness :"+thickness+", UsageType :"+usageType+", brandInfo :"+brandInfo;
    }
}
