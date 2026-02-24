class Adhya
{
	static void info(String name,int age,int height)
	{
		System.out.println("Name : "+name+" Age : "+age+" Height : "+height);
		
		if(name==null)
		{
			System.out.println("Name is invalid...");
			return;
		}
		
		if(age<0)
		{
			System.out.println("Age is invalid...");
			return;
		}
		
		if(height<40)
		{
			System.out.println("Height is invalid...");
			return;
		}
		
		System.out.println("Adhya Info is valid...");
	}
	
	static void familyInfo(String fatherName,String motherName,boolean siblings)
	{
		System.out.println("Father Name : "+fatherName+" Mother Name : "+motherName+" Sibling : "+siblings);
		
		if(fatherName==null)
		{
			System.out.println("Father Name is invalid...");
			return;
		}
		
		if(motherName==null)
		{
			System.out.println("Mother Name is invalid...");
			return;
		}
		System.out.println("Adhya Family Info is valid...");
	}
	
	
}