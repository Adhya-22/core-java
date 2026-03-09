class ParliamentRunner
{
	public static void main(String[] args)
	{
		Country country=new Country("India");
		ParliamentType type=ParliamentType.LOKASABHA;
		
		Parliament parliament=new Parliament(545,country,type);
		parliament.printInfo();
		
		ParliamentType type2=ParliamentType.RAJYASABHA;
		Parliament parliament1=new Parliament(545,country,type2);
		parliament1.printInfo();
	}
}