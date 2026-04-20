package com.xworkz.tostringandequals.sim;

public class SimRunner
{
    public static void main(String[] args) {

        Sim sim1 = new Sim("4G", true, "Prepaid");

        Sim sim2 = new Sim("5G", false, "Postpaid");

        Sim sim3 = new Sim("4G", true, "Prepaid");

        System.out.println(sim1);
        System.out.println(sim2);
        System.out.println(sim3);

        boolean check1 = sim1.equals(sim2);
        System.out.println("check 1 & 2 ="+check1);

        boolean check2 = sim1.equals(sim3);
        System.out.println("check 1 & 3 ="+check2);
    }
}
