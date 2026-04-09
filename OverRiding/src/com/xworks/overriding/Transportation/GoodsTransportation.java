package com.xworks.overriding.Transportation;

public class GoodsTransportation extends Transportation
{
    @Override
    public void transport() {
        System.out.println("transport goods");
    }
}
