class Storage
{
	String driveName;
	
	Storage(String driveName)
	{
		this.driveName=driveName;
	}
	
	void getInfo()
	{
		System.out.println("driveName : "+this.driveName);
	}
}