package com.xworks.crud.toy;

public class ToyStore
{
    Toy[] toys;
    int currentIndex=0;

    public ToyStore(Toy[] toys)
    {
        this.toys = toys;
    }

    public void store(Toy toy)
    {
        System.out.println("Executing store in ToyStore...");
        if(this.toys!=null && toy!=null)
        {
            int index=this.toys.length-1;
            if(currentIndex<=index)
            {
                this.toys[this.currentIndex]=toy;
                System.out.println("Toy stored at index : "+this.currentIndex);
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
        System.out.println("Displaying all toys...");
        if(this.toys!=null)
        {
            for(Toy toy:this.toys)
            {
                if(toy!=null)
                {
                    toy.displayInfo();
                }
            }
        }
    }

    public String search(int id)
    {
        System.out.println("Executing search in ToyStore...");
        if(this.toys!=null)
        {
            for (Toy toy : this.toys)
            {
                if(toy!=null && id==toy.toyId)
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

    public void update(boolean isBatteryOperated,int newAge)
    {
        System.out.println("Executing update in ToyStore...");
        if(this.toys!=null)
        {
            for(Toy toy:this.toys)
            {
                if(toy!=null)
                {
                    if(toy.isBatteryOperated)
                    {
                        toy.ageGroup=newAge;
                        System.out.println("Toy ageGroup updated");
                    }
                }
            }
        }
        else
        {
            System.out.println("Toys array cannot be null...");
        }
    }
}
