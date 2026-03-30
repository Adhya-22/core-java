class MusicalInstrumentRunner
{
    public static void main(String[] args)
	{
        MusicalInstrument musicalInstrument1=new MusicalInstrument();
        musicalInstrument1.name="Guitar";
        musicalInstrument1.weight=3;
        musicalInstrument1.type="String";
        musicalInstrument1.electric=true;
        musicalInstrument1.price=15000;
        musicalInstrument1.maintain();
        musicalInstrument1.tune();
        musicalInstrument1.play();

        MusicalInstrument musicalInstrument2=new MusicalInstrument();
        musicalInstrument2.name="Piano";
        musicalInstrument2.weight=50;
        musicalInstrument2.type="Keyboard";
        musicalInstrument2.electric=true;
        musicalInstrument2.price=50000;
        musicalInstrument2.maintain();
        musicalInstrument2.tune();
        musicalInstrument2.play();

        Instrument instrument1=new MusicalInstrument();
        instrument1.name="Violin";
        instrument1.weight=2;
        instrument1.maintain();
        instrument1.tune();

        Instrument instrument2=new MusicalInstrument();
        instrument2.name="Drum";
        instrument2.weight=20;
        instrument2.maintain();
        instrument2.tune();

        Instrument instrument3=new Instrument();
        instrument3.name="Flute";
        instrument3.weight=1;
        instrument3.maintain();
        instrument3.tune();

        Instrument instrument4=new Instrument();
        instrument4.name="Tabla";
        instrument4.weight=5;
        instrument4.maintain();
        instrument4.tune();
    }
}