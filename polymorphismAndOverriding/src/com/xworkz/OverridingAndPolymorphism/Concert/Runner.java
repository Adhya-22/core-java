package com.xworkz.OverridingAndPolymorphism.Concert;

public class Runner
{
    public static void main(String[] args) {

        Concert concert = new Concert();
        concert.perform();
        concert.controlLight();
        System.out.println(concert);

        FundRaisingConcert fundRaisingConcert = new FundRaisingConcert();
        fundRaisingConcert.perform();
        fundRaisingConcert.controlLight();
        System.out.println(fundRaisingConcert);
    }
}
