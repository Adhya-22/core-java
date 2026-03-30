class Device 
{
    String brand;
    boolean portable;
    int warranty;

    Device()
	{
        System.out.println("Non-parameterized constructor of Device");
    }

    void powerOn()
	{
        System.out.println("Executing powerOn in Device");
    }

    void powerOff()
	{
        System.out.println("Executing powerOff in Device");
    }
}