class Server
{
	String[] serverNames;
	Client[] Clients;
	
	Server(String[] serverNames,Client[] clients)
	{
		this.serverNames=serverNames;
		this.clients=clients;
	}

	void getInfo()
	{
		System.out.println("Executing getInfo in Server..");
		if(this.serverNames!=null)
		{
			for(String name:serverNames)
			{
				System.out.println("Server name : "+name);
			}
		}
		if(this.Clients!=null)
		{
			System.out.println("total Clients : "+this.clients.length);
			for(Client client:this.clients)
			{
				client.display();
			}
		}
	}
}