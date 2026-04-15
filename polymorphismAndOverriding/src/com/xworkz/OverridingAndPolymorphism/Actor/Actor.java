package com.xworkz.OverridingAndPolymorphism.Actor;

public class Actor
{
    double salary;
    int awardsCount;
    String[] skills;
    ExperienceLevel experienceLevel;
    Manager manager;

    public void act()
    {
        System.out.println(" act in Actor");
    }

    public void promote()
    {
        System.out.println(" promote in Actor");
    }

    @Override
    public String toString() {
        return "salary :"+salary+" awardCount : "+awardsCount+" experienceLevel : "+experienceLevel+" manager :"+manager;
    }
}
