class AcidStore
{
	Acid[] acids;
	int currentIndex=0;
	
	AcidStore(Acid[] acids)
	{
		this.acids=acids;
	}
	
	void save(Acid acid)
	{
		System.out.println("Executing save in AcidStore...");
		if(acid!=null && this.acids!=null)
		{
			int index=this.acids.length-1;
			if(this.currentIndex<=index)
			{
				this.acids[this.currentIndex]=acid;
				acid.printInfo();
				System.out.println("Acid Stored at index : "+this.currentIndex);
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