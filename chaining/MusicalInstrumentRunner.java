class MusicalInstrumentRunner
{
	public static void main(String... args)
	{
		Guitar guitar1=new Guitar();
		System.out.println("Type : "+guitar1.type);
		System.out.println("Price : "+guitar1.price);
		System.out.println("Sound Quality : "+guitar1.soundQuality);
		
		System.out.println();
		
		Guitar guitar2=new Guitar("Percussion",7000,true);
		System.out.println("Type : "+guitar2.type);
		System.out.println("Price : "+guitar2.price);
		System.out.println("Sound Quality : "+guitar2.soundQuality);
		
		System.out.println();
		
		Guitar guitar3=new Guitar(false);
		System.out.println("Type : "+guitar3.type);
		System.out.println("Price : "+guitar3.price);
		System.out.println("Sound Quality : "+guitar3.soundQuality);
	}
}