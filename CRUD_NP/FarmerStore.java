class FarmerStore
{
	Farmer[] farmers;
	int currentIndex=0;
	
	FarmerStore(Farmer[] farmers)
	{
		this.farmers=farmers;
	}
	
	void save(Farmer farmer)
	{
		System.out.println("Executing save in FarmerStore...");
		if(farmer!=null && this.farmers!=null)
		{
			int index=this.farmers.length-1;
			if(this.currentIndex<=index)
			{
				this.farmers[this.currentIndex]=farmer;
				farmer.printInfo();
				System.out.println("Farmer Stored at index : "+this.currentIndex);
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