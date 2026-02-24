class MovieRunner
{
	public static void main(String[] args)
	{
		Movie movie1=new Movie();
		System.out.println("Movie 1 rating : "+movie1.rating);
		System.out.println("Movie 1 director : "+movie1.director);
		System.out.println("Movie 1 title : "+movie1.title);
		System.out.println("Movie 1 durationMinutes : "+movie1.durationMinutes);
		movie1.durationMinutes=160;
		movie1.title="3 Idiots";
		movie1.rating=10;
		movie1.director="Rajkumar Hirani";
		System.out.println("After Update :");
		System.out.println("Movie 1 rating : "+movie1.rating);
		System.out.println("Movie 1 director : "+movie1.director);
		System.out.println("Movie 1 title : "+movie1.title);
		System.out.println("Movie 1 durationMinutes : "+movie1.durationMinutes);
		
		Movie movie2=new Movie();
		System.out.println("Movie 2 rating : "+movie2.rating);
		System.out.println("Movie 2 director : "+movie2.director);
		System.out.println("Movie 2 title : "+movie2.title);
		System.out.println("Movie 2 durationMinutes : "+movie2.durationMinutes);
		movie2.durationMinutes=170;
		movie2.title="KGF";
		movie2.rating=8;
		movie2.director="Prashaanth Neel";
		System.out.println("After Update :");
		System.out.println("Movie 2 rating : "+movie2.rating);
		System.out.println("Movie 2 director : "+movie2.director);
		System.out.println("Movie 2 title : "+movie2.title);
		System.out.println("Movie 2 durationMinutes : "+movie2.durationMinutes);
		
		Movie movie3=new Movie();
		System.out.println("Movie 3 rating : "+movie3.rating);
		System.out.println("Movie 3 director : "+movie3.director);
		System.out.println("Movie 3 title : "+movie3.title);
		System.out.println("Movie 3 durationMinutes : "+movie3.durationMinutes);
		movie3.durationMinutes=130;
		movie3.title="Uggramm";
		movie3.rating=9;
		movie3.director="Prashaanth Neel";
		System.out.println("After Update :");
		System.out.println("Movie 3 rating : "+movie3.rating);
		System.out.println("Movie 3 director : "+movie3.director);
		System.out.println("Movie 3 title : "+movie3.title);
		System.out.println("Movie 3 durationMinutes : "+movie3.durationMinutes);
		
		Movie movie4=new Movie();
		System.out.println("Movie 4 rating : "+movie4.rating);
		System.out.println("Movie 4 director : "+movie4.director);
		System.out.println("Movie 4 title : "+movie4.title);
		System.out.println("Movie 4 durationMinutes : "+movie4.durationMinutes);
		movie4.durationMinutes=140;
		movie4.title="Simple Agi Ond Love Story";
		movie4.rating=7;
		movie4.director="Suni";
		System.out.println("After Update :");
		System.out.println("Movie 4 rating : "+movie4.rating);
		System.out.println("Movie 4 director : "+movie4.director);
		System.out.println("Movie 4 title : "+movie4.title);
		System.out.println("Movie 4 durationMinutes : "+movie4.durationMinutes);
		
		Movie movie5=new Movie();
		System.out.println("Movie 5 rating : "+movie5.rating);
		System.out.println("Movie 5 director : "+movie5.director);
		System.out.println("Movie 5 title : "+movie5.title);
		System.out.println("Movie 5 durationMinutes : "+movie5.durationMinutes);
		movie5.durationMinutes=180;
		movie5.title="RRR";
		movie5.rating=9;
		movie5.director="SS Rajamouli";
		System.out.println("After Update :");
		System.out.println("Movie 5 rating : "+movie5.rating);
		System.out.println("Movie 5 director : "+movie5.director);
		System.out.println("Movie 5 title : "+movie5.title);
		System.out.println("Movie 5 durationMinutes : "+movie5.durationMinutes);
		
	}
}