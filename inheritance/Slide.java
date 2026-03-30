class Slide
{
    String material;
    int height;
    boolean indoor;

    Slide()
	{
        System.out.println("Non-parameterized constructor of Slide");
    }

	void slide()
	{
        System.out.println("Executing slideDown in Slide");
    }
	
    void climb()
	{
        System.out.println("Executing climb in Slide");
    }
}