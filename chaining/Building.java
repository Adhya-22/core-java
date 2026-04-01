class Building
{
	int noOfSecurity;
	boolean hasParking;
	boolean hasElevator;
	
	Building(int noOfSecurity,boolean hasParking,boolean hasElevator)
	{
		System.out.println("int,boolean,boolean constructor in Building");
		this.noOfSecurity=noOfSecurity;
		this.hasParking=hasParking;
		this.hasElevator=hasElevator;
	}
}