class NapkinRunner
{
	public static void main(String[] args)
	{
		Color color=new Color("Red");
		NapkinType type=NapkinType.CLOTH;
		Napkin napkin=new Napkin(3,color,type);
		napkin.printInfo();
		
		Color color2=new Color("Orange");
		NapkinType type2=NapkinType.PAPER;
		Napkin napkin2=new Napkin(1,color2,type2);
		napkin2.printInfo();
		
		Color color3=new Color("Blue");
		NapkinType type3=NapkinType.DINING;
		Napkin napkin3=new Napkin(4,color3,type3);
		napkin3.printInfo();
		
		Color color4=new Color("Pink");
		NapkinType type4=NapkinType.KITCHEN;
		Napkin napkin4=new Napkin(5,color4,type4);
		napkin4.printInfo();
	}
}