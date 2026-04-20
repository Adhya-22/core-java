package com.xworkz.tostringandequals.toothpaste;

public class ToothPasteRunner
{
    public static void main(String[] args)
    {
        ToothPaste toothPaste1 = new ToothPaste("Colgate", 120, 40);

        ToothPaste toothPaste2 = new ToothPaste("Patanjali", 100, 60);

        ToothPaste toothPaste3 = new ToothPaste("Colgate", 120, 40);

        System.out.println(toothPaste1);
        System.out.println(toothPaste2);
        System.out.println(toothPaste3);

        boolean check1 = toothPaste1.equals(toothPaste2);
        System.out.println("check 1 & 2 = "+check1);

        boolean check2 = toothPaste1.equals(toothPaste3);
        System.out.println("check 1 & 3 = "+check2);

    }
}
