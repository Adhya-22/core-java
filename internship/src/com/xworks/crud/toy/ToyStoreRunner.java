package com.xworks.crud.toy;

public class ToyStoreRunner
{
    public static void main(String[] args)
    {
        Toy toy1=new Toy(499.99,5,0.8,101,true);
        Toy toy2=new Toy(299.50,3,0.5,102,false);
        Toy toy3=new Toy(799.00,8,1.2,103,true);

        Toy[] toys=new Toy[3];

        ToyStore toyStore=new ToyStore(toys);

        toyStore.store(toy1);
        toyStore.store(toy2);
        toyStore.store(toy3);

        toyStore.displayAll();

        String found=toyStore.search(102);
        System.out.println(found);

        toyStore.update(true,8);
    }
}
