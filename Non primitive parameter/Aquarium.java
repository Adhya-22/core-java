class Aquarium
{
	int fishCount;
	String shape;
	double waterCapacity;
	boolean filtered;
	boolean decorated;

	Fish fish;
	Water water;
	Plant plant;
	Light light;
	Filter filter;
	
	Aquarium(int fishCount,String shape,double waterCapacity,boolean filtered,boolean decorated,Fish fish,
	Water water,Plant plant,Light light,Filter filter)
	{
		this.fishCount=fishCount;
		this.shape=shape;
		this.waterCapacity=waterCapacity;
		this.filtered=filtered;
		this.decorated=decorated;
		this.fish=fish;
		this.water=water;
		this.plant=plant;
		this.light=light;
		this.filter=filter;
	}
	
	void getInfo()
	{
		System.out.println("fishCount : "+this.fishCount);
		System.out.println("shape : "+this.shape);
		System.out.println("waterCapacity : "+this.waterCapacity);
		System.out.println("filtered : "+this.filtered);
		System.out.println("decorated : "+this.decorated);
	}
}