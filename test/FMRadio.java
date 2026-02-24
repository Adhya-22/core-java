class FMRadio
{
	static boolean radioState=true;
	static String[] stations={null,null,null,null,null};
	static int index=0;
	
	static void turnOnOrOff()
	{
		if(radioState)
		{
			radioState=false;
			System.out.println("Radio is OFF.");
		}
		else
		{
			radioState=true;
			System.out.println("Radio is ON.");
		}
	}
	
	static void setFrequency(float frequency)
	{
		if(radioState)
		{
			System.out.println("Frequency : "+frequency);
			if(frequency>88.0f && frequency<108.0f)
			{
				System.out.println("Frequency INVALID");
				return;
			}
			System.out.println("Frequency VALID");
		}
	}
	
	static void increaseVolume(int increment)
	{
		if(radioState)
		{
			System.out.println("Increment Volume : "+increment);
			if(increment>0 && increment<10)
			{
				System.out.println("Increment is VALID");
			}
			else
			{
				System.out.println("Increment is INVALID");
			}
		}
	}
	
	static void decreaseVolume(int decrement)
	{
		if(radioState)
		{
			System.out.println("Decrement Volume : "+decrement);
			if(decrement>0 && decrement<10)
			{
				System.out.println("decrement is VALID");
			}
			else
			{
				System.out.println("decrement is INVALID");
			}
		}
	}
	
	static void saveStation(String stationName)
	{
		System.out.println("Station Name : "+stationName);
		if(stationName==null)
		{
			System.out.println("Station Name is INVALID");
			return;
		}
		System.out.println("Station Name is VALID");
		
		stations[index]=stationName;
		index++;
		
		if(index==5)
			index=0;
		
	}
}