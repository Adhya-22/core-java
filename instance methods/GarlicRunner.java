class GarlicRunner
{
	public static void main(String[] args)
	{
		Garlic garlic1 = new Garlic("Ooty Garlic","Tamil Nadu",1.0,180.0,"White",true,"Winter",30,"Local Farmer",
		"Medium","Strong","Net Bag",true,"Premium","Cool Storage","UAE","A",5.2,"Retail",false);
		garlic1.getInfo();

		Garlic garlic2 = new Garlic("Chinese Garlic","China",2.0,250.0,"White",false,"Spring",40,"Importer",
		"Large","Mild","Bag",true,"Standard","Dry Place","India","B",4.8,"Wholesale",true);
		garlic2.getInfo();
		
		Garlic garlic3 = new Garlic("Kashmir Garlic","Kashmir",0.8,220.0,"Off White",true,"Autumn",25,
		"Supplier A","Small","Strong","Packet",true,"High","Refrigerated","USA","A+",5.5,"Retail",false);
		garlic3.getInfo();
		
		Garlic garlic4 = new Garlic("Desi Garlic","Karnataka",1.5,200.0,"White",true,"Winter",35,"Farmer Market",
		"Medium","Spicy","Net Bag",true,"Premium","Cool Storage","Dubai","A",5.0,"Retail",false);
		garlic4.getInfo();
		
		Garlic garlic5 = new Garlic("Organic Garlic","Kerala",1.2,300.0,"Cream",true,"Monsoon",28,
		"Organic Farm","Medium","Strong","Box",true,"Premium","Cold Storage","Germany","A+",5.7,"Export",false);
		garlic5.getInfo();
		
		Garlic garlic6 = new Garlic("Hybrid Garlic","Punjab",2.5,260.0,"White",false,"Spring",45,"Supplier B",
		"Large","Medium","Bag",true,"Standard","Warehouse","UK","B+",4.5,"Wholesale",true);
		garlic6.getInfo();
		
		Garlic garlic7 = new Garlic("Red Garlic","Rajasthan",1.8,240.0,"Light Red",false,"Summer",30,
		"Trader","Large","Spicy","Net Bag",true,"Good","Dry Place","USA","B",4.9,"Retail",false);
		garlic7.getInfo();
		
		Garlic garlic8 = new Garlic("Mountain Garlic","Himachal",0.9,210.0,"White",true,"Winter",20,
		"Farmer","Small","Strong","Packet",true,"Premium","Refrigerated","France","A",5.6,"Retail",false);
		garlic8.getInfo();
		
		Garlic garlic9 = new Garlic("Bulk Garlic","Gujarat",5.0,800.0,"White",false,"Autumn",60,"Wholesale Dealer",
		"Extra Large","Medium","Sack",true,"Standard","Warehouse","Saudi","C",4.2,"Wholesale",true);
		garlic9.getInfo();
		
		Garlic garlic10 = new Garlic("Premium Garlic","Andhra",1.3,280.0,"Cream",true,"Winter",32,"Supplier C",
		"Medium","Strong","Box",true,"High","Cold Storage","Japan","A+",5.8,"Export",false);
		garlic10.getInfo();
	}
}