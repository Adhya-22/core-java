class TollgateStore
{
	Tollgate[] tollgates;
	int currentIndex=0;
	
	TollgateStore(Tollgate[] tollgates)
	{
		this.tollgates=tollgates;
	}
	
	void save(Tollgate tollgate)
	{
		System.out.println("Executing save in TollgateStore...");
		if(tollgate!=null && this.tollgates!=null)
		{
			int index=this.tollgates.length-1;
			if(this.currentIndex<=index)
			{
				this.tollgates[this.currentIndex]=tollgate;
				tollgate.printInfo();
				System.out.println("Tollgate stored at index : "+this.currentIndex);
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