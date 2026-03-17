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
	
	boolean update(int index,String name)
	{
		System.out.println("Executing update in StoreSteelPlant...");
		if(index>=0 && index<=this.plantNames.length-1)
		{
			System.out.println("Index present, can update.");
			if(name!=null)
			{
				this.plantNames[index]=name;
				System.out.println("Stored : "+name);
				return true;
			}
			else
			{
				System.out.println("name is null...");
			}
		}
		else
		{
			System.out.println("Index not present..");
		}
		return false;
	}
	
	boolean update(String oldName,String newName)
	{
		System.out.println("Executing update using element in StoreSteelPlant..");
		if(oldName!=null)
		{
			int index=0;
			for(String name:plantNames)
			{
				if(name==oldName)
				{
					this.plantNames[index]=newName;
					System.out.println("Stored : "+newName);
					return true;
				}
				index++;
			}
		}
		else
		{
			System.out.println("Old name is null...");
		}
		return false;
	}
	
	String delete(int index)
	{
		System.out.println("Executing delete in StoreSteelPlant..");
		if(index>=0 && index<=this.plantNames.length-1)
		{
			System.out.println("Index Present, can delete.");
			this.plantNames[index]=null;
			return "DELETED SUCCESSFULLY";
		}
		else
		{
			System.out.println("Index not present..");
		}
		return "FAILED";
	}
	
	String delete(String name)
	{
		System.out.println("Executing delete with name in StoreSteelPlant..");
		int index=0;
		for(String savedName:plantNames)
		{
			if(savedName==name)
			{
				this.plantNames[index]=null;
				return "DELETED SUCCESSFULLY";
			}
			index++;
		}
		return "FAILED";
	}
}