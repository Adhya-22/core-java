package com.xworkz.country;

import java.util.Arrays;

public class State
{
    String name;
    long population;
    City[] cities;

    public State(String name, long population, City[] cities)
    {
        this.name = name;
        this.population = population;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "State name : " + name + ", state population : " + population + ", cities in state : " + Arrays.toString(cities);
    }
}
