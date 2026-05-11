package com.xwork.practiceInterface.interfacesClasses;

public class Viewer implements Cinema {

    public void bookMovie() {
        System.out.println("implemented bookMovie in viewer class");
    }

    public void cancelMovie() {
        System.out.println("implemented cancelMovie in viewer class");
    }

}
