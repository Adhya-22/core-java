class HospitalRunner
{
	public static void main(String[] args)
	{
		Hospital hospital1=new Hospital();
		System.out.println("Hospital 1 hasEmergencyWard : "+hospital1.hasEmergencyWard);
		System.out.println("Hospital 1 location : "+hospital1.location);
		System.out.println("Hospital 1 hospitalName : "+hospital1.hospitalName);
		System.out.println("Hospital 1 numberOfBeds : "+hospital1.numberOfBeds);
		hospital1.numberOfBeds=160;
		hospital1.hospitalName="Jayadeva";
		hospital1.hasEmergencyWard=true;
		hospital1.location="BTM Layout";
		System.out.println("After Update :");
		System.out.println("Hospital 1 hasEmergencyWard : "+hospital1.hasEmergencyWard);
		System.out.println("Hospital 1 location : "+hospital1.location);
		System.out.println("Hospital 1 hospitalName : "+hospital1.hospitalName);
		System.out.println("Hospital 1 numberOfBeds : "+hospital1.numberOfBeds);
		
		Hospital hospital2=new Hospital();
		System.out.println("Hospital 2 hasEmergencyWard : "+hospital2.hasEmergencyWard);
		System.out.println("Hospital 2 location : "+hospital2.location);
		System.out.println("Hospital 2 hospitalName : "+hospital2.hospitalName);
		System.out.println("Hospital 2 numberOfBeds : "+hospital2.numberOfBeds);
		hospital2.numberOfBeds=170;
		hospital2.hospitalName="Nimans";
		hospital2.hasEmergencyWard=true;
		hospital2.location="Kormangala";
		System.out.println("After Update :");
		System.out.println("Hospital 2 hasEmergencyWard : "+hospital2.hasEmergencyWard);
		System.out.println("Hospital 2 location : "+hospital2.location);
		System.out.println("Hospital 2 hospitalName : "+hospital2.hospitalName);
		System.out.println("Hospital 2 numberOfBeds : "+hospital2.numberOfBeds);
		
		Hospital hospital3=new Hospital();
		System.out.println("Hospital 3 hasEmergencyWard : "+hospital3.hasEmergencyWard);
		System.out.println("Hospital 3 location : "+hospital3.location);
		System.out.println("Hospital 3 hospitalName : "+hospital3.hospitalName);
		System.out.println("Hospital 3 numberOfBeds : "+hospital3.numberOfBeds);
		hospital3.numberOfBeds=130;
		hospital3.hospitalName="Saint Jhons";
		hospital3.hasEmergencyWard=true;
		hospital3.location="Rajajinagar";
		System.out.println("After Update :");
		System.out.println("Hospital 3 hasEmergencyWard : "+hospital3.hasEmergencyWard);
		System.out.println("Hospital 3 location : "+hospital3.location);
		System.out.println("Hospital 3 hospitalName : "+hospital3.hospitalName);
		System.out.println("Hospital 3 numberOfBeds : "+hospital3.numberOfBeds);
		
		Hospital hospital4=new Hospital();
		System.out.println("Hospital 4 hasEmergencyWard : "+hospital4.hasEmergencyWard);
		System.out.println("Hospital 4 location : "+hospital4.location);
		System.out.println("Hospital 4 hospitalName : "+hospital4.hospitalName);
		System.out.println("Hospital 4 numberOfBeds : "+hospital4.numberOfBeds);
		hospital4.numberOfBeds=140;
		hospital4.hospitalName="Nanjappa hospital";
		hospital4.hasEmergencyWard=true;
		hospital4.location="Jail road";
		System.out.println("After Update :");
		System.out.println("Hospital 4 hasEmergencyWard : "+hospital4.hasEmergencyWard);
		System.out.println("Hospital 4 location : "+hospital4.location);
		System.out.println("Hospital 4 hospitalName : "+hospital4.hospitalName);
		System.out.println("Hospital 4 numberOfBeds : "+hospital4.numberOfBeds);
		
		Hospital hospital5=new Hospital();
		System.out.println("Hospital 5 hasEmergencyWard : "+hospital5.hasEmergencyWard);
		System.out.println("Hospital 5 location : "+hospital5.location);
		System.out.println("Hospital 5 hospitalName : "+hospital5.hospitalName);
		System.out.println("Hospital 5 numberOfBeds : "+hospital5.numberOfBeds);
		hospital5.numberOfBeds=100;
		hospital5.hospitalName="Max";
		hospital5.hasEmergencyWard=true;
		hospital5.location="DurgiGudi";
		System.out.println("After Update :");
		System.out.println("Hospital 5 hasEmergencyWard : "+hospital5.hasEmergencyWard);
		System.out.println("Hospital 5 location : "+hospital5.location);
		System.out.println("Hospital 5 hospitalName : "+hospital5.hospitalName);
		System.out.println("Hospital 5 numberOfBeds : "+hospital5.numberOfBeds);
		
	}
}