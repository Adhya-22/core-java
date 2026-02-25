class NotebookRunner
{
	public static void main(String[] args)
	{
		Notebook notebook1=new Notebook();
		
		Notebook notebook2=new Notebook("Classmate");
		System.out.println("Notebook 2 info...");
		System.out.println("Brand : "+notebook2.brand);
		
		Notebook notebook3=new Notebook("Navaneet",250);
		System.out.println("Notebook 3 info...");
		System.out.println("Brand : "+notebook3.brand);
		System.out.println("pages : "+notebook3.pages);
		
		Notebook notebook4=new Notebook("Paperkraft",180,"A4");
		System.out.println("Notebook 4 info...");
		System.out.println("Brand : "+notebook4.brand);
		System.out.println("pages : "+notebook4.pages);
		System.out.println("Size : "+notebook4.size);
		
		Notebook notebook5=new Notebook("Camlin",300,"Long",80);
		System.out.println("Notebook 5 info...");
		System.out.println("Brand : "+notebook5.brand);
		System.out.println("pages : "+notebook5.pages);
		System.out.println("Size : "+notebook5.size);
		System.out.println("price : "+notebook5.price);
		
		Notebook notebook6=new Notebook("Luxor",280,"King",60,true);
		System.out.println("Notebook 6 info...");
		System.out.println("Brand : "+notebook6.brand);
		System.out.println("pages : "+notebook6.pages);
		System.out.println("Size : "+notebook6.size);
		System.out.println("price : "+notebook6.price);
		System.out.println("is Hard Cover : "+notebook6.isHardCover);

	}
}