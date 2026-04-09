package com.xworks.overriding.Transportation;

public class Runner 
{
    public static void main(String[] args)
    {
        GoodsTransportation goodsTransportation=new GoodsTransportation();
        goodsTransportation.transport();

        Transportation transportation1=new GoodsTransportation();
        transportation1.transport();

        Transportation transportation2=new Transportation();
        transportation2.transport();

    }
}
