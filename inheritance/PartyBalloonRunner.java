class PartyBalloonRunner
{
    public static void main(String... args)
	{
        PartyBalloon partyBalloon1=new PartyBalloon();
        partyBalloon1.color="Red";
        partyBalloon1.size=10;
        partyBalloon1.heliumFilled=true;
        partyBalloon1.eventName="Birthday";
        partyBalloon1.quantity=50;
        partyBalloon1.ribbonColor="Gold";
        partyBalloon1.glowInDark=false;
        partyBalloon1.popable=true;
        partyBalloon1.burst();
        partyBalloon1.fillGas();
        partyBalloon1.arrange();

        PartyBalloon partyBalloon2=new PartyBalloon();
        partyBalloon2.color="Blue";
        partyBalloon2.size=8;
        partyBalloon2.heliumFilled=false;
        partyBalloon2.eventName="Wedding";
        partyBalloon2.quantity=100;
        partyBalloon2.ribbonColor="Silver";
        partyBalloon2.glowInDark=true;
        partyBalloon2.popable=false;
        partyBalloon2.burst();
        partyBalloon2.fillGas();
        partyBalloon2.arrange();
       
        Balloon balloon1=new PartyBalloon();
        balloon1.color="Green";
        balloon1.size=6;
        balloon1.heliumFilled=true;
        balloon1.burst();
        balloon1.fillGas();
		
        Balloon balloon2=new PartyBalloon();
        balloon2.color="Yellow";
        balloon2.size=5;
        balloon2.heliumFilled=false;
        balloon2.burst();
        balloon2.fillGas();

        Balloon balloon3=new Balloon();
        balloon3.color="Pink";
        balloon3.size=7;
        balloon3.heliumFilled=true;
        balloon3.burst();
        balloon3.fillGas();

        Balloon balloon4=new Balloon();
        balloon4.color="Orange";
        balloon4.size=4;
        balloon4.heliumFilled=false;
        balloon4.burst();
        balloon4.fillGas();
    }
}