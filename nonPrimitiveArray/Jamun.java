class Jamun
{
	double[] prices;
	SweetShop[] sweetShops;
	
	Jamun(double[] prices,SweetShop[] sweetShops)
	{
		this.prices=prices;
		this.sweetShops=sweetShops;
	}
	
	void getInfo()
	{
		System.out.println("Executing getInfo in Jamun..");
		for(double price:prices)
		{
			System.out.println("Jamun price : "+price);
		}
		if(this.sweetShops!=null)
		{
			System.out.println("total SweetShops : "+this.sweetShops.length);
			for(SweetShop sweetShop:this.sweetShops)
			{
				sweetShop.display();
			}
		}
	}
}