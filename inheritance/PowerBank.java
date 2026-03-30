class PowerBank extends Device
{
    int capacity;
    boolean fastCharge;
    int outputPorts;
    String chargingType;
    boolean ledIndicator;

    PowerBank()
	{
        System.out.println("Non-parameterized constructor of PowerBank");
    }

    void supplyPower()
	{
        System.out.println("Executing supplyPower in PowerBank");
    }
}