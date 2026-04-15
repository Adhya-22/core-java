package com.xworkz.OverridingAndPolymorphism.Belt;

public class DesignerBelt extends Belt
{
    String brandName;
    boolean limitedEdition;

    public void tighten()
    {
        System.out.println("tighten in DesignerBelt");
    }

    @Override
    public void loosen() {
        System.out.println("loosen in DesignerBelt");
    }

    @Override
    public String toString() {
        return "brandName :"+brandName+", limitedEdition :"+limitedEdition;
    }
}
