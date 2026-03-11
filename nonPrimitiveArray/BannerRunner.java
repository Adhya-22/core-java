class BannerRunner
{
	public static void main(String[] args)
	{
		char[] sizes={'S','M','L'};
		
		Occasion occasion1=new Occasion("Shop Opening");
		Occasion occasion2=new Occasion("Wedding");
		Occasion occasion3=new Occasion("Birthday");
		
		Occasion[] occasions={occasion1,occasion2,occasion3};
		
		Banner banner=new Banner(sizes,occasions);
		banner.getInfo();
	}
}