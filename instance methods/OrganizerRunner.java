class OrganizerRunner
{
	public static void main(String[] args)
	{
		Organizer organizer1 = new Organizer("Desk Organizer","Plastic","Black",30.0,500.0,"Cello",
		true,"Office","Rectangle","Modern","Box","Cello Ltd","India",1,"OR01","Matte","Medium","5",
		"1kg","Good");
		organizer1.getInfo();

		Organizer organizer2 = new Organizer("Wardrobe Organizer","Cloth","Grey",60.0,1200.0,
		"HomePro",false,"Clothes","Rectangle","Simple","Pack","HomePro","India",2,"OR02","Matte",
		"Large","10","2kg","High");
		organizer2.getInfo();

		Organizer organizer3 = new Organizer("Makeup Organizer","Plastic","Transparent",25.0,800.0,
		"BeautyCo",true,"Cosmetics","Square","Stylish","Box","BeautyCo","USA",1,"OR03","Glossy",
		"Small","6","0.8kg","Good");
		organizer3.getInfo();

		Organizer organizer4 = new Organizer("File Organizer","Metal","Black",40.0,900.0,"OfficeMart",
		false,"Documents","Rectangle","Professional","Box","OfficeMart","India",3,"OR04","Matte",
		"Medium","8","3kg","High");
		organizer4.getInfo();

		Organizer organizer5 = new Organizer("Kitchen Organizer","Steel","Silver",50.0,1500.0,
		"KitchenPro",false,"Utensils","Rectangle","Modern","Box","KitchenPro","India",2,"OR05",
        "Glossy","Large","12","4kg","Very High");
		organizer5.getInfo();

		Organizer organizer6 = new Organizer("Toy Organizer","Plastic","Blue",70.0,2000.0,"KidsHome",
		true,"Toys","Rectangle","Colorful","Box","KidsHome","India",1,"OR06","Matte","Large","15",
		"5kg","Good");
		organizer6.getInfo();

		Organizer organizer7 = new Organizer("Cable Organizer","Plastic","Black",15.0,300.0,"TechGear",
		true,"Electronics","Round","Compact","Packet","TechGear","China",1,"OR07","Matte","Small",
		"3","0.3kg","Standard");
		organizer7.getInfo();

		Organizer organizer8 = new Organizer("Book Organizer","Wood","Brown",80.0,3500.0,"HomeCenter",
		false,"Books","Rectangle","Classic","Box","HomeCenter","India",5,"OR08","Matte","Large",
		"20","10kg","Very High");
		organizer8.getInfo();

		Organizer organizer9 = new Organizer("Jewelry Organizer","Velvet","Red",20.0,1800.0,"LuxStore",
		true,"Jewelry","Square","Elegant","Case","LuxStore","USA",2,"OR09","Glossy","Small","10",
		"1kg","High");
		organizer9.getInfo();

		Organizer organizer10 = new Organizer("Travel Organizer","Fabric","Grey",35.0,700.0,"TravelMate",
		true,"Travel","Rectangle","Compact","Pack","TravelMate","India",1,"OR10","Matte","Medium",
		"7","1.5kg","Good");
		organizer10.getInfo();
	}
}