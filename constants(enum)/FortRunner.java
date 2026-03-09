class FortRunner
{
	public static void main(String[] args)
	{
		Kingdom kingdom=new Kingdom("Cholas");
		Material type=Material.ROCK;
		Fort fort=new Fort(2700,kingdom,type);
		fort.printInfo();
		
		Kingdom kingdom2=new Kingdom("Magadha");
		Material type2=Material.BRICK;
		Fort fort2=new Fort(1800,kingdom2,type2);
		fort2.printInfo();
		
		Kingdom kingdom3=new Kingdom("Gandhara");
		Material type3=Material.CEMENT;
		Fort fort3=new Fort(3600,kingdom3,type3);
		fort3.printInfo();
		
		Kingdom kingdom4=new Kingdom("Kalinga");
		Material type4=Material.SAND;
		Fort fort4=new Fort(2000,kingdom4,type4);
		fort4.printInfo();
	}
}