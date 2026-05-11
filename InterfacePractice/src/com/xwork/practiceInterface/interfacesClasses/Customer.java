package com.xwork.practiceInterface.interfacesClasses;

public class Customer implements OnlineShopping {

    public void addToCart() {
        System.out.println("implemented addToCart in customer class");
    }

    public void placeOrder() {
        System.out.println("implemented placeOrder in customer class");
    }

}
