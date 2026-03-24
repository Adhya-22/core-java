class SambarStore
{
	Sambar[] sambars;
	int currentIndex=0;
	
	SambarStore(Sambar[] sambars)
	{
		this.sambars=sambars;
	}
	
	void save(Sambar sambar)
	{
		System.out.println("Executing save in SambarStore...");
		if(sambar!=null && this.sambars!=null)
		{
			int index=this.sambars.length-1;
			if(this.currentIndex<=index)
			{
				this.sambars[this.currentIndex]=sambar;
				sambar.printInfo();
				System.out.println("Sambar Stored at index : "+this.currentIndex);
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