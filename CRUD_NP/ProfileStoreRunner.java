class ProfileStoreRunner
{
	public static void main(String[] args)
	{
		Profile[] profiles=new Profile[10];
		
		ProfileStore profileStore=new ProfileStore(profiles);
		
		Profile profile1=new Profile("Adhya","adhyaravigowda@gmail.com",6364817378L,"adhya1234",false,true);
		profileStore.save(profile1);
		
		Profile profile2=new Profile("Arun","arun@gmail.com",8567935623L,"arun345",true,true);
		profileStore.save(profile2);
		
		Profile profile3=new Profile("Bhumi","bhumi@gmail.com",8964545350L,"bhumi567",true,false);
		profileStore.save(profile3);
		
		Profile profile4=new Profile("Harsha","harsha@gmail.com",8563785250L,"harsha123",true,false);
		profileStore.save(profile4);
		
		Profile profile5=new Profile("Nandhan","nandhan@gmail.com",9564882400L,"nandhan234",true,false);
		profileStore.save(profile5);
		
		Profile profile6=new Profile("Subbu","subbu@gmail.com",6785643230L,"subbu456",true,true);
		profileStore.save(profile6);
		
		Profile profile7=new Profile("Yash","yash@gmail.com",9867545299L,"yash5679",false,false);
		profileStore.save(profile7);
		
		Profile profile8=new Profile("Keerthi","keerthi@gmail.com",7865468439L,"keerthi111",false,true);
		profileStore.save(profile8);
		
		Profile profile9=new Profile("Varun","varun@gmail.com",7658940500L,"varun345",false,true);
		profileStore.save(profile9);
		
		Profile profile10=new Profile("Karan","karan@gmail.com",9876540320L,"karan777",true,false);
		profileStore.save(profile10);
	}
}