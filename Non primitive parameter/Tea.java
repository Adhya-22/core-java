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
	
	void getInfo()
	{
		System.out.println("cupCount : "+this.cupCount);
		System.out.println("temperature : "+this.temperature);
		System.out.println("origin : "+this.origin);
		System.out.println("sweet : "+this.sweet);
		System.out.println("flavor : "+this.flavor);
		if(this.teaGrain!=null)
		{
			this.teaGrain.getInfo();
		}
		if(this.cup!=null)
		{
			this.cup.getInfo();
		}
		if(this.milk!=null)
		{
			this.milk.getInfo();
		}
		if(this.sugar!=null)
		{
			this.sugar.getInfo();
		}
		if(this.kettle!=null)
		{
			this.kettle.getInfo();
		}
	}
}