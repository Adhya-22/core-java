class Runner
{
	public static void main(String[] args)
	{
		Battery battery=new Battery("AAA");
		battery.getInfo();
		Cable cable=new Cable(4);
		cable.getInfo();
		MousePad mousePad=new MousePad("Smooth");
		mousePad.getInfo();
		ScrollWheel scrollWheel=new ScrollWheel(true);
		scrollWheel.getInfo();
		Led led=new Led(3.3);
		led.getInfo();
		
		Mouse mouse=new Mouse("Razer",399,false,true,"black",battery,cable,mousePad,scrollWheel,led);
		mouse.getInfo();
		
		Extension extention=new Extension(".txt");
		extention.getInfo();
		Storage storage=new Storage("C");
		storage.getInfo();
		Folder folder=new Folder("Internship");
		folder.getInfo();
		Owner owner=new Owner("Adhya");
		owner.getInfo();
		Date date=new Date(2026);
		date.getInfo();
		
		File file=new File("File",2333,true,false,false,extention,storage,folder,owner,date);
		file.getInfo();
		
		Teeth teeth=new Teeth("Canine");
		teeth.getInfo();
		Cub cub=new Cub('F');
		cub.getInfo();
		Prey prey=new Prey("Deer");
		prey.getInfo();
		Habitat habitat=new Habitat("GrassLand");
		habitat.getInfo();
		Tail tail=new Tail(false);
		tail.getInfo();
		
		Lion lion=new Lion("Simba",15,87,'M',true,teeth,cub,prey,habitat,tail);
		lion.getInfo();
		
		Rotor rotor=new Rotor(2);
		rotor.getInfo();
		Stator stator=new Stator(250);
		stator.getInfo();
		Gear gear=new Gear("Helical");
		gear.getInfo();
		Bearing bearing=new Bearing("Plastic");
		bearing.getInfo();
		CoolingFan coolingFan=new CoolingFan(3);
		coolingFan.getInfo();
		
		Motor motor=new Motor("Invento",299,87.5f,3,true,rotor,stator,gear,bearing,coolingFan);
		motor.getInfo();
		
		Team team=new Team("RCB");
		team.getInfo();
		Trophy trophy=new Trophy(7);
		trophy.getInfo();
		Player player=new Player("Virat Kohli");
		player.getInfo();
		Stadium stadium=new Stadium("Chinnaswamy");
		stadium.getInfo();
		Umpire umpire=new Umpire("Abhijeet Bhattacharya");
		umpire.getInfo();
		
		Ipl ipl=new Ipl(18,10,"TATA",true,true,team,trophy,player,stadium,umpire);
		ipl.getInfo();
		
		Customer customer=new Customer("Sanjana");
		customer.getInfo();
		Massage massage=new Massage("Full Body");
		massage.getInfo();
		Oil oil=new Oil("Vanilla");
		oil.getInfo();
		Room room=new Room(4);
		room.getInfo();
		
		Spa spa=new Spa("Lakme",3,500,7,true,customer,owner,massage,oil,room);
		spa.getInfo();
		
		TeaGrain teaGrain=new TeaGrain(true);
		teaGrain.getInfo();
		Cup cup=new Cup("Glass");
		cup.getInfo();
		Milk milk=new Milk("Almond");
		milk.getInfo();
		Sugar sugar=new Sugar(false);
		sugar.getInfo();
		Kettle kettle=new Kettle(1.5);
		kettle.getInfo();
		
		Tea tea=new Tea(15,73,"India",true,"Ginger",teaGrain,cup,milk,sugar,kettle);
		tea.getInfo();
		
		Handle handle=new Handle("Rope");
		handle.getInfo();
		Metal metal=new Metal("Bronze alloy");
		metal.getInfo();
		Striker striker=new Striker("wood");
		striker.getInfo();
		Stand stand=new Stand(4);
		stand.getInfo();
		Sound sound=new Sound(500);
		sound.getInfo();
		
		Bell bell=new Bell("Flared Cup",true,"High",true,"Copper",handle,metal,striker,stand,sound);
		bell.getInfo();
		
		Fish fish=new Fish("Gold");
		fish.getInfo();
		Water water=new Water(true);
		water.getInfo();
		Plant plant=new Plant(2);
		plant.getInfo();
		Light light=new Light(true);
		light.getInfo();
		Filter filter=new Filter("Dophin");
		filter.getInfo();
		
		Aquarium aquarium=new Aquarium(3,"Bowl",4,true,true,fish,water,plant,light,filter);
		aquarium.getInfo();
		
		Strategy strategy=new Strategy(true);
		strategy.getInfo();
		TrainingSession trainingSession=new TrainingSession(12);
		trainingSession.getInfo();
		
		Coach coach=new Coach("Dinesh Karthik",4,500000,true,false,team,player,strategy,trainingSession,stadium);
		coach.getInfo();
		
		WaterDroplet waterDroplet=new WaterDroplet("High");
		waterDroplet.getInfo();
		Moisture moisture=new Moisture(63);
		moisture.getInfo();
		Wind wind=new Wind(30);
		wind.getInfo();
		Temperature temperature=new Temperature(false);
		temperature.getInfo();
		Rain rain=new Rain(3);
		rain.getInfo();
		
		Cloud cloud=new Cloud(67,1200,true,'H',"thick",waterDroplet,moisture,wind,temperature,rain);
		cloud.getInfo();
		
	}
}