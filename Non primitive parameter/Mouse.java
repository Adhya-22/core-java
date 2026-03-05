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
}