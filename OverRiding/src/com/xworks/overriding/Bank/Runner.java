package com.xworks.overriding.Bank;

public class Runner 
{
    public static void main(String[] args)
    {
        HDFCBank hdfcBank=new HDFCBank();
        hdfcBank.calculateInterest();

        Bank bank1=new HDFCBank();
        bank1.calculateInterest();

        Bank bank2=new Bank();
        bank2.calculateInterest();
    }
}
