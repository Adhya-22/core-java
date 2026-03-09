class Calendar
{
	int year;
	Event event;
	CalendarType calendarType;
	
	Calendar(int year,Event event,CalendarType calendarType)
	{
		this.year=year;
		this.event=event;
		this.calendarType=calendarType;
	}
	
	void printInfo()
	{
		System.out.println("Year : "+this.year);
		if(this.event!=null)
		{
			System.out.println("Event name : "+event.eventName);
		}
		System.out.println("Calendar Type : "+this.calendarType);
	}
}