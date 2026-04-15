package com.xworkz.OverridingAndPolymorphism.MedicalShop;

public class Runner
{
    public static void main(String[] args) {

        MedicalShop medicalShop = new MedicalShop();
        medicalShop.sell();
        medicalShop.restock();
        System.out.println(medicalShop);

        VeterinaryMedicalShop veterinaryMedicalShop = new VeterinaryMedicalShop();
        veterinaryMedicalShop.sell();
        veterinaryMedicalShop.restock();
        System.out.println(veterinaryMedicalShop);
    }
}
