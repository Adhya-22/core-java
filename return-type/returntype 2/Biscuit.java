class Biscuit
{
	static double getCost(String name)
	{
		System.out.println("Executing getCost in Biscuit...");
		System.out.println("Name : "+name);
		if(name==null)
		{
			System.out.println("Name is invalid..");
			return -1;
		}
		
		if(name=="parle-G")
		{
			return 5;
		}
		if(name=="Dark Fantasy")
		{
			return 30;
		}
		if(name=="Oreo")
		{
			return 10;
		}
		else
		{
			System.out.println(name+" is not matching in the Database.");
		}
		
		return 0;
	}
	
	static String getShape(String name)
	{
		System.out.println("Executing getShape in Biscuit...");
		System.out.println("Name : "+name);
		if(name==null)
		{
			System.out.println("Name is invalid..");
			return null;
		}
		
		if(name=="parle-G")
		{
			return "Rectangle";
		}
		if(name=="Dark Fantasy")
		{
			return "Circle filled with chocolate.";
		}
		if(name=="Oreo")
		{
			return "Double circle with cream in between.";
		}
		else
		{
			System.out.println(name+" is not matching in the Database.");
		}
		
		return null;
	}
	
	static String[] getFlavours(String name)
	{
		System.out.println("Executing getShape in Biscuit...");
		System.out.println("Name : "+name);
		if(name==null)
		{
			System.out.println("Name is invalid..");
			return null;
		}
		
		if(name=="parle-G")
		{
			String[] parleGFlavour={"Regular","Vanilla"};
			return parleGFlavour;
		}
		if(name=="Dark Fantasy")
		{
			String[] darkFantasyFlavours={"chocolate","Mint chocolate","Dark Chocolate"};
			return darkFantasyFlavours;
		}
		if(name=="Oreo")
		{
			String[] oreoFlavours={"Vanilla","Strawberry","Toffee","Red Velvet","Mint choco pie"};
			return oreoFlavours;
		}
		else
		{
			System.out.println(name+" is not matching in the Database.");
		}
		
		return null;
	}
}