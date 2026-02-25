class Snow 
{
    double temperature;
    String type;
    double thickness;
    String location;
    boolean isMelting;
	
	Snow()
	{
		System.out.println("No parameter constructor...");
	}
	
	Snow(double temperature)
	{
		this.temperature=temperature;
	}
	
	Snow(double temperature,String type)
	{
		this.temperature=temperature;
		this.type=type;
	}
	
	Snow(double temperature,String type,double thickness)
	{
		this.temperature=temperature;
		this.type=type;
		this.thickness=thickness;
	}
	
	Snow(double temperature,String type,double thickness,String location)
	{
		this.temperature=temperature;
		this.type=type;
		this.thickness=thickness;
		this.location=location;
	}
	
	Snow(double temperature,String type,double thickness,String location,boolean isMelting)
	{
		this.temperature=temperature;
		this.type=type;
		this.thickness=thickness;
		this.location=location;
		this.isMelting=isMelting;
	}
}