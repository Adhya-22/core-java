class Track 
{
    String name;
    double length;
    String surfaceType;
    String location;
    int numberOfLanes;
	
	Track()
	{
		System.out.println("No parameter constructor...");
	}
	
	Track(String name)
	{
		this.name=name;
	}
	
	Track(String name,double length)
	{
		this.name=name;
		this.length=length;
	}
	
	Track(String name,double length,String surfaceType)
	{
		this.name=name;
		this.length=length;
		this.surfaceType=surfaceType;
	}
	
	Track(String name,double length,String surfaceType,String location)
	{
		this.name=name;
		this.length=length;
		this.surfaceType=surfaceType;
		this.location=location;
	}
	
	Track(String name,double length,String surfaceType,String location,int numberOfLanes)
	{
		this.name=name;
		this.length=length;
		this.surfaceType=surfaceType;
		this.location=location;
		this.numberOfLanes=numberOfLanes;
	}
}
