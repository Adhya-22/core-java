class Map 
{
	String type;
    String country;
    String state;
    String city;
	boolean showsLatitudeAndLongitude;
	boolean isGoogleMaps;
	
	Map(String type,String Country,String state,String city,boolean showsLatitudeAndLongitude,boolean isGoogleMaps)
	{
		this.type=type;
		this.country=country;
		this.state=state;
		this.city=city;
		this.showsLatitudeAndLongitude=showsLatitudeAndLongitude;
		this.isGoogleMaps=isGoogleMaps;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Map...");
		System.out.println("Type : "+this.type);
		System.out.println("Country : "+this.country);
		System.out.println("State : "+this.state);
		System.out.println("City : "+this.city);
		System.out.println("showsLatitudeAndLongitude : "+this.showsLatitudeAndLongitude);
		System.out.println("isGoogleMaps : "+this.isGoogleMaps);
	}
}