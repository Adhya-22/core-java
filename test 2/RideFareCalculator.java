class RideFareCalculator
{
	double distanceInKm;
	int timeOfTheDay;
	boolean isSurgePrice;
	int waitingMinutes;
	
	double baseFare;
	double surgePrice;
	double waitingCharges;
	double finalFare;
	
	RideFareCalculator(double distanceInKm,int timeOfTheDay,boolean isSurgePrice,int waitingMinutes)
	{
		this.distanceInKm=distanceInKm;
		this.timeOfTheDay=timeOfTheDay;
		this.isSurgePrice=isSurgePrice;
		this.waitingMinutes=waitingMinutes;
	}
	
	double calculateBaseFare(double distanceInKm)
	{
		if(distanceInKm<=2)
			baseFare=5;
		else
			baseFare=5+(distanceInKm-2)*1.5;
		
		return baseFare;
	}
	
	double applyTimeSurge(double baseFare)
	{
		if(timeOfTheDay>=23 || timeOfTheDay<=5)
			surgePrice=baseFare+(baseFare*0.25);
		else if((timeOfTheDay>=7 && timeOfTheDay<=9)||(timeOfTheDay>=17 && timeOfTheDay<=19))
			surgePrice=baseFare+(baseFare*0.15);
		else
			surgePrice=0;
		
		return surgePrice;
	}
	
	double applyWaitingCharges()
	{
		if(waitingMinutes<=2)
			waitingCharges=0;
		else if(waitingMinutes>2)
			for(int i=2;i<waitingMinutes;i++)
				waitingCharges+=0.5;
		
		return waitingCharges;	
	}
	
	double calculateFinalFare()
	{
		finalFare=baseFare+surgePrice+waitingCharges;
		if(isSurgePrice)
			finalFare=finalFare*1.5;
		
		return finalFare;
	}
	
}