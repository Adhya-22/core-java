class CourtRunner
{
	public static void main(String[] args)
	{
		CourtCase courtCase=new CourtCase("Divorce");
		CourtLevel level=CourtLevel.DISTRICT;
		Court court=new Court(2,courtCase,level);
		court.printInfo();
		
		CourtCase courtCase2=new CourtCase("Family");
		CourtLevel level2=CourtLevel.GRAM_PANCHAYAT;
		Court court2=new Court(1,courtCase2,level2);
		court2.printInfo();
		
		CourtCase courtCase3=new CourtCase("Land Dispute");
		CourtLevel level3=CourtLevel.HIGH;
		Court court3=new Court(6,courtCase3,level3);
		court3.printInfo();
		
		CourtCase courtCase4=new CourtCase("Murder");
		CourtLevel level4=CourtLevel.SUPREME;
		Court court4=new Court(4,courtCase4,level4);
		court4.printInfo();
	}
}