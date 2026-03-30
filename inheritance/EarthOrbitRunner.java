class EarthOrbitRunner
{
    public static void main(String[] args)
	{
        EarthOrbit earthOrbit1=new EarthOrbit();
        earthOrbit1.centralBody="Sun";
        earthOrbit1.isCircular=false;
        earthOrbit1.speed=30000;
        earthOrbit1.hasSatellites=true;
        earthOrbit1.moonCount=1;
        earthOrbit1.atmosphereType="Nitrogen-Oxygen";
        earthOrbit1.supportsHumans=true;
        earthOrbit1.temperatureRange=50;
        earthOrbit1.startMotion();
        earthOrbit1.stopMotion();
        earthOrbit1.showDetails();

        EarthOrbit earthOrbit2=new EarthOrbit();
        earthOrbit2.centralBody="Sun";
        earthOrbit2.isCircular=true;
        earthOrbit2.speed=28000;
        earthOrbit2.hasSatellites=true;
        earthOrbit2.moonCount=1;
        earthOrbit2.atmosphereType="Dense";
        earthOrbit2.supportsHumans=true;
        earthOrbit2.temperatureRange=60;
        earthOrbit2.startMotion();
        earthOrbit2.stopMotion();
        earthOrbit2.showDetails();

        Orbit orbit1=new EarthOrbit();
        orbit1.centralBody="Sun";
        orbit1.isCircular=false;
        orbit1.speed=25000;
        orbit1.startMotion();
        orbit1.stopMotion();

        Orbit orbit2=new EarthOrbit();
        orbit2.centralBody="Star";
        orbit2.isCircular=true;
        orbit2.speed=27000;
        orbit2.startMotion();
        orbit2.stopMotion();

        Orbit orbit3=new Orbit();
        orbit3.centralBody="Planet";
        orbit3.isCircular=true;
        orbit3.speed=20000;
        orbit3.startMotion();
        orbit3.stopMotion();

        Orbit orbit4=new Orbit();
        orbit4.centralBody="Galaxy";
        orbit4.isCircular=false;
        orbit4.speed=15000;
        orbit4.startMotion();
        orbit4.stopMotion();
    }
}