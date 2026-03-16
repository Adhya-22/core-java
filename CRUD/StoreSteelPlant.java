class StoreSteelPlant
{
	String[] plantNames;
	int currentIndex;
	
	StoreSteelPlant(String[] plantNames)
	{
		this.plantNames=plantNames;
	}
	
	void store(String name)
	{
		System.out.println("Executing store in StoreSteelPlant...");
		System.out.println("Steel Plant name : "+name);
		if(this.plantNames!=null)
		{
			int index=this.plantNames.length-1;
			System.out.println("Saving plant in index : "+this.currentIndex);
			if(this.currentIndex<=index)
			{
				this.plantNames[this.currentIndex]=name;
				this.currentIndex++;
				System.out.println("Plant name stored , next index : "+this.currentIndex);
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
	
	boolean search(String name)
	{
		System.out.println("Executing search in StoreSteelPlant , with arg : "+name);
		if(name!=null)
		{
			if(this.plantNames!=null)
			{
				for(String tempName:plantNames)
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
				System.out.println("plantNames is null, cannot search..");
			}
		}
		else
		{
			System.out.println("name is null , cannot search..");
		}
		return false;
	}
}