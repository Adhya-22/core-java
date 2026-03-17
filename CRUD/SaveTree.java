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
	
	boolean update(int index,String name)
	{
		System.out.println("Executing update in SaveTree...");
		if(index>=0 && index<=this.names.length-1)
		{
			System.out.println("Index present, can update.");
			if(name!=null)
			{
				this.names[index]=name;
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
		System.out.println("Executing update using element in SaveTree..");
		if(oldName!=null)
		{
			int index=0;
			for(String name:names)
			{
				if(name==oldName)
				{
					this.names[index]=newName;
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
		System.out.println("Executing delete in SaveTree..");
		if(index>=0 && index<=this.names.length-1)
		{
			System.out.println("Index Present, can delete.");
			this.names[index]=null;
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
		System.out.println("Executing delete with name in SaveTree..");
		int index=0;
		for(String savedName:names)
		{
			if(savedName==name)
			{
				this.names[index]=null;
				return "DELETED SUCCESSFULLY";
			}
			index++;
		}
		return "FAILED";
	}
}