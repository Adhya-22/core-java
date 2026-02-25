class BatteryRunner
{
	public static void main(String[] args)
	{
		Battery battery1=new Battery();
		
		Battery battery2=new Battery("Duracell");
		System.out.println("Battery 2 info...");
		System.out.println("brand : "+battery2.brand);
		
		Battery battery3=new Battery("Eveready","AAA");
		System.out.println("Battery 3 info...");
		System.out.println("brand : "+battery3.brand);
		System.out.println("type : "+battery3.type);
		
		Battery battery4=new Battery("Amaron","Lithium",3000);
		System.out.println("Battery 4 info...");
		System.out.println("brand : "+battery4.brand);
		System.out.println("type : "+battery4.type);
		System.out.println("capacity : "+battery4.capacity);
		
		Battery battery5=new Battery("Panasonic","C",2000,1.2);
		System.out.println("Battery 5 info...");
		System.out.println("brand : "+battery5.brand);
		System.out.println("type : "+battery5.type);
		System.out.println("capacity : "+battery5.capacity);
		System.out.println("voltage : "+battery5.voltage);
		
		Battery battery6=new Battery("Sony","D",3500,1.5,false);
		System.out.println("Battery 6 info...");
		System.out.println("brand : "+battery6.brand);
		System.out.println("type : "+battery6.type);
		System.out.println("capacity : "+battery6.capacity);
		System.out.println("voltage : "+battery6.voltage);
		System.out.println("isRechargeable : "+battery6.isRechargeable);

	}
}