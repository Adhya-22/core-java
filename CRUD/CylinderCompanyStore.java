class CylinderCompanyStore
{
	String[] companyNames;
	int currentIndex=0;
	
	CylinderCompanyStore(String[] companyNames)
	{
		this.companyNames=companyNames;
	}
	
	void store(String company)
	{
		System.out.println("Executing store in CylinderCompanyStore..");
		System.out.println("Cylinder Company Name : "+company);
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
		System.out.println("Executing search in CylinderCompanyStore , with arg : "+name);
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
	
	boolean update(int index,String company)
	{
		System.out.println("Executing update in SavePasta...");
		if(index>=0 && index<=this.companyNames.length-1)
		{
			System.out.println("Index present, can update.");
			if(company!=null)
			{
				this.companyNames[index]=company;
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
		System.out.println("Executing update using element in savePasta..");
		if(oldCompany!=null)
		{
			int index=0;
			for(String company:companyNames)
			{
				if(company==oldCompany)
				{
					this.companyNames[index]=newCompany;
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
		System.out.println("Executing delete in SavePasta..");
		if(index>=0 && index<=this.companyNames.length-1)
		{
			System.out.println("Index Present, can delete.");
			this.companyNames[index]=null;
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
		System.out.println("Executing delete with company in SavePasta..");
		int index=0;
		for(String savedCompany:companyNames)
		{
			if(savedCompany==company)
			{
				this.companyNames[index]=null;
				return "DELETED SUCCESSFULLY";
			}
			index++;
		}
		return "FAILED";
	}

}