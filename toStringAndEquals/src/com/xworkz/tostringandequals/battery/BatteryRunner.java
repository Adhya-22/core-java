package com.xworkz.tostringandequals.battery;

public class BatteryRunner
{
    public static void main(String[] args)
    {
        Battery battery1 = new Battery("Lithium", 4000, 3.7);

        Battery battery2 = new Battery("Alkaline", 2000, 1.5);

        Battery battery3 = new Battery("Lithium", 4000, 3.7);

        System.out.println(battery1);
        System.out.println(battery2);
        System.out.println(battery3);

        boolean check1=battery1.equals(battery2);
        System.out.println("check 1 & 2 ="+check1);

        boolean check2=battery1.equals(battery3);
        System.out.println("check 1 & 3 ="+check2);

    }
}
