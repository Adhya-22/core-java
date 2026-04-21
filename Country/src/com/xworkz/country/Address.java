package com.xworkz.country;

public class Address
{
    int number;
    int pincode;
    State state;

    public  Address(int number, int pincode, State state)
    {
        this.number = number;
        this.pincode = pincode;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address number=" + number + ", address pincode=" + pincode + ", address state=" + state;
    }
}
