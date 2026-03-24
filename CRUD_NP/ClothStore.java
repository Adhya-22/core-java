class ClothStore
{
	Cloth[] clothes;
	int currentIndex=0;
	
	ClothStore(Cloth[] clothes)
	{
		this.clothes=clothes;
	}
	
	void save(Cloth cloth)
	{
		System.out.println("Executing save in ClothStore...");
		if(cloth!=null && this.clothes!=null)
		{
			int index=this.clothes.length-1;
			if(this.currentIndex<=index)
			{
				this.clothes[this.currentIndex]=cloth;
				cloth.printInfo();
				System.out.println("Cloth Stored at index : "+this.currentIndex);
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