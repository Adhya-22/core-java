class EarthOrbit extends Orbit
{
    boolean hasSatellites;
    int moonCount;
    String atmosphereType;
    boolean supportsHumans;
    int temperatureRange;

    EarthOrbit()
	{
        System.out.println("Non-parameterized constructor of EarthOrbit");
    }

    void showDetails()
	{
        System.out.println("Executing showDetails in EarthOrbit");
    }
}