package com.xworks.crud.grocery;

public class GroceryStoreRunner
{
    public static void main(String[] args) {

        Grocery grocery1=new Grocery("Rice","Staples",60.5,5,"India Gate");
        Grocery grocery2=new Grocery("Milk","Dairy",25.0,2,"Nandini");
        Grocery grocery3=new Grocery("Biscuits","Snacks",30.0,3,"Britannia");


        Grocery[] grocerys=new Grocery[3];

        GroceryStore groceryStore=new GroceryStore(grocerys);

        groceryStore.store(grocery1);
        groceryStore.store(grocery2);
        groceryStore.store(grocery3);

        groceryStore.displayAll();

        String found=groceryStore.search("Milk");
        System.out.println(found);

        groceryStore.update("Rice",52.0);
    }
}
