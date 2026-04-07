package com.xworks.crud.shop;

public class ShopStoreRunner
{
    public static void main(String[] args)
    {
        Shop shop1=new Shop("Ramesh", "Bangalore", 9876543210L, "9:00 AM", "9:00 PM");
        Shop shop2=new Shop("Suresh", "Mysore", 9123456780L, "10:00 AM", "8:00 PM");
        Shop shop3=new Shop("Anita", "Hubli", 9988776655L, "8:30 AM", "10:00 PM");
        
        Shop[] shops=new Shop[3];

        ShopStore shopStore=new ShopStore(shops);

        shopStore.store(shop1);
        shopStore.store(shop2);
        shopStore.store(shop3);

        shopStore.displayAll();

        String found=shopStore.search("Anita");
        System.out.println(found);

        shopStore.update("Suresh",6364817378L);
    }
}
