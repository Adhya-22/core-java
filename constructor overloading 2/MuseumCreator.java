class MuseumCreator
{
	static void getMuseum()
	{
		System.out.println("Will create a Museum..");
		Museum museum=new Museum();
		System.out.println("Created a Museum...");
	}
	
	static void getMuseum(String name)
	{
		System.out.println("Will create a Museum using name : "+name);
		Museum museum=new Museum(name);
		System.out.println("Museum name : "+museum.name);
		System.out.println("Created a Museum using name...");
	}
	
	static void getMuseum(String name,String location)
	{
		System.out.println("Will create a Museum using name : "+name+" and Location : "+location);
		Museum museum=new Museum(name,location);
		System.out.println("Museum name : "+museum.name);
		System.out.println("Museum location : "+museum.location);
		System.out.println("Created a Museum using name...");
	}
}