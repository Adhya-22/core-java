class WaterFallRunner
{
	public static void main(String[] args)
	{
		WaterFall.info("JogFalls","Karnataka",253,true);
		WaterFall.info(null,"Karnataka",253,true);
		WaterFall.info("JogFalls",null,253,true);
		WaterFall.info("JogFalls","Karnataka",0,true);
		WaterFall.info("JogFalls","Karnataka",253,false);
		
		WaterFall.stateInfo("Karnataka","Shivamogga","Sagara");
		WaterFall.stateInfo(null,"Shivamogga","Sagara");
		WaterFall.stateInfo("Karnataka",null,"Sagara");
		WaterFall.stateInfo("Karnataka","Shivamogga",null);
		WaterFall.stateInfo("Goa","South Goa","Sanguem");
	}
}