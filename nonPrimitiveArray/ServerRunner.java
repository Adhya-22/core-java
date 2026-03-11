class ServerRunner
{
	public static void main(String[] args)
	{
		String[] serverNames={"ByteNet","NovaNex","PixelPath"};
		
		Client client1=new Client("Chrome");
		Client client2=new Client("FireFox");
		Client client3=new Client("MicroSoft Edge");
		
		Client[] clients={client1,client2,client3};
		
		Server server=new Server(serverNames,clients);
		server.getInfo();
	}
}