class SaltStore
{
	Salt[] salts;
	int currentIndex=0;
	
	SaltStore(Salt[] salts)
	{
		this.salts=salts;
	}
	
	void save(Salt salt)
	{
		System.out.println("Executing save in SaltStore...");
		if(salt!=null && this.salts!=null)
		{
			int index=this.salts.length-1;
			if(this.currentIndex<=index)
			{
				this.salts[this.currentIndex]=salt;
				salt.printInfo();
				System.out.println("Salt Stored at index : "+this.currentIndex);
				this.currentIndex++;
			}
			else
			{
				System.out.println("Array is full..");
			}
		}
		else
		{
			System.out.println("Reference cannot be null...");
		}
	}
}