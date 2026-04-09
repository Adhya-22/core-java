package com.xworks.overriding.User;

public class Admin extends User
{
    @Override
    public void access() {
        System.out.println("Full Access");
    }
}
