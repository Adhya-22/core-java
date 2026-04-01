class ChickenRunner
{
	public static void main(String... args)
	{
		FarmChicken farmChicken1=new FarmChicken();
		System.out.println("Quantity : "+farmChicken1.quantity);
		System.out.println("price : "+farmChicken1.price);
		System.out.println("Marinated : "+farmChicken1.marinated);
		
		System.out.println();
		
		FarmChicken farmChicken2=new FarmChicken(3.5,580,false);
		System.out.println("Quantity : "+farmChicken2.quantity);
		System.out.println("price : "+farmChicken2.price);
		System.out.println("Marinated : "+farmChicken2.marinated);
		
		System.out.println();
		
		FarmChicken farmChicken3=new FarmChicken(true);
		System.out.println("Quantity : "+farmChicken3.quantity);
		System.out.println("price : "+farmChicken3.price);
		System.out.println("Marinated : "+farmChicken3.marinated);
	}
}