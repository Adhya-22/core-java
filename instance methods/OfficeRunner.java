class OfficeRunner
{
	public static void main(String[] args)
	{
		Office office1 = new Office("Tech Solutions","IT Park","IT Company",250,5000.0,"Ramesh",
        "Development","Commercial",true,true,"Modern","9AM-6PM","9876543210","info@tech.com",
		"www.tech.com","Bangalore","Karnataka","India","BLR01",2015);
		office1.getInfo();

		Office office2 = new Office("Finance Hub","MG Road","Finance",150,3000.0,"Suresh","Accounts",
		"Commercial",true,true,"Corporate","9AM-5PM","9123456780","contact@finance.com","www.finance.com",
        "Chennai","Tamil Nadu","India","CHE01",2012);
		office2.getInfo();

		Office office3 = new Office("HealthCare Ltd","City Center","Hospital Admin",400,8000.0,"Anita",
        "Management","Corporate",true,true,"Modern","8AM-8PM","9988776655","admin@health.com",
		"www.health.com","Hyderabad","Telangana","India","HYD01",2010);
		office3.getInfo();

		Office office4 = new Office("EduTech","Campus Road","Education",120,2500.0,"Vikram","Training",
		"Academic",false,true,"Basic","9AM-4PM","9012345678","info@edutech.com","www.edutech.com",
        "Pune","Maharashtra","India","PUN01",2018);
		office4.getInfo();

		Office office5 = new Office("Retail Corp","Mall Road","Retail",300,6000.0,"Meena","Sales",
		"Commercial",true,true,"Modern","10AM-9PM","9876501234","support@retail.com","www.retail.com",
        "Delhi","Delhi","India","DEL01",2016);
		office5.getInfo();

		Office office6 = new Office("Startup Labs","Tech Hub","Startup",50,1200.0,"Arjun","Innovation",
		"Co-working",false,true,"Minimal","Flexible","9090909090","hello@startup.com","www.startup.com",
        "Mumbai","Maharashtra","India","MUM01",2020);
		office6.getInfo();

		Office office7 = new Office("Manufacture Pro","Industrial Area","Manufacturing",500,15000.0,
		"Kumar","Production","Factory",true,false,"Industrial","8AM-6PM","9887766554","info@manupro.com",
		"www.manupro.com","Coimbatore","Tamil Nadu","India","CBE01",2008);
		office7.getInfo();

		Office office8 = new Office("Design Studio","Art Street","Creative",80,1800.0,"Neha","Design",
		"Commercial",false,true,"Stylish","10AM-6PM","9765432109","design@studio.com","www.studio.com",
        "Jaipur","Rajasthan","India","JAI01",2019);
		office8.getInfo();

		Office office9 = new Office("Logistics Hub","Highway Road","Logistics",350,10000.0,"Prakash",
        "Operations","Warehouse",true,true,"Functional","24 Hours","9345678901","contact@logistics.com",
		"www.logistics.com","Ahmedabad","Gujarat","India","AHM01",2014);
		office9.getInfo();

		Office office10 = new Office("Consultancy Group","Business Park","Consulting",200,4000.0,
		"Divya","Advisory","Corporate",true,true,"Premium","9AM-6PM","9223344556","info@consult.com",
		"www.consult.com","Kolkata","West Bengal","India","KOL01",2011);
		office10.getInfo();
	}
}