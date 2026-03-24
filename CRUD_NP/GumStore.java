class GumStore
{
	Gum[] gums;
	int currentIndex=0;
	
	GumStore(Gum[] gums)
	{
		this.gums=gums;
	}
	
	void save(Gum gum)
	{
		System.out.println("Executing save in GumStore...");
		if(gum!=null && this.gums!=null)
		{
			int index=this.gums.length-1;
			if(this.currentIndex<=index)
			{
				this.gums[this.currentIndex]=gum;
				gum.printInfo();
				System.out.println("Gum Stored at index : "+this.currentIndex);
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