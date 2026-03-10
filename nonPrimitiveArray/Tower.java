class Tower
{
	double[] heights;
	Floor[] floors;
	
	Tower(double[] heights,Floor[] floors)
	{
		this.heights=heights;
		this.floors=floors;
	}
	
	void getInfo()
	{
		System.out.println("Executing getInfo in Tower..");
		for(double height:heights)
		{
			System.out.println("Tower height : "+height);
		}
		if(this.floors!=null)
		{
			System.out.println("total Floors : "+this.floors.length);
			for(Floor floor:this.floors)
			{
				floor.display();
			}
		}
	}
}