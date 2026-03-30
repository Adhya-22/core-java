class WaterSlide extends Slide
{
    int length;
    String parkName;
    int capacity;
	boolean waterFlow;
    boolean safetyGuard;

    WaterSlide()
	{
        System.out.println("Non-parameterized constructor of WaterSlide");
    }

    void ride()
	{
        System.out.println("Executing startRide in WaterSlide");
    }
}