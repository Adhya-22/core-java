class MapRunner
{
	public static void main(String[] args)
	{
		Map map1 = new Map("Political","India","1:1000000","Oxford",2022,"English",350.0,"Paper",
		"Large",false,"Folded","Mercator","Color","Education","India","5th","ISBN001","Tube","PDF",
		"General");
		map1.getInfo();

		Map map2 = new Map("Physical","Asia","1:500000","Cambridge",2021,"English",450.0,"Glossy",
		"Medium",true,"Rolled","Mercator","Multi Color","Geography","UK","3rd","ISBN002","Box",
		"eBook","Relief");
		map2.getInfo();

		Map map3 = new Map("Road","Karnataka","1:200000","Survey Dept",2020,"English",250.0,"Paper",
		"Medium",false,"Folded","Lambert","Color","Travel","India","2nd","ISBN003","Cover","App",
		"Transport");
		map3.getInfo();

		Map map4 = new Map("World","Global","1:10000000","National Geo",2023,"English",600.0,"Laminated",
		"Large",true,"Wall","Mercator","Color","Reference","USA","6th","ISBN004","Tube","PDF","World");
		map4.getInfo();

		Map map5 = new Map("Tourist","Goa","1:150000","Travel Corp",2022,"English",200.0,"Glossy",
		"Small",true,"Folded","Mercator","Bright","Tourism","India","1st","ISBN005","Cover","Mobile",
		"Beach");
		map5.getInfo();

		Map map6 = new Map("Topographic","Himalaya","1:25000","Geo Survey",2019,"English",800.0,
		"Laminated","Large",true,"Rolled","Lambert","Detailed","Research","India","4th","ISBN006",
        "Tube","GIS","Terrain");
		map6.getInfo();

		Map map7 = new Map("Climate","World","1:5000000","Weather Org",2021,"English",500.0,"Paper",
		"Large",false,"Wall","Mercator","Gradient","Study","USA","3rd","ISBN007","Box","PDF","Climate");
		map7.getInfo();

		Map map8 = new Map("Historical","Europe","1:800000","History Pub",2018,"English",420.0,"Paper",
		"Medium",false,"Folded","Mercator","Classic","Education","UK","2nd","ISBN008","Cover","eBook",
		"History");
		map8.getInfo();

		Map map9 = new Map("Railway","India","1:300000","Rail Corp",2022,"English",300.0,"Glossy",
		"Medium",false,"Folded","Mercator","Color","Travel","India","5th","ISBN009","Cover","App",
		"Transport");
		map9.getInfo();

		Map map10 = new Map("Satellite","Earth","1:10000000","Space Org",2023,"English",1000.0,"Laminated",
		"Large",true,"Wall","Mercator","High Resolution","Research","USA","1st","ISBN010","Tube",
		"GIS","Satellite");
		map10.getInfo();
	}
}