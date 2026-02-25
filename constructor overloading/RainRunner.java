class RainRunner
{
	public static void main(String[] args)
	{
		Rain rain1=new Rain();
		
		Rain rain2=new Rain(5);
		System.out.println("Rain 2 info...");
		System.out.println("intensity : "+rain2.intensity);
		
		Rain rain3=new Rain(8,"Winter");
		System.out.println("Rain 3 info...");
		System.out.println("intensity : "+rain3.intensity);
		System.out.println("season : "+rain3.season);
		
		Rain rain4=new Rain(3,"Summer","Light");
		System.out.println("Rain 4 info...");
		System.out.println("intensity : "+rain4.intensity);
		System.out.println("season : "+rain4.season);
		System.out.println("type : "+rain4.type);
		
		Rain rain5=new Rain(6,"Monsoon","Moderate",3);
		System.out.println("Rain 5 info...");
		System.out.println("intensity : "+rain5.intensity);
		System.out.println("season : "+rain5.season);
		System.out.println("type : "+rain5.type);
		System.out.println("duration : "+rain5.duration);
		
		Rain rain6=new Rain(7,"Spring","Shower",2.5,false);
		System.out.println("Rain 6 info...");
		System.out.println("intensity : "+rain6.intensity);
		System.out.println("season : "+rain6.season);
		System.out.println("type : "+rain6.type);
		System.out.println("duration : "+rain6.duration);
		System.out.println("accompaniedByThunder : "+rain6.accompaniedByThunder);

	}
}