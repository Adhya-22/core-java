package IPA2;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] travelAgencies=new TravelAgencies[4];
        for(int i=0;i<travelAgencies.length;i++)
        {
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String packType=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            boolean flight=sc.nextBoolean();

            travelAgencies[i]=new TravelAgencies(id,name,packType,price,flight);
        }

        int highestPrice=findAgencyWithHighestPackagePrice(travelAgencies);
        System.out.println(highestPrice);

        TravelAgencies travelAgency=agencyDetailsForGivenldAndType(travelAgencies,987,"Diamond");
        if(travelAgency!=null)
        {
            System.out.println(travelAgency.getAgencyName()+" : "+travelAgency.getPrice());
        }


    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] travelAgencies)
    {
        if(travelAgencies!=null)
        {
            int max=travelAgencies[0].getPrice();
            for(TravelAgencies travelAgency:travelAgencies)
            {
                if(travelAgency.getPrice()>max)
                {
                    max=travelAgency.getPrice();
                }
            }
            return max;
        }
        else
        {
            System.out.println("No travel agencies found");
        }
        return 0;
    }

    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] travelAgencies,int reg,String packType)
    {
        if(travelAgencies!=null && packType!=null)
        {
            for(TravelAgencies travelAgency:travelAgencies)
            {
                if(travelAgency.getFlightFacility())
                {
                    if(travelAgency.getRegNo()==reg && travelAgency.getPackageType().equalsIgnoreCase(packType))
                    {
                        return travelAgency;
                    }
                }
            }
        }
        else
        {
            System.out.println("No travel agencies found");
        }
        return null;
    }
}
