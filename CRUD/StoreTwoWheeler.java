class StoreTwoWheeler
{
	String[] models;
	int currentIndex=0;
	
	StoreTwoWheeler(String[] models)
	{
		this.models=models;
	}
	
	void store(String model)
	{
		System.out.println("Executing store in StoreTwoWheeler..");
		System.out.println("TwoWheeler model : "+model);
		if(this.models!=null)
		{
			int index=this.models.length-1;
			System.out.println("Storing two wheeler model in index : "+this.currentIndex);
			if(this.currentIndex<=index)
			{
				this.models[this.currentIndex]=model;
				this.currentIndex++;
				System.out.println("Two wheeler model saved , next index : "+this.currentIndex);
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
	
	boolean search(String model)
	{
		System.out.println("Executing search in StoreTwoWheeler , with arg : "+model);
		if(model!=null)
		{
			if(this.models!=null)
			{
				for(String tempModel:models)
				{
					System.out.println("Comparing with : "+tempModel);
					if(model==tempmodel)
					{
						System.out.println("model is matching...");
						return true;
					}
				}
			}
			else
			{
				System.out.println("models is null, cannot search..");
			}
		}
		else
		{
			System.out.println("model is null , cannot search..");
		}
		return false;
	}
}