class MapStoreRunner
{
	public static void main(String[] args)
	{
		Map[] maps=new Map [10];
		
		MapStore mapStore=new MapStore(maps);
		
		Map map1=new Map("Physical","India","Karnataka","Bengaluru",true,true);
		mapStore.save(map1);
		
		Map map2=new Map("Political","India","Maharashtra","Mumbai",false,false);
		mapStore.save(map2);
		
		Map map3=new Map("Physical","India","Tamil Nadu","Chennai",true,true);
		mapStore.save(map3);
		
		Map map4=new Map("Political","India","Rajasthan","Jaipur",false,false);
		mapStore.save(map4);
		
		Map map5=new Map("Physical","India","Uttar Pradesh","Lucknow",true,true);
		mapStore.save(map5);
		
		Map map6=new Map("Political","India","West Bengal","Kolkata",false,false);
		mapStore.save(map6);
		
		Map map7=new Map("Physical","India","Andhra Pradesh","Visakhapatnam",true,true);
		mapStore.save(map7);
		
		Map map8=new Map("Political","India","Kerala","Kochi",false,false);
		mapStore.save(map8);
		
		Map map9=new Map("Physical","India","Assam","Guwahati",true,true);
		mapStore.save(map9);
		
		Map map10=new Map("Political","India","Jammu and Kashmir","Srinagar",false,false);
		mapStore.save(map10);
	}
}