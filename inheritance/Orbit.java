class Orbit
{
    String centralBody;
    boolean isCircular;
    int speed;

    Orbit()
	{
        System.out.println("Non-parameterized constructor of Orbit");
    }

    void startMotion()
	{
        System.out.println("Executing startMotion in Orbit");
    }

    void stopMotion()
	{
        System.out.println("Executing stopMotion in Orbit");
    }
}