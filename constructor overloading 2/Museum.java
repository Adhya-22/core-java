class Museum
{
	String name;
	String location;
	
	Museum()
	{
		System.out.println("No parameter constructor..");
	}
	
	Museum(String name)
	{
		this.name=name;
	}
	
	Museum(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
}