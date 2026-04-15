package com.xworkz.OverridingAndPolymorphism.Language;

public class Language
{
    int numberOfSpeakers;
    double avgWordsPerMinute;
    String[] commonPhrases;
    RegionType regionType;
    Country country;

    public void speak()
    {
        System.out.println("Speaking in Language");
    }

    public void translate()
    {
        System.out.println("Translation in Language");
    }

    @Override
    public String toString() {
        return "Speakers: " + numberOfSpeakers + ", Speed: " + avgWordsPerMinute + ", Region: " + regionType + ", Country" + country;
    }
}

