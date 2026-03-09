class PaneerRunner
{
	public static void main(String[] args)
	{
		Dish dish=new Dish("Lababdar");
		PaneerShape shape=PaneerShape.CUBE;
		Paneer paneer=new Paneer(200,dish,shape);
		paneer.printInfo();
		
		Dish dish2=new Dish("Tikka masala");
		PaneerShape shape2=PaneerShape.SLAB;
		Paneer paneer2=new Paneer(400,dish2,shape2);
		paneer2.printInfo();
		
		Dish dish3=new Dish("Tikka");
		PaneerShape shape3=PaneerShape.DICED;
		Paneer paneer3=new Paneer(500,dish3,shape3);
		paneer3.printInfo();
		
		Dish dish4=new Dish("Butter paneer");
		PaneerShape shape4=PaneerShape.TRIANGLES;
		Paneer paneer4=new Paneer(100,dish4,shape4);
		paneer4.printInfo();
	}
}