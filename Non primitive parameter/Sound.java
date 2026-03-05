class Sound
{
	double frequency;
	
	Sound(double frequency)
	{
		this.frequency=frequency;
	}
	
	void getInfo()
	{
		System.out.println("frequency : "+this.frequency);
	}
}