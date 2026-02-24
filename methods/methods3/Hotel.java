class Hotel
{
	static void order(String itemName,int quantity,boolean parcel)
	{
		System.out.println("Item Name : "+itemName);
		System.out.println("Quantity : "+quantity);
		System.out.println("Parcel : "+parcel);
	}
	
	static void ownerInfo(int tax,int age,String address)
	{
		String name="Adhya";
		long gstNo=12345678910l;
		System.out.println("Name : "+name);
		System.out.println("GST No : "+gstNo);
		System.out.println("Tax Paid : "+tax);
		System.out.println("Age : "+age);
		System.out.println("Address: "+address);
	}
	
	static void staffInfo(String type,String name,int salary,String nativity,String email,long mobileNo)
	{
		System.out.println("Type : "+type);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Nativity : "+nativity);
		System.out.println("Email : "+email);
		System.out.println("Mobile Number: "+mobileNo);
	}
	
	static void hotelInfo(String name,String address,String owner,long mobileNum,int noOfStaff)
	{
		System.out.println("Hotel Name : "+name);
		System.out.println("Address: "+address);
		System.out.println("Owner : "+owner);
		System.out.println("Contact: "+mobileNum);
		System.out.println("Number of staff : "+noOfStaff);
		
	}
}