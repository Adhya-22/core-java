class StadiumCreator
{
	static void getStadium()
	{
		System.out.println("Will create a Stadium..");
		Stadium stadium=new Stadium();
		System.out.println("Created a Stadium...");
	}
	
	static void getStadium(String name)
	{
		System.out.println("Will create a Stadium using name : "+name);
		Stadium stadium=new Stadium(name);
		System.out.println("Stadium name : "+stadium.name);
		System.out.println("Created a Stadium using name...");
	}
	
	static void getStadium(String name,int seatingCapacity)
	{
		System.out.println("Will create a Stadium using name : "+name+" and Seating Capacity : "+seatingCapacity);
		Stadium stadium=new Stadium(name,seatingCapacity);
		System.out.println("Stadium name : "+stadium.name);
		System.out.println("Stadium location : "+stadium.seatingCapacity);
		System.out.println("Created a stadium using name and seating Capacity...");
	}
}