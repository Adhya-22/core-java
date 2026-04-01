class StairCase
{
	int noOfSteps;
	double stepWidth;
	boolean hasCarpet;
	
	StairCase(int noOfSteps,double stepWidth,boolean hasCarpet)
	{
		System.out.println("int,double,boolean constructor in StairCase");
		this.noOfSteps=noOfSteps;
		this.stepWidth=stepWidth;
		this.hasCarpet=hasCarpet;
	}
}