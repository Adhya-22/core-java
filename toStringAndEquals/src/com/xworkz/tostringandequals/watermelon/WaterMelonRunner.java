package com.xworkz.tostringandequals.watermelon;

public class WaterMelonRunner
{
    public static void main(String[] args) {

        WaterMelon waterMelon1 = new WaterMelon(5.5, 230, true);

        WaterMelon waterMelon2 = new WaterMelon(6.2, 270, false);

        WaterMelon waterMelon3 = new WaterMelon(5.5, 230, true);

        System.out.println(waterMelon1);
        System.out.println(waterMelon2);
        System.out.println(waterMelon3);

        boolean check1=waterMelon1.equals(waterMelon2);
        System.out.println("check 1 & 2 ="+check1);

        boolean check2=waterMelon1.equals(waterMelon3);
        System.out.println("check 1 & 2 ="+check2);

    }
}
