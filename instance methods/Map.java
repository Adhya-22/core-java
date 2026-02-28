class Map
{
    String type;
    String region;
    String scale;
    String publisher;
    int publishedYear;
    String language;
    double price;
    String material;
    String size;
    boolean waterproof;
    String format;
    String projection;
    String colorScheme;
    String usage;
    String country;
    String edition;
    String isbn;
    String packaging;
    String digitalVersion;
    String theme;
	
	Map(String type,String region,String scale,String publisher,int publishedYear,String language,
	double price,String material,String size,boolean waterproof,String format,String projection,
	String colorScheme,String usage,String country,String edition,String isbn,String packaging,
	String digitalVersion,String theme)
	{
		this.type=type;
		this.region=region;
		this.scale=scale;
		this.publisher=publisher;
		this.publishedYear=publishedYear;
		this.language=language;
		this.price=price;
		this.material=material;
		this.size=size;
		this.waterproof=waterproof;
		this.format=format;
		this.projection=projection;
		this.colorScheme=colorScheme;
		this.usage=usage;
		this.country=country;
		this.edition=edition;
		this.isbn=isbn;
		this.packaging=packaging;
		this.digitalVersion=digitalVersion;
		this.theme=theme;
	}
	
	void getInfo()
	{
		System.out.println("Type : "+this.type);
		System.out.println("region : "+this.region);
		System.out.println("scale : "+this.scale);
		System.out.println("publisher : "+this.publisher);
		System.out.println("publishedYear : "+this.publishedYear);
		System.out.println("language : "+this.language);
		System.out.println("price : "+this.price);
		System.out.println("material : "+this.material);
		System.out.println("size : "+this.size);
		System.out.println("waterproof : "+this.waterproof);
		System.out.println("format : "+this.format);
		System.out.println("projection : "+this.projection);
		System.out.println("colorScheme : "+this.colorScheme);
		System.out.println("usage : "+this.usage);
		System.out.println("country : "+this.country);
		System.out.println("edition : "+this.edition);
		System.out.println("isbn : "+this.isbn);
		System.out.println("packaging : "+this.packaging);
		System.out.println("digitalVersion : "+this.digitalVersion);
		System.out.println("theme : "+this.theme);
	}

}