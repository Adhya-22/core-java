class SavePasta
{
	String[] types;
	int currentIndex;
	
	SavePasta(String[] types)
	{
		this.types=types;
	}
	
	void save(String type)
	{
		System.out.println("Executing save in SavePasta...");
		System.out.println("Pasta type : "+type);
		if(this.types!=null)
		{
			int index=this.types.length-1;
			System.out.println("Saving pasta in index : "+this.currentIndex);
			if(this.currentIndex<=index)
			{
				this.types[this.currentIndex]=type;
				this.currentIndex++;
				System.out.println("Pasta type saved , next index : "+this.currentIndex);
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
	
	boolean search(String type)
	{
		System.out.println("Executing search in SavePasta , with arg : "+type);
		if(type!=null)
		{
			if(this.types!=null)
			{
				for(String tempType:types)
				{
					System.out.println("Comparing with : "+tempType);
					if(type==tempType)
					{
						System.out.println("type is matching...");
						return true;
					}
				}
			}
			else
			{
				System.out.println("types is null, cannot search..");
			}
		}
		else
		{
			System.out.println("type is null , cannot search..");
		}
		return false;
	}
	
	boolean update(int index,String type)
	{
		System.out.println("Executing update in SavePasta...");
		if(index>=0 && index<=this.types.length-1)
		{
			System.out.println("Index present, can update.");
			if(type!=null)
			{
				this.types[index]=type;
				System.out.println("Stored : "+type);
				return true;
			}
			else
			{
				System.out.println("type is null...");
			}
		}
		else
		{
			System.out.println("Index not present..");
		}
		return false;
	}
	
	boolean update(String oldType,String newType)
	{
		System.out.println("Executing update using element in savePasta..");
		if(oldType!=null)
		{
			int index=0;
			for(String type:types)
			{
				if(type==oldType)
				{
					this.types[index]=newType;
					System.out.println("Stored : "+newType);
					return true;
				}
				index++;
			}
		}
		else
		{
			System.out.println("Old type is null...");
		}
		return false;
	}
	
	String delete(int index)
	{
		System.out.println("Executing delete in SavePasta..");
		if(index>=0 && index<=this.types.length-1)
		{
			System.out.println("Index Present, can delete.");
			this.types[index]=null;
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
		System.out.println("Executing delete with type in SavePasta..");
		int index=0;
		for(String savedType:types)
		{
			if(savedType==type)
			{
				this.types[index]=null;
				return "DELETED SUCCESSFULLY";
			}
			index++;
		}
		return "FAILED";
	}
}