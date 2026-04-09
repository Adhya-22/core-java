package com.xworks.overriding.Restaurant;


public class Runner 
{
    public static void main(String[] args)
    {
        FiveStarRestaurant fiveStarRestaurant=new FiveStarRestaurant();
        fiveStarRestaurant.price();

        Restaurant restaurant1=new FiveStarRestaurant();
        restaurant1.price();

        Restaurant restaurant2=new Restaurant();
        restaurant2.price();

    }
}
