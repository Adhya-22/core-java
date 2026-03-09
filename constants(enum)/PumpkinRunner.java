class PumpkinRunner
{
	public static void main(String[] args)
	{
		Farm farm=new Farm(4);
		PumpkinSize size=PumpkinSize.SMALL;
		Pumpkin pumpkin=new Pumpkin(2,farm,size);
		pumpkin.printInfo();
		
		Farm farm2=new Farm(5);
		PumpkinSize size2=PumpkinSize.MEDIUM;
		Pumpkin pumpkin2=new Pumpkin(4,farm2,size2);
		pumpkin2.printInfo();
		
		Farm farm3=new Farm(2);
		PumpkinSize size3=PumpkinSize.LARGE;
		Pumpkin pumpkin3=new Pumpkin(6,farm3,size3);
		pumpkin3.printInfo();
		
		Farm farm4=new Farm(8);
		PumpkinSize size4=PumpkinSize.GAINT;
		Pumpkin pumpkin4=new Pumpkin(10,farm4,size4);
		pumpkin4.printInfo();
	}
}