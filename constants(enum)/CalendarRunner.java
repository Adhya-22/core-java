class CalendarRunner
{
	public static void main(String[] args)
	{
		Event event=new Event("BirthDay");
		CalendarType type=CalendarType.DESK;
		Calendar calendar=new Calendar(2026,event,type);
		calendar.printInfo();
		
		Event event2=new Event("Anniversary");
		CalendarType type2=CalendarType.WALL;
		Calendar calendar2=new Calendar(2025,event2,type2);
		calendar2.printInfo();
		
		Event event3=new Event("Festival");
		CalendarType type3=CalendarType.DIGITAL;
		Calendar calendar3=new Calendar(2024,event3,type3);
		calendar3.printInfo();
		
		Event event4=new Event("Holiday");
		CalendarType type4=CalendarType.POCKET;
		Calendar calendar4=new Calendar(2023,event4,type4);
		calendar4.printInfo();
	}
}