package com.xworks.overriding.Game;

public class Runner 
{
    public static void main(String[] args)
    {
        Cricket cricket=new Cricket();
        cricket.play();

        Game game1=new Cricket();
        game1.play();

        Game game2=new Game();
        game2.play();
    }
}
