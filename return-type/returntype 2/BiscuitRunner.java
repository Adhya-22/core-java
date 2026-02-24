import java.util.Arrays;

class BiscuitRunner
{
	public static void main(String[] args)
	{
		double parleG=Biscuit.getCost("parle-G");
		System.out.println("Cost : "+parleG);
		
		double darkFantasy=Biscuit.getCost("Dark Fantasy");
		System.out.println("Cost : "+darkFantasy);
		
		double oreo=Biscuit.getCost("Oreo");
		System.out.println("Cost : "+oreo);
		
		System.out.println("Shape : "+Biscuit.getShape("parle-G"));
		System.out.println("Shape : "+Biscuit.getShape("Dark Fantasy"));
		System.out.println("Shape : "+Biscuit.getShape("Oreo"));
		
		System.out.println("Flavours : "+Arrays.toString(Biscuit.getFlavours("parle-G")));
		System.out.println("Flavours : "+Arrays.toString(Biscuit.getFlavours("Dark Fantasy")));
		System.out.println("Flavours : "+Arrays.toString(Biscuit.getFlavours("Oreo")));
	}
}