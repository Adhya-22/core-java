class StoreTwoWheelerRunner
{
	public static void main(String[] args)
	{
		String[] models=new String[20];
		
		StoreTwoWheeler storeTwoWheeler=new StoreTwoWheeler(models);
		
		storeTwoWheeler.store("Hero Splendor Plus");
		storeTwoWheeler.store("Honda Shine 125");
		storeTwoWheeler.store("Hero HF Deluxe");
		storeTwoWheeler.store("Bajaj Pulsar 125");
		storeTwoWheeler.store("TVS Apache RTR 160");
		storeTwoWheeler.store("Royal Enfield Classic 350");
		storeTwoWheeler.store("TVS Raider 125");
		storeTwoWheeler.store("Bajaj Platina 110");
		storeTwoWheeler.store("Honda CB Unicorn");
		storeTwoWheeler.store("Hero Xtreme 125R");
		storeTwoWheeler.store("Honda Activa");
		storeTwoWheeler.store("TVS Jupiter");
		storeTwoWheeler.store("Suzuki Access 125");
		storeTwoWheeler.store("TVS iQube");
		storeTwoWheeler.store("Bajaj Chetak");
		storeTwoWheeler.store("TVS Ntorq 125");
		storeTwoWheeler.store("Ather Rizta");
		storeTwoWheeler.store("Ola S1 X");
		storeTwoWheeler.store("Honda Dio");
		storeTwoWheeler.store("Suzuki Burgman Street");
		
		boolean found=storeTwoWheeler.search("TVS iQube");
		System.out.println("Model found : "+found);
		
		boolean update=storeTwoWheeler.update(13,"TVS Ntorq 125");
		System.out.println("Updated ? : "+update);
		
		boolean update1=storeTwoWheeler.update("Bajaj Pulsar 125","TVS Jupiter");
		System.out.println("Updated ? : "+update1);
		
		String delete=storeTwoWheeler.delete(18);
		System.out.println("Deleted ? : "+delete);
		
		String delete1=storeTwoWheeler.delete("Ather Rizta");
		System.out.println("Deleted ? : "+delete1);
	}
}