class CarpenterRunner
{
	public static void main(String[] args)
	{
		String[] woods={"Teak","Maple","Mahogany"};
		
		Nail nail1=new Nail("Copper");
		Nail nail2=new Nail("Aluminium");
		Nail nail3=new Nail("Stainless Steel");
		
		Nail[] nails={nail1,nail2,nail3};
		
		Carpenter carpenter=new Carpenter(woods,nails);
		carpenter.getInfo();
	}
}