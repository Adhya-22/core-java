class ShampooRunner
{
	public static void main(String[] args)
	{
		Shampoo shampoo1 = new Shampoo("Dove","Anti-Dandruff","Mild",650.0,450.0,"Dry",true,true,
        "White","Bottle","Unilever","India",24,"Keratin","Hair Wash","Flip Cap","Large","Premium",
		"Creamy","2 Years");
		shampoo1.getInfo();

		Shampoo shampoo2 = new Shampoo("Head & Shoulders","Anti-Dandruff","Fresh",400.0,300.0,
		"Oily",false,false,"White","Bottle","P&G","USA",24,"Zinc","Daily Use","Pump","Medium",
		"Standard","Thick","2 Years");
		shampoo2.getInfo();

		Shampoo shampoo3 = new Shampoo("Pantene","Smooth","Floral",500.0,350.0,"Dry",true,false,
        "White","Bottle","P&G","India",24,"Pro-V","Hair Wash","Flip Cap","Medium","Premium",
		"Creamy","2 Years");
		shampoo3.getInfo();

		Shampoo shampoo4 = new Shampoo("Clinic Plus","Strong","Mild",700.0,280.0,"Normal",false,false,
        "White","Bottle","HUL","India",18,"Milk Protein","Daily","Flip Cap","Large","Standard",
		"Liquid","1.5 Years");
		shampoo4.getInfo();

		Shampoo shampoo5 = new Shampoo("Tresemme","Keratin","Strong",580.0,600.0,"Damaged",true,true,
        "Black","Bottle","Unilever","USA",30,"Keratin","Salon Use","Pump","Large","Premium",
		"Thick","2.5 Years");
		shampoo5.getInfo();

		Shampoo shampoo6 = new Shampoo("L'Oreal","Repair","Fresh",450.0,550.0,"Dry",true,true,
        "White","Bottle","L'Oreal","France",24,"Argan Oil","Hair Wash","Flip Cap","Medium",
		"Premium","Creamy","2 Years");
		shampoo6.getInfo();

		Shampoo shampoo7 = new Shampoo("WOW","Herbal","Natural",300.0,400.0,"All Hair",true,true,
        "Transparent","Bottle","WOW Skin","India",24,"Onion Extract","Daily","Pump","Small",
		"Organic","Liquid","2 Years");
		shampoo7.getInfo();

		Shampoo shampoo8 = new Shampoo("Biotique","Ayurvedic","Herbal",340.0,250.0,"Oily",true,true,
        "Green","Bottle","Biotique","India",36,"Neem","Hair Care","Flip Cap","Medium","Herbal",
		"Liquid","3 Years");
		shampoo8.getInfo();

		Shampoo shampoo9 = new Shampoo("Sunsilk","Smooth","Floral",650.0,320.0,"Normal",false,false,
        "Pink","Bottle","Unilever","India",24,"Silk Protein","Daily","Flip Cap","Large","Standard",
		"Creamy","2 Years");
		shampoo9.getInfo();

		Shampoo shampoo10 = new Shampoo("Mamaearth","Onion","Natural",400.0,450.0,"Hair Fall",true,
		true,"Brown","Bottle","Mamaearth","India",24,"Onion Oil","Hair Growth","Pump","Medium",
		"Organic","Liquid","2 Years");
		shampoo10.getInfo();
	}
}