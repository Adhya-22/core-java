package com.xworkz.OverridingAndPolymorphism.Concert;

public class Concert
{
    int audienceSize;
    double ticketPrice;
    String[] performers;
    ConcertType concertType;
    Venue venue;

    public void perform()
    {
        System.out.println("perform in concert");
    }

    public void controlLight()
    {
        System.out.println("control light in concert");
    }

    @Override
    public String toString() {
        return "AudianceSize : "+audienceSize+" ,ticketPrice : "+ticketPrice+" ,performers : "+ performers+" ,ConcertType : "+concertType+" ,Venue : "+venue;
    }
}
