package com.xworks.overriding.Restaurant;

public class FiveStarRestaurant extends Restaurant
{
    @Override
    public void price() {
        System.out.println("price are High");
    }
}
