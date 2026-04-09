package com.xworks.overriding.Mobile;

public class Runner 
{
    public static void main(String[] args)
    {
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.unlock();

        Mobile mobile1=new SmartPhone();
        mobile1.unlock();

        Mobile mobile2=new Mobile();
        mobile2.unlock();

    }
}
