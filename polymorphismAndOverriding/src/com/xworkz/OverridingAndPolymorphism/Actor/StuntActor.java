package com.xworkz.OverridingAndPolymorphism.Actor;

public class StuntActor extends Actor
{
    boolean performsOwnStunts;
    int riskLevel;

    @Override
    public void act() {
        System.out.println("act in StuntActor");
    }

    @Override
    public void promote() {
        System.out.println("promote in StuntActor");
    }

    @Override
    public String toString() {
        return "performsOwnStunt : "+performsOwnStunts+" riskLevel : "+riskLevel;
    }
}
