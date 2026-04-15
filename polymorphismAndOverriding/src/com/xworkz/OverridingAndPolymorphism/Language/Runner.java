package com.xworkz.OverridingAndPolymorphism.Language;

public class Runner
{
    public static void main(String[] args)
    {
        Language language = new Language();
        language.speak();
        language.translate();
        System.out.println(language);

        RegionalLanguage regionalLanguage = new RegionalLanguage();
        regionalLanguage.speak();
        regionalLanguage.translate();
        System.out.println(regionalLanguage);
    }
}
