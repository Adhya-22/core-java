class HairDryerRunner
{
	public static void main(String[] args)
	{
		HairDryer hairDryer1=new HairDryer();
		
		HairDryer hairDryer2=new HairDryer("Philips");
		System.out.println("HairDryer 2 info...");
		System.out.println("brand : "+hairDryer2.brand);
		
		HairDryer hairDryer3=new HairDryer("Nova","NV200");
		System.out.println("HairDryer 3 info...");
		System.out.println("brand : "+hairDryer3.brand);
		System.out.println("model : "+hairDryer3.model);
		
		HairDryer hairDryer4=new HairDryer("Havells","HV300",1800);
		System.out.println("HairDryer 4 info...");
		System.out.println("brand : "+hairDryer4.brand);
		System.out.println("model : "+hairDryer4.model);
		System.out.println("powerWatts : "+hairDryer4.powerWatts);
		
		HairDryer hairDryer5=new HairDryer("Syska","SY400",1600,1700);
		System.out.println("HairDryer 5 info...");
		System.out.println("brand : "+hairDryer5.brand);
		System.out.println("model : "+hairDryer5.model);
		System.out.println("powerWatts : "+hairDryer5.powerWatts);
		System.out.println("price : "+hairDryer5.price);
		
		HairDryer hairDryer6=new HairDryer("Panasonic","PN500",1400,2100,false);
		System.out.println("HairDryer 6 info...");
		System.out.println("brand : "+hairDryer6.brand);
		System.out.println("model : "+hairDryer6.model);
		System.out.println("powerWatts : "+hairDryer6.powerWatts);
		System.out.println("price : "+hairDryer6.price);
		System.out.println("hasCoolAirOption : "+hairDryer6.hasCoolAirOption);

	}
}