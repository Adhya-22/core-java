class StandRunner
{
	public static void main(String[] args)
	{
		Stand stand1 = new Stand("TV Stand","Wood","Brown",120.0,60.0,20.0,8000.0,"IKEA",false,
		"Living Room",5,"Modern","Rectangle","Sweden","Box",false,"Matte","50kg","ST01","IKEA");
		stand1.getInfo();

		Stand stand2 = new Stand("Laptop Stand","Metal","Black",30.0,25.0,2.0,1500.0,"Portronics",
		true,"Office",2,"Minimal","Rectangle","India","Box",true,"Glossy","10kg","ST02","Portronics");
		stand2.getInfo(); 
		
		Stand stand3 = new Stand("Mobile Stand","Plastic","White",15.0,10.0,0.5,300.0,"Boat",true,
		"Desk",1,"Simple","Square","India","Packet",true,"Matte","2kg","ST03","Boat");
		stand3.getInfo();
		
		Stand stand4 = new Stand("Mic Stand","Steel","Black",180.0,40.0,5.0,2500.0,"Yamaha",false,
		"Studio",3,"Professional","Round","Japan","Box",true,"Matte","15kg","ST04","Yamaha");
		stand4.getInfo();
		
		Stand stand5 = new Stand("Flower Stand","Iron","Golden",100.0,35.0,8.0,3500.0,"HomeStyle",
		false,"Decoration",2,"Classic","Circle","India","Box",false,"Glossy","20kg","ST05","HomeStyle");
		stand5.getInfo();
		
		Stand stand6 = new Stand("Speaker Stand","Wood","Black",90.0,30.0,6.0,4000.0,"Sony",false,
		"Audio Setup",4,"Modern","Rectangle","Japan","Box",false,"Matte","25kg","ST06","Sony");
		stand6.getInfo();
		
		Stand stand7 = new Stand("Book Stand","Plastic","Blue",25.0,20.0,1.0,500.0,"Classmate",true,
		"Study",1,"Simple","Rectangle","India","Packet",true,"Matte","5kg","ST07","Classmate");
		stand7.getInfo();
		
		Stand stand8 = new Stand("Keyboard Stand","Steel","Black",70.0,50.0,7.0,3000.0,"Casio",true,
		"Music",3,"Professional","X Shape","Japan","Box",true,"Matte","30kg","ST08","Casio");
		stand8.getInfo();
		
		Stand stand9 = new Stand("Camera Stand","Aluminium","Grey",160.0,40.0,3.0,4500.0,"Canon",
        true,"Photography",2,"Compact","Tripod","Japan","Bag",true,"Matte","12kg","ST09","Canon");
		stand9.getInfo();
		
		Stand stand10 = new Stand("Shoe Stand","Wood","Brown",80.0,70.0,15.0,6000.0,"HomeCenter",
        false,"Home",5,"Modern","Rectangle","India","Box",false,"Matte","40kg","ST10","HomeCenter");
		stand10.getInfo();
	}
}

