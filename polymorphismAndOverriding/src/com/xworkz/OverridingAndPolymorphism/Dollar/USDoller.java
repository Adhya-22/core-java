package com.xworkz.OverridingAndPolymorphism.Dollar;

public class USDoller extends Dollar
{
    int issueYear;
    String noteCondition;

    public void convert()
    {
        System.out.println("Convert to USDollar");
    }

    @Override
    public void pay() {
        System.out.println("pay in USDollar");
    }

    @Override
    public String toString() {
        return "IssueYear: " + issueYear+", Note Condition: " + noteCondition;
    }
}
