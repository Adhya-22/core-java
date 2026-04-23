package com.xworkz.string;

import java.io.FileWriter;
import java.io.IOException;

public class Write
{
    public static void main(String[] args) {

        String sentance="My name is Adhya K R.";

        try
        {
            FileWriter writer=new FileWriter("result1.txt");
            writer.write(sentance);
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
