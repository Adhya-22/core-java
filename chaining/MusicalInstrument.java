class MusicalInstrument
{
	String type;
	double price;
	boolean soundQuality;
	
	MusicalInstrument(String type,double price,boolean soundQuality)
	{
		System.out.println("String,double,boolean constructor of MusicalInstrument");
		this.type=type;
		this.price=price;
		this.soundQuality=soundQuality;
	}
}