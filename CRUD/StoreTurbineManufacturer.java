class StoreTurbineManufacturer
{
	String[] companies;
	int currentIndex;
	
	StoreTurbineManufacturer(String[] companies)
	{
		this.companies=companies;
	}
	
	void store(String company)
	{
		System.out.println("Executing store in StoreTurbineManufacturer...");
		System.out.println("Manufacturer company : "+company);
		if(this.companies!=null)
		{
			int index=this.companies.length-1;
			System.out.println("Saving manufacturer company in index : "+this.currentIndex);
			if(this.currentIndex<=index)
			{
				this.companies[this.currentIndex]=company;
				this.currentIndex++;
				System.out.println("Manufacturer company stored , next index : "+this.currentIndex);
			}
			else
			{
				System.out.println("Array is full, connot save more..");
			}
		}
		else
		{
			System.out.println("Array is null");
		}
	}
	
	boolean search(String company)
	{
		System.out.println("Executing search in StoreTurbineManufacturer , with arg : "+company);
		if(company!=null)
		{
			if(this.companies!=null)
			{
				for(String tempcompany:companies)
				{
					System.out.println("Comparing with : "+tempcompany);
					if(company==tempcompany)
					{
						System.out.println("company is matching...");
						return true;
					}
				}
			}
			else
			{
				System.out.println("companies is null, cannot search..");
			}
		}
		else
		{
			System.out.println("company is null , cannot search..");
		}
		return false;
	}
}