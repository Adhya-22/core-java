class JamunRunner
{
	public static void main(String[] args)
	{
		double[] prices={200,340,450};
		
		SweetShop sweetShop1=new SweetShop("Haldiram's");
		SweetShop sweetShop2=new SweetShop("Great Indian Sweet House");
		SweetShop sweetShop3=new SweetShop("Savi Bakery");
		
		SweetShop[] sweetShops={sweetShop1,sweetShop2,sweetShop3};
		
		Jamun jamun=new Jamun(prices,sweetShops);
		jamun.getInfo();
	}
}