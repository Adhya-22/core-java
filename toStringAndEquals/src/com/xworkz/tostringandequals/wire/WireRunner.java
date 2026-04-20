package com.xworkz.tostringandequals.wire;

public class WireRunner
{
    public static void main(String[] args) {

        Wire wire1 = new Wire(10, "Copper", 1500);

        Wire wire2 = new Wire(20, "Aluminum", 2000);

        Wire wire3 = new Wire(10, "Copper", 1500);

        System.out.println(wire1);
        System.out.println(wire2);
        System.out.println(wire3);

        boolean check1=wire1.equals(wire2);
        System.out.println("check 1 & 2 = "+check1);

        boolean check2=wire1.equals(wire3);
        System.out.println("check 1 & 3 ="+check2);
    }
}
