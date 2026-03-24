class CapStore
{
	Cap[] caps;
	int currentIndex=0;
	
	CapStore(Cap[] caps)
	{
		this.caps=caps;
	}
	
	void save(Cap cap)
	{
		System.out.println("Executing save in CapStore...");
		if(cap!=null && this.caps!=null)
		{
			int index=this.caps.length-1;
			if(this.currentIndex<=index)
			{
				this.caps[this.currentIndex]=cap;
				cap.printInfo();
				System.out.println("Cap Stored at index : "+this.currentIndex);
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