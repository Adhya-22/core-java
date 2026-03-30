class DigitalClockRunner
{
	public static void main(String... args)
	{
        DigitalClock digitalClock1=new DigitalClock();
        digitalClock1.isWallclock=true;
        digitalClock1.price=1500;
        digitalClock1.type="Digital";
        digitalClock1.color="Black";
        digitalClock1.alarmSettable=true;
        digitalClock1.timeFormat="24hr";
        digitalClock1.isBatteryPowered=true;
        digitalClock1.warranty=2;
        digitalClock1.showTime();
        digitalClock1.showDate();
        digitalClock1.alarm();

        DigitalClock digitalClock2=new DigitalClock();
        digitalClock2.isWallclock=false;
        digitalClock2.price=2000;
        digitalClock2.type="LED";
        digitalClock2.color="White";
        digitalClock2.alarmSettable=false;
        digitalClock2.timeFormat="12hr";
        digitalClock2.isBatteryPowered=false;
        digitalClock2.warranty=1;
        digitalClock2.showTime();
        digitalClock2.showDate();
        digitalClock2.alarm();

        Clock clock1=new DigitalClock();
        clock1.isWallclock=true;
        clock1.price=1800;
        clock1.type="Smart";
        clock1.showTime();
        clock1.showDate();

        Clock clock2=new DigitalClock();
        clock2.isWallclock=false;
        clock2.price=1200;
        clock2.type="Basic";
        clock2.showTime();
        clock2.showDate();

        Clock clock3=new Clock();
        clock3.isWallclock=true;
        clock3.price=800;
        clock3.type="Analog";
        clock3.showTime();
        clock3.showDate();

        Clock clock4=new Clock();
        clock4.isWallclock=false;
        clock4.price=600;
        clock4.type="Desk";
        clock4.showTime();
        clock4.showDate();
	}
}