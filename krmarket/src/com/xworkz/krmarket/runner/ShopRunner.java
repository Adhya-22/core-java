package com.xworkz.krmarket.runner;

import com.xworkz.krmarket.shop.Shop;
import com.xworkz.krmarket.shop.impl.CoffeeShop;
import com.xworkz.krmarket.shop.impl.Vegetableimpl;

public class ShopRunner
{
    public static void main(String[] args) {

        Shop shop=new Vegetableimpl();
        shop.business();
        shop.invest();

        Shop shop2=new CoffeeShop();
        shop2.business();
        shop2.invest();
    }
}
