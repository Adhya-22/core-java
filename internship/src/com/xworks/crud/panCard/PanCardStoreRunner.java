package com.xworks.crud.panCard;

public class PanCardStoreRunner 
{
    public static void main(String[] args) {

        PanCard panCard1=new PanCard("ABCDE1234F","Rahul Sharma","12-05-1995","Delhi","Income Tax Dept");
        PanCard panCard2=new PanCard("PQRSX5678L","Sneha Reddy","08-11-1998","Hyderabad","Income Tax Dept");
        PanCard panCard3=new PanCard("LMNOP4321Z","Arjun Kumar","25-01-1992","Bengaluru","Income Tax Dept");

        PanCard[] panCards=new PanCard[3];

        PanCardStore panCardStore=new PanCardStore(panCards);

        panCardStore.store(panCard1);
        panCardStore.store(panCard2);
        panCardStore.store(panCard3);

        panCardStore.displayAll();

        String found=panCardStore.search("PQRSX5678L");
        System.out.println(found);

        panCardStore.update("LMNOP4321Z","Mumbai");
    }
}
