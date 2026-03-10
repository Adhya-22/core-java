class TowerRunner
{
	public static void main(String[] args)
	{
		double[] height={25,50,34};
		
		Floor floor1=new Floor(12);
		Floor floor2=new Floor(17);
		Floor floor3=new Floor(15);
		
		Floor[] floors={floor1,floor2,floor3};
		
		Tower tower=new Tower(height,floors);
		tower.getInfo();
	}
}