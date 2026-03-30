class Army
{
    String country;
    int soldiers;
    boolean active;

    Army()
	{
        System.out.println("Non-parameterized constructor of Army");
    }

    void defend()
	{
        System.out.println("Executing defend in Army");
    }

    void train()
	{
        System.out.println("Executing train in Army");
    }
}