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
}