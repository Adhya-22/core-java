class SaveTree
{
	String[] names;
	int currentIndex;
	
	SaveTree(String[] names)
	{
		this.names=names;
	}
	
	void save(String name)
	{
		System.out.println("Executing save in SaveTree...");
		System.out.println("Tree name : "+name);
		if(this.names!=null)
		{
			int index=this.names.length-1;
			System.out.println("Saving Tree in index : "+this.currentIndex);
			if(this.currentIndex<=index)
			{
				this.names[this.currentIndex]=name;
				this.currentIndex++;
				System.out.println("Tree name saved , next index : "+this.currentIndex);
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
		System.out.println("Executing search in SaveTree , with arg : "+name);
		if(name!=null)
		{
			if(this.names!=null)
			{
				for(String tempName:names)
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
				System.out.println("names is null, cannot search..");
			}
		}
		else
		{
			System.out.println("name is null , cannot search..");
		}
		return false;
	}
}