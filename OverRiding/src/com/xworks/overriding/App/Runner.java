package com.xworks.overriding.App;

public class Runner
{
    public static void main(String[] args) {

        Instagram instagram=new Instagram();
        instagram.sendMsg();

        App app1=new Instagram();
        app1.sendMsg();

        App app2=new App();
        app2.sendMsg();

    }
}
