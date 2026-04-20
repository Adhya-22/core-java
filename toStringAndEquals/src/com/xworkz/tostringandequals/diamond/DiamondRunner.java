package com.xworkz.tostringandequals.diamond;

public class DiamondRunner
{
    public static void main(String[] args) {

        Diamond diamond1 = new Diamond(1.5, "White", 50000);

        Diamond diamond2 = new Diamond(2.0, "Blue", 120000);

        Diamond diamond3 = new Diamond(1.5, "White", 50000);

        System.out.println(diamond1);
        System.out.println(diamond2);
        System.out.println(diamond3);

        boolean check1 = diamond1.equals(diamond2);
        System.out.println("check 1 & 2 = "+check1);

        boolean check2 = diamond1.equals(diamond3);
        System.out.println("check 1 & 3 = "+check2);

    }
}
