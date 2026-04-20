package com.xworkz.tostringandequals.crown;

public class CrownRunner
{
    public static void main(String[] args) {

        Crown crown1 = new Crown("Gold", 1.2, 50);

        Crown crown2 = new Crown("Silver", 0.9, 30);

        Crown crown3 = new Crown("Gold", 1.2, 50);

        System.out.println(crown1);
        System.out.println(crown2);
        System.out.println(crown3);

        boolean check1 = crown1.equals(crown2);
        System.out.println("check 1 & 2 = "+check1);

        boolean check2 = crown1.equals(crown3);
        System.out.println("check 1 & 3 = "+check2);

    }
}
