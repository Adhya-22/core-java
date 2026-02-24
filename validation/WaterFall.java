class WaterFall
{
	static void info(String name,String location,int length,boolean generation)
	{
		System.out.println("Name : "+name+" Location : "+location+" Length : "+length+" Generates : "+generation);
		
		if(name==null)
		{
			System.out.println("Name is invalid...");
	        return;
		}
		
		if(location==null)
		{
			System.out.println("Location is invalid...");
	        return;
		}
		
		if(length<=0)
		{
			System.out.println("Length is invalid...");
	        return;
		}
		System.out.println("WaterFall Info is valid...");
	}
	
	static void stateInfo(String state,String district,String taluk)
	{
		if(state==null)
		{
			System.out.println("State is invalid...");
	        return;
		}
		
		if(district==null)
		{
			System.out.println("District is invalid...");
	        return;
		}
		
		if(taluk==null)
		{
			System.out.println("Taluk is invalid...");
	        return;
		}
		System.out.println("State Info is valid...");
	}
}