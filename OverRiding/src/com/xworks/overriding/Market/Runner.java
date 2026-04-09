package com.xworks.overriding.Market;

public class Runner 
{
    public static void main(String[] args)
    {
        SuperMarket superMarket=new SuperMarket();
        superMarket.payment();

        Market market1=new SuperMarket();
        market1.payment();

        Market market2=new Market();
        market2.payment();

    }
}
