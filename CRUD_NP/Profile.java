class Profile
{
	String userName;
	String email;
	long mobileNo;
	String password;
	boolean profilePicture;
	boolean isActive;
	
	Profile(String userName,String email,long mobileNo,String password,boolean profilePicture,boolean isActive)
	{
		this.userName=userName;
		this.email=email;
		this.mobileNo=mobileNo;
		this.password=password;
		this.profilePicture=profilePicture;
		this.isActive=isActive;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Profile..");
		System.out.println("User Name : "+this.userName);
		System.out.println("email : "+this.email);
		System.out.println("mobileNo : "+this.mobileNo);
		System.out.println("password : "+this.password);
		System.out.println("profilePicture : "+this.profilePicture);
		System.out.println("isActive : "+this.isActive);
	}
}