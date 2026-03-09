class BeerRunner
{
	public static void main(String[] args)
	{
		Bottle bottle=new Bottle(450);
		BeerBrand brand=BeerBrand.KINGFISHER;
		Beer beer=new Beer(2000,bottle,brand);
		beer.printInfo();
		
		Bottle bottle2=new Bottle(500);
		BeerBrand brand2=BeerBrand.BUDWEISER;
		Beer beer2=new Beer(1200,bottle2,brand2);
		beer2.printInfo();
		
		Bottle bottle3=new Bottle(200);
		BeerBrand brand3=BeerBrand.HEINEKEN;
		Beer beer3=new Beer(2360,bottle3,brand3);
		beer3.printInfo();
		
		Bottle bottle4=new Bottle(90);
		BeerBrand brand4=BeerBrand.CORONA;
		Beer beer4=new Beer(1340,bottle4,brand4);
		beer4.printInfo();
	}
}