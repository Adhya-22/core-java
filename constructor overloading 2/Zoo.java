class Zoo 
{
    String name;
    int numberOfAnimals;
	
	Zoo()
	{
		System.out.println("No parameter Constructor...");
	}
	
	Zoo(String name)
	{
		this.name=name;
	}
	
	Zoo(String name,int numberOfAnimals)
	{
		this.name=name;
		this.numberOfAnimals=numberOfAnimals;
	}
}