class Charger
{
	static void chargerInfo(String type)
	{
		System.out.println("charger of type : "+type);
		if(type==null)
		{
			System.out.println("Type cannot be null");
			return;
		}
		System.out.println("Charger info is valid...");
	}
	
	static void chargerInfo(int voltage,String type)
	{
		System.out.println("Over-loaded: charger of voltage : "+voltage+" Type : "+type);
		if(voltage<=0)
		{
			System.out.println("Voltage cannot be 0");
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