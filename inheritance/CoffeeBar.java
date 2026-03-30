class CoffeeBar extends Bar
{
    String coffeeType;
	int typesInMenu;
    boolean hasWifi;
    String ambience;
    boolean takeaway;

    CoffeeBar()
	{
        System.out.println("Non-parameterized constructor of CoffeeBar");
    }

    void brew()
	{
        System.out.println("Executing brew in CoffeeBar");
    }
}