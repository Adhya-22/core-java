package com.xworkz.tostringandequals.trolley;

public class TrolleyRunner
{
    public static void main(String[] args)
    {
        Trolley trolley1 = new Trolley(4, true, "Plastic");

        Trolley trolley2 = new Trolley(2, false, "Metal");

        Trolley trolley3 = new Trolley(4, true, "Plastic");

        System.out.println(trolley1);
        System.out.println(trolley2);
        System.out.println(trolley3);

        boolean check1 = trolley1.equals(trolley2);
        System.out.println("check 1 & 2 ="+check1);

        boolean check2 = trolley1.equals(trolley3);
        System.out.println("check 1 & 3 = "+check2);

    }
}
