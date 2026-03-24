class MapStore
{
	Map[] maps;
	int currentIndex=0;
	
	MapStore(Map[] maps)
	{
		this.maps=maps;
	}
	
	void save(Map map)
	{
		System.out.println("Executing save in MapStore...");
		if(map!=null && this.maps!=null)
		{
			int index=this.maps.length-1;
			if(this.currentIndex<=index)
			{
				this.maps[this.currentIndex]=map;
				map.printInfo();
				System.out.println("Map stored at index : "+this.currentIndex);
				this.currentIndex++;
			}
			else
			{
				System.out.println("Array is full...");
			}
		}
		else
		{
			System.out.println("Reference cannot be null..");
		}
	}
	
}