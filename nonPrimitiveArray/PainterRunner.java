class PainterRunner
{
	public static void main(String[] args)
	{
		String[] colors={"Red","Yellow","PBrush"};
		
		Brush brush1=new Brush("Flat");
		Brush brush2=new Brush("Round");
		Brush brush3=new Brush("Filbert");
		
		Brush[] Brushes={brush1,brush2,brush3};
		
		Painter painter=new Painter(colors,Brushes);
		painters.getInfo();
	}
}