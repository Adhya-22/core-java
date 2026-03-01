class EducationRunner
{
	public static void main(String[] args)
	{
		Education education1 = new Education("VTU","Computer Science","B.E",4,"VTU","Full Time",
		150000.0,"Engineering Subjects","Experienced","Karnataka","AICTE","English","Entrance Exam",
		"PUC","Semester","Yes","Mandatory","Degree Certificate","Top 10","Available");
		education1.getInfo();

		Education education2 = new Education("IIT","Mechanical","B.Tech",4,"IIT","Full Time",250000.0,
        "Core Engineering","Highly Qualified","Delhi","AICTE","English","JEE","12th","Semester",
		"Yes","Mandatory","Degree","Top 5","Merit Based");
		education2.getInfo();

		Education education3 = new Education("MIT","Data Science","M.Tech",2,"MIT","Full Time",300000.0,
        "AI & ML","Expert Faculty","USA","ABET","English","GRE","B.Tech","Semester","Yes","Optional",
        "Masters Degree","Top 3","Available");
		education3.getInfo();

		Education education4 = new Education("Anna University","Civil","B.E",4,"Anna University",
		"Full Time",120000.0,"Core Civil","Experienced","Tamil Nadu","AICTE","English","Counselling",
		"12th","Semester","Yes","Mandatory","Degree","Top 20","Available");
		education4.getInfo();

		Education education5 = new Education("Oxford","MBA","MBA",2,"Oxford","Full Time",500000.0,
        "Business Management","Senior Faculty","UK","Global","English","Entrance","Graduate","Semester",
		"Yes","Mandatory","MBA Degree","Top 5","Merit");
		education5.getInfo();

		Education education6 = new Education("Harvard","Law","LLB",3,"Harvard","Full Time",600000.0,
        "Legal Studies","Top Faculty","USA","ABA","English","Entrance","Graduate","Semester","Yes",
		"Mandatory","Law Degree","Top 3","Scholarship");
		education6.getInfo();

		Education education7 = new Education("Stanford","AI","PhD",5,"Stanford","Full Time",800000.0,
        "Advanced AI","Research Faculty","USA","Global","English","Research","Masters","Semester",
		"Yes","Research","Doctorate","Top 3","Research Grant");
		education7.getInfo();

		Education education8 = new Education("SRM","IT","B.Tech",4,"SRM","Full Time",180000.0,
        "IT Subjects","Experienced","Tamil Nadu","AICTE","English","Entrance","12th","Semester",
		"Yes","Mandatory","Degree","Top 50","Available");
		education8.getInfo();

		Education education9 = new Education("BITS","Electronics","B.Tech",4,"BITS","Full Time",220000.0,
        "Core Electronics","Expert Faculty","Rajasthan","AICTE","English","BITSAT","12th","Semester",
		"Yes","Mandatory","Degree","Top 10","Merit");
		education9.getInfo();

		Education education10 = new Education("Amity","MBA","MBA",2,"Amity","Full Time",200000.0,
        "Business","Experienced","Noida","AICTE","English","Entrance","Graduate","Semester","Yes",
		"Optional","MBA Degree","Top 100","Available");
		education10.getInfo();
	}
}