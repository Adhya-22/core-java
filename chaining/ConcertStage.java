class ConcertStage extends Stage
{
	ConcertStage()
	{
		super(30,40,true);
		System.out.println("No-arg contructor in ConcertStage");
	}
	
	ConcertStage(double height,double width,boolean hasVIPSection)
	{
		super(height,width,hasVIPSection);
		System.out.println("double,double,boolean constructor in ConcertStage");
	}
	
	ConcertStage(boolean hasVIPSection)
	{
		super(50,120,hasVIPSection);
		System.out.println("boolean constructor in ConcertStage");
	}
}