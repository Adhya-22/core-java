class GenderStore
{
	Gender[] genders;
	int currentIndex=0;
	
	GenderStore(Gender[] genders)
	{
		this.genders=genders;
	}
	
	void store(Gender gender)
	{
		System.out.println("Executing store in GenderStore....");
		if(gender!=null && this.genders!=null)
		{
			int index=this.genders.length-1;
			if(this.currentIndex<=index)
			{
				this.genders[this.currentIndex]=gender;
				System.out.println("Gender stored");
				this.currentIndex++;
			}
			else
			{
				System.out.println("Array is full...");
			}
		}
		else
		{
			System.out.println("References cannot be null...");
		}
	}
	
	void display()
	{
		System.out.println("Executing display in GenderStore...");
		if(this.genders!=null)
		{
			for(Gender gender:this.genders)
			{
				if(gender!=null)
				{
					System.out.println(gender);
				}
			}
		}
		else
		{
			System.out.println("Array is not present...");
		}
	}
	
	void sortAscendingOrder(Gender[] genders)
	{
		System.out.println("Executing sortAscendingOrder in GenderStore...");
		if(genders!=null)
		{
			for(int index=0;index<genders.length-1;index++)
			{
				for(int nextIndex=index+1;nextIndex<genders.length;nextIndex++)
				{
					if(genders[index].name().compareTo(genders[nextIndex].name())>0)
					{
						Gender temp=genders[index];
						genders[index]=genders[nextIndex];
						genders[nextIndex]=temp;
					}
				}
			}
		}
		else
		{
			System.out.println("Array is not present..");
		}
	}
	
	void sortDescendingOrder(Gender[] genders)
	{
		System.out.println("Executing sortDescendingOrder in GenderStore...");
		if(genders!=null)
		{
			for(int index=0;index<genders.length-1;index++)
			{
				for(int nextIndex=index+1;nextIndex<genders.length;nextIndex++)
				{
					if(genders[index].name().compareTo(genders[nextIndex].name())<0)
					{
						Gender temp=genders[index];
						genders[index]=genders[nextIndex];
						genders[nextIndex]=temp;
					}
				}
			}
		}
		else
		{
			System.out.println("Array is not present..");
		}
	}
}