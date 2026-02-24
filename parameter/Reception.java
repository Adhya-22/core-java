class Reception
{
	static void book(String patientName,String symptom,String email,long mobile)
	{
		System.out.println("Confirm at reception....");
		Hospital.bookAppointment(patientName,symptom);
	}
}