class ProfileStore
{
	Profile[] profiles;
	int currentIndex=0;
	
	ProfileStore(Profile[] profiles)
	{
		this.profiles=profiles;
	}
	
	void save(Profile profile)
	{
		System.out.println("Executing save in ProfileStore...");
		if(profile!=null && this.profiles!=null)
		{
			int index=this.profiles.length-1;
			if(this.currentIndex<=index)
			{
				this.profiles[this.currentIndex]=profile;
				profile.printInfo();
				System.out.println("Profile Stored at index : "+this.currentIndex);
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