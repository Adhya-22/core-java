class Banner
{
	char[] sizes;
	Occasion[] occasions;
	
	Banner(char[] sizes,Occasion[] occasions)
	{
		this.sizes=sizes;
		this.occasions=occasions;
	}
	
	void getInfo()
	{
		System.out.println("Executing getInfo in Banner..");
		for(double size:sizes)
		{
			System.out.println("Banner size : "+size);
		}
		if(this.occasions!=null)
		{
			System.out.println("total Occasions : "+this.occasions.length);
			for(Occasion occasion:this.occasions)
			{
				occasion.display();
			}
		}
	}
}