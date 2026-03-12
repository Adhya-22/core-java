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
}