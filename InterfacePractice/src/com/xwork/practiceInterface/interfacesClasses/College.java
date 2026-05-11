package com.xwork.practiceInterface.interfacesClasses;

public interface College {

    int students = 1000;
    String principal = "Dr. Y Vijaya Kumar";
    char grade = 'A';

    void conductClass();
    void conductExam();

    default void sports() {
        System.out.println("running sports in College interface");
    }

    default void culturalFest() {
        System.out.println("running culturalFest in College interface");
    }

    static void collegeInfo() {
        System.out.println("running college info in College interface");
    }
}

