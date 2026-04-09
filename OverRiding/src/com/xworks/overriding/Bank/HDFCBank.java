package com.xworks.overriding.Bank;

public class HDFCBank extends Bank
{
    @Override
    public void calculateInterest() {
        System.out.println("calculate interest with 9%");
    }
}
