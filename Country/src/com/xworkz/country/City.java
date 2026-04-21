package com.xworkz.country;

import java.util.Arrays;

public class City
{
    String name;
    int noOfDistricts;
    District[] districts;

    public City(String name, int noOfDistricts, District[] districts)
    {
        this.name = name;
        this.noOfDistricts = noOfDistricts;
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "city name : " + name +" ,no Of District in city : "+noOfDistricts+ ", districts in city : " + Arrays.toString(districts);
    }
}
