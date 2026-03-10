class Broker
{
	String[] brokerNames;
	Deal[] deals;
	
	Broker(String[] brokerNames,Deal[] deals)
	{
		this.brokerNames=brokerNames;
		this.deals=deals;
	}
	
	void getInfo()
	{
		System.out.println("Executing getInfo in Broker..");
		if(this.brokerNames!=null)
		{
			for(String name:brokerNames)
			{
				System.out.println("Broker name : "+name);
			}
		}
		if(this.deals!=null)
		{
			System.out.println("total deals : "+this.deals.length);
			for(Deal deal:this.deals)
			{
				deal.display();
			}
		}
	}
}