class Soldier
{
    String name;
    int age;
    boolean trained;

    Soldier()
	{
        System.out.println("Non-parameterized constructor of Soldier");
    }

    void march()
	{
        System.out.println("Executing march in Soldier");
    }

    void salute()
	{
        System.out.println("Executing salute in Soldier");
    }
}