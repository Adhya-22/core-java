class Fire
{
	static String getReaction()
	{
		System.out.println("Executing getReaction in Fire...");
		String reaction="Chemical";
		return reaction;
	}
	
	static String getEnergy()
	{
		System.out.println("Executing getEnergy in Fire...");
		String energy="Exothermic";
		return energy;
	}
	
	static String getEmission()
	{
		System.out.println("Executing getEmission in Fire...");
		String emission="CO2";
		return emission;
	}
	
	static String getColor()
	{
		System.out.println("Executing getColor in Fire...");
		String color="Orange";
		return color;
	}
	
	static int getTemp()
	{
		System.out.println("Executing getTemp in Fire...");
		int temp=300;
		return temp;
	}
}