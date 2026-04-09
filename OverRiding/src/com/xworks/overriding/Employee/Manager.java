package com.xworks.overriding.Employee;

public class Manager extends Employee
{
    @Override
    public void work()
    {
        System.out.println("manager manages the team");
    }
}
