class CloudStore
{
	Cloud[] clouds;
	int currentIndex=0;
	
	CloudStore(Cloud[] clouds)
	{
		this.clouds=clouds;
	}
	
	void save(Cloud cloud)
	{
		System.out.println("Executing save in CloudStore...");
		if(cloud!=null && this.clouds!=null)
		{
			int index=this.clouds.length-1;
			if(this.currentIndex<=index)
			{
				this.clouds[this.currentIndex]=cloud;
				cloud.printInfo();
				System.out.println("Cloud stored at index : "+this.currentIndex);
				this.currentIndex++;
			}
			else
			{
				System.out.println("Array is full...");
			}
		}
		else
		{
			System.out.println("Reference cannot be null..");
		}
	}
}