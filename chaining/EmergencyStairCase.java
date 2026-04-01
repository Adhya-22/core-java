class EmergencyStairCase extends StairCase
{
	EmergencyStairCase()
	{
		super(20,5.3,true);
		System.out.println("No-arg contructor in EmergencyStairCase");
	}
	
	EmergencyStairCase(int noOfSteps,double stepWidth,boolean hasCarpet)
	{
		super(noOfSteps,stepWidth,hasCarpet);
		System.out.println("int,double,boolean constructor in EmergencyStairCase");
	}
	
	EmergencyStairCase(double stepWidth)
	{
		super(25,stepWidth,false);
		System.out.println("double constructor in EmergencyStairCase");
	}
}
