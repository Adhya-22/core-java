package com.xworkz.string.Immutability;

public class property
{
    public static void main(String[] args)
    {
        ///can be declared in two ways : literal and new keyword

        String name="Adhya";    ///points to constant pool

        String name2=new String("Adhya"); ///points to instance memory

        System.out.println(name==name2);

        System.out.println(name.equals(name2));

    }



}
