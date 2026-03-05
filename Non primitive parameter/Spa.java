class Spa
{
	String spaName;
	int noOfTreatmentRooms;
	double serviceCost;
	int noOfEmployees;
	boolean membershipAvailable;
	
	Customer customer;
	Owner owner;
	Massage massage;
	Oil oil;
	Room room;
	
	Spa(String spaName,int noOfTreatmentRooms,double serviceCost,int noOfEmployees,boolean membershipAvailable,
	Customer customer,Owner owner,Massage massage,Oil oil,Room room)
	{
		this.spaName=spaName;
		this.noOfTreatmentRooms=noOfTreatmentRooms;
		this.serviceCost=serviceCost;
		this.noOfEmployees=noOfEmployees;
		this.membershipAvailable=membershipAvailable;
		this.customer=customer;
		this.owner=owner;
		this.massage=massage;
		this.oil=oil;
		this.room=room;
	}
	
	void getInfo()
	{
		System.out.println("spaName : "+this.spaName);
		System.out.println("noOfTreatmentRooms : "+this.noOfTreatmentRooms);
		System.out.println("serviceCost : "+this.serviceCost);
		System.out.println("noOfEmployees : "+this.noOfEmployees);
		System.out.println("membershipAvailable : "+this.membershipAvailable);
	}
}
