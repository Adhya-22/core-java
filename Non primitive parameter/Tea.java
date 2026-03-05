class Tea
{
	int cupCount;
	double temperature;
	String origin;
	boolean sweet;
	String flavor;
	
	TeaGrain teaGrain;
	Cup cup;
	Milk milk;
	Sugar sugar;
	Kettle kettle;

	Tea(int cupCount,double temperature,String origin,boolean sweet,String flavor,TeaGrain teaGrain,
	Cup cup,Milk milk,Sugar sugar,Kettle kettle)
	{
		this.cupCount=cupCount;
		this.temperature=temperature;
		this.origin=origin;
		this.sweet=sweet;
		this.flavor=flavor;
		this.teaGrain=teaGrain;
		this.cup=cup;
		this.milk=milk;
		this.sugar=sugar;
		this.kettle=kettle;
	}
}