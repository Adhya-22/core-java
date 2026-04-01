class JumboShawarma extends Shawarma
{
	
	JumboShawarma()
	{
		super("Chicken",3,true);
		System.out.println("No-arg contructor in JumboShawarma");
	}
	
	JumboShawarma(String meatType,int spiceLevel,boolean isGrilled)
	{
		super(meatType,spiceLevel,isGrilled);
		System.out.println("String,int,boolean constructor in JumboShawarma");
	}
	
	JumboShawarma(boolean isGrilled)
	{
		super("Chicken",4,isGrilled);
		System.out.println("boolean constructor in JumboShawarma");
	}
}