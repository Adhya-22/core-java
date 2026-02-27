class Google 
{
    String name;
    String founder;
    int foundedYear;
    String ceo;
    String headquarters;
    String searchEngine;
    String emailService;
    String cloudService;
    String os;
    String browser;
    int employeeCount;
    double revenue;
    boolean publicCompany;
    String parentCompany;
    String aiPlatform;
    String videoPlatform;
    String mapService;
    String appStore;
    String languageSupport;
    String stockSymbol;
	
	Google(String name,String founder,int foundedYear,String ceo,String headquarters,String searchEngine,
	String emailService,String cloudService,String os,String browser,int employeeCount,double revenue,
	boolean publicCompany,String parentCompany,String aiPlatform,String videoPlatform,String mapService,
	String appStore,String languageSupport,String stockSymbol)
	{
		this.name=name;
		this.founder=founder;
		this.foundedYear=foundedYear;
		this.ceo=ceo;
		this.headquarters=headquarters;
		this.searchEngine=searchEngine;
		this.emailService=emailService;
		this.cloudService=cloudService;
		this.os=os;
		this.browser=browser;
		this.employeeCount=employeeCount;
		this.revenue=revenue;
		this.publicCompany=publicCompany;
		this.parentCompany=parentCompany;
		this.aiPlatform=aiPlatform;
		this.videoPlatform=videoPlatform;
		this.mapService=mapService;
		this.appStore=appStore;
		this.languageSupport=languageSupport;
		this.stockSymbol=stockSymbol;
	}
	
	void getInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Founder : "+this.founder);
		System.out.println("FOunded year : "+this.foundedYear);
		System.out.println("CEO : "+this.ceo);
		System.out.println("Headquaters : "+this.headquarters);
		System.out.println("Search Engine : "+this.searchEngine);
		System.out.println("Email Service : "+this.emailService);
		System.out.println("OS : "+this.os);
		System.out.println("Browser : "+this.browser);
		System.out.println("Employee Count : "+this.employeeCount);
		System.out.println("Revenue : "+this.revenue);
		System.out.println("Public Company : "+this.publicCompany);
		System.out.println("Parent Company : "+this.parentCompany);
		System.out.println("AI platform : "+this.aiPlatform);
		System.out.println("Video Platform : "+this.videoPlatform);
		System.out.println("Map Services : "+this.mapService);
		System.out.println("App Store : "+this.appStore);
		System.out.println("Languages Support : "+this.languageSupport);
		System.out.println("Stock Symbol : "+this.stockSymbol);
	}
}

