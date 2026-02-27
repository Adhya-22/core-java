class WallPaperRunner
{
	public static void main(String[] args)
	{
		WallPaper wallPaper1 = new WallPaper("Asian Paints","Blue","Floral","Vinyl",10.5,2.5,2500.0,
		"Smooth",true,true,"Modern","Living Room","Matte","India",5,1.5,"WP01",true,"Roll","Asian Paints");
		wallPaper1.getInfo();

        WallPaper wallPaper2 = new WallPaper("Berger","White","Striped","Paper",8.0,2.0,1800.0,
		"Rough",true,false,"Classic","Bedroom","Glossy","India",3,1.2,"WP02",false,"Roll","Berger");
		wallPaper2.getInfo();
		
        WallPaper wallPaper3 = new WallPaper("Dulux","Grey","Abstract","PVC",12.0,3.0,3200.0,
		"Smooth",true,true,"Premium","Hall","Matte","UK",6,1.8,"WP03",true,"Box","Dulux");
		wallPaper3.getInfo();
		
        WallPaper wallPaper4 = new WallPaper("Asian","Pink","Floral","Vinyl",9.5,2.2,2100.0,"Soft",
		true,true,"Modern","Kids Room","Glossy","India",4,1.4,"WP04",true,"Roll","Asian");
		wallPaper4.getInfo();
		
        WallPaper wallPaper5 = new WallPaper("Berger","Green","Nature","Paper",7.5,2.1,1500.0,
		"Matte",false,false,"Classic","Office","Matte","India",2,1.0,"WP05",false,"Roll","Berger");
		wallPaper5.getInfo();
		
        WallPaper wallPaper6 = new WallPaper("Dulux","Yellow","Geometric","PVC",11.0,2.8,2900.0,
		"Smooth",true,true,"Premium","Hall","Glossy","UK",5,1.6,"WP06",true,"Box","Dulux");
		wallPaper6.getInfo();
		
        WallPaper wallPaper7 = new WallPaper("Asian","Brown","Wood","Vinyl",10.0,2.4,2600.0,
		"Textured",true,true,"Modern","Living Room","Matte","India",5,1.5,"WP07",true,"Roll","Asian");
		wallPaper7.getInfo();
		
        WallPaper wallPaper8 = new WallPaper("Berger","Cream","Plain","Paper",8.5,2.3,1700.0,
		"Smooth",true,false,"Simple","Bedroom","Matte","India",3,1.2,"WP08",false,"Roll","Berger");
		wallPaper8.getInfo();
		
        WallPaper wallPaper9 = new WallPaper("Dulux","Purple","Abstract","PVC",12.5,3.2,3500.0,
		"Soft",true,true,"Luxury","Hall","Glossy","UK",6,1.9,"WP09",true,"Box","Dulux");
		wallPaper9.getInfo();
		
        WallPaper wallPaper10 = new WallPaper("Asian","Orange","Floral","Vinyl",9.0,2.0,2000.0,
		"Smooth",true,true,"Modern","Dining Room","Matte","India",4,1.3,"WP10",true,"Roll","Asian");
		wallPaper10.getInfo();
		
	}
}