class TrackRunner
{
	public static void main(String[] args)
	{
		Track track1=new Track();
		
		Track track2=new Track("Olympic");
		System.out.println("Track 2 info...");
		System.out.println("name : "+track2.name);
		
		Track track3=new Track("National",350);
		System.out.println("Track 3 info...");
		System.out.println("name : "+track3.name);
		System.out.println("length : "+track3.length);
		
		Track track4=new Track("City",300,"Grass");
		System.out.println("Track 4 info...");
		System.out.println("name : "+track4.name);
		System.out.println("length : "+track4.length);
		System.out.println("surfaceType : "+track4.surfaceType);
		
		Track track5=new Track("School",200,"Mud","Chennai");
		System.out.println("Track 5 info...");
		System.out.println("name : "+track5.name);
		System.out.println("length : "+track5.length);
		System.out.println("surfaceType : "+track5.surfaceType);
		System.out.println("location : "+track5.location);
		
		Track track6=new Track("Training",450,"Synthetic","Hyderabad",8);
		System.out.println("Track 6 info...");
		System.out.println("name : "+track6.name);
		System.out.println("length : "+track6.length);
		System.out.println("surfaceType : "+track6.surfaceType);
		System.out.println("location : "+track6.location);
		System.out.println("numberOfLanes : "+track6.numberOfLanes);

	}
}