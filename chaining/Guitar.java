class Guitar extends MusicalInstrument
{
	
	Guitar()
	{
		super("String",25000,true);
		System.out.println("No-arg contructor in Guitar");
	}
	
	Guitar(String type,double price,boolean soundQuality)
	{
		super(type,price,soundQuality);
		System.out.println("String,double,boolean constructor of Guitar");
	}
	
	Guitar(boolean soundQuality)
	{
		super("wind",2000,soundQuality);
		System.out.println("boolean constructor in Guitar");
	}
}