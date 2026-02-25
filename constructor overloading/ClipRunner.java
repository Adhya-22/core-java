class ClipRunner
{
	public static void main(String[] args)
	{
		Clip clip1=new Clip();
		
		Clip clip2=new Clip("Plastic");
		System.out.println("Clip 2 info...");
		System.out.println("material : "+clip2.material);
		
		Clip clip3=new Clip("Metal","Gold");
		System.out.println("Clip 3 info...");
		System.out.println("material : "+clip3.material);
		System.out.println("color : "+clip3.color);
		
		Clip clip4=new Clip("Wood","Brown",6);
		System.out.println("Clip 4 info...");
		System.out.println("material : "+clip4.material);
		System.out.println("color : "+clip4.color);
		System.out.println("size : "+clip4.size);
		
		Clip clip5=new Clip("Steel","Silver",5,25);
		System.out.println("Clip 5 info...");
		System.out.println("material : "+clip5.material);
		System.out.println("color : "+clip5.color);
		System.out.println("size : "+clip5.size);
		System.out.println("price : "+clip5.price);
		
		Clip clip6=new Clip("Rubber","Blue",3,5,false);
		System.out.println("Clip 6 info...");
		System.out.println("material : "+clip6.material);
		System.out.println("color : "+clip6.color);
		System.out.println("size : "+clip6.size);
		System.out.println("price : "+clip6.price);
		System.out.println("isDecorative : "+clip6.isDecorative);

	}
}