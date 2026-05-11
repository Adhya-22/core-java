package com.xwork.practiceInterface.interfacesClasses;

public class Waiter implements Restaurant {

    public void takeOrder() {
        System.out.println("implemented takeOrder in Waiter class");
    }

    public void serveFood() {
        System.out.println("implemented serveFood in Waiter class");
    }
}
