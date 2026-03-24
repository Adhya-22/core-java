class Tollgate
{
	String location;
	String vehicleType;    
    double tollAmount;
	int vehiclesPassed;
	boolean isOpen;
	boolean fastTag;
	
	Tollgate(String location,String vehicleType,double tollAmount,int vehiclesPassed,boolean isOpen,boolean fastTag)
	{
		this.location=location;
		this.vehicleType=vehicleType;
		this.tollAmount=tollAmount;
		this.vehiclesPassed=vehiclesPassed;
		this.isOpen=isOpen;
		this.fastTag=fastTag;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Tollgate...");
		System.out.println("location : "+this.location);
		System.out.println("vehicleType : "+this.vehicleType);
		System.out.println("tollAmount : "+this.tollAmount);
		System.out.println("vehiclesPassed : "+this.vehiclesPassed);
		System.out.println("isOpen : "+this.isOpen);
		System.out.println("fastTag : "+this.fastTag);
	}
}