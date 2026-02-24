class Bird
{
	static String[] getColorByName(String name)
	{
		System.out.println("Executing getColorByName in bird... Name : "+name);
		if(name==null)
		{
			System.out.println("Name cannot be null");
			return null;
		}
		
		if(name=="Peacock")
		{
			String[] peacockColor={"Blue","Green","Gold"};
			return peacockColor;
		}
		if(name=="Parrot")
		{
			String[] parrotColor={"Green","Red"};
			return parrotColor;
		}
		if(name=="Kingfisher")
		{
			String[] kingfisherColor={"Blue","Orange"};
			return kingfisherColor;
		}
		if(name=="Crow")
		{
			String[] crowColor={"Black","Grey"};
			return crowColor;
		}
		if(name=="Sparrow")
		{
			String[] sparrowColor={"Brown","White"};
			return sparrowColor;
		}
		if(name=="Flamingo")
		{
			String[] flamingoColor={"Pink"};
			return flamingoColor;
		}
		if(name=="Pigeon")
		{
			String[] pigeonColor={"Grey","Green","Purple"};
			return pigeonColor;
		}
		if(name=="Eagle")
		{
			String[] eagleColor={"Brown","Gold"};
			return eagleColor;
		}
		if(name=="Owl")
		{
			String[] owlColor={"Brown","White"};
			return owlColor;
		}
		if(name=="WoodPecker")
		{
			String[] woodPeckerColor={"Red","Yellow","Black"};
			return woodPeckerColor;
		}
		if(name=="Humming Bird")
		{
			String[] hummingBirdColor={"Green","Red"};
			return hummingBirdColor;
		}
		if(name=="Swan")
		{
			String[] swanColor={"White"};
			return swanColor;
		}
		if(name=="Duck")
		{
			String[] duckColor={"Brown","Green","White"};
			return duckColor;
		}
		if(name=="Robin")
		{
			String[] robinColor={"Orange","Brown"};
			return robinColor;
		}
		if(name=="Toucan")
		{
			String[] toucanColor={"Black","Yellow","Orange"};
			return toucanColor;
		}
		if(name=="Penguin")
		{
			String[] penguinColor={"Black","White","Yellow"};
			return penguinColor;
		}
		if(name=="Heron")
		{
			String[] heronColor={"Grey","White"};
			return heronColor;
		}
		if(name=="Canary")
		{
			String[] canaryColor={"Yellow"};
			return canaryColor;
		}
		if(name=="Macaw")
		{
			String[] macawColor={"Blue","Yellow"};
			return macawColor;
		}
		if(name=="Hoopoe")
		{
			String[] macawColor={"Brown","Black","White"};
			return macawColor;
		}
		System.out.println("Name does not match DataBase.");
		
		return null;
	}
	
	static int getLifeSpanByName(String name)
	{
		System.out.println("Executing getLifeSpanByName in bird... Name : "+name);
		if(name==null)
		{
			System.out.println("Name cannot be null");
			return -1;
		}
		
		if(name=="Peacock")
		{
			return 18;
		}
		if(name=="Parrot")
		{
			return 25;
		}
		if(name=="Kingfisher")
		{
			return 8;
		}
		if(name=="Crow")
		{
			return 18;
		}
		if(name=="Sparrow")
		{
			return 4;
		}
		if(name=="Flamingo")
		{
			return 25;
		}
		if(name=="Pigeon")
		{
			return 10;
		}
		if(name=="Eagle")
		{
			return 25;
		}
		if(name=="Owl")
		{
			return 12;
		}
		if(name=="WoodPecker")
		{
			return 10;
		}
		if(name=="Humming Bird")
		{
			return 4;
		}
		if(name=="Swan")
		{
			return 25;
		}
		if(name=="Duck")
		{
			return 8;
		}
		if(name=="Robin")
		{
			return 5;
		}
		if(name=="Toucan")
		{
			return 18;
		}
		if(name=="Penguin")
		{
			return 18;
		}
		if(name=="Heron")
		{
			return 20;
		}
		if(name=="Canary")
		{
			return 12;
		}
		if(name=="Macaw")
		{
			return 40;
		}
		if(name=="Hoopoe")
		{
			return 9;
		}
		System.out.println("Name does not match DataBase.");
		
		return -1;
	}
}