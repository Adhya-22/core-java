package com.xworks.overriding.Employee;

public class Runner 
{
    public static void main(String[] args)
    {
        Manager manager=new Manager();
        manager.work();

        Employee employee1=new Manager();
        employee1.work();

        Employee employee2=new Employee();
        employee2.work();
    }
}
