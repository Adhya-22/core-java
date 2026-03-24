class Acid 
{
    String name;
    String formula; 
	double boilingPoint;
    double meltingPoint;
	boolean isStrong;
	boolean flammable;
	
	Acid(String name,String formula,double boilingPoint,double meltingPoint,boolean isStrong,boolean flammable)
	{
		this.name=name;
		this.formula=formula;
		this.boilingPoint=boilingPoint;
		this.meltingPoint=meltingPoint;
		this.isStrong=isStrong;
		this.flammable=flammable;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Acid..");
		System.out.println("name : "+this.name);
		System.out.println("formula : "+this.formula);
		System.out.println("boilingPoint : "+this.boilingPoint);
		System.out.println("meltingPoint : "+this.meltingPoint);
		System.out.println("isStrong : "+this.isStrong);
		System.out.println("flammable : "+this.flammable);
	}
}