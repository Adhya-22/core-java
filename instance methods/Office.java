class Office 
{
    String name;
    String location;
    String type;
    int employeeCount;
    double area;
    String manager;
    String department;
    String buildingType;
    boolean parkingAvailable;
    boolean wifiAvailable;
    String furnitureType;
    String workingHours;
    String contactNumber;
    String email;
    String website;
    String city;
    String state;
    String country;
    String branchCode;
    int establishedYear;
	
	Office(String name,String location,String type,int employeeCount,double area,String manager,
	String department,String buildingType,boolean parkingAvailable,boolean wifiAvailable,
	String furnitureType,String workingHours,String contactNumber,String email,String website,
	String city,String state,String country,String branchCode,int establishedYear)
	{
		this.name=name;
		this.location=location;
		this.type=type;
		this.employeeCount=employeeCount;
		this.area=area;
		this.manager=manager;
		this.department=department;
		this.buildingType=buildingType;
		this.parkingAvailable=parkingAvailable;
		this.wifiAvailable=wifiAvailable;
		this.furnitureType=furnitureType;
		this.workingHours=workingHours;
		this.contactNumber=contactNumber;
		this.email=email;
		this.website=website;
		this.city=city;
		this.state=state;
		this.country=country;
		this.branchCode=branchCode;
		this.establishedYear=establishedYear;
	}
	
	void getInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("location : "+this.location);
		System.out.println("type : "+this.type);
		System.out.println("employeeCount : "+this.employeeCount);
		System.out.println("area : "+this.area);
		System.out.println("manager : "+this.manager);
		System.out.println("department : "+this.department);
		System.out.println("buildingType : "+this.buildingType);
		System.out.println("parkingAvailable : "+this.parkingAvailable);
		System.out.println("wifiAvailable : "+this.wifiAvailable);
		System.out.println("furnitureType : "+this.furnitureType);
		System.out.println("workingHours : "+this.workingHours);
		System.out.println("contactNumber : "+this.contactNumber);
		System.out.println("email : "+this.email);
		System.out.println("website : "+this.website);
		System.out.println("city : "+this.city);
		System.out.println("state : "+this.state);
		System.out.println("country : "+this.country);
		System.out.println("branchCode : "+this.branchCode);
		System.out.println("establishedYear : "+this.establishedYear);
	}

}