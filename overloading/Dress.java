class Dress
{
	static void dressInfo(String type)
	{
		System.out.println("Dress of type : "+type);
		if(type==null)
		{
			System.out.println("Type cannot be null");
			return;
		}
		System.out.println("Dress info is valid...");
	}
	
	static void dressInfo(String type,int size,String color)
	{
		System.out.println("Over-loaded: Dress of type : "+type);
		if(type==null)
		{
			System.out.println("Type cannot be null");
			return;
		}
		if(size<=0)
		{
			System.out.println("Size cannot be 0");
			return;
		}
		if(color==null)
		{
			System.out.println("color cannot be null");
			return;
		}
		System.out.println("Dress info is valid...");
	}
}