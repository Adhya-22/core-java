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
	
		boolean update(int index,String company)
	{
		System.out.println("Executing update in StoreTurbineManufacturer...");
		if(index>=0 && index<=this.companies.length-1)
		{
			System.out.println("Index present, can update.");
			if(company!=null)
			{
				this.companies[index]=company;
				System.out.println("Stored : "+company);
				return true;
			}
			else
			{
				System.out.println("company is null...");
			}
		}
		else
		{
			System.out.println("Index not present..");
		}
		return false;
	}
	
	boolean update(String oldCompany,String newCompany)
	{
		System.out.println("Executing update using element in StoreTurbineManufacturer..");
		if(oldCompany!=null)
		{
			int index=0;
			for(String company:companies)
			{
				if(company==oldCompany)
				{
					this.companies[index]=newCompany;
					System.out.println("Stored : "+newCompany);
					return true;
				}
				index++;
			}
		}
		else
		{
			System.out.println("Old company is null...");
		}
		return false;
	}
	
	String delete(int index)
	{
		System.out.println("Executing delete in StoreTurbineManufacturer..");
		if(index>=0 && index<=this.companies.length-1)
		{
			System.out.println("Index Present, can delete.");
			this.companies[index]=null;
			return "DELETED SUCCESSFULLY";
		}
		else
		{
			System.out.println("Index not present..");
		}
		return "FAILED";
	}
	
	String delete(String company)
	{
		System.out.println("Executing delete with company in StoreTurbineManufacturer..");
		int index=0;
		for(String savedCompany:companies)
		{
			if(savedCompany==company)
			{
				this.companies[index]=null;
				return "DELETED SUCCESSFULLY";
			}
			index++;
		}
		return "FAILED";
	}
}