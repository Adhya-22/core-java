package com.xworkz.OverridingAndPolymorphism.Jail;

public class Jail
{
    int cellCount;
    double areaSize;
    String[] securitySystems;
    SecurityCategory securityCategory;
    Department department;

    public void monitor()
    {
        System.out.println("monitor in jail");
    }

    public void inspection()
    {
        System.out.println("inspection in jail");
    }

    @Override
    public String toString() {
        return "cellCount :"+cellCount+", areaSize :"+areaSize+", securitySystems :"+securitySystems+", securityCategory :"+securityCategory+", department :"+department;
    }
}
