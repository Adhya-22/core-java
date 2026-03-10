class BrokerRunner
{
	public static void main(String[] args)
	{
		String[] names={"Suraj","Mahesh","Nandhan"};
		
		Deal deals1=new Deal("House");
		Deal deals2=new Deal("Land");
		Deal deals3=new Deal("Vehicle");
		
		Deal[] deals={deals1,deals2,deals3};
		
		Broker Broker=new Broker(names,deals);
		Broker.getInfo();
	}
}