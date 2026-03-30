class Instrument
{
    String name;
    int weight;

    Instrument()
	{
        System.out.println("Non-parameterized constructor of Instrument");
    }

    void maintain()
	{
        System.out.println("Executing maintain in Instrument");
    }

    void tune()
	{
        System.out.println("Executing tune in Instrument");
    }
}