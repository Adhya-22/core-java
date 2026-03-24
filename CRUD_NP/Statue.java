class Statue
{
	String name;
	double height;
    String represention;
    int yearBuiltIn;
	String location;
	String country;
	
	Statue(String name,double height,String represention,int yearBuiltIn,String location,String country)
	{
		this.name=name;
		this.height=height;
		this.represention=represention;
		this.yearBuiltIn=yearBuiltIn;
		this.location=location;
		this.country=country;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Statue...");
		System.out.println("Name : "+this.name);
		System.out.println("Height : "+this.height);
		System.out.println("represention : "+this.represention);
		System.out.println("yearBuiltIn : "+this.yearBuiltIn);
		System.out.println("location : "+this.location);
		System.out.println("country : "+this.country);
	}
}