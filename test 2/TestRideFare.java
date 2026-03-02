class TestRideFare
{
	public static void main(String[] args)
	{
		RideFareCalculator rideFareCalculator1=new RideFareCalculator(5,12,true,2);
		System.out.println("Base Fare : "+rideFareCalculator1.calculateBaseFare(5));
		System.out.println("Time Surge Price : "+rideFareCalculator1.applyTimeSurge(12));
		System.out.println("waiting Charges : "+rideFareCalculator1.applyWaitingCharges());
		System.out.println("Final fare : "+rideFareCalculator1.calculateFinalFare());
		
		RideFareCalculator rideFareCalculator2=new RideFareCalculator(15,4,true,20);
		System.out.println("Base Fare : "+rideFareCalculator2.calculateBaseFare(15));
		System.out.println("Time Surge Price : "+rideFareCalculator2.applyTimeSurge(4));
		System.out.println("waiting Charges : "+rideFareCalculator2.applyWaitingCharges());
		System.out.println("Final fare : "+rideFareCalculator2.calculateFinalFare());
		
		RideFareCalculator rideFareCalculator3=new RideFareCalculator(30,20,true,13);
		System.out.println("Base Fare : "+rideFareCalculator3.calculateBaseFare(30));
		System.out.println("Time Surge Price : "+rideFareCalculator3.applyTimeSurge(20));
		System.out.println("waiting Charges : "+rideFareCalculator3.applyWaitingCharges());
		System.out.println("Final fare : "+rideFareCalculator3.calculateFinalFare());
	}
}