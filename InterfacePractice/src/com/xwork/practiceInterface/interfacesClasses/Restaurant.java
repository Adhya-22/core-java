package com.xwork.practiceInterface.interfacesClasses;

public interface Restaurant {

    int tables = 20;
    String chef = "Kiran";
    float rating = 4.5f;

    void takeOrder();
    void serveFood();

    default void provideMenu() {
        System.out.println("running provideMenu in restaurant interface");
    }

    default void billing() {
        System.out.println("running billing in restaurant interface");
    }

    static void restaurantInfo() {
        System.out.println("running restaurantInfo in restaurant interface");
    }
}
