class Hospital
{
	static void bookAppointment(String patientName,String symptom)
	{
		System.out.println("Booking appointment....");
		int bp=167;
		boolean sugar=true;
		Nurse.basicCheck(patientName,symptom,bp,sugar);
	}
}