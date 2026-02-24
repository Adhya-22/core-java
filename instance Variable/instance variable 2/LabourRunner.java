class LabourRunner
{
	public static void main(String[] args) 
	{
        Labour labour1 = new Labour();
		
        labour1.name = "Ramesh";
        labour1.salary = 15000.0;
        labour1.idProofs = new String[]{"Aadhar Card", "PAN Card"};

		System.out.println("---- Labour 1 Details ----");
        System.out.println("Name: " + labour1.name);
        System.out.println("Salary: " + labour1.salary);
        System.out.println("ID Proofs:");
        for (int index=0;index<labour1.idProofs.length;index++) 
		{
            System.out.println(labour1.idProofs[index]);
        }
		
		
        Labour labour2 = new Labour();
		
        labour2.name = "Suresh";
        labour2.salary = 18000.0;
        labour2.idProofs = new String[]{"Voter ID", "Driving License"};

        System.out.println("---- Labour 2 Details ----");
        System.out.println("Name: " + labour2.name);
        System.out.println("Salary: " + labour2.salary);
        System.out.println("ID Proofs:");
        for (int index=0;index<labour2.idProofs.length;index++) 
		{
            System.out.println(labour2.idProofs[index]);
        }
    }

}