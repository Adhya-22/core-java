class Carpenter
{
	String[] woods;
	Nail[] nails;
	
	Carpenter(String[] woods,Nail[] nails)
	{
		this.woods=woods;
		this.nails=nails;
	}
	
	void getInfo()
	{
		System.out.println("Executing getInfo in Carpenter..");
		if(this.woods!=null)
		{
			for(String wood:woods)
			{
				System.out.println("Brand : "+wood);
			}
		}
		if(this.nails!=null)
		{
			System.out.println("total inks : "+this.nails.length);
			for(Nail nail:this.nails)
			{
				nail.display();
			}
		}
	}
}