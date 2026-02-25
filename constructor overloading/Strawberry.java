class Strawberry 
{
    String variety;
	double weight;
    String color;
    double pricePerKg;
    boolean isOrganic;
	
	Strawberry()
	{
		System.out.println("No parameter constuctor...");
	}
	
	Strawberry(String variety)
	{
		this.variety=variety;
	}
	
	Strawberry(String variety,double weight)
	{
		this.variety=variety;
		this.weight=weight;
	}
	
	Strawberry(String variety,double weight,String color)
	{
		this.variety=variety;
		this.weight=weight;
		this.color=color;
	}
	
	Strawberry(String variety,double weight,String color,double pricePerKg)
	{
		this.variety=variety;
		this.weight=weight;
		this.color=color;
		this.pricePerKg=pricePerKg;
	}
	
	Strawberry(String variety,double weight,String color,double pricePerKg,boolean isOrganic)
	{
		this.variety=variety;
		this.weight=weight;
		this.color=color;
		this.pricePerKg=pricePerKg;
		this.isOrganic=isOrganic;
	}
}