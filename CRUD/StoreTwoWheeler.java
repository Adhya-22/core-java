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
					if(model==tempModel)
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
	
	boolean update(int index,String model)
	{
		System.out.println("Executing update in SavePasta...");
		if(index>=0 && index<=this.models.length-1)
		{
			System.out.println("Index present, can update.");
			if(model!=null)
			{
				this.models[index]=model;
				System.out.println("Stored : "+model);
				return true;
			}
			else
			{
				System.out.println("model is null...");
			}
		}
		else
		{
			System.out.println("Index not present..");
		}
		return false;
	}
	
	boolean update(String oldModel,String newModel)
	{
		System.out.println("Executing update using element in savePasta..");
		if(oldModel!=null)
		{
			int index=0;
			for(String model:models)
			{
				if(model==oldModel)
				{
					this.models[index]=newModel;
					System.out.println("Stored : "+newModel);
					return true;
				}
				index++;
			}
		}
		else
		{
			System.out.println("Old model is null...");
		}
		return false;
	}
	
	String delete(int index)
	{
		System.out.println("Executing delete in SavePasta..");
		if(index>=0 && index<=this.models.length-1)
		{
			System.out.println("Index Present, can delete.");
			this.models[index]=null;
			return "DELETED SUCCESSFULLY";
		}
		else
		{
			System.out.println("Index not present..");
		}
		return "FAILED";
	}
	
	String delete(String model)
	{
		System.out.println("Executing delete with model in SavePasta..");
		int index=0;
		for(String savedModel:models)
		{
			if(savedModel==model)
			{
				this.models[index]=null;
				return "DELETED SUCCESSFULLY";
			}
			index++;
		}
		return "FAILED";
	}
}