package com.xworks.crud.medicine;

public class MedicineStoreRunner
{
    public static void main(String[] args) {

        Medicine medicine1=new Medicine("Paracetamol", "Cipla", 20.5, "500mg", 100);
        Medicine medicine2=new Medicine("Amoxicillin", "Sun Pharma", 45.0, "250mg", 50);
        Medicine medicine3=new Medicine("Cetirizine", "Dr Reddy", 15.0, "10mg", 75);

        Medicine[] medicines=new Medicine[3];

        MedicineStore medicineStore=new MedicineStore(medicines);

        medicineStore.store(medicine1);
        medicineStore.store(medicine2);
        medicineStore.store(medicine3);

        medicineStore.displayAll();

        String found=medicineStore.search("Cetirizine");
        System.out.println(found);

        medicineStore.update("Amoxicillin","60mg");
    }
}
