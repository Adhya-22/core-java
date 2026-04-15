package com.xworkz.krmarket.shop.impl;

import com.xworkz.krmarket.shop.Shop;

public class CoffeeShop implements Shop
{
    @Override
    public void business()
    {
        System.out.println("CoffeeShop");
    }

    @Override
    public void invest()
    {
        System.out.println("invest in coffeeShop");
    }
}
