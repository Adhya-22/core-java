class StrawberryRunner
{
	public static void main(String[] args)
	{
		Strawberry strawberry1=new Strawberry();
		
		Strawberry strawberry2=new Strawberry("Albion");
		System.out.println("Strawberry 2 info...");
		System.out.println("variety : "+strawberry2.variety);
		
		Strawberry strawberry3=new Strawberry("Chandler",0.30);
		System.out.println("Strawberry 3 info...");
		System.out.println("variety : "+strawberry3.variety);
		System.out.println("weight : "+strawberry3.weight);
		
		Strawberry strawberry4=new Strawberry("Camarosa",0.25,"DarkRed");
		System.out.println("Strawberry 4 info...");
		System.out.println("variety : "+strawberry4.variety);
		System.out.println("weight : "+strawberry4.weight);
		System.out.println("color : "+strawberry4.color);
		
		Strawberry strawberry5=new Strawberry("Festival",0.22,"Red",290);
		System.out.println("Strawberry 5 info...");
		System.out.println("variety : "+strawberry5.variety);
		System.out.println("weight : "+strawberry5.weight);
		System.out.println("color : "+strawberry5.color);
		System.out.println("pricePerKg : "+strawberry5.pricePerKg);
		
		Strawberry strawberry6=new Strawberry("SweetCharlie",0.27,"PinkRed",310,true);
		System.out.println("Strawberry 6 info...");
		System.out.println("variety : "+strawberry6.variety);
		System.out.println("weight : "+strawberry6.weight);
		System.out.println("color : "+strawberry6.color);
		System.out.println("pricePerKg : "+strawberry6.pricePerKg);
		System.out.println("is Organic : "+strawberry6.isOrganic);

	}
}