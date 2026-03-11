class Hammer
{
	double[] prices;
	Nail[] nails;
	
	Hammer(double[] prices,Nail[] nails)
	{
		this.prices=prices;
		this.nails=nails;
	}
	
	void getInfo()
	{
		System.out.println("Executing getInfo in Hammer..");
		for(double price:prices)
		{
			System.out.println("Hammer price : "+price);
		}
		if(this.nails!=null)
		{
			System.out.println("total nails : "+this.nails.length);
			for(Nail nail:this.nails)
			{
				nail.display();
			}
		}
	}
}