class CoffeeBarRunner
{
    public static void main(String... args)
	{
        CoffeeBar coffeeBar1=new CoffeeBar();
        coffeeBar1.name="Cafe Brew";
        coffeeBar1.employeeCount=10;
        coffeeBar1.openNow=true;
        coffeeBar1.coffeeType="Espresso";
        coffeeBar1.typesInMenu=15;
        coffeeBar1.hasWifi=true;
        coffeeBar1.ambience="Cozy";
        coffeeBar1.takeaway=true;
        coffeeBar1.open();
        coffeeBar1.serve();
        coffeeBar1.brew();

        CoffeeBar coffeeBar2=new CoffeeBar();
        coffeeBar2.name="Bean Spot";
        coffeeBar2.employeeCount=8;
        coffeeBar2.openNow=false;
        coffeeBar2.coffeeType="Latte";
        coffeeBar2.typesInMenu=10;
        coffeeBar2.hasWifi=false;
        coffeeBar2.ambience="Modern";
        coffeeBar2.takeaway=false;
        coffeeBar2.open();
        coffeeBar2.serve();
        coffeeBar2.brew();

        Bar bar1=new CoffeeBar();
        bar1.name="Mini Cafe";
        bar1.employeeCount=5;
        bar1.openNow=true;
        bar1.open();
        bar1.serve();

        Bar bar2=new CoffeeBar();
        bar2.name="Quick Coffee";
        bar2.employeeCount=4;
        bar2.openNow=false;
        bar2.open();
        bar2.serve();

        Bar bar3=new Bar();
        bar3.name="Classic Bar";
        bar3.employeeCount=12;
        bar3.openNow=true;
        bar3.open();
        bar3.serve();

        Bar bar4=new Bar();
        bar4.name="Night Bar";
        bar4.employeeCount=15;
        bar4.openNow=false;
        bar4.open();
        bar4.serve();
    }
}