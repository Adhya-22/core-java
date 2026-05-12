package com.xwork.practiceInterface.task;

public class BindedMenuCard implements MenuCard
{
    public String[] getItems(int tableNo,String CustomerName)
    {
        System.out.println("running getItems in BindedMenuCard");
        System.out.println("tableNo="+tableNo);
        System.out.println("CustomerName="+CustomerName);
        return new String[]{"Masala Dosa","Idli Vada","Set Dosa","KesariBath"};
    }
}
