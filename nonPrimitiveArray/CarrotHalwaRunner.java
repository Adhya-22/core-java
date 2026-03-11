class CarrotHalwaRunner
{
	public static void main(String[] args)
	{
		double[] quantities={250,500,100};
		
		DryFruit dryFruit1=new DryFruit("Cashew");
		DryFruit dryFruit2=new DryFruit("Almond");
		DryFruit dryFruit3=new DryFruit("Pista");
		
		DryFruit[] dryFruits={dryFruit1,dryFruit2,dryFruit3};
		
		CarrotHalwa carrotHalwa=new CarrotHalwa(quantities,dryFruits);
		carrotHalwa.getInfo();
	}
}