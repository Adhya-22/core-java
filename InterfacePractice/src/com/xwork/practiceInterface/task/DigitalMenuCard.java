package com.xwork.practiceInterface.task;

public class DigitalMenuCard implements MenuCard
{

    public String[] getItems(int tableNo, String CustomerName)
    {
        System.out.println("running getItems in DigitalMenuCard");
        System.out.println("tableNo="+tableNo);
        System.out.println("CustomerName="+CustomerName);
        return new String[]{"Pizza","Burger","Crapes","Cake"};
    }
}
