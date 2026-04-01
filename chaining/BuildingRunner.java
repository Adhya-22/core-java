class BuildingRunner
{
	public static void main(String... args)
	{
		CommercialBuilding commercialBuilding1=new CommercialBuilding();
		System.out.println("No of Security : "+commercialBuilding1.noOfSecurity);
		System.out.println("has Parking : "+commercialBuilding1.hasParking);
		System.out.println("has Elevator : "+commercialBuilding1.hasElevator);
		
		System.out.println();
		
		CommercialBuilding commercialBuilding2=new CommercialBuilding(1,false,false);
		System.out.println("No of Security : "+commercialBuilding2.noOfSecurity);
		System.out.println("has Parking : "+commercialBuilding2.hasParking);
		System.out.println("has Elevator : "+commercialBuilding2.hasElevator);
		
		System.out.println();
		
		CommercialBuilding commercialBuilding3=new CommercialBuilding(false);
		System.out.println("No of Security : "+commercialBuilding3.noOfSecurity);
		System.out.println("has Parking : "+commercialBuilding3.hasParking);
		System.out.println("has Elevator : "+commercialBuilding3.hasElevator);
	}
}