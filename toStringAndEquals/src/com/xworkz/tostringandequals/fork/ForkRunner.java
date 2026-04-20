package com.xworkz.tostringandequals.fork;

public class ForkRunner
{
    public static void main(String[] args)
    {
        Fork fork1 = new Fork("Prestige", false, "Dining");

        Fork fork2 = new Fork("Generic", true, "Disposable");

        Fork fork3 = new Fork("Prestige", false, "Dining");

        System.out.println(fork1);
        System.out.println(fork2);
        System.out.println(fork3);

        boolean check1 = fork1.equals(fork2);
        System.out.println("check 1 & 2 = "+check1);

        boolean check2 = fork1.equals(fork3);
        System.out.println("check 1 & 3 = "+check2);
    }
}
