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
	
	boolean update(int index,String brand)
	{
		System.out.println("Executing update in StoreKettleBrand...");
		if(index>=0 && index<=this.brands.length-1)
		{
			System.out.println("Index present, can update.");
			if(brand!=null)
			{
				this.brands[index]=brand;
				System.out.println("Stored : "+brand);
				return true;
			}
			else
			{
				System.out.println("brand is null...");
			}
		}
		else
		{
			System.out.println("Index not present..");
		}
		return false;
	}
	
	boolean update(String oldBrand,String newBrand)
	{
		System.out.println("Executing update using element in StoreKettleBrand..");
		if(oldBrand!=null)
		{
			int index=0;
			for(String brand:brands)
			{
				if(brand==oldBrand)
				{
					this.brands[index]=newBrand;
					System.out.println("Stored : "+newBrand);
					return true;
				}
				index++;
			}
		}
		else
		{
			System.out.println("Old brand is null...");
		}
		return false;
	}
	
	String delete(int index)
	{
		System.out.println("Executing delete in SaveKettleBrand..");
		if(index>=0 && index<=this.brands.length-1)
		{
			System.out.println("Index Present, can delete.");
			this.brands[index]=null;
			return "DELETED SUCCESSFULLY";
		}
		else
		{
			System.out.println("Index not present..");
		}
		return "FAILED";
	}
	
	String delete(String brand)
	{
		System.out.println("Executing delete with brand in SaveKettleBrand..");
		int index=0;
		for(String savedBrand:brands)
		{
			if(savedBrand==brand)
			{
				this.brands[index]=null;
				return "DELETED SUCCESSFULLY";
			}
			index++;
		}
		return "FAILED";
	}
}