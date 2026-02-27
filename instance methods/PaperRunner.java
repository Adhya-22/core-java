class PaperRunner
{
	public static void main(String[] args)
	{
		Paper paper1 = new Paper("A4","210x297mm","White","JK",0.1,80.0,350.0,"Smooth",true,
		"Printing",500,"Matte","JK Mills","India",false,"Premium","Ream","80 GSM","Rectangle","Dry Place");
		paper1.getInfo();

		Paper paper2 = new Paper("A3","297x420mm","White","B2B",0.12,100.0,450.0,"Smooth",false,
		"Drawing",250,"Glossy","B2B Pvt Ltd","India",false,"Standard","Pack","100 GSM","Rectangle","Cool Place");
		paper2.getInfo();
		
		Paper paper3 = new Paper("Chart","Large","Pink","Classmate",0.2,120.0,50.0,"Rough",false,
		"Project",10,"Matte","ITC","India",false,"Good","Sheet","120 GSM","Rectangle","Dry Area");
		paper3.getInfo();
		
		Paper paper4 = new Paper("Bond","A4","Cream","Navneet",0.15,90.0,400.0,"Smooth",true,
		"Office",500,"Matte","Navneet Ltd","India",false,"Premium","Ream","90 GSM","Rectangle","Dry Place");
		paper4.getInfo();
		
		Paper paper5 = new Paper("Glossy","A4","White","HP",0.18,130.0,600.0,"Glossy",false,
		"Photo",100,"Glossy","HP Inc","USA",true,"High","Pack","130 GSM","Rectangle","Cool Storage");
		paper5.getInfo();
		
		Paper paper6 = new Paper("Craft","A2","Brown","Local",0.25,150.0,300.0,"Rough",true,
		"Craft Work",200,"Matte","Local Supplier","India",false,"Standard","Bundle","150 GSM","Rectangle","Dry Place");
		paper6.getInfo();
		
		Paper paper7 = new Paper("CardSheet","A4","Blue","Camel",0.3,180.0,500.0,"Hard",false,
		"Card Making",100,"Matte","Camel Pvt Ltd","India",false,"Premium","Pack","180 GSM","Rectangle","Dry Area");
		paper7.getInfo();
		
		Paper paper8 = new Paper("Tracing","A4","Transparent","Artist",0.05,60.0,250.0,"Smooth",
		false,"Design",50,"Matte","Art Corp","India",false,"Good","Pack","60 GSM","Rectangle","Cool Place");
		paper8.getInfo();
		
		Paper paper9 = new Paper("Newsprint","Large","Grey","Times",0.08,70.0,200.0,"Rough",true,
		"Newspaper",1000,"Matte","Times Group","India",false,"Standard","Bundle","70 GSM","Rectangle","Dry Storage");
		paper9.getInfo();
		
		Paper paper10 = new Paper("Sticker","A4","White","LabelCo",0.2,120.0,450.0,"Glossy",false,
		"Labels",100,"Glossy","LabelCo Ltd","India",true,"High","Pack","120 GSM","Rectangle","Cool Storage");
		paper10.getInfo();
	}
}