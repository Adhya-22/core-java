package com.xwork.practiceInterface.interfacesClasses;

public interface OnlineShopping {

    int products = 1000;
    String website = "Amazon";
    double deliveryCharge = 50;

    void addToCart();
    void placeOrder();

    default void trackOrder() {
        System.out.println("running trackOrder in OnlneShopping interface");
    }

    default void cancelOrder() {
        System.out.println("running cancelOrder in OnlneShopping interface");
    }

    static void shoppingInfo() {
        System.out.println("running shoppingInfo in OnlneShopping interface");
    }
}
