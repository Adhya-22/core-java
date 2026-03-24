class AcidStoreRunner
{
	public static void main(String[] args)
	{
		Acid[] acids=new Acid[10];
		
		AcidStore acidStore=new AcidStore(acids);
		
		Acid acid1=new Acid("Hydrochloric Acid","HCl",110,-27.0,true,false);
		acidStore.save(acid1);
		
		Acid acid2=new Acid("Sulfuric Acid","H2SO4",337,10,true,false);
		acidStore.save(acid2);
		
		Acid acid3=new Acid("Nitric Acid","HNO3",83,-42,true,false);
		acidStore.save(acid3);
		
		Acid acid4=new Acid("Acetic Acid","CH3COOH",118,16,false,true);
		acidStore.save(acid4);
		
		Acid acid5=new Acid("Phosphoric Acid","H3PO4",158,42,false,false);
		acidStore.save(acid5);
		
		Acid acid6=new Acid("Citric Acid","C6H8O7",310,153,false,false);
		acidStore.save(acid6);
		
		Acid acid7=new Acid("Carbonic Acid","H2CO3",333,-56,false,false);
		acidStore.save(acid7);
		
		Acid acid8=new Acid("Formic Acid","HCOOH",101,8,false,true);
		acidStore.save(acid8);
		
		Acid acid9=new Acid("Oxalic Acid","C2H2O4",157,189,false,false);
		acidStore.save(acid9);
		
		Acid acid10=new Acid("Lactic Acid","C3H6O3",122,53,false,false);
		acidStore.save(acid10);
	}
}