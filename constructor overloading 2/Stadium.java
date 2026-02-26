class Stadium 
{
    String name;
    int seatingCapacity;
	
	Stadium()
	{
		System.out.println("No parameter constructor...");
	}
	
	Stadium(String name)
	{
		this.name=name;
	}
	
	Stadium(String name,int seatingCapacity)
	{
		this.name=name;
		this.seatingCapacity=seatingCapacity;
	}
}