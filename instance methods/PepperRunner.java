class PepperRunner
{
	public static void main(String[] args)
	{
		Pepper pepper1 = new Pepper("Black Pepper","Black","Kerala",0.5,450.0,"Strong",true,"Packet",
		"Everest","Powder","Winter",12,"A","Local Farmer","Cooking",true,"Premium","Dry Place",5.5,"USA");
		pepper1.getInfo();

		Pepper pepper2 = new Pepper("White Pepper","White","Tamil Nadu",0.4,400.0,"Mild",false,"Packet",
		"MDH","Whole","Summer",10,"B","Supplier A","Cooking",false,"Standard","Cool Place",4.2,"UK");
		pepper2.getInfo();
		
		Pepper pepper3 = new Pepper("Green Pepper","Green","Karnataka",0.6,500.0,"Fresh",true,"Box",
		"Catch","Fresh","Monsoon",8,"A","Supplier B","Salads",false,"Premium","Refrigerated",6.0,"Canada");
		pepper3.getInfo();
		
		Pepper pepper4 = new Pepper("Red Pepper","Red","Andhra",0.7,550.0,"Spicy",true,"Packet","Everest",
		"Powder","Summer",14,"A+","Local Market","Cooking",true,"High","Dry Place",5.0,"Australia");
		pepper4.getInfo();
		
		Pepper pepper5 = new Pepper("Black Pepper","Black","Vietnam",1.0,800.0,"Strong",false,"Bag",
		"Global Spice","Whole","Winter",18,"Export","Exporter","Industry",true,"Export Quality","Warehouse",4.8,"Germany");
		pepper5.getInfo();
		
		Pepper pepper6 = new Pepper("White Pepper","White","Indonesia",0.8,750.0,"Mild",true,"Box",
		"SpicePro","Powder","Spring",15,"Premium","Importer","Cooking",false,"Premium","Cool Storage",4.5,"France");
		pepper6.getInfo();
		
		Pepper pepper7 = new Pepper("Green Pepper","Green","Brazil",0.9,720.0,"Fresh",false,"Bag",
		"NatureSpice","Whole","Autumn",11,"Standard","Farmer","Salads",false,"Good","Dry Storage",5.2,"USA");
		pepper7.getInfo();
		
		Pepper pepper8 = new Pepper("Black Pepper","Black","Sri Lanka",0.6,600.0,"Strong",true,"Packet",
		"SpiceKing","Powder","Winter",12,"A","Supplier C","Cooking",true,"Premium","Dry Place",5.3,"Dubai");
		pepper8.getInfo();
		
		Pepper pepper9 = new Pepper("Red Pepper","Red","Mexico",0.7,580.0,"Hot",false,"Box","HotSpice",
		"Flakes","Summer",9,"B+","Trader","Fast Food",true,"Standard","Cool Place",6.1,"USA");
		pepper9.getInfo();
		
		Pepper pepper10 = new Pepper("White Pepper","White","Malaysia",0.5,650.0,"Mild",true,"Packet",
		"SpiceWorld","Powder","Spring",13,"A","Supplier D","Cooking",false,"Premium","Dry Storage",4.9,"Japan");
		pepper10.getInfo();
	}
}