class Ocean
{
	static void info(String name,int areaCovered,String location,int countries,int salinity)
	{
		System.out.println("Ocean Name : "+name+" Area covered : "+areaCovered+" Location : "+location+" Countries : "
		+countries+" salinity : "+salinity);
		
		if(name==null)
		{
			System.out.println("Name is invalid...");
			return;
		}
		
		if(areaCovered<361)
		{
			System.out.println("Area Covered is invalid...");
			return;
		}
		
		if(location==null)
		{
			System.out.println("Location is invalid...");
			return;
		}
		
		if(countries<0)
		{
			System.out.println("Countries touching is invalid...");
			return;
		}
		
		if(salinity<0)
		{
			System.out.println("Area Covered is invalid...");
			return;
		}
	}
}