package com.xworkz.krmarket.shop.impl;

import com.xworkz.krmarket.shop.Shop;

public class Vegetableimpl implements Shop
{
    @Override
    public void business() {
        System.out.println("Vegetable impl business");
        System.out.println("Vegetable business is good");
    }
}
