class File
{
	String name;
	int sizeInKb;
	boolean isformatted;
	boolean hidden;
	boolean compressed;
	
	Extension extension;
	Storage storage;
	Folder folder;
	Owner owner;
	Date date;
	
	File(String name,int sizeInKb,boolean isformatted,boolean hidden,boolean compressed,
	Extension extension,Storage storage, Folder folder,Owner owner,Date date)
	{
		this.name=name;
		this.sizeInKb=sizeInKb;
		this.isformatted=isformatted;
		this.hidden=hidden;
		this.compressed=compressed;
		this.extension=extension;
		this.storage=storage;
		this.folder=folder;
		this.owner=owner;
		this.date=date;
	}
	
	void getInfo()
	{
		System.out.println("name : "+this.name);
		System.out.println("sizeInKb : "+this.sizeInKb);
		System.out.println("isformatted : "+this.isformatted);
		System.out.println("hidden : "+this.hidden);
		System.out.println("compressed : "+this.compressed);
		if(this.extension!=null)
		{
			this.extension.getInfo();
		}
		if(this.storage!=null)
		{
			this.storage.getInfo();
		}
		if(this.folder!=null)
		{
			this.folder.getInfo();
		}
		if(this.owner!=null)
		{
			this.owner.getInfo();
		}
		if(this.date!=null)
		{
			this.date.getInfo();
		}
	}
	
	
}