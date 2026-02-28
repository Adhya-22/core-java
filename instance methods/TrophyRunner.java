class TrophyRunner
{
	public static void main(String[] args)
	{
		Trophy trophy1 = new Trophy("Championship Cup","Gold Plated","Golden",45.0,3.5,15000.0,
		"Cricket","Team A",2026,"Classic","Prestige","Best Team","Cup","Box",true,"India",
		"Trophy Makers","Glossy","Sports","XYZ Pvt Ltd");
		trophy1.getInfo();

		Trophy trophy2 = new Trophy("Football Shield","Silver","Silver",40.0,3.0,12000.0,"Football",
		"Team B",2025,"Modern","AwardsCo","Winner","Shield","Box",true,"India","AwardsCo","Matte",
		"Sports","ABC Ltd");
		trophy2.getInfo();

		Trophy trophy3 = new Trophy("Academic Excellence","Crystal","Transparent",30.0,2.0,8000.0,
		"Education","Student A",2024,"Elegant","EduAwards","Topper","Star","Case",true,"India",
		"EduAwards","Glossy","Academic","School Trust");
		trophy3.getInfo();

		Trophy trophy4 = new Trophy("Best Employee","Metal","Gold",25.0,1.5,5000.0,"Corporate",
		"Employee X",2026,"Simple","CorpAwards","Outstanding","Star","Box",true,"India","CorpAwards",
        "Matte","Corporate","Company Ltd");
		trophy4.getInfo();

		Trophy trophy5 = new Trophy("Music Award","Bronze","Brown",35.0,2.5,10000.0,"Music",
		"Artist Y",2025,"Artistic","MusicOrg","Best Singer","Microphone","Case",true,"USA",
		"MusicOrg","Glossy","Entertainment","Music Co");
		trophy5.getInfo();

		Trophy trophy6 = new Trophy("Dance Trophy","Gold","Golden",28.0,1.8,7000.0,"Dance",
		"Performer Z",2024,"Modern","DanceAwards","Winner","Figure","Box",true,"India","DanceAwards",
        "Matte","Cultural","Cultural Assoc");
		trophy6.getInfo();

		Trophy trophy7 = new Trophy("Science Fair","Crystal","Clear",32.0,2.2,9000.0,"Science",
		"Student B",2026,"Futuristic","SciAwards","Innovation","Globe","Case",true,"India",
		"SciAwards","Glossy","Academic","College");
		trophy7.getInfo();

		Trophy trophy8 = new Trophy("Marathon Medal","Steel","Silver",20.0,1.0,3000.0,"Marathon",
		"Runner C",2025,"Compact","SportsOrg","Finisher","Medal","Pouch",false,"India","SportsOrg",
        "Matte","Sports","Health Dept");
		trophy8.getInfo();

		Trophy trophy9 = new Trophy("Debate Cup","Silver","Silver",27.0,1.6,6000.0,"Debate",
		"Student D",2024,"Classic","DebateClub","Best Speaker","Cup","Box",true,"India","DebateClub",
        "Glossy","Academic","University");
		trophy9.getInfo();

		Trophy trophy10 = new Trophy("Coding Challenge","Metal","Black",30.0,2.3,8500.0,"Hackathon",
		"Team Code",2026,"Tech","TechAwards","Champion","Circuit","Case",true,"India","TechAwards",
        "Matte","Technology","IT Firm");
		trophy10.getInfo();
	}
}