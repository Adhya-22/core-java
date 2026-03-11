class Painter
{
	String[] colors;
	Brush[] brushes;
	
	Painter(String[] colors,Brush[] brushes)
	{
		this.colors=colors;
		this.brushes=brushes;
	}

	void getInfo()
	{
		System.out.println("Executing getInfo in Painter..");
		if(this.colors!=null)
		{
			for(String color:colors)
			{
				System.out.println("color : "+color);
			}
		}
		if(this.brushes!=null)
		{
			System.out.println("total brushes : "+this.brushes.length);
			for(Brush brush:this.brushes)
			{
				brush.display();
			}
		}
	}

}