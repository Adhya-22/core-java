class StatueStore
{
	Statue[] statues;
	int currentIndex=0;
	
	StatueStore(Statue[] statues)
	{
		this.statues=statues;
	}
	
	void save(Statue statue)
	{
		System.out.println("Executing save in StatueStore...");
		if(statue!=null && this.statues!=null)
		{
			int index=this.statues.length-1;
			if(this.currentIndex<=index)
			{
				this.statues[this.currentIndex]=statue;
				statue.printInfo();
				System.out.println("Statue stored at index : "+this.currentIndex);
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