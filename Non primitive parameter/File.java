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
	
	
}