package com.xworks.crud.medicine;

public class MedicineStore 
{
    Medicine[] medicines;
    int currentIndex=0;

    public MedicineStore(Medicine[] medicines)
    {
        this.medicines=medicines;
    }

    public void store(Medicine medicine)
    {
        System.out.println("Executing store in MedicineStore...");
        if(this.medicines!=null && medicine!=null)
        {
            int index=this.medicines.length-1;
            if(currentIndex<=index)
            {
                this.medicines[this.currentIndex]=medicine;
                System.out.println("medicine stored at index : "+this.currentIndex);
                this.currentIndex++;
            }
            else
            {
                System.out.println("Array is Full...");
            }
        }
        else
        {
            System.out.println("References cannot be null...");
        }
    }

    public void displayAll()
    {
        System.out.println("Displaying all Medicines...");
        if(this.medicines!=null)
        {
            for(Medicine medicine:this.medicines)
            {
                if(medicine!=null)
                {
                    medicine.displayInfo();
                }
            }
        }
    }

    public String search(String medicineName)
    {
        System.out.println("Executing search in MedicineStore...");
        if(this.medicines!=null && medicineName!=null)
        {
            for (Medicine medicine : this.medicines)
            {
                if(medicine!=null && medicineName.equals(medicine.medicineName))
                {
                    return "FOUND";
                }
            }
        }
        else
        {
            System.out.println("References Cannot be null...");
        }
        return "NOT FOUND";
    }

    public void update(String medicineName,String dosage)
    {
        System.out.println("Executing update in MedicineStore...");
        if(this.medicines!=null && medicineName!=null)
        {
            for(Medicine medicine:this.medicines)
            {
                if(medicine!=null)
                {
                    if(medicine.medicineName.equals(medicineName))
                    {
                        medicine.dosage=dosage;
                        System.out.println("medicine price updated");
                    }
                }
            }
        }
        else
        {
            System.out.println("array cannot be null...");
        }
    }
}
