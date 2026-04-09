package com.xworks.overriding.User;

public class Runner 
{
    public static void main(String[] args)
    {
        Admin admin=new Admin();
        admin.access();

        User user1=new Admin();
        user1.access();

        User user2=new User();
        user2.access();
    }
}
