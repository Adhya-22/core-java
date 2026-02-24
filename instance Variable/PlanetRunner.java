class PlanetRunner
{
	public static void main(String[] args)
	{
		Planet planet1=new Planet();
		System.out.println("Planet 1 mass : "+planet1.mass);
		System.out.println("Planet 1 hasRings : "+planet1.hasRings);
		System.out.println("Planet 1 name : "+planet1.name);
		System.out.println("Planet 1 radius : "+planet1.radius);
		planet1.radius=6371;
		planet1.name="Earth";
		planet1.mass=5.97;
		planet1.hasRings=false;
		System.out.println("After Update :");
		System.out.println("Planet 1 mass : "+planet1.mass);
		System.out.println("Planet 1 hasRings : "+planet1.hasRings);
		System.out.println("Planet 1 name : "+planet1.name);
		System.out.println("Planet 1 radius : "+planet1.radius);
		
		Planet planet2=new Planet();
		System.out.println("Planet 2 mass : "+planet2.mass);
		System.out.println("Planet 2 hasRings : "+planet2.hasRings);
		System.out.println("Planet 2 name : "+planet2.name);
		System.out.println("Planet 2 radius : "+planet2.radius);
		planet2.radius=2438;
		planet2.name="Mercury";
		planet2.mass=0.33;
		planet2.hasRings=false;
		System.out.println("After Update :");
		System.out.println("Planet 2 mass : "+planet2.mass);
		System.out.println("Planet 2 hasRings : "+planet2.hasRings);
		System.out.println("Planet 2 name : "+planet2.name);
		System.out.println("Planet 2 radius : "+planet2.radius);
		
		Planet planet3=new Planet();
		System.out.println("Planet 3 mass : "+planet3.mass);
		System.out.println("Planet 3 hasRings : "+planet3.hasRings);
		System.out.println("Planet 3 name : "+planet3.name);
		System.out.println("Planet 3 radius : "+planet3.radius);
		planet3.radius=6052;
		planet3.name="Venus";
		planet3.mass=4.87;
		planet3.hasRings=false;
		System.out.println("After Update :");
		System.out.println("Planet 3 mass : "+planet3.mass);
		System.out.println("Planet 3 hasRings : "+planet3.hasRings);
		System.out.println("Planet 3 name : "+planet3.name);
		System.out.println("Planet 3 radius : "+planet3.radius);
		
		Planet planet4=new Planet();
		System.out.println("Planet 4 mass : "+planet4.mass);
		System.out.println("Planet 4 hasRings : "+planet4.hasRings);
		System.out.println("Planet 4 name : "+planet4.name);
		System.out.println("Planet 4 radius : "+planet4.radius);
		planet4.radius=560268;
		planet4.name="Saturn";
		planet4.mass=56846;
		planet4.hasRings=true;
		System.out.println("After Update :");
		System.out.println("Planet 4 mass : "+planet4.mass);
		System.out.println("Planet 4 hasRings : "+planet4.hasRings);
		System.out.println("Planet 4 name : "+planet4.name);
		System.out.println("Planet 4 radius : "+planet4.radius);
		
		Planet planet5=new Planet();
		System.out.println("Planet 5 mass : "+planet5.mass);
		System.out.println("Planet 5 hasRings : "+planet5.hasRings);
		System.out.println("Planet 5 name : "+planet5.name);
		System.out.println("Planet 5 radius : "+planet5.radius);
		planet5.radius=71492;
		planet5.name="Jupiter";
		planet5.mass=189860;
		planet5.hasRings=true;
		System.out.println("After Update :");
		System.out.println("Planet 5 mass : "+planet5.mass);
		System.out.println("Planet 5 hasRings : "+planet5.hasRings);
		System.out.println("Planet 5 name : "+planet5.name);
		System.out.println("Planet 5 radius : "+planet5.radius);
		
	}
}