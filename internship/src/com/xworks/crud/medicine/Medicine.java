package com.xworks.crud.medicine;

public class Medicine
{
        String medicineName;
        String manufacturer;
        double price;
        String dosage;
        int stock;

        public Medicine(String medicineName, String manufacturer, double price, String dosage, int stock)
        {
            this.medicineName = medicineName;
            this.manufacturer = manufacturer;
            this.price = price;
            this.dosage = dosage;
            this.stock = stock;
        }

    public void displayInfo()
    {
        System.out.println("Manufacturer :"+this.manufacturer);
        System.out.println("Medicine name: "+this.medicineName);
        System.out.println("price: "+this.price);
        System.out.println("dosage : "+this.dosage);
        System.out.println("stock: "+this.stock);
    }
}
