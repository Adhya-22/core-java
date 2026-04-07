package com.xworks.crud.panCard;

public class PanCardStore 
{
    PanCard[] panCards;
    int currentIndex=0;

    public PanCardStore(PanCard[] panCards)
    {
        this.panCards = panCards;
    }

    public void store(PanCard panCard)
    {
        System.out.println("Executing store in PanCardStore...");
        if(this.panCards!=null && panCard!=null)
        {
            int index=this.panCards.length-1;
            if(currentIndex<=index)
            {
                this.panCards[this.currentIndex]=panCard;
                System.out.println("panCard stored at index : "+this.currentIndex);
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
        System.out.println("Displaying all PanCards...");
        if(this.panCards!=null)
        {
            for(PanCard panCard:this.panCards)
            {
                if(panCard!=null)
                {
                    panCard.displayInfo();
                }
            }
        }
    }

    public String search(String panNumber)
    {
        System.out.println("Executing search in PanCardStore...");
        if(this.panCards!=null &&  panNumber!=null)
        {
            for (PanCard panCard : this.panCards)
            {
                if(panCard!=null && panNumber.equals(panCard.panNumber))
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

    public void update(String panNumber,String newAddress)
    {
        System.out.println("Executing update in PanCardStore...");
        if(this.panCards!=null)
        {
            for(PanCard panCard:this.panCards)
            {
                if(panCard!=null)
                {
                    if(panCard.panNumber.equals(panNumber))
                    {
                        panCard.address=newAddress;
                        System.out.println("PanCard address updated");
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
