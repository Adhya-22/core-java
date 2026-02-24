class BedSheet
{
	static void info(String type)
	{
		System.out.println("Spreading sheet of type : "+type);
		if(type==null)
		{
			System.out.println("Type cannot be null");
			return;
		}
		System.out.println("BedSheet Info is Valid...");
	}
	
	static void info(int noOfSheets,String color,String type)
	{
		
		System.out.println("Over-loaded: Spreading sheet of type : "+type+" Color : "+color+" noOfSheets : "+noOfSheets);
		if(noOfSheets<=0)
		{
			System.out.println("No of Sheets cannot be 0");
			return;
		}
		if(color==null)
		{
			System.out.println("color cannot be null");
			return;
		}
		if(type==null)
		{
			System.out.println("Type cannot be null");
			return;
		}
		
		System.out.println("BedSheet Info is Valid...");
	}
}