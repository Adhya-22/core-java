class President
{
	static void govern()
	{
		System.out.println("Gverning...");
		callState();
	}
	
	static void callState()
	{
		System.out.println("State calls...");
		rules();
	}
	
	static void rules()
	{
		System.out.println("Set rules...");
		check();
	}
	
	static void check()
	{
		System.out.println("Checking the operations...");
		callAdmin();
	}
	
	static void callAdmin()
	{
		System.out.println("calling the adminstrator...");
		collect();
	}
	
	static void collect()
	{
		System.out.println("Collect Information...");
		apply();
	}
	
	static void apply()
	{
		System.out.println("Implement Plans...");
		chain();
	}
	
	static void chain()
	{
		System.out.println("Create a Chain...");
		citizen();
	}
	
	static void citizen()
	{
		System.out.println("making the Implementation public...");
		follow();
	}
	
	static void follow()
	{
		System.out.println("Making sure the citizen follow the rules...");
	}
}