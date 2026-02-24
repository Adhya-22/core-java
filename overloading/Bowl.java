class Bowl
{
	static void bowlInfo(String type)
	{
		System.out.println("Bowl of type : "+type);
		if(type==null)
		{
			System.out.println("Type cannot be null");
			return;
		}
		System.out.println("Bowl info is valid...");
	}
	
	static void bowlInfo(int size,String type)
	{
		System.out.println("Over-loaded: Bowl of size : "+size+" Type :"+type);
		if(size<=0)
		{
			System.out.println("Size cannot be 0");
			return;
		}
		if(type==null)
		{
			System.out.println("Type cannot be null");
			return;
		}
		System.out.println("Charger info is valid...");
	}
}