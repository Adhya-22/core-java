package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.College;
import com.xwork.practiceInterface.interfacesClasses.Teacher;

public class CollegeRunner {

    public static void main(String[] args) {

        College college = new Teacher();

        college.conductClass();
        college.conductExam();
        college.sports();
        college.culturalFest();

        College.collegeInfo();
    }
}
