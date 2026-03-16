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
}