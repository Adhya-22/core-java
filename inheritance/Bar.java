class Bar 
{
    String name;
    int employeeCount;
	boolean openNow;
	
    Bar()
	{
        System.out.println("Non-parameterized constructor of Bar");
    }
	
	void open()
	{
        System.out.println("Executing open in Bar");
    }

    void serve()
	{
        System.out.println("Executing serve in Bar");
    }
}