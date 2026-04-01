class StairCaseRunner
{
	public static void main(String... args)
	{
		EmergencyStairCase emergencyStairCase1=new EmergencyStairCase();
		System.out.println("No Of Steps : "+emergencyStairCase1.noOfSteps);
		System.out.println("Step Width : "+emergencyStairCase1.stepWidth);
		System.out.println("has Carpet : "+emergencyStairCase1.hasCarpet);
		
		System.out.println();
		
		EmergencyStairCase emergencyStairCase2=new EmergencyStairCase(40,200,true);
		System.out.println("No Of Steps : "+emergencyStairCase2.noOfSteps);
		System.out.println("Step Width : "+emergencyStairCase2.stepWidth);
		System.out.println("has Carpet : "+emergencyStairCase2.hasCarpet);
		
		System.out.println();
		
		EmergencyStairCase emergencyStairCase3=new EmergencyStairCase(4.0);
		System.out.println("No Of Steps : "+emergencyStairCase3.noOfSteps);
		System.out.println("Step Width : "+emergencyStairCase3.stepWidth);
		System.out.println("has Carpet : "+emergencyStairCase3.hasCarpet);
	}
}