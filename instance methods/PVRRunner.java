class PVRRunner
{
	public static void main(String[] args)
	{
		PVR pvr1 = new PVR("PVR Orion","Rajajinagar",8,1200,"Ajay Bijli",1997,"Gurgaon",250.0,
		"Snacks",true,true,"Dolby Atmos","4K","www.pvr.com","PVR App","Privilege","Available",
		"Bangalore","Karnataka","India");
		pvr1.getInfo();

		PVR pvr2 = new PVR("PVR Forum","Koramangala",6,900,"Ajay Bijli",1997,"Gurgaon",220.0,
		"Food Court",true,false,"Dolby","2K","www.pvr.com","PVR App","Gold","Available","Bangalore",
		"Karnataka","India");
		pvr1.getInfo();

		PVR pvr3 = new PVR("PVR Phoenix","Whitefield",10,1500,"Ajay Bijli",1997,"Gurgaon",300.0,
		"Premium Snacks",true,true,"Dolby Atmos","IMAX","www.pvr.com","PVR App","Platinum",
		"Available","Bangalore","Karnataka","India");
		pvr1.getInfo();

		PVR pvr4 = new PVR("PVR Lulu","Kochi",7,1000,"Ajay Bijli",1997,"Gurgaon",200.0,"Snacks",
		false,false,"Dolby","2K","www.pvr.com","PVR App","Silver","Available","Kochi","Kerala",
		"India");
		pvr1.getInfo();

		PVR pvr5 = new PVR("PVR Select","Delhi",12,2000,"Ajay Bijli",1997,"Gurgaon",350.0,"Luxury Dining",
		true,true,"Dolby Atmos","IMAX","www.pvr.com","PVR App","Elite","Available","Delhi","Delhi",
		"India");
		pvr1.getInfo();

		PVR pvr6 = new PVR("PVR Express","Mumbai",5,700,"Ajay Bijli",1997,"Gurgaon",180.0,"Snacks",
		false,false,"Dolby","2K","www.pvr.com","PVR App","Basic","Limited","Mumbai","Maharashtra",
		"India");
		pvr1.getInfo();

		PVR pvr7 = new PVR("PVR Grand","Hyderabad",9,1400,"Ajay Bijli",1997,"Gurgaon",260.0,
		"Food Court",true,true,"Dolby Atmos","4K","www.pvr.com","PVR App","Privilege","Available",
		"Hyderabad","Telangana","India");
		pvr1.getInfo();

		PVR pvr8 = new PVR("PVR Central","Chennai",6,850,"Ajay Bijli",1997,"Gurgaon",210.0,"Snacks",
		false,true,"Dolby","2K","www.pvr.com","PVR App","Silver","Available","Chennai","Tamil Nadu",
		"India");
		pvr1.getInfo();

		PVR pvr9 = new PVR("PVR Mall","Pune",8,1100,"Ajay Bijli",1997,"Gurgaon",240.0,"Food Court",
		true,false,"Dolby","4K","www.pvr.com","PVR App","Gold","Available","Pune","Maharashtra",
		"India");
		pvr1.getInfo();

		PVR pvr10 = new PVR("PVR City","Ahmedabad",7,950,"Ajay Bijli",1997,"Gurgaon",230.0,"Snacks",
		false,true,"Dolby","2K","www.pvr.com","PVR App","Privilege","Available","Ahmedabad",
		"Gujarat","India");
		pvr1.getInfo();
	}
}