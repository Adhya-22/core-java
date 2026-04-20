package com.xworkz.tostringandequals.industry;

public class IndustryRunner
{
    public static void main(String[] args)
    {
        Industry industry1 = new Industry("Bangalore", 5000000.0, false);

        Industry industry2 = new Industry("Mumbai", 12000000.0, true);

        Industry industry3 = new Industry("Bangalore", 5000000.0, false);

        System.out.println(industry1);
        System.out.println(industry2);
        System.out.println(industry3);

        boolean check1=industry1.equals(industry2);
        System.out.println("check 1 & 2 ="+check1);

        boolean check2=industry1.equals(industry3);
        System.out.println("check 1 & 3 ="+check2);
    }
}
