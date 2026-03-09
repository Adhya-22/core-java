class Parliament
{
	int noOfMembers;
	Country country;
	ParliamentType parliamentType;
	
	Parliament(int noOfMembers,Country country,ParliamentType parliamentType)
	{
		this.noOfMembers=noOfMembers;
		this.country=country;
		this.parliamentType=parliamentType;
	}
	
	void printInfo()
	{
		System.out.println("Number of Members : "+this.noOfMembers);
		if(this.country!=null)
		{
			System.out.println("Country name :"+country.name);
		}
		System.out.println("Parliament Type : "+this.parliamentType);
	}
}