package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.Customer;
import com.xwork.practiceInterface.interfacesClasses.OnlineShopping;

public class OnlineShoppingRunner {

    public static void main(String[] args) {

        OnlineShopping onlineShopping = new Customer();

        onlineShopping.addToCart();
        onlineShopping.placeOrder();
        onlineShopping.trackOrder();
        onlineShopping.cancelOrder();

        OnlineShopping.shoppingInfo();
    }
}
