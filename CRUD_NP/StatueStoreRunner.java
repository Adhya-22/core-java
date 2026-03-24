class StatueStoreRunner
{
	public static void main(String[] args)
	{
		Statue[] statues=new Statue [10];
		
		StatueStore statueStore=new StatueStore(statues);
		
		Statue statue1=new Statue("Statue of Unity",182,"Sardar Vallabhbhai Patel",2018,"Gujarat","India");
		statueStore.save(statue1);
		
		Statue statue2=new Statue("Spring Temple Buddha",128,"Vairocana Buddha",2008,"Henan","China");
		statueStore.save(statue2);
		
		Statue statue3=new Statue("Laykyun Sekkya",115.8,"Gautama Buddha",2008,"Sagaing","Myanmar");
		statueStore.save(statue3);
		
		Statue statue4=new Statue("Statue of Belief",106,"Lord Shiva",2020,"Rajasthan","India");
		statueStore.save(statue4);
		
		Statue statue5=new Statue("Ushiku Daibutsu",100,"Amitabha Buddha",1993,"Ibaraki","Japan");
		statueStore.save(statue5);
		
		Statue statue6=new Statue("Sendai Daikannon",100,"Kannon",1991,"Miyagi","Japan");
		statueStore.save(statue6);
		
		Statue statue7=new Statue("Guishan Guanyin",99,"Eleven-headed Guanyin",2009,"Hunan","China");
		statueStore.save(statue7);
		
		Statue statue8=new Statue("Mother of All Asia",98.15,"Virgin Mary",2021,"Batangas","Philippines");
		statueStore.save(statue8);
		
		Statue statue9=new Statue("Great Buddha of Thailand",93,"Gautama Buddha",2008,"Ang Thong","Thailand");
		statueStore.save(statue9);
		
		Statue statue10=new Statue("The Motherland Calls",85,"Mother Motherland",1967,"Volgograd","Russia");
		statueStore.save(statue10);
	}
}