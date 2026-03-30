class WorldWarRunner
{
    public static void main(String... args)
	{
        WorldWar worldWar1=new WorldWar();
        worldWar1.warName="World War I";
        worldWar1.duration=4;
        worldWar1.global=true;
        worldWar1.countriesInvolved=30;
        worldWar1.ongoing=false;
        worldWar1.yearStarted=1914;
        worldWar1.yearEnded=1918;
        worldWar1.totalDeaths=16000000;
        worldWar1.bombCountry();
        worldWar1.hostagePeople();
        worldWar1.fight();

        WorldWar worldWar2=new WorldWar();
        worldWar2.warName="World War II";
        worldWar2.duration=6;
        worldWar2.global=true;
        worldWar2.countriesInvolved=50;
        worldWar2.ongoing=false;
        worldWar2.yearStarted=1939;
        worldWar2.yearEnded=1945;
        worldWar2.totalDeaths=70000000;
        worldWar2.bombCountry();
        worldWar2.hostagePeople();
        worldWar2.fight();

        War war1=new WorldWar();
        war1.warName="Cold Conflict";
        war1.duration=10;
        war1.global=false;
        war1.bombCountry();
        war1.hostagePeople();

        War war2=new WorldWar();
        war2.warName="Regional War";
        war2.duration=5;
        war2.global=false;
        war2.bombCountry();
        war2.hostagePeople();

        War war3=new War();
        war3.warName="Local War";
        war3.duration=2;
        war3.global=false;
        war3.bombCountry();
        war3.hostagePeople();

        War war4=new War();
        war4.warName="Mini Conflict";
        war4.duration=1;
        war4.global=false;
        war4.bombCountry();
        war4.hostagePeople();
    }
}