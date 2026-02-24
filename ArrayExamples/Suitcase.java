class Suitcase
{
	static void suitcaseInfo(int noOfCompartments)
	{
		System.out.println("Suitcase with no Of Compartments : "+noOfCompartments);
		if(noOfCompartments<=0)
		{
			System.out.println("No of compartments cannot be 0");
			return;
		}
		System.out.println("Suitcase info is valid...");
	}
	
	static void suitcaseInfo(String company,int noOfCompartments)
	{
		System.out.println("Over-loaded: Suitcase Of Company : "+company+" and No of Compartments : "+noOfCompartments);
		if(company==null)
		{
			System.out.println("Company cannot be null");
			return;
		}
		if(noOfCompartments<=0)
		{
			System.out.println("No of compartments cannot be 0");
			return;
		}
		System.out.println("Suitcase info is valid...");
	}
}