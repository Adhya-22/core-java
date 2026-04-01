class StageRunner
{
	public static void main(String... args)
	{
		ConcertStage concertStage1=new ConcertStage();
		System.out.println("height : "+concertStage1.height);
		System.out.println("width : "+concertStage1.width);
		System.out.println("has VIP Section : "+concertStage1.hasVIPSection);
		
		System.out.println();
		
		ConcertStage concertStage2=new ConcertStage(40,200,true);
		System.out.println("height : "+concertStage2.height);
		System.out.println("width : "+concertStage2.width);
		System.out.println("has VIP Section : "+concertStage2.hasVIPSection);
		
		System.out.println();
		
		ConcertStage concertStage3=new ConcertStage(false);
		System.out.println("height : "+concertStage3.height);
		System.out.println("width : "+concertStage3.width);
		System.out.println("has VIP Section : "+concertStage3.hasVIPSection);
	}
}