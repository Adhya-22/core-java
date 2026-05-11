package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.Restaurant;
import com.xwork.practiceInterface.interfacesClasses.Waiter;

public class RestaurantRunner {

    public static void main(String[] args) {

        Restaurant restaurant = new Waiter();

        restaurant.takeOrder();
        restaurant.serveFood();
        restaurant.provideMenu();
        restaurant.billing();

        Restaurant.restaurantInfo();
    }
}
