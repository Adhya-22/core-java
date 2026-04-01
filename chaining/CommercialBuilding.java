class CommercialBuilding extends Building
{
	
	CommercialBuilding()
	{
		super(20,true,true);
		System.out.println("No-arg contructor in CommercialBuilding");
	}
	
	CommercialBuilding(int noOfSecurity,boolean hasParking,boolean hasElevator)
	{
		super(noOfSecurity,hasParking,hasElevator);
		System.out.println("int,boolean,boolean constructor in CommercialBuilding");
	}
	
	CommercialBuilding(boolean hasParking)
	{
		super(25,hasParking,true);
		System.out.println("boolean constructor in CommercialBuilding");
	}
	
}