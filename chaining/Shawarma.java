class Shawarma
{
	String meatType;
	int spiceLevel;
	boolean isGrilled;
	
	Shawarma(String meatType,int spiceLevel,boolean isGrilled)
	{
		System.out.println("String,int,boolean constructor in Shawarma");
		this.meatType=meatType;
		this.spiceLevel=spiceLevel;
		this.isGrilled=isGrilled;
	}
}