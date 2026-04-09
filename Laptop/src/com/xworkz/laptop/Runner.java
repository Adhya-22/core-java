package com.xworkz.laptop;

public class Runner
{
    public static void main(String[] args)
    {
        FoldableLaptop foldableLaptop=new FoldableLaptop("Acer","Swift Go14");
        foldableLaptop.update();

        Laptop laptop=new FoldableLaptop("Acer","Swift Go14");
        laptop.update();

        Laptop laptop1=new Laptop("Acer","Swift Go14");
        laptop1.update();

    }
}
