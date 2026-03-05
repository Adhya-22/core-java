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
}

