class HorlicksRunner
{
	public static void main(String[] args)
	{
		Milk milk=new Milk("Regular");
		Flavour flavour=Flavour.CLASSIC;
		Horlicks horlicks=new Horlicks(500,milk,flavour);
		horlicks.printInfo();
		
		Milk milk2=new Milk("Oat");
		Flavour flavour2=Flavour.ELACHI;
		Horlicks horlicks2=new Horlicks(750,milk2,flavour2);
		horlicks2.printInfo();
		
		Milk milk3=new Milk("Almond");
		Flavour flavour3=Flavour.CHOCOLATE;
		Horlicks horlicks3=new Horlicks(250,milk3,flavour3);
		horlicks3.printInfo();
		
		Milk milk4=new Milk("Regular");
		Flavour flavour4=Flavour.VANILLA;
		Horlicks horlicks4=new Horlicks(1000,milk4,flavour4);
		horlicks4.printInfo();
	}
}