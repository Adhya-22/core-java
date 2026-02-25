class UmbrellaRunner
{
	public static void main(String[] args)
	{
		Umbrella umbrella1=new Umbrella();
		
		Umbrella umbrella2=new Umbrella("Puma");
		System.out.println("Umbrella 2 info...");
		System.out.println("Brand : "+umbrella2.brand);
		
		Umbrella umbrella3=new Umbrella("Skybags","Pink");
		System.out.println("Umbrella 3 info...");
		System.out.println("Brand : "+umbrella3.brand);
		System.out.println("color : "+umbrella3.color);
		
		Umbrella umbrella4=new Umbrella("Adidas","Blue",500);
		System.out.println("Umbrella 4 info...");
		System.out.println("Brand : "+umbrella4.brand);
		System.out.println("color : "+umbrella4.color);
		System.out.println("Price : "+umbrella4.price);
		
		Umbrella umbrella5=new Umbrella("Wildcraft","Grey",300,42);
		System.out.println("Umbrella 5 info...");
		System.out.println("Brand : "+umbrella5.brand);
		System.out.println("color : "+umbrella5.color);
		System.out.println("Price : "+umbrella5.price);
		System.out.println("Size : "+umbrella5.size);
		
		Umbrella umbrella6=new Umbrella("Nike","Black",480,40,true);
		System.out.println("Umbrella 6 info...");
		System.out.println("Brand : "+umbrella6.brand);
		System.out.println("color : "+umbrella6.color);
		System.out.println("Price : "+umbrella6.price);
		System.out.println("Size : "+umbrella6.size);
		System.out.println("is Foldable : "+umbrella6.isFoldable);

	}
}