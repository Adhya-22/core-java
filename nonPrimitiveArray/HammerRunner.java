class HammerRunner
{
	public static void main(String[] args)
	{
		double[] prices={200,340,450};
		
		Nail nail1=new Nail("Copper");
		Nail nail2=new Nail("Aluminium");
		Nail nail3=new Nail("Stainless Steel");
		
		Nail[] nails={nail1,nail2,nail3};
		
		Hammer hammer=new Hammer(prices,nails);
		hammer.getInfo();
	}
}