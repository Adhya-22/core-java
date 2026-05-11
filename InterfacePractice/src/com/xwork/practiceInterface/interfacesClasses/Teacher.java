package com.xwork.practiceInterface.interfacesClasses;

public class Teacher implements College {

    public void conductClass() {
        System.out.println("implemented conductClass in Teacher class");
    }

    public void conductExam() {
        System.out.println("implemented conductExam in Teacher class");
    }
}
