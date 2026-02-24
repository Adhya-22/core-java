class FMRadioRunner
{
	public static void main(String[] args)
	{
		FMRadio.turnOnOrOff();
		FMRadio.turnOnOrOff();
		
		FMRadio.setFrequency(89.4f);
		FMRadio.setFrequency(97.3f);
		FMRadio.setFrequency(109.4f);
		
		FMRadio.increaseVolume(2);
		FMRadio.increaseVolume(12);
		
		FMRadio.decreaseVolume(2);
		FMRadio.decreaseVolume(8);
		
		FMRadio.saveStation("99.9FM");
		FMRadio.saveStation("99.8FM");
		FMRadio.saveStation("99.7FM");
		FMRadio.saveStation("Radio");
		FMRadio.saveStation("Radio Mirchi");
		
		System.out.println("Saved Stations are : ");
		for(int i=0;i<5;i++)
			System.out.println(FMRadio.stations[i]);
	}
}