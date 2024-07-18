class SimCardRunner
{
	public static void main(String [] args)
	{
		SimCard ref = new SimCard();
		ref.create("Airtel", "Unlimited", 1);
		ref.SimCardInfo();
		
		SimCard ref1 = new SimCard();
		ref1.create("Jio", "Unlimited", 2);
		ref1.SimCardInfo();
		
		SimCard ref2 = new SimCard();
		ref2.create("Vodafone", "Unlimited", 3);
		ref2.SimCardInfo();
		
		SimCard ref3 = new SimCard();
		ref3.create("BSNL", "Unlimited", 4);
		ref3.SimCardInfo();
		
		SimCard ref4 = new SimCard();
		ref4.create("Tata Docomo", "Unlimited", 5);
		ref4.SimCardInfo();
		
		SimCard ref5 = new SimCard();
		ref5.create("Aircel", "Unlimited", 6);
		ref5.SimCardInfo();
		
		SimCard ref6 = new SimCard();
		ref6.create("Reliance Docomo", "Unlimited", 7);
		ref6.SimCardInfo();
		
		SimCard ref7 = new SimCard();
		ref7.create("MTNL", "Unlimited", 8);
		ref7.SimCardInfo();
		
		SimCard ref8 = new SimCard();
		ref8.create("MTS India", "Unlimited", 9);
		ref8.SimCardInfo();
		
		SimCard ref9 = new SimCard();
		ref9.create("Vodafone Idea", "Unlimited", 10);
		ref9.SimCardInfo();
		
		SimCard ref10 = new SimCard();
		ref10.create("Jio Infocomm", "Unlimited", 11);
		ref10.SimCardInfo();
		
		SimCard ref11 = new SimCard();
		ref11.create("Airtel", "Unlimited", 12);
		ref11.SimCardInfo();
	}
}