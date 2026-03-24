class FestivalStoreRunner
{
	public static void main(String[] args)
	{
		Festival[] festivals=new Festival[10];
		
		FestivalStore festivalStore=new FestivalStore(festivals);
		
		Festival festival1=new Festival("Diwali","01-11-2026","Hindu",5,true);
		festivalStore.save(festival1);
		
		Festival festival2=new Festival("Eid","10-04-2026","Muslim",3,true);
		festivalStore.save(festival2);
		
		Festival festival3=new Festival("Christmas","25-12-2026","Christian",2,true);
		festivalStore.save(festival3);
		
		Festival festival4=new Festival("Pongal","14-01-2026","Hindu",4,true);
		festivalStore.save(festival4);
		
		Festival festival5=new Festival("Ugadi","09-04-2026","Hindu",1,true);
		festivalStore.save(festival5);
		
		Festival festival6=new Festival("Holi","18-03-2026","Hindu",2,true);
		festivalStore.save(festival6);
		
		Festival festival7=new Festival("Onam","06-09-2026","Hindu",10,true);
		festivalStore.save(festival7);
		
		Festival festival8=new Festival("Bakrid","17-06-2026","Muslim",2,true);
		festivalStore.save(festival8);
		
		Festival festival9=new Festival("Good Friday","29-03-2026","Christian",1,true);
		festivalStore.save(festival9);
		
		Festival festival10=new Festival("Ganesh Chaturthi","07-09-2026","Hindu",10,true);
		festivalStore.save(festival10);
	}
}