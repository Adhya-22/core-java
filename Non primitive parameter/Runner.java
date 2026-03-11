class Runner
{
	public static void main(String[] args)
	{
		Battery battery=new Battery("AAA");
		Cable cable=new Cable(4);
		MousePad mousePad=new MousePad("Smooth");
		ScrollWheel scrollWheel=new ScrollWheel(true);
		Led led=new Led(3.3);
		
		Mouse mouse=new Mouse("Razer",399,false,true,"black",battery,cable,mousePad,scrollWheel,led);
		mouse.getInfo();
		
		Extension extention=new Extension(".txt");
		Storage storage=new Storage("C");
		Folder folder=new Folder("Internship");
		Owner owner=new Owner("Adhya");
		Date date=new Date(2026);
		
		File file=new File("File",2333,true,false,false,extention,storage,folder,owner,date);
		file.getInfo();
		
		Teeth teeth=new Teeth("Canine");
		Cub cub=new Cub('F');
		Prey prey=new Prey("Deer");
		Habitat habitat=new Habitat("GrassLand");
		Tail tail=new Tail(false);
		
		Lion lion=new Lion("Simba",15,87,'M',true,teeth,cub,prey,habitat,tail);
		lion.getInfo();
		
		Rotor rotor=new Rotor(2);
		Stator stator=new Stator(250);
		Gear gear=new Gear("Helical");
		Bearing bearing=new Bearing("Plastic");
		CoolingFan coolingFan=new CoolingFan(3);
		
		Motor motor=new Motor("Invento",299,87.5f,3,true,rotor,stator,gear,bearing,coolingFan);
		motor.getInfo();
		
		Team team=new Team("RCB");
		Trophy trophy=new Trophy(7);
		Player player=new Player("Virat Kohli");
		Stadium stadium=new Stadium("Chinnaswamy");
		Umpire umpire=new Umpire("Abhijeet Bhattacharya");
		
		Ipl ipl=new Ipl(18,10,"TATA",true,true,team,trophy,player,stadium,umpire);
		ipl.getInfo();
		
		Customer customer=new Customer("Sanjana");
		Massage massage=new Massage("Full Body");
		Oil oil=new Oil("Vanilla");
		Room room=new Room(4);
		
		Spa spa=new Spa("Lakme",3,500,7,true,customer,owner,massage,oil,room);
		
		TeaGrain teaGrain=new TeaGrain(true);
		Cup cup=new Cup("Glass");
		Milk milk=new Milk("Almond");
		Sugar sugar=new Sugar(false);
		Kettle kettle=new Kettle(1.5);
		
		Tea tea=new Tea(15,73,"India",true,"Ginger",teaGrain,cup,milk,sugar,kettle);
		tea.getInfo();
		
		Handle handle=new Handle("Rope");
		Metal metal=new Metal("Bronze alloy");
		Striker striker=new Striker("wood");
		Stand stand=new Stand(4);
		Sound sound=new Sound(500);
		
		Bell bell=new Bell("Flared Cup",true,"High",true,"Copper",handle,metal,striker,stand,sound);
		bell.getInfo();
		
		Fish fish=new Fish("Gold");
		Water water=new Water(true);
		Plant plant=new Plant(2);
		Light light=new Light(true);
		Filter filter=new Filter("Dophin");
		
		Aquarium aquarium=new Aquarium(3,"Bowl",4,true,true,fish,water,plant,light,filter);
		aquarium.getInfo();
		
		Strategy strategy=new Strategy(true);
		TrainingSession trainingSession=new TrainingSession(12);
		
		Coach coach=new Coach("Dinesh Karthik",4,500000,true,false,team,player,strategy,trainingSession,stadium);
		coach.getInfo();
		
		WaterDroplet waterDroplet=new WaterDroplet("High");
		Moisture moisture=new Moisture(63);
		Wind wind=new Wind(30);
		Temperature temperature=new Temperature(false);
		Rain rain=new Rain(3);
		
		Cloud cloud=new Cloud(67,1200,true,'H',"thick",waterDroplet,moisture,wind,temperature,rain);
		cloud.getInfo();
		
	}
}