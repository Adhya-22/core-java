package com.xwork.practiceInterface.task.Usage;

import com.xwork.practiceInterface.task.MenuCard;

import java.util.Arrays;

public class Kitchen
{
    private MenuCard menuCard;

    public Kitchen(MenuCard menuCard)
    {
        this.menuCard = menuCard;
    }

    public void serve()
    {
        System.out.println("running serve in Kitchen");
        if(this.menuCard != null)
        {
            String[] items=this.menuCard.getItems(8,"Adhya");
            System.out.println("items="+ Arrays.toString(items));
            System.out.println("Items are served");
        }
    }
}
