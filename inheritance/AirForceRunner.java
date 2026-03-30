class AirForceRunner
{
    public static void main(String[] args)
	{
        AirForce airForce1=new AirForce();
        airForce1.country="India";
        airForce1.soldiers=500;
        airForce1.active=true;
        airForce1.aircrafts=200;
        airForce1.base="Bangalore";
        airForce1.fighterJets=true;
        airForce1.pilots=150;
        airForce1.commander="Air Chief Raj";
        airForce1.defend();
        airForce1.train();
        airForce1.airStrike();

        AirForce airForce2=new AirForce();
        airForce2.country="USA";
        airForce2.soldiers=800;
        airForce2.active=true;
        airForce2.aircrafts=300;
        airForce2.base="Texas";
        airForce2.fighterJets=true;
        airForce2.pilots=200;
        airForce2.commander="Air Chief John";
        airForce2.defend();
        airForce2.train();
        airForce2.airStrike();

        Army army1=new AirForce();
        army1.country="UK";
        army1.soldiers=400;
        army1.active=true;
        army1.defend();
        army1.train();

        Army army2=new AirForce();
        army2.country="France";
        army2.soldiers=350;
        army2.active=false;
        army2.defend();
        army2.train();

        Army army3=new Army();
        army3.country="Germany";
        army3.soldiers=300;
        army3.active=true;
        army3.defend();
        army3.train();

        Army army4=new Army();
        army4.country="Japan";
        army4.soldiers=250;
        army4.active=false;
        army4.defend();
        army4.train();
    }
}