package com.xworks.crud.panCard;

public class PanCard
{
        String panNumber;
        String fullName;
        String dateOfBirth;
        String address;
        String issuingAuthority;

        PanCard(String panNumber, String fullName, String dateOfBirth, String address, String issuingAuthority)
        {
            this.panNumber = panNumber;
            this.fullName = fullName;
            this.dateOfBirth = dateOfBirth;
            this.address = address;
            this.issuingAuthority = issuingAuthority;
        }

    public void displayInfo()
    {
        System.out.println("Pan Number "+this.panNumber);
        System.out.println("Full Name: "+this.fullName);
        System.out.println("date Of Birth: "+this.dateOfBirth);
        System.out.println("address : "+this.address);
        System.out.println("issuing Authority: "+this.issuingAuthority);
    }
}
