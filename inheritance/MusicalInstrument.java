class MusicalInstrument extends Instrument 
{
    String type;
    boolean electric;
    int price;

    MusicalInstrument()
	{
        System.out.println("Non-parameterized constructor of MusicalInstrument");
    }

    void play()
	{
        System.out.println("Executing perform in MusicalInstrument");
    }
}