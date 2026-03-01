class Education 
{
    String institutionName;
    String courseName;
    String degree;
    int durationYears;
    String university;
    String mode;
    double fees;
    String syllabus;
    String faculty;
    String location;
    String accreditation;
    String medium;
    String admissionProcess;
    String eligibility;
    String examType;
    String semesterSystem;
    String internship;
    String certification;
    String ranking;
    String scholarship;
	
	Education(String institutionName,String courseName,String degree,int durationYears,String university,
	String mode,double fees,String syllabus,String faculty,String location,String accreditation,
	String medium,String admissionProcess,String eligibility,String examType,String semesterSystem,
	String internship,String certification,String ranking,String scholarship)
	{
		this.institutionName=institutionName;
		this.courseName=courseName;
		this.degree=degree;
		this.durationYears=durationYears;
		this.university=university;
		this.mode=mode;
		this.fees=fees;
		this.syllabus=syllabus;
		this.faculty=faculty;
		this.location=location;
		this.accreditation=accreditation;
		this.medium=medium;
		this.admissionProcess=admissionProcess;
		this.eligibility=eligibility;
		this.examType=examType;
		this.semesterSystem=semesterSystem;
		this.internship=internship;
		this.certification=certification;
		this.ranking=ranking;
		this.scholarship=scholarship;
	}
	
	void getInfo()
	{
		System.out.println("Institution name : "+this.institutionName);
		System.out.println("courseName : "+this.courseName);
		System.out.println("degree : "+this.degree);
		System.out.println("durationYears : "+this.durationYears);
		System.out.println("university : "+this.university);
		System.out.println("mode : "+this.mode);
		System.out.println("fees : "+this.fees);
		System.out.println("syllabus : "+this.syllabus);
		System.out.println("faculty : "+this.faculty);
		System.out.println("location : "+this.location);
		System.out.println("accreditation : "+this.accreditation);
		System.out.println("medium : "+this.medium);
		System.out.println("admissionProcess : "+this.admissionProcess);
		System.out.println("eligibility : "+this.eligibility);
		System.out.println("examType : "+this.examType);
		System.out.println("semesterSystem : "+this.semesterSystem);
		System.out.println("Internship : "+this.internship);
		System.out.println("certification : "+this.certification);
		System.out.println("ranking : "+this.ranking);
		System.out.println("scholarship : "+this.scholarship);
	}

}