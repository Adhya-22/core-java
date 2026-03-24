class SaltStoreRunner
{
	public static void main(String[] args)
	{
		Salt[] salts=new Salt[10];
		
		SaltStore saltStore = new SaltStore(salts);
		
		Salt salt1=new Salt("Tata", "Iodized", 1, 25, true, "Packet");
		saltStore.save(salt1);
		
		Salt salt2=new Salt("Aashirvaad", "Rock Salt", 0.5, 40, false, "Pouch");
		saltStore.save(salt2);
		
		Salt salt3=new Salt("Catch", "Sea Salt", 0.75, 60, false, "Bottle");
		saltStore.save(salt3);
		
		Salt salt4=new Salt("Tata", "Lite Salt", 1, 30, true, "Packet");
		saltStore.save(salt4);
		
		Salt salt5=new Salt("Organic India", "Himalayan Pink", 0.5, 120, false, "Jar");
		saltStore.save(salt5);
		
		Salt salt6=new Salt("Aachi", "Table Salt", 1, 20, true, "Packet");
		saltStore.save(salt6);
		
		Salt salt7=new Salt("Patanjali", "Black Salt", 0.5, 35, false, "Pouch");
		saltStore.save(salt7);
		
		Salt salt8=new Salt("Catch", "Low Sodium", 0.75, 55, true, "Bottle");
		saltStore.save(salt8);
		
		Salt salt9=new Salt("Keya", "Sea Salt", 0.25, 80, false, "Jar");
		saltStore.save(salt9);
		
		Salt salt10=new Salt("Tata", "Crystal Salt", 1.5, 28, true, "Packet");
		saltStore.save(salt10);
	}
}