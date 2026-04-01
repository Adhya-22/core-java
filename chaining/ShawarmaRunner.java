class ShawarmaRunner
{
	public static void main(String... args)
	{
		JumboShawarma jumboShawarma1=new JumboShawarma();
		System.out.println("meatType : "+jumboShawarma1.meatType);
		System.out.println("spiceLevel : "+jumboShawarma1.spiceLevel);
		System.out.println("isGrilled : "+jumboShawarma1.isGrilled);
		
		System.out.println();
		
		JumboShawarma jumboShawarma2=new JumboShawarma("Lamb",5,false);
		System.out.println("meatType : "+jumboShawarma2.meatType);
		System.out.println("spiceLevel : "+jumboShawarma2.spiceLevel);
		System.out.println("isGrilled : "+jumboShawarma2.isGrilled);
		
		System.out.println();
		
		JumboShawarma jumboShawarma3=new JumboShawarma(true);
		System.out.println("meatType : "+jumboShawarma3.meatType);
		System.out.println("spiceLevel : "+jumboShawarma3.spiceLevel);
		System.out.println("isGrilled : "+jumboShawarma3.isGrilled);
	}
}