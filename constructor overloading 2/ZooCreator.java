class ZooCreator
{
	static void getZoo()
	{
		System.out.println("Will create a Zoo..");
		Zoo zoo=new Zoo();
		System.out.println("Created a Zoo...");
	}
	
	static void getZoo(String name)
	{
		System.out.println("Will create a Zoo using name : "+name);
		Zoo zoo=new Zoo(name);
		System.out.println("Zoo name : "+zoo.name);
		System.out.println("Created a zoo using name...");
	}
	
	static void getZoo(String name,int numberOfAnimals)
	{
		System.out.println("Will create a Zoo using name : "+name+" and No of Animals : "+numberOfAnimals);
		Zoo zoo=new Zoo(name,numberOfAnimals);
		System.out.println("Zoo name : "+zoo.name);
		System.out.println("Zoo location : "+zoo.numberOfAnimals);
		System.out.println("Created a Zoo using name and number Of Animals...");
	}
}