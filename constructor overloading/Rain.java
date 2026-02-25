class Rain 
{
    double intensity;
    String season;
    String type;
    double duration;
    boolean accompaniedByThunder;
	
	Rain()
	{
		System.out.println("No parameter constructor...");
	}
	
	Rain(double intensity)
	{
		this.intensity=intensity;
	}
	
	Rain(double intensity,String season)
	{
		this.intensity=intensity;
		this.season=season;
	}
	
	Rain(double intensity,String season,String type)
	{
		this.intensity=intensity;
		this.season=season;
		this.type=type;
	}
	
	Rain(double intensity,String season,String type,double duration)
	{
		this.intensity=intensity;
		this.season=season;
		this.type=type;
		this.duration=duration;
	}
	
	Rain(double intensity,String season,String type,double duration,boolean accompaniedByThunder)
	{
		this.intensity=intensity;
		this.season=season;
		this.type=type;
		this.duration=duration;
		this.accompaniedByThunder=accompaniedByThunder;
	}
}