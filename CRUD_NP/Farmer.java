class Farmer
{
	int numberOfWorkers;
	String cropType;            
    double landArea;
	double yeild;
	boolean hasTractor;
    boolean hasIrrigationSystem;
	
	Farmer(int numberOfWorkers,String cropType,double landArea,double yeild,boolean hasTractor,boolean hasIrrigationSystem)
	{
		this.numberOfWorkers=numberOfWorkers;
		this.cropType=cropType;
		this.landArea=landArea;
		this.yeild=yeild;
		this.hasTractor=hasTractor;
		this.hasIrrigationSystem=hasIrrigationSystem;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Farmer...");
		System.out.println("numberOfWorkers : "+this.numberOfWorkers);
		System.out.println("cropType : "+this.cropType);
		System.out.println("landArea : "+this.landArea);
		System.out.println("yeild : "+this.yeild);
		System.out.println("hasTractor : "+this.hasTractor);
		System.out.println("hasIrrigationSystem : "+this.hasIrrigationSystem);
	}
}