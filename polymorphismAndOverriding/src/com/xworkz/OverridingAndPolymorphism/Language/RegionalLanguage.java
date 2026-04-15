package com.xworkz.OverridingAndPolymorphism.Language;

public class RegionalLanguage extends Language
{
    String dialect;
    boolean hasScript;

    @Override
    public String toString() {
        return "dialect: " + dialect + ", hasScript: " + hasScript;
    }

    public void speak()
    {
        System.out.println("Speaking in RegionalLanguage.");
    }

    @Override
    public void translate() {
        System.out.println("Translation in RegionalLanguage.");
    }
}
