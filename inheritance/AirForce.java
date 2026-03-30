class AirForce extends Army
{
    int aircrafts;
    String base;
    boolean fighterJets;
    int pilots;
    String commander;

    AirForce()
	{
        System.out.println("Non-parameterized constructor of AirForce");
    }

    void airStrike()
	{
        System.out.println("Executing airStrike in AirForce");
    }
}