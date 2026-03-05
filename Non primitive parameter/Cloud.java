class Cloud
{
	int coveragePercentage;
	double altitude;
	boolean producingRain;
	char densityLevel;
	String thickness;

	WaterDroplet waterDroplet;
	Moisture moisture;
	Wind wind;
	Temperature temperature;
	Rain rain;
	
	Cloud(int coveragePercentage,double altitude,boolean producingRain,char densityLevel,String thickness,
	WaterDroplet waterDroplet,Moisture moisture,Wind wind,Temperature temperature,Rain rain)
	{
		this.coveragePercentage=coveragePercentage;
		this.altitude=altitude;
		this.producingRain=producingRain;
		this.densityLevel=densityLevel;
		this.thickness=thickness;
		this.waterDroplet=waterDroplet;
		this.moisture=moisture;
		this.wind=wind;
		this.temperature=temperature;
		this.rain=rain;
	}
	
	void getInfo()
	{
		System.out.println("coveragePercentage : "+this.coveragePercentage);
		System.out.println("altitude : "+this.altitude);
		System.out.println("producingRain : "+this.producingRain);
		System.out.println("densityLevel : "+this.densityLevel);
		System.out.println("thickness : "+this.thickness);
	}
}

