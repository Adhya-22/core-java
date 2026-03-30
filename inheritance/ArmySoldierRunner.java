class ArmySoldierRunner
{
    public static void main(String... args)
	{
        ArmySoldier armySoldier1=new ArmySoldier();
        armySoldier1.name="Rahul";
        armySoldier1.age=30;
        armySoldier1.trained=true;
        armySoldier1.rank="Captain";
        armySoldier1.missions=15;
        armySoldier1.onDuty=true;
        armySoldier1.weapon="Rifle";
        armySoldier1.experienceYears=8;
        armySoldier1.march();
        armySoldier1.salute();
        armySoldier1.attack();

        ArmySoldier armySoldier2=new ArmySoldier();
        armySoldier2.name="Arjun";
        armySoldier2.age=28;
        armySoldier2.trained=true;
        armySoldier2.rank="Lieutenant";
        armySoldier2.missions=10;
        armySoldier2.onDuty=false;
        armySoldier2.weapon="Pistol";
        armySoldier2.experienceYears=5;
        armySoldier2.march();
        armySoldier2.salute();
        armySoldier2.attack();

        Soldier soldier1=new ArmySoldier();
        soldier1.name="Vikram";
        soldier1.age=35;
        soldier1.trained=true;
        soldier1.march();
        soldier1.salute();

        Soldier soldier2=new ArmySoldier();
        soldier2.name="Kiran";
        soldier2.age=32;
        soldier2.trained=false;
        soldier2.march();
        soldier2.salute();

        Soldier soldier3=new Soldier();
        soldier3.name="Ravi";
        soldier3.age=25;
        soldier3.trained=true;
        soldier3.march();
        soldier3.salute();

        Soldier soldier4=new Soldier();
        soldier4.name="Manoj";
        soldier4.age=27;
        soldier4.trained=false;
        soldier4.march();
        soldier4.salute();
    }
}