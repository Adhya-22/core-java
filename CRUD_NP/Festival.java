class Festival
{
    String name;
    String date;
	String religion;
	int duration;
	boolean isPublicHoliday;
	
	Festival(String name,String date,String religion,int duration,boolean isPublicHoliday)
	{
		this.name=name;
		this.date=date;
		this.religion=religion;
		this.duration=duration;
		this.isPublicHoliday=isPublicHoliday;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Festival..");
		System.out.println("name : "+this.name);
		System.out.println("date : "+this.date);
		System.out.println("religion : "+this.religion);
		System.out.println("duration : "+this.duration);
		System.out.println("isPublicHoliday : "+this.isPublicHoliday);
	}
}