class Factory
{
    String location;
    int workers;
    boolean operational;

    Factory()
	{
        System.out.println("Non-parameterized constructor of Factory");
    }

    void produce()
	{
        System.out.println("Executing produce in Factory");
    }

    void distribute()
	{
        System.out.println("Executing distribute in Factory");
    }
}