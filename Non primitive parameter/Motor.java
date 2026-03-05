class Motor
{
	String brand;
	double price;
	float efficiency;
	int phaseType;
	boolean isElectric;
	
	Rotor rotor;
	Stator stator;
	Gear gear;
	Bearing bearing;
	CoolingFan coolingFan;
	
	Motor(String brand,double price,float efficiency,int phaseType,boolean isElectric,Rotor rotor,Stator 
	stator,Gear gear,Bearing bearing,CoolingFan coolingFan)
	{
		this.brand=brand;
		this.price=price;
		this.efficiency=efficiency;
		this.phaseType=phaseType;
		this.isElectric=isElectric;
		this.rotor=rotor;
		this.stator=stator;
		this.gear=gear;
		this.bearing=bearing;
		this.coolingFan=coolingFan;
	}
}