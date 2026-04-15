package com.xworkz.OverridingAndPolymorphism.MedicalShop;

public class MedicalShop
{
    int employeeCount;
    double discountRate;
    String[] availableServices;
    PaymentMode paymentMode;
    License license;

    public void sell()
    {
        System.out.println("sell in MedicalShop");
    }

    public void restock()
    {
        System.out.println("restock in MedicalShop");
    }

    public String toString()
    {
        return "employeeCount :"+employeeCount+", discountRate :"+discountRate+", availableServices :"+availableServices+"paymentMode : "+paymentMode+" License :"+license;
    }
}
