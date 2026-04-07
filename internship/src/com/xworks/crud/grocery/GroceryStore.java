package com.xworks.crud.grocery;

public class GroceryStore 
{
    Grocery[] groceries;
    int currentIndex=0;

    public GroceryStore(Grocery[] groceries)
    {
        this.groceries = groceries;
    }

    public void store(Grocery grocery)
    {
        System.out.println("Executing store in GroceryStore...");
        if(this.groceries!=null && grocery!=null)
        {
            int index=this.groceries.length-1;
            if(currentIndex<=index)
            {
                this.groceries[this.currentIndex]=grocery;
                System.out.println("grocery stored at index : "+this.currentIndex);
                this.currentIndex++;
            }
            else
            {
                System.out.println("Array is Full...");
            }
        }
        else
        {
            System.out.println("References cannot be null...");
        }
    }

    public void displayAll()
    {
        System.out.println("Displaying all Grocerys...");
        if(this.groceries!=null)
        {
            for(Grocery grocery:this.groceries)
            {
                if(grocery!=null)
                {
                    grocery.displayInfo();
                }
            }
        }
    }

    public String search(String itemName)
    {
        System.out.println("Executing search in GroceryStore...");
        if(this.groceries!=null && itemName!=null)
        {
            for (Grocery grocery : this.groceries)
            {
                if(grocery!=null && itemName.equals(grocery.itemName))
                {
                    return "FOUND";
                }
            }
        }
        else
        {
            System.out.println("References Cannot be null...");
        }
        return "NOT FOUND";
    }

    public void update(String itemName,double price)
    {
        System.out.println("Executing update in groceryStore...");
        if(this.groceries!=null && itemName!=null)
        {
            for(Grocery grocery:this.groceries)
            {
                if(grocery!=null)
                {
                    if(grocery.itemName.equals(itemName))
                    {
                        grocery.price=price;
                        System.out.println("grocery price updated");
                    }
                }
            }
        }
        else
        {
            System.out.println("array cannot be null...");
        }
    }
}
