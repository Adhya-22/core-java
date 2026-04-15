package com.xworkz.OverridingAndPolymorphism.MedicalShop;

public class VeterinaryMedicalShop extends MedicalShop
{
    String animalType;
    boolean hasPetCareProducts;

    public void sell()
    {
        System.out.println("sell in veterinary medical shop");
    }

    public void restock()
    {
        System.out.println("restock in veterinary medical shop");
    }

    @Override
    public String toString() {
        return "animalType :"+animalType+", hasPetCareProducts :"+hasPetCareProducts;
    }
}
