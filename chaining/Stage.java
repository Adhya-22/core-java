class Stage
{
	double height;
	double width;
	boolean hasVIPSection;
	
	Stage(double height,double width,boolean hasVIPSection)
	{
		System.out.println("double,double,boolean constructor in Stage");
		this.height=height;
		this.width=width;
		this.hasVIPSection=hasVIPSection;
	}
}