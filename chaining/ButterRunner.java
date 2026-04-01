class ButterRunner
{
	public static void main(String... args)
	{
		FlavouredButter flavouredButter1=new FlavouredButter();
		System.out.println("SelfLife : "+flavouredButter1.selfLife);
		System.out.println("Flavour : "+flavouredButter1.flavour);
		System.out.println("isVegan : "+flavouredButter1.isVegan);
		
		System.out.println();
		
		FlavouredButter flavouredButter2=new FlavouredButter(3,"Salted",false);
		System.out.println("SelfLife : "+flavouredButter2.selfLife);
		System.out.println("Flavour : "+flavouredButter2.flavour);
		System.out.println("isVegan : "+flavouredButter2.isVegan);
		
		System.out.println();
		
		FlavouredButter flavouredButter3=new FlavouredButter(true);
		System.out.println("SelfLife : "+flavouredButter3.selfLife);
		System.out.println("Flavour : "+flavouredButter3.flavour);
		System.out.println("isVegan : "+flavouredButter3.isVegan);
	}
}