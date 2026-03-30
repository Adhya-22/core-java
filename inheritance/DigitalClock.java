class DigitalClock extends Clock
{
	String color;
	boolean alarmSettable;
	String timeFormat;
	boolean isBatteryPowered;
	int warranty;
	
	DigitalClock()
	{
		System.out.println("Non=parametrized Constructor of DigitalClock");
	}
	
	void alarm()
	{
		System.out.println("Executing alarm inn DigitalClock");
	}
	
}