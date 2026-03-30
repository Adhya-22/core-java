class Balloon
{
    String color;
    int size;
    boolean heliumFilled;

    Balloon()
	{
        System.out.println("Non-parameterized constructor of Balloon");
    }

	void burst()
	{
        System.out.println("Executing burst in Balloon");
    }
	
    void fillGas()
	{
        System.out.println("Executing fillGas in Balloon");
    }
}