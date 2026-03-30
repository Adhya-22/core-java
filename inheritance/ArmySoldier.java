class ArmySoldier extends Soldier
{
    String rank;
    int missions;
    boolean onDuty;
    String weapon;
    int experienceYears;

    ArmySoldier()
	{
        System.out.println("Non-parameterized constructor of ArmySoldier");
    }

    void attack()
	{
        System.out.println("Executing attack in ArmySoldier");
    }
}