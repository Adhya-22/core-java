package com.xworkz.OverridingAndPolymorphism.Actor;

public class Runner
{
    public static void main(String[] args)
    {
        Actor actor = new Actor();
        actor.promote();
        actor.act();
        System.out.println(actor);

        StuntActor stuntActor = new StuntActor();
        stuntActor.promote();
        stuntActor.act();
        System.out.println(stuntActor);
    }
}
