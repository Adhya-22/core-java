class ConditionerRunner
{
	public static void main(String[] args)
	{
		Conditioner conditioner1 = new Conditioner("Dove","Damage Repair","Mild",650.0,480.0,"Dry",
		true,true,"White","Bottle","Unilever","India",24,"Keratin","After Wash","Flip Cap","Large",
		"Premium","Creamy","2 Years");
		conditioner1.getInfo();

		Conditioner conditioner2 = new Conditioner("Pantene","Smooth","Floral",500.0,420.0,"Frizzy",
		true,false,"White","Bottle","P&G","India",24,"Pro-V","After Shampoo","Flip Cap","Medium",
		"Premium","Thick","2 Years");
		conditioner2.getInfo();

		Conditioner conditioner3 = new Conditioner("Tresemme","Keratin","Strong",580.0,620.0,
		"Damaged",true,true,"Black","Bottle","Unilever","USA",30,"Keratin","Salon Use","Pump",
        "Large","Premium","Thick","2.5 Years");
		conditioner3.getInfo();

		Conditioner conditioner4 = new Conditioner("L'Oreal","Total Repair","Fresh",450.0,560.0,
		"Dry",true,true,"White","Bottle","L'Oreal","France",24,"Argan Oil","Hair Care","Flip Cap",
        "Medium","Premium","Creamy","2 Years");
		conditioner4.getInfo();

		Conditioner conditioner5 = new Conditioner("Clinic Plus","Strong","Mild",700.0,300.0,
		"Normal",false,false,"White","Bottle","HUL","India",18,"Milk Protein","Daily","Flip Cap",
        "Large","Standard","Liquid","1.5 Years");
		conditioner5.getInfo();

		Conditioner conditioner6 = new Conditioner("Head & Shoulders","Anti-Dandruff","Fresh",400.0,
		350.0,"Oily",false,false,"White","Bottle","P&G","USA",24,"Zinc","After Wash","Pump",
        "Medium","Standard","Thick","2 Years");
		conditioner6.getInfo();

		Conditioner conditioner7 = new Conditioner("WOW","Onion","Natural",300.0,450.0,"Hair Fall",
		true,true,"Brown","Bottle","WOW Skin","India",24,"Onion Extract","Hair Growth","Pump",
        "Small","Organic","Liquid","2 Years");
		conditioner7.getInfo();

		Conditioner conditioner8 = new Conditioner("Biotique","Herbal","Ayurvedic",340.0,260.0,
		"Oily",true,true,"Green","Bottle","Biotique","India",36,"Neem","Hair Care","Flip Cap",
        "Medium","Herbal","Liquid","3 Years");
		conditioner8.getInfo();

		Conditioner conditioner9 = new Conditioner("Sunsilk","Smooth","Floral",650.0,340.0,"Normal",
		false,false,"Pink","Bottle","Unilever","India",24,"Silk Protein","Daily","Flip Cap","Large",
		"Standard","Creamy","2 Years");
		conditioner9.getInfo();

		Conditioner conditioner10 = new Conditioner("Mamaearth","Onion","Natural",400.0,480.0,
		"Hair Fall",true,true,"Brown","Bottle","Mamaearth","India",24,"Onion Oil","After Shampoo",
		"Pump","Medium","Organic","Liquid","2 Years");
		conditioner10.getInfo();
	}
}