package com.xworkz.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read
{
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("result1.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line); // prints each line
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
