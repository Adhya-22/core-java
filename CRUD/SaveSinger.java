class SaveSinger
{
	String[] names;
	int currentIndex;
	
	SaveSinger(String[] names)
	{
		this.names=names;
	}
	
	void save(String name)
	{
		System.out.println("Executing save in SaveSinger...");
		System.out.println("Singer name : "+name);
		if(this.names!=null)
		{
			int index=this.names.length-1;
			System.out.println("Saving singer in index : "+this.currentIndex);
			if(this.currentIndex<=index)
			{
				this.names[this.currentIndex]=name;
				this.currentIndex++;
				System.out.println("Singer name saved , next index : "+this.currentIndex);
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
		System.out.println("Executing search in SaveSinger , with arg : "+name);
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
		System.out.println("Executing update in SaveSinger..");
		if(index>=0 && index<=this.names.length-1)
		{
			System.out.println("Index present, can update");
			if(name!=null)
			{
				this.names[index]=name;
				System.out.println("Stored : "+name);
				return true;
			}
			else
			{
				System.out.println("Name is null..");
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
		System.out.println("Executing update with name in SaveSinger...");
		if(oldName!=null)
		{
			int index=0;
			for(String name:names)
			{
				if(oldName==name)
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
			System.out.println("oldName is null..");
		}
		return false;
	}
	
	String delete(int index)
	{
		System.out.println("Executing delete in SaveSinger...");
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
	
	String delete(String type)
	{
		System.out.println("Executing delete with type in SaveSinger..");
		int index=0;
		for(String savedName:names)
		{
			if(savedName==type)
			{
				this.names[index]=null;
				return "DELETED SUCCESSFULLY";
			}
			index++;
		}
		return "FAILED";
	}
}