class Beer
{
	double price;
	Bottle bottle;
	BeerBrand beerBrand;
	
	Beer(double price, Bottle bottle,BeerBrand beerBrand)
	{
		this.price=price;
		this.bottle=bottle;
		this.beerBrand=beerBrand;
	}
	
	void printInfo()
	{
		System.out.println("Beer Price : "+this.price);
		if(this.bottle!=null)
		{
			System.out.println("bottle size : "+bottle.size);
		}
		System.out.println("Beer brand : "+this.beerBrand);
	}
}