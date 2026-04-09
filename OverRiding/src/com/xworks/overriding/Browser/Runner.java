package com.xworks.overriding.Browser;

public class Runner 
{
    public static void main(String[] args)
    {
        ChromeBrowser chromeBrowser=new ChromeBrowser();
        chromeBrowser.browse();

        Browser browser1=new ChromeBrowser();
        browser1.browse();

        Browser browser2=new Browser();
        browser2.browse();

    }
}
