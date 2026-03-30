class Clock
{
	boolean isWallclock;
	int price;
    String type;
	
	Clock()
	{
		System.out.println("Non-parameterized constructor of clock");
	}
	
	void showTime()
	{
		System.out.println("Executing showTime in clock");
	}
	
	void showDate()
	{
		System.out.println("Executing showDate in clock");
	}
}