class CapStoreRunner
{
	public static void main(String[] args)
	{
		Cap[] caps=new Cap[10];
		
		CapStore capStore=new CapStore(caps);
		
		Cap cap1=new Cap("Puma","Orange","Baseball",200,"cotton",true);
		capStore.save(cap1);
		
		Cap cap2=new Cap("Adidas","Black","Snapback",300,"Polyster",true);
		capStore.save(cap2);
		
		Cap cap3=new Cap("Urban Monkey","Grey","Baseball",350,"Nylon",true);
		capStore.save(cap3);
		
		Cap cap4=new Cap("Reebok","White","Snapback",250,"Wool",false);
		capStore.save(cap4);
		
		Cap cap5=new Cap("Wax London","Black","Baseball",400,"cotton",true);
		capStore.save(cap5);
		
		Cap cap6=new Cap("Urban Monkey","Purple","Snapback",230,"Polyster",true);
		capStore.save(cap6);
		
		Cap cap7=new Cap("New Era","Green","Baseball",299,"Nylon",false);
		capStore.save(cap7);
		
		Cap cap8=new Cap("Adidas","Blue","Snapback",439,"Wool",true);
		capStore.save(cap8);
		
		Cap cap9=new Cap("Puma","Beige","Baseball",500,"Polyster",false);
		capStore.save(cap9);
		
		Cap cap10=new Cap("Reebok","Black","Snapback",320,"Nylon",true);
		capStore.save(cap10);
	}
}