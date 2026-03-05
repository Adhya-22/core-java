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
}


