class Cloud
{
	String username;
    String role;
	String serviceType;  
    int storageCapacity;
	boolean autoScaling;
    boolean backupEnabled;
	
	Cloud(String username,String role,String serviceType,int storageCapacity,boolean autoScaling,boolean backupEnabled)
	{
		this.username=username;
		this.role=role;
		this.serviceType=serviceType;
		this.storageCapacity=storageCapacity;
		this.autoScaling=autoScaling;
		this.backupEnabled=backupEnabled;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Cloud...");
		System.out.println("username : "+this.username);
		System.out.println("role : "+this.role);
		System.out.println("serviceType : "+this.serviceType);
		System.out.println("storageCapacity : "+this.storageCapacity);
		System.out.println("autoScaling : "+this.autoScaling);
		System.out.println("backupEnabled : "+this.backupEnabled);
	}
}