class CarromRunner
{
	public static void main(String[] args)
	{
		Carrom carrom1=new Carrom();
		
		Carrom carrom2=new Carrom("Wood");
		System.out.println("Carrom 2 info...");
		System.out.println("boardMaterial : "+carrom2.boardMaterial);
		
		Carrom carrom3=new Carrom("Plywood",28);
		System.out.println("Carrom 3 info...");
		System.out.println("boardMaterial : "+carrom3.boardMaterial);
		System.out.println("size : "+carrom3.size);
		
		Carrom carrom4=new Carrom("Hardwood",30,"Wood");
		System.out.println("Carrom 4 info...");
		System.out.println("boardMaterial : "+carrom4.boardMaterial);
		System.out.println("size : "+carrom4.size);
		System.out.println("strikerType : "+carrom4.strikerType);
		
		Carrom carrom5=new Carrom("MDF",27,"Metal",19);
		System.out.println("Carrom 5 info...");
		System.out.println("boardMaterial : "+carrom5.boardMaterial);
		System.out.println("size : "+carrom5.size);
		System.out.println("strikerType : "+carrom5.strikerType);
		System.out.println("numberOfCoins : "+carrom5.numberOfCoins);
		
		Carrom carrom6=new Carrom("Teak",31,"Plastic",19,true);
		System.out.println("Carrom 6 info...");
		System.out.println("boardMaterial : "+carrom6.boardMaterial);
		System.out.println("size : "+carrom6.size);
		System.out.println("strikerType : "+carrom6.strikerType);
		System.out.println("numberOfCoins : "+carrom6.numberOfCoins);
		System.out.println("hasStand : "+carrom6.hasStand);

	}
}