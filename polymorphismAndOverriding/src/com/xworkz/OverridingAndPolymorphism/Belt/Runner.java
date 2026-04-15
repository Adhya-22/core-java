package com.xworkz.OverridingAndPolymorphism.Belt;

public class Runner
{
    public static void main(String[] args) {

        Belt belt = new Belt();
        belt.tighten();
        belt.loosen();
        System.out.println(belt);

        DesignerBelt designerBelt = new DesignerBelt();
        designerBelt.tighten();
        designerBelt.loosen();
        System.out.println(designerBelt);
    }
}
