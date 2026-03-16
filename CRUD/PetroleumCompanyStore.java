class PetroleumCompanyStore
{
	String[] companyNames;
	int currentIndex=0;
	
	PetroleumCompanyStore(String[] companyNames)
	{
		this.companyNames=companyNames;
	}
	
	void store(String company)
	{
		System.out.println("Executing store in PetroleumCompanyStore..");
		System.out.println("Petroleum Company Name : "+company);
		if(this.companyNames!=null)
		{
			int index=this.companyNames.length-1;
			System.out.println("Storing companyName in index : "+this.currentIndex);
			if(this.currentIndex<=index)
			{
				this.companyNames[this.currentIndex]=company;
				this.currentIndex++;
				System.out.println("Company name stored, next index is : "+this.currentIndex);
			}
			else
			{
				System.out.println("Array is full, cannot store maore.");
			}
		}
		else
		{
			System.out.println("Array is null..");
		}
	}
	
	boolean search(String name)
	{
		System.out.println("Executing search in PetroleumCompanyStore , with arg : "+name);
		if(name!=null)
		{
			if(this.companyNames!=null)
			{
				for(String tempName:companyNames)
				{
					System.out.println("Comparing with : "+tempName);
					if(name==tempName)
					{
						System.out.println("Name is matching...");
						return true;
					}
				}
			}
			else
			{
				System.out.println("CompanyNames is null, cannot search..");
			}
		}
		else
		{
			System.out.println("name is null , cannot search..");
		}
		return false;
	}
}