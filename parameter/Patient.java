class Patient
{
	static void sick()
	{
		System.out.println("Patient is sick.....");
		String patientName="Suresh Rao";
		String symptom="Running nose";
		String email="suresh123@gmail.com";
		long mobile=7864592345L;
		Mobile.register(patientName,symptom,email,mobile); 
	}
}