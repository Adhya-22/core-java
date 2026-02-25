class Battery
{
    String brand;
    String type;
    double capacity;
    double voltage;
    boolean isRechargeable;
	
	Battery()
	{
		System.out.println("No parameter constructor....");
	}
	
	Battery(String brand)
	{
		this.brand=brand;
	}
	
	Battery(String brand,String type)
	{
		this.brand=brand;
		this.type=type;
	}
	
	Battery(String brand,String type,double capacity)
	{
		this.brand=brand;
		this.type=type;
		this.capacity=capacity;
	}
	
	Battery(String brand,String type,double capacity,double voltage)
	{
		this.brand=brand;
		this.type=type;
		this.capacity=capacity;
		this.voltage=voltage;
	}
	
	Battery(String brand,String type,double capacity,double voltage,boolean isRechargeable)
	{
		this.brand=brand;
		this.type=type;
		this.capacity=capacity;
		this.voltage=voltage;
		this.isRechargeable=isRechargeable;
	}
}