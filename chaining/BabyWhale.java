class BabyWhale extends BlueWhale
{
	BabyWhale()
	{
		super(180.5,25,true);
		System.out.println("No-arg contructor in BabyWhale");
	}
	
	BabyWhale(double heartSize,int swimSpeed,boolean isEndangered)
	{
		super(heartSize,swimSpeed,isEndangered);
		System.out.println("double,int,boolean constructor in BabyWhale");
	}
	
	BabyWhale(boolean isEndangered)
	{
		super(150.0,20,false);
		System.out.println("boolean constructor in BabyWhale");
	}
}