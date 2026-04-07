package com.xworks.crud.grocery;

public class Grocery
{
        String itemName;
        String category;
        double price;
        int quantity;
        String brand;

        Grocery(String itemName,String category,double price,int quantity,String brand)
        {
            this.itemName=itemName;
            this.category=category;
            this.price=price;
            this.quantity=quantity;
            this.brand=brand;
        }

        public void displayInfo()
        {
            System.out.println("Item Name "+this.itemName);
            System.out.println("Category: "+this.category);
            System.out.println("price: "+this.price);
            System.out.println("quantity : "+this.quantity);
            System.out.println("brand: "+this.brand);
        }
}
