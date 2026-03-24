class FestivalStore
{
	Festival[] festivals;
	int currentIndex=0;
	
	FestivalStore(Festival[] festivals)
	{
		this.festivals=festivals;
	}
	
	void save(Festival festival)
	{
		System.out.println("Executing save in FestivalStore...");
		if(festival!=null && this.festivals!=null)
		{
			int index=this.festivals.length-1;
			if(this.currentIndex<=index)
			{
				this.festivals[this.currentIndex]=festival;
				festival.printInfo();
				System.out.println("Festival Stored at index : "+this.currentIndex);
				this.currentIndex++;
			}
			else
			{
				System.out.println("Array is full..");
			}
		}
		else
		{
			System.out.println("Reference cannot be null...");
		}
	}
}