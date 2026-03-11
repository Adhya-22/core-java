class Mouse
{
	String brand;
	double price;
	boolean hasBattery;
	boolean wireless;
	String color;
	
	Battery battery;
	Cable cable;
	MousePad mousePad;
	ScrollWheel scrollWheel;
	Led led;
	
	Mouse(String brand,double price,boolean hasBattery,boolean wireless,String color,Battery battery,
	Cable cable,MousePad mousePad,ScrollWheel scrollWheel,Led led)
	{
		this.brand=brand;
		this.price=price;
		this.hasBattery=hasBattery;
		this.wireless=wireless;
		this.color=color;
		this.battery=battery;
		this.cable=cable;
		this.mousePad=mousePad;
		this.scrollWheel=scrollWheel;
		this.led=led;
	}
	
	void getInfo()
	{
		System.out.println("brand : "+this.brand);
		System.out.println("price : "+this.price);
		System.out.println("hasBattery : "+this.hasBattery);
		System.out.println("wireless : "+this.wireless);
		System.out.println("color : "+this.color);
		if(this.led!=null)
		{
			this.led.getInfo();
		}
		if(this.scrollWheel!=null)
		{
			this.scrollWheel.getInfo();
		}
		if(this.mousePad!=null)
		{
			this.mousePad.getInfo();
		}
		if(this.cable!=null)
		{
			this.cable.getInfo();
		}
		if(this.battery!=null)
		{
			this.battery.getInfo();
		}
	}
}