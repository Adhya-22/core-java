class Lion
{
	String name;
	int age;
    double weight;
    char gender;
	boolean isInZoo;

	Teeth teeth;
    Cub cub;
    Prey prey;
    Habitat habitat;
    Tail tail;
	
	Lion(String name,int age, double weight,char gender,boolean isInZoo,Teeth teeth,Cub cub,Prey prey,
	Habitat habitat,Tail tail)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.gender=gender;
		this.isInZoo=isInZoo;
		this.teeth=teeth;
		this.cub=cub;
		this.prey=prey;
		this.habitat=habitat;
		this.tail=tail;
	}
	
	void getInfo()
	{
		System.out.println("name : "+this.name);
		System.out.println("age : "+this.age);
		System.out.println("weight : "+this.weight);
		System.out.println("gender : "+this.gender);
		System.out.println("isInZoo : "+this.isInZoo);
	}
}


