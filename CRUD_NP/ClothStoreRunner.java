class ClothStoreRunner
{
	public static void main(String[] args)
	{
		Cloth[] clothes=new Cloth[10];
		
		ClothStore clothStore=new ClothStore(clothes);
		
		Cloth cloth1=new Cloth("Megenta","L",636,"Cotton",false,true);
		clothStore.save(cloth1);
		
		Cloth cloth2=new Cloth("White","XXL",854,"Linen",true,true);
		clothStore.save(cloth2);
		
		Cloth cloth3=new Cloth("Black","L",896,"Wool",true,false);
		clothStore.save(cloth3);
		
		Cloth cloth4=new Cloth("Blue","XS",856,"Silk",true,false);
		clothStore.save(cloth4);
		
		Cloth cloth5=new Cloth("Pink","M",956,"Leather",true,false);
		clothStore.save(cloth5);
		
		Cloth cloth6=new Cloth("Red","XXL",678,"Denim",true,true);
		clothStore.save(cloth6);
		
		Cloth cloth7=new Cloth("Orange","S",986,"Polyester",false,false);
		clothStore.save(cloth7);
		
		Cloth cloth8=new Cloth("Green","M",785,"Nylon",false,true);
		clothStore.save(cloth8);
		
		Cloth cloth9=new Cloth("Grey","XL",765,"Rayon",false,true);
		clothStore.save(cloth9);
		
		Cloth cloth10=new Cloth("Yellow","XXL",987,"Cotton",true,false);
		clothStore.save(cloth10);
	}
}