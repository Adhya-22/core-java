package IPA1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Associate[] associate=new Associate[5];
        for(int i=0;i<associate.length;i++)
        {
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String technology=sc.nextLine();
            int experience=sc.nextInt();sc.nextLine();

            associate[i]=new Associate(id,name,technology,experience);
        }

        String search=sc.nextLine();
        Associate[] assoArr=associatesForGivenTechnology(associate,search);

        if(assoArr!=null)
        {
            for (Associate value : assoArr)
            {
                System.out.println(value.getId());
            }
        }

    }

    public static Associate[] associatesForGivenTechnology(Associate[] associates,String searchTechnology)
    {
        Associate[] result=new Associate[0];
        if(searchTechnology!=null && associates!=null)
        {
            for(Associate a:associates)
            {
                if(a.getTechnology().equalsIgnoreCase(searchTechnology) && (a.experienceInYears%5)==0)
                {
                    result= Arrays.copyOf(result,result.length+1);
                    result[result.length-1]=a;
                }
            }

            if(result.length>0)
            {
                return result;
            }
            else
            {
                return null;
            }
        }
        else
        {
            System.out.println("No such technology");
            return null;
        }
    }

}
