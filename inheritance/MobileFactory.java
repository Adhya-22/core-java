class MobileFactory extends Factory
{
    String brand;
    int mobilesPerDay;
    boolean qualityCheck;
    String processorType;

    MobileFactory()
	{
        System.out.println("Non-parameterized constructor of MobileFactory");
    }

    void assemble()
	{
        System.out.println("Executing assemble in MobileFactory");
    }
}