class StoreKettleBrand
{
	String[] brands;
	int currentIndex;
	
	StoreKettleBrand(String[] brands)
	{
		this.brands=brands;
	}
	
	void store(String brand)
	{
		System.out.println("Executing store in StoreKettleBrand...");
		System.out.println("Kettle brand : "+brand);
		if(this.brands!=null)
		{
			int index=this.brands.length-1;
			System.out.println("Saving kettle brand in index : "+this.currentIndex);
			if(this.currentIndex<=index)
			{
				this.brands[this.currentIndex]=brand;
				this.currentIndex++;
				System.out.println("Kettle brand stored , next index : "+this.currentIndex);
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
	
	boolean search(String brand)
	{
		System.out.println("Executing search in StoreKettleBrand , with arg : "+brand);
		if(brand!=null)
		{
			if(this.brands!=null)
			{
				for(String tempbrand:brands)
				{
					System.out.println("Comparing with : "+tempbrand);
					if(brand==tempbrand)
					{
						System.out.println("brand is matching...");
						return true;
					}
				}
			}
			else
			{
				System.out.println("brands is null, cannot search..");
			}
		}
		else
		{
			System.out.println("brand is null , cannot search..");
		}
		return false;
	}
}