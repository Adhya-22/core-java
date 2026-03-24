class GumStoreRunner
{
	public static void main(String[] args)
	{
		Gum[] gums=new Gum[10];
		
		GumStore gumStore=new GumStore(gums);
		
		Gum gum1=new Gum("Mint","Orbit",50.0,"12-12-2026",true,true);
		gumStore.save(gum1);
		
		Gum gum2=new Gum("Strawberry","Center Fresh",40.0,"10-11-2026",false,true);
		gumStore.save(gum2);
		
		Gum gum3=new Gum("Bubblegum","Big Babol",30.0,"05-09-2026",false,true);
		gumStore.save(gum3);
		
		Gum gum4=new Gum("Spearmint","Happydent",60.0,"15-01-2027",true,true);
		gumStore.save(gum4);
		
		Gum gum5=new Gum("Orange","Boomer",35.0,"20-08-2026",false,false);
		gumStore.save(gum5);
		
		Gum gum6=new Gum("Cinnamon","Wrigley",55.0,"30-12-2026",true,false);
		gumStore.save(gum6);
		
		Gum gum7=new Gum("Lemon","Doublemint",45.0,"25-07-2026",true,true);
		gumStore.save(gum7);
		
		Gum gum8=new Gum("Grape","Chiclets",38.0,"18-10-2026",false,false);
		gumStore.save(gum8);
		
		Gum gum9=new Gum("Cola","Mentos",48.0,"09-03-2027",true,true);
		gumStore.save(gum9);
		
		Gum gum10=new Gum("Watermelon","Trident",52.0,"01-06-2026",false,true);
		gumStore.save(gum10);
	}
}