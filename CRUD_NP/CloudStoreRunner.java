class CloudStoreRunner
{
	public static void main(String[] args)
	{
		Cloud[] clouds=new Cloud[10];
		
		CloudStore cloudStore=new CloudStore(clouds);
		
		Cloud cloud1=new Cloud("user1","Admin","SaaS",100,true,true);
		cloudStore.save(cloud1);
		
		Cloud cloud2=new Cloud("user2","User","PaaS",200,true,false);
		cloudStore.save(cloud2);
		
		Cloud cloud3=new Cloud("user3","Admin","IaaS",500,true,true);
		cloudStore.save(cloud3);
		
		Cloud cloud4=new Cloud("user4","User","SaaS",150,false,true);
		cloudStore.save(cloud4);
		
		Cloud cloud5=new Cloud("user5","Manager","PaaS",300,true,true);
		cloudStore.save(cloud5);
		
		Cloud cloud6=new Cloud("user6","User","IaaS",250,false,false);
		cloudStore.save(cloud6);
		
		Cloud cloud7=new Cloud("user7","Admin","SaaS",400,true,true);
		cloudStore.save(cloud7);
		
		Cloud cloud8=new Cloud("user8","User","PaaS",180,false,true);
		cloudStore.save(cloud8);
		
		Cloud cloud9=new Cloud("user9","Manager","IaaS",350,true,false);
		cloudStore.save(cloud9);
		
		Cloud cloud10=new Cloud("user10","Admin","SaaS",600,true,true);
		cloudStore.save(cloud10);
	}
}