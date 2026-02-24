class LaptopRunner
{
	public static void main(String[] args)
	{
		Laptop laptop1=new Laptop();
		System.out.println("Laptop 1 ramGB : "+laptop1.ramGB);
		System.out.println("Laptop 1 processor : "+laptop1.processor);
		System.out.println("Laptop 1 brand : "+laptop1.brand);
		System.out.println("Laptop 1 price : "+laptop1.price);
		laptop1.price=52000;
		laptop1.brand="Acer";
		laptop1.ramGB=6;
		laptop1.processor="Ryzen";
		System.out.println("After Update :");
		System.out.println("Laptop 1 ramGB : "+laptop1.ramGB);
		System.out.println("Laptop 1 processor : "+laptop1.processor);
		System.out.println("Laptop 1 brand : "+laptop1.brand);
		System.out.println("Laptop 1 price : "+laptop1.price);
		
		Laptop laptop2=new Laptop();
		System.out.println("Laptop 2 ramGB : "+laptop2.ramGB);
		System.out.println("Laptop 2 processor : "+laptop2.processor);
		System.out.println("Laptop 2 brand : "+laptop2.brand);
		System.out.println("Laptop 2 price : "+laptop2.price);
		laptop2.price=45000;
		laptop2.brand="Dell";
		laptop2.ramGB=8;
		laptop2.processor="intel";
		System.out.println("After Update :");
		System.out.println("Laptop 2 ramGB : "+laptop2.ramGB);
		System.out.println("Laptop 2 processor : "+laptop2.processor);
		System.out.println("Laptop 2 brand : "+laptop2.brand);
		System.out.println("Laptop 2 price : "+laptop2.price);
		
		Laptop laptop3=new Laptop();
		System.out.println("Laptop 3 ramGB : "+laptop3.ramGB);
		System.out.println("Laptop 3 processor : "+laptop3.processor);
		System.out.println("Laptop 3 brand : "+laptop3.brand);
		System.out.println("Laptop 3 price : "+laptop3.price);
		laptop3.price=130000;
		laptop3.brand="Asus";
		laptop3.ramGB=6;
		laptop3.processor="Snapdragon";
		System.out.println("After Update :");
		System.out.println("Laptop 3 ramGB : "+laptop3.ramGB);
		System.out.println("Laptop 3 processor : "+laptop3.processor);
		System.out.println("Laptop 3 brand : "+laptop3.brand);
		System.out.println("Laptop 3 price : "+laptop3.price);
		
		Laptop laptop4=new Laptop();
		System.out.println("Laptop 4 ramGB : "+laptop4.ramGB);
		System.out.println("Laptop 4 processor : "+laptop4.processor);
		System.out.println("Laptop 4 brand : "+laptop4.brand);
		System.out.println("Laptop 4 price : "+laptop4.price);
		laptop4.price=56000;
		laptop4.brand="Lenova";
		laptop4.ramGB=8;
		laptop4.processor="intel";
		System.out.println("After Update :");
		System.out.println("Laptop 4 ramGB : "+laptop4.ramGB);
		System.out.println("Laptop 4 processor : "+laptop4.processor);
		System.out.println("Laptop 4 brand : "+laptop4.brand);
		System.out.println("Laptop 4 price : "+laptop4.price);
		
		Laptop laptop5=new Laptop();
		System.out.println("Laptop 5 ramGB : "+laptop5.ramGB);
		System.out.println("Laptop 5 processor : "+laptop5.processor);
		System.out.println("Laptop 5 brand : "+laptop5.brand);
		System.out.println("Laptop 5 price : "+laptop5.price);
		laptop5.price=180000;
		laptop5.brand="Apple";
		laptop5.ramGB=16;
		laptop5.processor="MacProcessor";
		System.out.println("After Update :");
		System.out.println("Laptop 5 ramGB : "+laptop5.ramGB);
		System.out.println("Laptop 5 processor : "+laptop5.processor);
		System.out.println("Laptop 5 brand : "+laptop5.brand);
		System.out.println("Laptop 5 price : "+laptop5.price);
		
	}
}