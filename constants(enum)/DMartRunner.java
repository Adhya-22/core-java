class DMartRunner
{
	public static void main(String[] args)
	{
		Location location=new Location("BTM");
		ShampooName name=ShampooName.LOREAL;
		DMart dMart=new DMart(30,location,name);
		dMart.printInfo();
		
		Location location2=new Location("Bannergatta");
		ShampooName name2=ShampooName.PANTENE;
		DMart dMart2=new DMart(30,location2,name2);
		dMart2.printInfo();
		
		Location location3=new Location("Maruthi Nagar");
		ShampooName name3=ShampooName.CLINIC_PLUS;
		DMart dMart3=new DMart(30,location3,name3);
		dMart3.printInfo();
		
		Location location4=new Location("Mico Layout");
		ShampooName name4=ShampooName.DOVE;
		DMart dMart4=new DMart(30,location4,name4);
		dMart4.printInfo();
	}
}