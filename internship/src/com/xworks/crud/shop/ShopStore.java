package com.xworks.crud.shop;

import com.xworks.crud.toy.Toy;

public class ShopStore
{
    Shop[] shops;
    int currentIndex=0;
    
    public ShopStore(Shop[] shops)
    {
        this.shops=shops;
    }

    public void store(Shop shop)
    {
        System.out.println("Executing store in ShopStore...");
        if(this.shops!=null && shop!=null)
        {
            int index=this.shops.length-1;
            if(currentIndex<=index)
            {
                this.shops[this.currentIndex]=shop;
                System.out.println("shop stored at index : "+this.currentIndex);
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
        System.out.println("Displaying all toys...");
        if(this.shops!=null)
        {
            for(Shop shop:this.shops)
            {
                if(shop!=null)
                {
                    shop.displayInfo();
                }
            }
        }
    }

    public String search(String ownerName)
    {
        System.out.println("Executing search in shopStore...");
        if(this.shops!=null && ownerName!=null)
        {
            for (Shop shop:this.shops)
            {
                if(shop!=null && ownerName.equals(shop.ownerName))
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

    public void update(String ownerName,long contactNumber)
    {
        System.out.println("Executing update in ToyStore...");
        if(this.shops!=null)
        {
            for(Shop shop:this.shops)
            {
                if(shop!=null)
                {
                    if(shop.ownerName.equals(ownerName))
                    {
                        shop.contactNumber=contactNumber;
                        System.out.println("Phone Number updated");
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
