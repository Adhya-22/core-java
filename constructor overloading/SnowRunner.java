class SnowRunner
{
	public static void main(String[] args)
	{
		Snow snow1=new Snow();
		
		Snow snow2=new Snow(-5);
		System.out.println("Snow 2 info...");
		System.out.println("temperature : "+snow2.temperature);
		
		Snow snow3=new Snow(-2,"Wet");
		System.out.println("Snow 3 info...");
		System.out.println("temperature : "+snow3.temperature);
		System.out.println("type : "+snow3.type);
		
		Snow snow4=new Snow(-8,"Ice",15);
		System.out.println("Snow 4 info...");
		System.out.println("temperature : "+snow4.temperature);
		System.out.println("type : "+snow4.type);
		System.out.println("thickness : "+snow4.thickness);
		
		Snow snow5=new Snow(-1,"Slush",4,"Sikkim");
		System.out.println("Snow 5 info...");
		System.out.println("temperature : "+snow5.temperature);
		System.out.println("type : "+snow5.type);
		System.out.println("thickness : "+snow5.thickness);
		System.out.println("location : "+snow5.location);
		
		Snow snow6=new Snow(-6,"Dry",12,"Ladakh",false);
		System.out.println("Snow 6 info...");
		System.out.println("temperature : "+snow6.temperature);
		System.out.println("type : "+snow6.type);
		System.out.println("thickness : "+snow6.thickness);
		System.out.println("location : "+snow6.location);
		System.out.println("isMelting : "+snow6.isMelting);

	}
}