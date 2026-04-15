package com.xworkz.krmarket.shop;

public interface Shop
{
    public void business();

    default void invest(){
        System.out.println("Investing in business");
    }
}
