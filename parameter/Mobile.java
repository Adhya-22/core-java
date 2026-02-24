class Mobile
{
	static void register(String patientName,String symptom,String email,long mobile) 
	{
		System.out.println("Register in Mobile....");
		Reception.book(patientName,symptom,email,mobile);
	}
}