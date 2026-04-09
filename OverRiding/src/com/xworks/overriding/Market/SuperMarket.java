package com.xworks.overriding.Market;

public class SuperMarket extends Market
{
    @Override
    public void payment() {
        System.out.println("payment using UPI");
    }
}
