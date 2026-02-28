class PVR 
{
    String name;
    String location;
    int screenCount;
    int seatingCapacity;
    String ceo;
    int foundedYear;
    String headquarters;
    double ticketPrice;
    String foodCourt;
    boolean imaxAvailable;
    boolean reclinerSeats;
    String soundSystem;
    String projectorType;
    String website;
    String mobileApp;
    String membershipProgram;
    String parkingFacility;
    String city;
    String state;
    String country;
	
	PVR(String name,String location,int screenCount,int seatingCapacity,String ceo,int foundedYear,
	String headquarters,double ticketPrice,String foodCourt,boolean imaxAvailable,boolean reclinerSeats,
	String soundSystem,String projectorType,String website,String mobileApp,String membershipProgram,
	String parkingFacility,String city,String state,String country)
	{
		this.name=name;
		this.location=location;
		this.screenCount=screenCount;
		this.seatingCapacity=seatingCapacity;
		this.ceo=ceo;
		this.foundedYear=foundedYear;
		this.headquarters=headquarters;
		this.ticketPrice=ticketPrice;
		this.foodCourt=foodCourt;
		this.imaxAvailable=imaxAvailable;
		this.reclinerSeats=reclinerSeats;
		this.soundSystem=soundSystem;
		this.projectorType=projectorType;
		this.website=website;
		this.mobileApp=mobileApp;
		this.membershipProgram=membershipProgram;
		this.parkingFacility=parkingFacility;
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	void getInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("location : "+this.location);
		System.out.println("screenCount : "+this.screenCount);
		System.out.println("seatingCapacity : "+this.seatingCapacity);
		System.out.println("ceo : "+this.ceo);
		System.out.println("foundedYear : "+this.foundedYear);
		System.out.println("headquarters : "+this.headquarters);
		System.out.println("ticketPrice : "+this.ticketPrice);
		System.out.println("foodCourt : "+this.foodCourt);
		System.out.println("imaxAvailable : "+this.imaxAvailable);
		System.out.println("reclinerSeats : "+this.reclinerSeats);
		System.out.println("soundSystem : "+this.soundSystem);
		System.out.println("projectorType : "+this.projectorType);
		System.out.println("website : "+this.website);
		System.out.println("mobileApp : "+this.mobileApp);
		System.out.println("membershipProgram : "+this.membershipProgram);
		System.out.println("parkingFacility : "+this.parkingFacility);
		System.out.println("city : "+this.city);
		System.out.println("state : "+this.state);
		System.out.println("country : "+this.country);
	}
	

}