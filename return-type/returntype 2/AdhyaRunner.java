import java.util.Arrays;

class AdhyaRunner
{
	public static void main(String[] args)
	{
		int age=Adhya.getAge("Adhya");
		System.out.println("Age : "+age);
		System.out.println("phone Numbers : "+Arrays.toString(Adhya.getNumbers("Adhya")));
		System.out.println("Emails : "+Arrays.toString(Adhya.getEmails("Adhya")));
		
		age=Adhya.getAge("Harsha");
		System.out.println("Age : "+age);
		System.out.println("phone Numbers : "+Arrays.toString(Adhya.getNumbers("Harsha")));
		System.out.println("Emails : "+Arrays.toString(Adhya.getEmails("Harsha")));
		
		age=Adhya.getAge("Annapurna");
		System.out.println("Age : "+age);
		System.out.println("phone Numbers : "+Arrays.toString(Adhya.getNumbers("Annapurna")));
		System.out.println("Emails : "+Arrays.toString(Adhya.getEmails("Annapurna")));
	}
}