class MushroomRunner
{
	public static void main(String[] args)
	{
		Farm farm=new Farm(4);
		MushroomType type=MushroomType.BUTTON;
		Mushroom mushroom=new Mushroom(2,farm,type);
		mushroom.printInfo();
		
		Farm farm2=new Farm(5);
		MushroomType type2=MushroomType.OYSTER;
		Mushroom mushroom2=new Mushroom(4,farm2,type2);
		mushroom2.printInfo();
		
		Farm farm3=new Farm(2);
		MushroomType type3=MushroomType.SHIITAKE;
		Mushroom mushroom3=new Mushroom(6,farm3,type3);
		mushroom3.printInfo();
		
		Farm farm4=new Farm(8);
		MushroomType type4=MushroomType.PORTOBELLO;
		Mushroom mushroom4=new Mushroom(10,farm4,type4);
		mushroom4.printInfo();
	}
}