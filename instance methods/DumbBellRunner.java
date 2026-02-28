class DumbBellRunner
{
	public static void main(String[] args)
	{
		DumbBell dumbBell1 = new DumbBell("ProFit",10.0,"Iron","Black",2000.0,"Rubber",false,"Gym",
		"Powder Coated","Medium","Round","Box",2,"Fitness Co","India","DB01","Matte","10kg",
		"Home Gym","High");
		dumbBell1.getInfo();

		DumbBell dumbBell2 = new DumbBell("Adidas",12.5,"Steel","Grey",3500.0,"Textured",false,
		"Gym","Chrome","Medium","Hex","Box",3,"Adidas","Germany","DB02","Glossy","12.5kg",
		"Commercial","High");
		dumbBell2.getInfo();

		DumbBell dumbBell3 = new DumbBell("Nike",8.0,"Iron","Black",1800.0,"Rubber",true,"Workout",
		"Coated","Small","Round","Pack",1,"Nike","USA","DB03","Matte","8kg","Home","Medium");
		dumbBell3.getInfo();

		DumbBell dumbBell4 = new DumbBell("Reebok",15.0,"Steel","Silver",5000.0,"Foam",false,
		"Training","Chrome","Large","Hex","Box",4,"Reebok","UK","DB04","Glossy","15kg","Commercial",
		"High");
		dumbBell4.getInfo();

		DumbBell dumbBell5 = new DumbBell("Decathlon",5.0,"Iron","Blue",1200.0,"Rubber",true,
		"Exercise","Coated","Small","Round","Pack",2,"Decathlon","France","DB05","Matte","5kg","Home",
		"Medium");
		dumbBell5.getInfo();

		DumbBell dumbBell6 = new DumbBell("ProFit",20.0,"Steel","Black",6500.0,"Textured",false,
		"Strength","Chrome","Large","Hex","Box",3,"Fitness Co","India","DB06","Glossy","20kg",
		"Commercial","High");
		dumbBell6.getInfo();

		DumbBell dumbBell7 = new DumbBell("CultFit",7.5,"Iron","Grey",1700.0,"Rubber",true,"Workout",
		"Coated","Small","Round","Pack",1,"Cult","India","DB07","Matte","7.5kg","Home","Medium");
		dumbBell7.getInfo();

		DumbBell dumbBell8 = new DumbBell("ProForm",18.0,"Steel","Black",6000.0,"Foam",false,
		"Training","Chrome","Large","Hex","Box",5,"ProForm","USA","DB08","Glossy","18kg",
		"Commercial","High");
		dumbBell8.getInfo();

		DumbBell dumbBell9 = new DumbBell("Kobo",6.0,"Iron","Red",1400.0,"Rubber",true,"Exercise",
		"Coated","Small","Round","Pack",2,"Kobo","India","DB09","Matte","6kg","Home","Medium");
		dumbBell9.getInfo();

		DumbBell dumbBell10 = new DumbBell("PowerMax",25.0,"Steel","Black",8000.0,"Textured",false,
		"Strength","Chrome","Extra Large","Hex","Box",5,"PowerMax","India","DB10","Glossy","25kg",
		"Commercial","Very High");
		dumbBell10.getInfo();
	}
}