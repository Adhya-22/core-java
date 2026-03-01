class LotionRunner
{
	public static void main(String[] args)
	{
		Lotion lotion1 = new Lotion("Nivea","Moisturizing","Mild",400.0,350.0,"Dry",true,false,"White",
		"Bottle","Nivea Ltd","Germany",24,"Aloe Vera","Daily Use","Flip Cap","Medium","Creamy",
		"2 Years","Premium");
		lotion1.getInfo();

		Lotion lotion2 = new Lotion("Vaseline","Hydrating","Light",300.0,250.0,"Normal",false,false,"White",
		"Bottle","Unilever","USA",24,"Petroleum Jelly","Daily","Pump","Small","Smooth","2 Years",
		"Standard");
		lotion2.getInfo();

		Lotion lotion3 = new Lotion("Dove","Nourishing","Floral",500.0,450.0,"Dry",true,false,"White",
		"Bottle","Unilever","India",24,"Shea Butter","After Bath","Flip Cap","Large","Creamy",
		"2 Years","Premium");
		lotion3.getInfo();

		Lotion lotion4 = new Lotion("Himalaya","Herbal","Natural",200.0,220.0,"Sensitive",true,true,
		"Green","Tube","Himalaya","India",36,"Neem","Skin Care","Cap","Small","Light","3 Years",
		"Herbal");
		lotion4.getInfo();

		Lotion lotion5 = new Lotion("Lakme","Glow","Floral",250.0,400.0,"Normal",false,false,"Pink",
		"Bottle","Lakme Ltd","India",24,"Vitamin E","Daily","Pump","Medium","Smooth","2 Years",
		"Premium");
		lotion5.getInfo();

		Lotion lotion6 = new Lotion("Ponds","Soft","Mild",350.0,300.0,"Dry",false,false,"White","Bottle",
		"HUL","India",24,"Milk Extract","Daily","Flip Cap","Medium","Creamy","2 Years","Standard");
		lotion6.getInfo();

		Lotion lotion7 = new Lotion("Mamaearth","Vitamin C","Citrus",300.0,500.0,"All Skin",true,true,
        "Orange","Bottle","Mamaearth","India",24,"Vitamin C","After Bath","Pump","Medium","Light",
		"2 Years","Organic");
		lotion7.getInfo();

		Lotion lotion8 = new Lotion("Biotique","Ayurvedic","Herbal",190.0,260.0,"Oily",true,true,"Green",
		"Tube","Biotique","India",36,"Aloe","Daily","Cap","Small","Light","3 Years","Herbal");
		lotion8.getInfo();

		Lotion lotion9 = new Lotion("Cetaphil","Moisturizer","Mild",250.0,600.0,"Sensitive",true,false,
        "White","Bottle","Galderma","USA",24,"Glycerin","Daily","Pump","Medium","Smooth","2 Years",
		"Dermatologist");
		lotion9.getInfo();

		Lotion lotion10 = new Lotion("WOW","Coconut","Natural",400.0,420.0,"Dry",true,true,"White",
		"Bottle","WOW Skin","India",24,"Coconut Oil","After Bath","Pump","Large","Creamy","2 Years",
		"Organic");
		lotion10.getInfo();
	}
}