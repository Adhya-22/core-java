package com.xworks.overriding.Browser;

public class ChromeBrowser extends Browser{

    @Override
    public void browse()
    {
        System.out.println("fast browsing");
    }
}
