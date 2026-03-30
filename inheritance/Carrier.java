class Carrier
{
    String type;
    int capacity;

    Carrier() 
	{
        System.out.println("Non-parameterized constructor of Carrier");
    }

    void load()
	{
        System.out.println("Executing load in Carrier");
    }
	
	void unload()
	{
        System.out.println("Executing unload in Carrier");
    }
}