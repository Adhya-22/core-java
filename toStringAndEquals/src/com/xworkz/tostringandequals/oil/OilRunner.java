package com.xworkz.tostringandequals.oil;

public class OilRunner
{
    public static void main(String[] args)
    {
        Oil oil1 = new Oil("Coconut", 200, 2);

        Oil oil2 = new Oil("Vegetable", 400, 1);

        Oil oil3 = new Oil("Coconut", 200, 2);

        System.out.println(oil1);
        System.out.println(oil2);
        System.out.println(oil3);

        boolean check1=oil1.equals(oil2);
        System.out.println("check 1 & 2 ="+check1);

        boolean check2=oil1.equals(oil3);
        System.out.println("check 1 & 3 ="+check2);
    }
}
